package mazmorra;

public class Personaje {
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private Herramienta herramienta; // Agregación: se forja afuera
    private Personaje companero;

    public Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
    }

    public String getTipo() {
        return "Personaje";
    }

    protected int calcularDanio(int base) {
        return base;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void equipar(Herramienta h) {
        this.herramienta = h;
    }

    public void atacar(Personaje objetivo) {
        if (!estaVivo() || herramienta == null) {
            return;
        }
        int base = herramienta.golpear(); // Polimorfismo: Java corre el método de la herramienta equipada
        if (base > 0) {
            objetivo.recibirDanio(calcularDanio(base));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDanio(int cantidad) {
        this.vida = Math.max(0, this.vida - cantidad);
    }

    public void curar(int cantidad) {
        if (estaVivo()) {
            this.vida = Math.min(vidaMaxima, this.vida + cantidad);
        }
    }

    public void setCompanero(Personaje companero) {
        this.companero = companero;
    }

    public Personaje getCompanero() {
        return companero;
    }

    @Override
    public String toString() {
        return nombre + " (" + getTipo() + ") " + vida + "/" + vidaMaxima;
    }
}