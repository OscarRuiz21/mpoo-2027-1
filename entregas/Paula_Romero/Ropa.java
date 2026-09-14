/*
 * CONTEXTO: Vive en un organizador personal para saber que ponerme en la semana.
 * QUÉ SABE Y POR QUÉ: Guarda la prenda, el color y si estaLimpia para saber si la puedo usar hoy.
 * QUÉ SABE HACER Y POR QUÉ: Tiene un metodo void para cambiar su estado a sucia y un metodo que regresa si esta disponible.
 * QUÉ IGNORÉ: Ignore la talla y la marca porque solo me importa organizarla por limpia o sucia.
 */

public class Ropa {

    // --- ATRIBUTOS ---
    // tipo: String, nombre: tipoPrenda, valor inicial: Sudadera
    String tipoPrenda = "Sudadera";
    // tipo: String, nombre: color, valor inicial: Negra
    String color = "Negra";
    // tipo: boolean, nombre: estaLimpia, valor inicial: true
    boolean estaLimpia = true;

    // --- MÉTODOS ---
    // firma: usarPrenda(int horasDeUso)
    public void usarPrenda(int horasDeUso) {
        if (horasDeUso > 5) {
            estaLimpia = false;
        }
    }

    // firma: sePuedeUsar()
    public boolean sePuedeUsar() {
        return estaLimpia;
    }

    // --- MÉTODO PRINCIPAL ---
    public static void main(String[] args) {
        Ropa miRopa = new Ropa();
        miRopa.usarPrenda(8);

        System.out.println("--- TARJETA DE ROPA ---");
        System.out.println("Prenda: " + miRopa.tipoPrenda);
        System.out.println("Color: " + miRopa.color);
        System.out.println("¿Esta limpia?: " + miRopa.estaLimpia);
        System.out.println("¿Me la puedo poner?: " + miRopa.sePuedeUsar());
    }
}