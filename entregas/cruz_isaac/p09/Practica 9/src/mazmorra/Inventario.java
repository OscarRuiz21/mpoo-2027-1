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
        if (i < 0 || i >= cuantas || i >= 3) {
            return null;
        }
        return herramientas[i];
    }

    public int usarMejor() {
        int mejorIndice = -1;
        int maxDanio = -1;

        for (int i = 0; i < cuantas; i++) {
            if (herramientas[i] != null && !herramientas[i].estaRota()) {
                if (herramientas[i].getDanio() > maxDanio) {
                    maxDanio = herramientas[i].getDanio();
                    mejorIndice = i;
                }
            }
        }

        if (mejorIndice != -1) {
            return herramientas[mejorIndice].usar();
        }
        return 0;
    }
}
