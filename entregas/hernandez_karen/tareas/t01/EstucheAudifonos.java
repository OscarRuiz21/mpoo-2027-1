// CONTEXTO:Objeto que vive en un programa que simula un estuche de audifonos inalambricos
// QUE SABE Y POR QUE: pila(sabe cuanta pila tiene para cargar a los audifonos)
//                      abierto()sabe si esta abierto o cerrado )
// QUE SABE HACER Y POR QUE: cargar() es void ya que solamente cambia el estado de la bateria de los audifonos
//                           guardar(boolean) evalua si esta abierto o cerrado para guardar los audifonos
//                           conectarAudifonos() si el estuche tiene pila y esta abierto podemos
//                           emparejarlos con un dispositivo
// QUE IGNORE:El color del estuche y la marca,no son importantes para este programa
public class EstucheAudifonos {

    // ===== ATRIBUTOS=====
    int pila=35; //tipo: int · nombre: pila · valor inicial: 35
    boolean abierto=false; //tipo: boolean · nombre: abierto · valor inicial: false

    // ===== METODOS  =====
    //firma: cargar(int) · retorno: void · parametro: int porcentajePila
    void cargar(int porcentajePila){

        pila+=porcentajePila; //operador +=
    }

    //firma: guardar() · retorno: boolean · parametro: sin parametros
    boolean guardar(){

        return abierto;
    }

    //firma: conectarAudifonos() · retorno: boolean · parametro: sin parametros
    boolean conectarAudifonos(){

        return pila >0 && (abierto!=false); //operadores && y !
    }


    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: MiObjeto");
        EstucheAudifonos estuche1=new EstucheAudifonos();

        System.out.println("[estado inicial]");
        System.out.println("Pila: "+ estuche1.pila);
        System.out.println("Abierto: "+ estuche1.abierto);
        System.out.println("[invocando metodos]");
        estuche1.cargar(20);
        System.out.println("cargar(int) -> void; pila= " + estuche1.pila);
        estuche1.guardar();
        System.out.println("guardar() -> boolean; abierto= " + estuche1.abierto);
        estuche1.abierto=true;//que el estuche se pueda abrir para cargar los audifonos sea true
        System.out.println("cargarAudifonos() -> boolean; cargarAudifonos= " + estuche1.conectarAudifonos());


        // 3: firma + invocacion + resultado
        System.out.println("[estado final]");      // 4: imprime atributos otra vez
        System.out.println("Pila: "+ estuche1.pila);
        System.out.println("Abierto: "+ estuche1.abierto);
        System.out.println("Se pueden cargar los audifonos: "+estuche1.conectarAudifonos());
    }
}