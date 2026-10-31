package mazmorra;

public class Inventario {

    private final Herramienta[] herramientas;
    private int cuantas;

    public Inventario() {
        this.herramientas = new Herramienta[3];
        this.cuantas = 0;
    }


    public boolean agregar(Herramienta h) {
        if (h == null || this.cuantas >= 3) {
            return false;
        }

        for (int i = 0; i < herramientas.length; i++) {
            if (herramientas[i] == null) {
                herramientas[i] = h;
                this.cuantas++;
                return true;
            }
        }
        return false;
    }

    public int getCuantas() {
        return this.cuantas;
    }

    public Herramienta getHerramienta(int i) {
        if (i < 0 || i >= herramientas.length) {
            return null;
        }
        return herramientas[i];
    }

    public int usarMejor() {
        Herramienta mejorHerramienta = null;

        for (int i = 0; i < herramientas.length; i++) {
            Herramienta actual = herramientas[i];

            if (actual != null && !actual.estaRota()) {
                if (mejorHerramienta == null || actual.getDanio() > mejorHerramienta.getDanio()) {
                    mejorHerramienta = actual;
                }
            }
        }

        if (mejorHerramienta != null) {
            return mejorHerramienta.usar();
        }

        return 0;
    }
}
