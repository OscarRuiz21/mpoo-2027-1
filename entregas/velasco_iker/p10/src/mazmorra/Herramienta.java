package mazmorra;

public abstract class Herramienta {
    private final String nombre;
    private final int danio;
    private int durabilidad;

    protected Herramienta(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = entre(danio, 1, 50);
        this.durabilidad = 100;
    }

    // 1. GRITO: cada herramienta suena distinto al atacar
    public abstract String grito();

    // 2. GOLPE: cada herramienta decide cuanto dano hace un golpe
    public abstract int golpear();

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
        return durabilidad == 0;
    }

    // rota no hace daño; si no, se desgasta un punto
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