// CONTEXTO: Mochila escolar para cargar cuadernos o cosas necesarias
// / QUE SABE Y POR QUE: pesoKg (saber el peso actual), cerrada (saber si se puede meter algo).
// QUE SABE HACER Y POR QUE: meter (void, solo modifica el peso), estaPesada (retorna boolean si excede el limite).
// QUE IGNORE: color y marca, no afectan la capacidad ni el peso.
public class Mochila {
    // ATRIBUTOS
    double pesoKg = 1.2;
    boolean cerrada = false;

    // CONSTRUCTOR 
    public Mochila(double pesoKg, boolean cerrada) {
        this.pesoKg = pesoKg;
        this.cerrada = cerrada;
    }

    // METODO 1 
    void meter(double kg) {
        if (!cerrada) {
            pesoKg += kg; 
        }
    }

    // METODO 2 
    
    boolean estaPesada() {
        return pesoKg >= 5.0; 
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Mochila");
        System.out.println("[Estado inicial]");
        Mochila m = new Mochila(1.5, false);
        System.out.println("Peso: " + m.pesoKg + " kg | Cerrada: " + m.cerrada);

        System.out.println("[Invocando metodos]");
        m.meter(4.0);
        System.out.println("Pesada: " + m.estaPesada());

        System.out.println("[Estado final]");
        System.out.println("Peso: " + m.pesoKg + " kg");
    }
}