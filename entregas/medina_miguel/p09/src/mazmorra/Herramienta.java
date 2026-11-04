package mazmorra;

public class Herramienta {
    private String nombre;
    private int danio;
    private int durabilidad;

    public Herramienta(String nombre, int danio) {
        this.nombre = nombre;
        // Limita el daño máximo a 50 (Bloquea la trampa 3)
        this.danio = Math.min(danio, 50);
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

    public void usar() {
        if (durabilidad > 0) {
            durabilidad--;
        }
    }

    @Override
    public String toString() {
        return nombre + " (Daño: " + danio + ", Durabilidad: " + durabilidad + ")";
    }
}