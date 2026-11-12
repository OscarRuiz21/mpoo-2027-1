package mazmorra;

public abstract class Personaje {
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private Herramienta herramienta;
    private Personaje companero;

    protected Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.companero = null;
    }

    public abstract String getTipo();

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

    public Personaje getCompanero() {
        return companero;
    }

    public void equipar(Herramienta h) {
        this.herramienta = h;
    }

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

    public void curar(int puntos) {
        if (puntos > 0 && estaVivo()) {
            vida = limitar(vida + puntos);
        }
    }

    public void atacar(Personaje objetivo) {
        if (!estaVivo() || herramienta == null) {
            return;
        }
        int base = herramienta.golpear();
        if (base > 0) {
            objetivo.recibirDanio(calcularDanio(base));
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

    protected int limitar(int valor) {
        return Math.max(0, Math.min(valor, vidaMaxima));
    }
}