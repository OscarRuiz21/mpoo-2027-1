package mazmorra;

public abstract class Personaje {
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private final Inventario inventario;   // composición: lo crea el personaje
    private Personaje companero;           // asociación: se conocen

    protected Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.inventario = new Inventario();
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

    public int getCuantasHerramientas() {
        return inventario.getCuantas();
    }

    public Herramienta getHerramienta(int i) {
        return inventario.getHerramienta(i);
    }

    public Personaje getCompanero() {
        return companero;
    }

    // agregación: la herramienta se forjó afuera
    public boolean equipar(Herramienta h) {
        return inventario.agregar(h);
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

    // un personaje caído ya no se cura
    public void curar(int puntos) {
        if (puntos > 0 && estaVivo()) {
            vida = limitar(vida + puntos);
        }
    }

    public void atacar(Personaje objetivo) {
        if (!estaVivo()) {
            return;
        }
        int base = inventario.usarMejor();
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

    // la vida siempre queda entre 0 y su máximo
    private int limitar(int valor) {
        return Math.max(0, Math.min(vidaMaxima, valor));
    }
}
