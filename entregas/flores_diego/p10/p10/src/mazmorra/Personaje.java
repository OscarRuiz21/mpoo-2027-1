package mazmorra;

public abstract class Personaje {
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private Herramienta herramienta;
    private Personaje companero;           // asociación: se conocen

    protected Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
    }

    public abstract String getTipo();

    // cada tipo decide cuánto daño hace con lo que da su herramienta
    protected abstract int calcularDanio(int base);

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    // una sola herramienta: la nueva reemplaza a la anterior
    public void equipar(Herramienta h) {
        this.herramienta = h;
    }

    public void atacar(Personaje objetivo) {
        if (!estaVivo() || herramienta == null) {
            return;
        }
        int base = herramienta.golpear();  // P10: la herramienta decide
        if (base > 0) {
            objetivo.recibirDanio(calcularDanio(base));
        }
    }



    public Personaje getCompanero() {
        return companero;
    }

    // agregación: la herramienta se forjó afuera

    public void setCompanero(Personaje companero) {
        this.companero = companero;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDanio(int puntos) {
        if (puntos > 0) {
            vida = limitar(vida - puntos);
        }
    }

    // un personaje caído ya no se cura
    public void curar(int puntos) {
        if (puntos > 0 && estaVivo()) {
            vida = limitar(vida + puntos);
        }
    }



    public void ayudarCompanero() {
        if (companero != null) {
            companero.curar(10);
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + getTipo() + ") " + vida + "/" + vidaMaxima;
    }

    // la vida siempre queda entre 0 y su máximo
    private int limitar(int valor) {
        return Math.max(0, Math.min(vidaMaxima, valor));
    }
}
