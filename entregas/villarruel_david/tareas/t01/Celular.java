/*
CONTEXTO: El celular lo uso para comunicarme y hacer actividades de la universidad.
QUE SABE Y POR QUE: Sabe su bateria y si esta encendido porque son datos importantes de su estado.
QUE SABE HACER Y POR QUE: Puede cargar bateria y revisar si esta listo para usarse.
*/

public class Celular {

    // tipo: double, nombre: bateria, valor inicial: 50.0
    double bateria = 50.0;

    // tipo: boolean, nombre: encendido, valor inicial: true
    boolean encendido = true;

    // firma: cargar(double)
    void cargar(double cantidad) {
        bateria = bateria + cantidad; // operador +
        if (bateria > 100) { // operador >
            bateria = 100;
        }
    }

    // firma: puedeUsarse()
    boolean puedeUsarse() {
        return bateria > 0 && encendido; // operadores > y &&
    }

    public static void main(String[] args) {

        Celular celular = new Celular();

        System.out.println("Estado inicial:");
        System.out.println("Bateria: " + celular.bateria);
        System.out.println("Encendido: " + celular.encendido);

        System.out.println("Invocando cargar(double)");
        celular.cargar(20);

        System.out.println("Invocando puedeUsarse()");
        System.out.println("Puede usarse: " + celular.puedeUsarse());

        System.out.println("Estado final:");
        System.out.println("Bateria: " + celular.bateria);
    }
}