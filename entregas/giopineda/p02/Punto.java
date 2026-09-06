/*
// FASE 1: Implementación básica
public class Punto {
    int x, y;
    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}
*/

/*
// FASE 2 y 3: Constructor parametrizado 
// (Elimina el constructor por defecto vacío)
public class Punto {
    int x, y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}
*/

// FASE 4: Sobrecarga de constructores (ACTIVA)
public class Punto {
    int x, y;

    // Constructor por defecto (vacío)
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