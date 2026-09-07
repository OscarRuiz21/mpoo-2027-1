public class Punto {
    int x, y;

    // Constructor sin parámetros (constructor por defecto explicito)
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