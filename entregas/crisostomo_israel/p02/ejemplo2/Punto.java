package ejemplo2;

public class Punto {
    int x, y;

    // Constructor por defecto (sin parámetros)
    public Punto() {
    }

    // Constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}
