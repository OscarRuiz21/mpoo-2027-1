public class PuntoConstructores {
    int x, y;

    // Constructor por defecto (sin parámetros)
    public PuntoConstructores() {
    }

    // Constructor con parámetros
    public PuntoConstructores(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para imprimir las coordenadas
    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}