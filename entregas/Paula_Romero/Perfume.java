/*
 * CONTEXTO: Vive en una app de notas sobre cosas de mi tocador.
 * QUÉ SABE Y POR QUÉ: Guarda la marca, el aroma y los mililitrosRestantes para saber si se va a acabar.
 * QUÉ SABE HACER Y POR QUÉ: Usa un metodo void para dar atomizaciones y un metodo que retorna true o false si queda poco.
 * QUÉ IGNORÉ: Ignore el precio y el diseno del frasco porque no afectan el uso diario.
 */

public class Perfume {

    // --- ATRIBUTOS ---
    // tipo: String, nombre: marca, valor inicial: Dior
    String marca = "Dior";
    // tipo: String, nombre: aroma, valor inicial: Dulce
    String aroma = "Dulce";
    // tipo: double, nombre: mililitrosRestantes, valor inicial: 50.0
    double mililitrosRestantes = 50.0;

    // --- MÉTODOS ---
    // firma: usarPerfume(double mililitrosUsados)
    public void usarPerfume(double mililitrosUsados) {
        mililitrosRestantes = mililitrosRestantes - mililitrosUsados;
    }

    // firma: quedaPoco()
    public boolean quedaPoco() {
        if (mililitrosRestantes < 10.0) {
            return true;
        } else {
            return false;
        }
    }

    // --- MÉTODO PRINCIPAL ---
    public static void main(String[] args) {
        Perfume miPerfume = new Perfume();
        miPerfume.usarPerfume(5.5);

        System.out.println("--- TARJETA DE PERFUME ---");
        System.out.println("Marca: " + miPerfume.marca);
        System.out.println("Aroma: " + miPerfume.aroma);
        System.out.println("Mililitros restantes: " + miPerfume.mililitrosRestantes);
        System.out.println("¿Queda poco perfume?: " + miPerfume.quedaPoco());
    }
}