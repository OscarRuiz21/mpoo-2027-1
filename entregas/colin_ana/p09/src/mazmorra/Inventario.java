package mazmorra;

public class Inventario {
    private final Herramienta[] herramientas;
    private int cuantas;

    public Inventario() {
        this.herramientas = new Herramienta[3];
        this.cuantas = 0;
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
        if (i < 0 || i >= cuantas) {
            return null;
        }
        return herramientas[i];
    }

    public int usarMejor() {
        int mejorIndice = -1;
        int maxDanio = -1;

        for (int i = 0; i < cuantas; i++) {
            Herramienta h = herramientas[i];
            if (!h.estaRota() && h.getDanio() > maxDanio) {
                maxDanio = h.getDanio();
                mejorIndice = i;
            }
        }

        if (mejorIndice == -1) {
            return 0;
        }

        return herramientas[mejorIndice].usar();
    }
}