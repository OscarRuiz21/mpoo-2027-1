// CONTEXTO: Sistema de monitoreo de bateria y audio para unos audifonos Bluetooth.
// QUE SABE Y POR QUE: Sabe el nivel de bateria (double) y el volumen actual (int) para gestionar la reproduccion.
// QUE SABE HACER Y POR QUE: Sabe subir volumen (void) y verificar si la bateria es suficiente (boolean).
// QUE IGNORO: Ignoro la marca, el color, el codec de audio y el microfono.

public class Audifonos {

    // Atributos
    private double bateria;
    private int volumen;

    // Metodo void con parametro
    // firma: subirVolumen(int)
    public void subirVolumen(int incremento) {
        this.volumen += incremento; // Operador: +=
    }

    // Metodo que retorna valor
    // firma: tieneBateriaSuficiente()
    public boolean tieneBateriaSuficiente() {
        return this.bateria > 15.0 && this.volumen <= 100; // Operadores: >, <= y &&
    }

    public static void main(String[] args) {
        Audifonos a = new Audifonos();
        a.bateria = 80.5;
        a.volumen = 50;

        System.out.println("--- Estado Inicial ---");
        System.out.println("Bateria: " + a.bateria + "%, Volumen: " + a.volumen);

        // Invocaciones
        a.subirVolumen(20);
        boolean lista = a.tieneBateriaSuficiente();

        System.out.println("\n--- Estado Final ---");
        System.out.println("Nuevo Volumen: " + a.volumen);
        System.out.println("¿Bateria suficiente?: " + lista);
    }
}