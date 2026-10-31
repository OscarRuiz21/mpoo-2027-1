package mazmorra;

public class Herramienta {
    private final String nombre;
    private final int danio;
    private int durabilidad;

    public Herramienta(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = cntrc(danio, 1, 50);
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

    private int cntrc(int valor, int min, int max) {
        if (valor < min) return min;
        if (valor > max) return max;
        return valor;
    }
}