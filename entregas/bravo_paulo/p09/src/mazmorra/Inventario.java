package mazmorra;

/** Inventario de capacidad fija para un máximo de tres herramientas. */
public class Inventario {
    private final Herramienta[] herramientas;
    private int cuantas;

    public Inventario() {
        herramientas = new Herramienta[3];
        cuantas = 0;
    }

    public boolean agregar(Herramienta h) {
        if (h == null || cuantas >= herramientas.length) {
            return false;
        }
        herramientas[cuantas] = h;
        cuantas++;
        return true;
    }

    public int getCuantas() {
        return cuantas;
    }

    public Herramienta getHerramienta(int i) {
        if (i < 0 || i >= herramientas.length) {
            return null;
        }
        return herramientas[i];
    }

    /** Usa la herramienta no rota de mayor daño; en empate conserva la primera. */
    public int usarMejor() {
        Herramienta mejor = null;
        for (int i = 0; i < cuantas; i++) {
            Herramienta actual = herramientas[i];
            if (actual != null && !actual.estaRota()
                    && (mejor == null || actual.getDanio() > mejor.getDanio())) {
                mejor = actual;
            }
        }
        return mejor == null ? 0 : mejor.usar();
    }
}
