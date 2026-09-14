// CONTEXTO: Esta es una App para el cuidado y monitoreo del bienestar de mis mascotas en casa
// QUE SABE Y POR QUE: nombre (para identificar al gato), nivelHambre (para saber cuándo darle de comer),
//                     dormido (para saber si está descansando y que no me moleste).
// QUE SABE HACER Y POR QUE: alimentar(int) es void porque solo altera su nivel de hambre interno
//                           quiereJugar() retorna boolean para saber si el sistema le habilita juguetes.
// QUE IGNORE: La edad y el color del pelaje, porque no cambian las interacciones
//             diarias del programa y puede ser general para cualquier gato.

public class Gato {

    static final int HAMBRE_MAXIMA = 100;   // utilize el hambre como constante ya no cambia su valor, y solo puede estar hambriento hasta 100

    // ATRIBUTOS 
    String nombre = "Desconocido";          
    int nivelHambre = 50;                   // en esta parte estan los atributos, y son las caractridticas de mi objeto 
    boolean dormido = false;                

    //CONSTRUCTOR 
    // esta es la firma: Gato
    Gato(String nombre) {
        this.nombre = nombre;               // esto es el ATRIBUTO  ysu nombre = PARAMETRO
    }
     //CONSTRUCTOR SOBRECARGADO: Lo que hace es recibir el nombre y el estado con los dos parametros
    Gato(String nombre, boolean dormido) {
        this.nombre = nombre;
        this.dormido = dormido;
    }

    // METODOS: es el metodo para alimntar al gato y el metodo para saber si quiere jugar
    void alimentar(int porcion) {
        nivelHambre -= porcion;             // operador abreviado -=
    }

    boolean quiereJugar() {
        return nivelHambre < 30 && !dormido; // operadores < (relacional), && y ! (lógicos)
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Gato");
        
        Gato miGato = new Gato("Belcebú", false); //new, clase e instancia

        System.out.println("[estado inicial]");
        System.out.println("nombre      = " + miGato.nombre);
        System.out.println("nivelHambre = " + miGato.nivelHambre);
        System.out.println("dormido     = " + miGato.dormido);

        System.out.println("[invocando metodos]");
        miGato.alimentar(25);
        System.out.println("alimentar(int) -> void; nivelHambre = " + miGato.nivelHambre);
        System.out.println("quiereJugar() -> boolean; " + miGato.quiereJugar());

        System.out.println("[estado final]");
        System.out.println("nombre = " + miGato.nombre + " | nivelHambre = " + miGato.nivelHambre + " | dormido = " + miGato.dormido);
    }
}