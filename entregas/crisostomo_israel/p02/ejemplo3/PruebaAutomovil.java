package ejemplo3;

public class PruebaAutomovil {
    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Chevrolet Aveo", 20020);
        /*Automovil es el tipo de dato (la clase). miAuto es el nombre de la variable. */
        miAuto.registrarServicio(150);
        /*Automóvil, registra un servicio con el valor 150 */
    }
}
