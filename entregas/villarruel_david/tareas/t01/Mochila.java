/*
CONTEXTO: La mochila la uso para llevar mis cosas de la universidad.
QUE SABE Y POR QUE: Sabe su peso y cuántos compartimentos tiene porque son características de la mochila.
QUE SABE HACER Y POR QUE: Puede agregar peso y calcular cuánto peso lleva para representar su uso.
*/

public class Mochila {

    // tipo: double, nombre: pesoKg, valor inicial: 0
    double pesoKg = 0;

    // tipo: int, nombre: compartimentos, valor inicial: 3
    int compartimentos = 3;

    // firma: Mochila(double)
    Mochila(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    // firma: agregarPeso(double)
    void agregarPeso(double peso) {
        pesoKg += peso; // operador +=
    }

    // firma: pesoTotal()
    double pesoTotal() {
        return pesoKg * compartimentos; // operador *
    }

    public static void main(String[] args) {

        Mochila mochila = new Mochila(2.5);

        System.out.println("Estado inicial:");
        System.out.println("Peso: " + mochila.pesoKg);
        System.out.println("Compartimentos: " + mochila.compartimentos);

        System.out.println("Invocando agregarPeso(double)");
        mochila.agregarPeso(1.5);

        System.out.println("Invocando pesoTotal()");
        System.out.println("Peso total: " + mochila.pesoTotal());

        System.out.println("Estado final:");
        System.out.println("Peso: " + mochila.pesoKg);
    }
}