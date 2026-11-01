package mazmorra;

public class Inventario {
    private final Herramienta[] herramientas;
    private int cuantas;

    public Inventario() {
        this.herramientas = new Herramienta[3];
        this.cuantas = 0;
    }

    public boolean agregar(Herramienta h) {
        if (h == null || cuantas >= 3) {
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

    public int usarMejor() {
        Herramienta mejor = null;
        for (int i = 0; i < cuantas; i++) {
            Herramienta actual = herramientas[i];
            if (!actual.estaRota()) {
                if (mejor == null || actual.getDanio() > mejor.getDanio()) {
                    mejor = actual;
                }
            }
        }
        if (mejor != null) {
            return mejor.usar();
        }
        return 0;
    }
}