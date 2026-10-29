package mazmorra;

/** Herramienta que puede usar un personaje y cuya durabilidad se desgasta. */
public class Herramienta {
    private final String nombre;
    private final int danio;
    private int durabilidad;

    public Herramienta(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = entre(danio, 1, 50);
        this.durabilidad = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanio() {
        return danio;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public boolean estaRota() {
        return durabilidad <= 0;
    }

    /** Devuelve cero si está rota; de lo contrario, desgasta una unidad y devuelve el daño. */
    public int usar() {
        if (estaRota()) {
            return 0;
        }
        durabilidad--;
        return danio;
    }

    public void reparar() {
        durabilidad = 100;
    }

    private int entre(int valor, int min, int max) {
        return Math.max(min, Math.min(max, valor));
    }
}
