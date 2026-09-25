// CONTEXTO:Un programa que simula el uso de una vaso que contiene agua
// QUE SABE Y POR QUE: capacidad(conoce exactamente cuanta agua puede contener)
//                     cantidad(sabe cuanta agua tiene)
// QUE SABE HACER Y POR QUE: guardarAgua(int) cambia el estado despues de guardar agua, y recibe el valor de cuanta agua va a almacenar
//                           darAgua(int) sabe cuando pierde agua y cuanto es lo que pierde,nos regresa el valor
//                           maximo(int) evualua si puede guadar el valor de agua que se proporciona,devuelve boolean
// QUE IGNORE:el tipo de material del que esta hecho el vaso, de donde viene el agua
public class VasoAgua {

    // ===== ATRIBUTOS=====
    // ej:  double saldo = 0;   // tipo: double · nombre: saldo · valor inicial: 0
    double capacidadMl=1500.00; // tipo: double · nombre: capacidadMl · valor inicial: 1500.00
    double cantidadMl=125.32; // tipo: double · nombre: cantidadMl · valor inicial: 125.32


    // ===== METODOS =====
    // firma: maximo(int) · retorno: boolean · parametro: int max
    boolean maximo(int max){
        return cantidadMl+max<=capacidadMl; //operadores +,<=
    }
    // firma: guardarAgua(int) · retorno: void · parametro: int guardarA
    void guardarAgua(int guardarA) {//evalua si no supera la cantidad maxima
        if (maximo(guardarA)) {
            cantidadMl=cantidadMl+guardarA; //operador +
        }
    }
    void darAgua(int darA){
        if(darA>0 && darA<=cantidadMl){ //un valor mayor a cero y menor o igual al que hay en el vaso,operadores >,<=,&&
            cantidadMl=cantidadMl-darA;//operador-
        }
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: VasoAgua");
        VasoAgua v1= new VasoAgua();

        System.out.println("[estado inicial]");    // 2: imprime cada atributo
        System.out.println("Capacidad del Vaso: "+ v1.capacidadMl);
        System.out.println("Cantidad de agua: "+ v1.cantidadMl);

        System.out.println("[invocando metodos]"); // 3: firma + invocacion + resultado
        System.out.println("maximo(int) -> boolean; maximo= " + v1.maximo(850));
        v1.guardarAgua(1028);
        System.out.println("guardarAgua(int) -> void; Cantidad Agua= " + v1.cantidadMl);
        v1.darAgua(23);
        System.out.println("darAgua(int) -> void; Cantidad Agua= " + v1.cantidadMl);
        int litros=(int)(v1.cantidadMl / 1000); //cast solamente litros, sin ml
        System.out.println("casting (int) de 1130.32 = " +litros);

        System.out.println("[estado final]");      // 4: imprime atributos otra vez
        System.out.println("Capacidad del Vaso: "+ v1.capacidadMl);
        System.out.println("Cantidad de agua: "+ v1.cantidadMl);

    }
}
