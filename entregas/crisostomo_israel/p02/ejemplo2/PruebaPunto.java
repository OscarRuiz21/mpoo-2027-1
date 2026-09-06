package ejemplo2;

public class PruebaPunto {
    public static void main(String[] args) {
        // Usando el constructor con parámetros (más directo)
        Punto p = new Punto(5, 8);
        p.imprimePunto();

        // Usando el constructor por defecto (asignación manual)
        Punto x = new Punto();
        x.x = 7;
        x.y = 2;
        x.imprimePunto();
    }
}
