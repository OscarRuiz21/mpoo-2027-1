package mazmorra;

public class Inventario {
    private Herramienta[] herramientas;
    private int cuantas;

    public Inventario() {
        this.herramientas = new Herramienta[3]; // Límite máximo de 3 herramientas
        this.cuantas = 0;
    }

    public boolean agregarHerramienta(Herramienta h) {
        if (cuantas < herramientas.length) {
            herramientas[cuantas] = h;
            cuantas++;
            return true;
        }
        return false; // Inventario lleno (Bloquea la trampa 4)
    }

    public int getCuantas() {
        return cuantas;
    }

    public Herramienta getHerramienta(int indice) {
        if (indice >= 0 && indice < cuantas) {
            return herramientas[indice];
        }
        return null; // Índice inválido (Bloquea la trampa 5)
    }
}