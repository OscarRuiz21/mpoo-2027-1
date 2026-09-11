// CONTEXTO: Vive en una app de streaming (tipo Netflix) para controlar la reproduccion de contenido en pantalla.
// QUE SABE Y POR QUE: titulo y duracionMin (identifican la cinta), minutosVistos (mide el avance),
// enPausa (estado del reproductor), clasificacion (restriccion de edad).
// QUE SABE HACER Y POR QUE: reproducir(double) es void porque solo cambia el estado interno; 
// porcentajeVisto() retorna double para pintar la barra de progreso; estaTerminada() retorna boolean para cambiar de video.
// QUE IGNORE: Reparto de actores y director porque no influyen en la logica de reproduccion de este programa.

public class Pelicula {

    // ===== ATRIBUTOS =====
    String titulo = "Sin titulo";      // tipo: String ; nombre: titulo ; valor inicial: "Sin titulo"
    int duracionMin = 120;             // tipo: int ; nombre: duracionMin ; valor inicial: 120
    double minutosVistos = 0.0;        // tipo: double ; nombre: minutosVistos ; valor inicial: 0.0
    boolean enPausa = true;            // tipo: boolean ; nombre: enPausa ; valor inicial: true
    char clasificacion = 'B';          // tipo: char ; nombre: clasificacion ; valor inicial: 'B'

    // ===== CONSTRUCTOR =====
    Pelicula(String titulo, int duracionMin) {  // firma: Pelicula(String, int) ; sin tipo de retorno
        this.titulo = titulo;
        this.duracionMin = duracionMin;
    }

    // ===== METODOS =====
    void reproducir(double minutos) {   // firma: reproducir(double) ; retorno: void ; parametro: double minutos
        this.minutosVistos = this.minutosVistos + minutos;  // operador aritmetico +
        this.enPausa = false;
    }

    double porcentajeVisto() {  // firma: porcentajeVisto() ; retorno: double ; sin parametros
        return (this.minutosVistos / this.duracionMin) * 100.0; // operador aritmetico /
    }
    
    boolean estaTerminada() {   // firma: estaTerminada() ; retorno: boolean ; sin parametros
        return (this.minutosVistos >= this.duracionMin) && !this.enPausa; // operador relacional >= y operador logico &&
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Pelicula");
        System.out.println();

        // Creacion del objeto usando el constructor
        Pelicula p = new Pelicula("Inception", 148);

        // Estado inicial
        System.out.println("[estado inicial]");
        System.out.println("titulo = " + p.titulo);
        System.out.println("duracionMin = " + p.duracionMin);
        System.out.println("minutosVistos = " + p.minutosVistos);
        System.out.println("enPausa = " + p.enPausa);
        System.out.println("clasificacion = " + p.clasificacion);
        System.out.println();

        // Invocacion de metodos
        System.out.println("[invocando metodos]");
        p.reproducir(74.0);
        System.out.println("reproducir(double) -> void; minutosVistos = " + p.minutosVistos);
        System.out.println("porcentajeVisto() -> double; " + p.porcentajeVisto() + "%");
        System.out.println("estaTerminada() -> boolean; " + p.estaTerminada());

        // Modulo % y Casting explicito (int)
        int minutosCompletos = (int) p.minutosVistos; // casting explicito: de double a int
        int minutosModulo = p.duracionMin % 60;        // operador residuo % (minutos sobrantes de la hora)
        System.out.println("casting (int) " + p.minutosVistos + " = " + minutosCompletos);
        System.out.println("modulo % (148 % 60) = " + minutosModulo);
        System.out.println();

        // Estado final
        System.out.println("[estado final]");
        System.out.println("minutosVistos = " + p.minutosVistos + " | enPausa = " + p.enPausa);
    }
}