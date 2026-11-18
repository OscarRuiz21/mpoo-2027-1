package mazmorra;

public class Inventario {
    private final Herramienta[] herramientas;
    private int cuantas;

    public Inventario() {
        this.herramientas = new Herramienta[3];
        this.cuantas = 0;
    }

    // false si está lleno: el arreglo nunca se entrega a nadie
    public boolean agregar(Herramienta h) {
        if (h == null || cuantas == herramientas.length) {
            return false;
        }
        herramientas[cuantas] = h;
        cuantas++;
        return true;
    }

    public int getCuantas() {
        return cuantas;
    }

    // null si en esa posición no hay herramienta
    public Herramienta getHerramienta(int i) {
        if (i < 0 || i >= cuantas) {
            return null;
        }
        return herramientas[i];
    }

    // usa la herramienta sana que más daño hace; 0 si no hay ninguna
    public int usarMejor() {
        Herramienta mejor = null;
        for (int i = 0; i < cuantas; i++) {
            Herramienta h = herramientas[i];
            if (!h.estaRota() && (mejor == null || h.getDanio() > mejor.getDanio())) {
                mejor = h;
            }
        }
        if (mejor == null) {
            return 0;
        }
        return mejor.usar();
    }
}
