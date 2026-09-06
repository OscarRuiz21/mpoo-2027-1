public class PruebaPuntoConstructores {
    public static void main(String[] args) {
        // Instancia pasando parámetros al constructor
        PuntoConstructores p = new PuntoConstructores(5, 8);
        p.imprimePunto();

        // Instancia sin parámetros y asignación posterior
        PuntoConstructores x = new PuntoConstructores();
        x.x = 7;
        x.y = 2;
        x.imprimePunto();
    }
}