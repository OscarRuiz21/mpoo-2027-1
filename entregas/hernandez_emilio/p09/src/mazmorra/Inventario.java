package mazmorra;

public class Inventario {
    private final Herramienta[] herramientas = new Herramienta[3];
    private int cuantas = 0;

    public Inventario() {
        // Arreglo inicializado por defecto en null
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
        if (i < 0 || i >= 3) {
            return null;
        }
        return herramientas[i];
    }

    public int usarMejor() {
        int indiceMejor = -1;
        int maxDanio = -1;

        for (int i = 0; i < cuantas; i++) {
            Herramienta h = herramientas[i];
            if (h != null && !h.estaRota()) {
                if (h.getDanio() > maxDanio) {
                    maxDanio = h.getDanio();
                    indiceMejor = i;
                }
            }
        }

        if (indiceMejor == -1) {
            return 0;
        }

        return herramientas[indiceMejor].usar();
    }
}
