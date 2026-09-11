// CONTEXTO: Operaciones para gestionar accesorios de audio (audifonos) al ver una pelicula en la television.
// QUE SABE Y POR QUE: Bateria (nivel de pila restante; cancelacion de ruido (booleano que indica si esta activada o no)
// QUE SABE HACER Y POR QUE: usar(double) es void pq reduce la bateria al usar los audifonos; necesitaCarga() es booleano pq indica si la bateria esta baja
//; cancelacionActivada() es booleano y nos activa la cancelacion de ruido
// QUE IGNORE: Marca de los audifonos, esta no afecta al control del audio o del dispositivo
public class Audifonos {

    // ===== ATRIBUTOS =====
    double bateria = 85.0;  //tipo: double ; nombre: bateria ; valor inicial: 85.0
    boolean cancelacionRuido = false;  //tipo: boolean; nombre: cancelacionRuido ; valor inicial: false

    // ===== METODOS =====
    void usar(double horas) { // firma: usae(double)) ; retorno: void ; parametro: double horas
        this.bateria -= horas * 10.0;  // reduce un 10% de bateria por cada hora que se usen
    }

    boolean necesitaCarga(){    //firma: necesitaCarga ; retorno: boolean ; sin parametros      
        return this.bateria <15.0; //operador <
    }

    boolean cancelacionActivada(){
        return this.cancelacionRuido = true; //operador de asignacion = y operador de retorno return
    }

    //===================
    public static void main(String[]args){
    System.out.println("RADI0GRAFIA: AUDIFONOS");
    

    //Creacion del abjeto utilizando los valores por defecto
    Audifonos au = new Audifonos();

    //Estado Inicial
    System.out.println("[Estado Inicial]");
    System.out.println("bateria = " + au.bateria);
    System.out.println("cancelacionRuido = " + au.cancelacionRuido);
    System.out.println();


    //Invocacion de metodos
    System.out.println("[Invocando los metodos]");
    au.usar(2.0);
    System.out.println("usar(double) -> void; Bateria = " + au.bateria);
    System.out.println("necesitaCarga() -> boolean = " + au.necesitaCarga());
    System.out.println("cancelacionActivada() -> boolean = " + au.cancelacionActivada());
    System.out.println();


    //Estado Final
    System.out.println("[Estado Final]");
    System.out.println("bateria = " + au.bateria + "; cancelacionRuido = " + au.cancelacionRuido);




    }
}