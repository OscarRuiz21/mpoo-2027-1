// CONTEXTO: Operaciones de reproduccion de contenido en una television de señal abierta.
// QUE SABE Y POR QUE: En que canal esta sintonizada, volumen (nivel del sonido), 
// canal (numero en el que esta sintonizada).
// QUE SABE HACER Y POR QUE: bajarVolumen(int) es void porque reduce el audio, es decir cambia el estado
//  interno; subircanal() es void porque cambia el canal;
public class Television {

    // ===== ATRIBUTOS =====
    int canal = 5;  //tipo: int ; nombre: canal ; valor inicial: 5
    int volumen = 25;  //tipo: int ; nombre: volumen ; valor inicial: 25

    // ===== METODOS =====
    void bajarVolumen(int puntos) { // firma: bajarVolumen(int) ; retorno: void ; parametro: int puntos
        this.volumen -= puntos;  // operador -= y operador -
    }

    void subirCanal(){
        this.canal ++;  // operador contador ++
    }

    //===================
    public static void main(String[]args){
    System.out.println("RADI0GRAFIA: TELEVISION");
    

    //Creacion del abjeto utilizando los valores por defecto
    Television tv = new Television();

    //Estado Inicial
    System.out.println("[Estado Inicial]");
    System.out.println("canal = " + tv.canal);
    System.out.println("volumen = " + tv.volumen);
    System.out.println();


    //Invocacion de metodos
    System.out.println("[Invocando los metodos]");
    tv.bajarVolumen(24);
    System.out.println("bajarVolumen(int) -> void; canal = " + tv.canal);
    tv.subirCanal();
    System.out.println("subirCanal() -> void = " + tv.canal);
    System.out.println();


    //Estado Final
    System.out.println("[Estado Final]");
    System.out.println("canal = " + tv.canal + "; volumen = " + tv.volumen);




    }
}
