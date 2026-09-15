/*
CONTEXTO: La impresora la uso para imprimir trabajos y documentos de la universidad.
QUE SABE Y POR QUE: Sabe cuántas hojas tiene y si está encendida porque eso representa su estado.
QUE SABE HACER Y POR QUE: Puede imprimir hojas y calcular cuántas quedan después de imprimir.
*/

public class Impresora {

    // tipo: int, nombre: hojas, valor inicial: 50
    int hojas = 50;

    // tipo: char, nombre: calidad, valor inicial: 'A'
    char calidad = 'A';

    // firma: imprimir(int)
    void imprimir(int cantidad) {
        hojas = hojas - cantidad; // operador -
        if (hojas < 0) { // operador <
            hojas = 0;
        }
    }

    // firma: paquetesDeHojas()
    int paquetesDeHojas() {
        return hojas / 10; // operador /
    }

    // firma: hojasExtra()
    int hojasExtra() {
        return hojas % 10; // operador %
    }

    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        System.out.println("Estado inicial:");
        System.out.println("Hojas: " + impresora.hojas);
        System.out.println("Calidad: " + impresora.calidad);

        System.out.println("Invocando imprimir(int)");
        impresora.imprimir(23);

        System.out.println("Invocando paquetesDeHojas()");
        System.out.println("Paquetes completos: " + impresora.paquetesDeHojas());

        System.out.println("Invocando hojasExtra()");
        System.out.println("Hojas restantes del paquete: " + impresora.hojasExtra());

        System.out.println("Estado final:");
        System.out.println("Hojas: " + impresora.hojas);
    }
}