public class PruebaPunto {
    public static void main(String[] args) {
        // Ejemplo con constructor con parámetros
        Punto p = new Punto(5, 8);
        p.imprimePunto();

        // Ejemplo con constructor por defecto
        Punto x = new Punto();
        x.x = 7;
        x.y = 2;
        x.imprimePunto();
    }
}