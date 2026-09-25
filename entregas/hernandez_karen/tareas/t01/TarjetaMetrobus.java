// CONTEXTO: Programa que simula el comportamiento de una tarjeta del metrobus
// QUE SABE Y POR QUE: saldo(conoce exactamente cuanto saldo tiene)
//                     numeroSerie(entre tantas tarjetas hay un identificador para cada una)
//                     TARIFA_METROBUS(sabe exactamente el costo del servicio del  metrobus)
// QUE SABE HACER Y POR QUE: consultar() solamente queremos saber el estado del saldo,no modificarlo
//                           pagarTarifa(int) solamente permite que el costo de la tarifa haga que el saldo cambie
//                           calcular(int) calcula con el saldo que tenemos para cuantos viajes nos alcanza
// QUE IGNORE:el tamaño de la tarjeta,el color de la tarjeta,no afecta en el programa
    public class TarjetaMetrobus {

        // ===== CONSTANTE (opcional, punto extra) =====
         static final int TARIFA_METROBUS=6; //tipo: int · nombre:NUMERO_SERIE · no cambia nunca
        // ===== ATRIBUTOS (etiqueta cada parte) =====
        int saldo= 123; //tipo: int · nombre: saldo · valor inicial: 123
        String numeroSerie; //tipo: String · nombre: numeroSerie· valor inicial: null

        // ===== CONSTRUCTOR =====
        // firma: TarjetaMetrobus(int) · mismo nombre de la clase · SIN tipo de retorno
        TarjetaMetrobus(String numeroSerie){
            this.numeroSerie = numeroSerie; // this.numeroSerie es el ATRIBUTO, numeroSerie a secas el PARAMETRO
        }

        // ===== METODOS  =====
        //firma: consultar() · retorno: int · sin parametros
        int consultar(){
            return saldo;
        }
        //firma: pagarTarifa() · retorno: void · sin parametros
        void pagarTarifa(){
            saldo=saldo-TARIFA_METROBUS; //operador -
        }

        //firma: calcular() · retorno: int · sin parametros
        int calcular(){
            int c;
            c=saldo/TARIFA_METROBUS; //operador /
            return c;
        }

        public static void main(String[] args) {
            System.out.println("RADIOGRAFIA: TarjetaMetrobus");
            TarjetaMetrobus t1=new TarjetaMetrobus("CDI17200218");

            System.out.println("[estado inicial]");    // 2: imprime cada atributo
            System.out.println("Saldo: "+t1.saldo);
            System.out.println("Numero de serie: "+t1.numeroSerie);

            System.out.println("[invocando metodos]"); // 3: firma + invocacion + resultado
            t1.consultar();
            System.out.println("consultar() -> int; saldo= " + t1.saldo);
            t1.pagarTarifa();
            System.out.println("pagarTarifa() -> void; saldo= " + t1.saldo);
            t1.calcular();
            System.out.println("calcular() -> int; calcular= " + t1.calcular());

            System.out.println("[estado final]");      // 4: imprime atributos otra vez
            System.out.println("Saldo: "+t1.saldo);
            System.out.println("Numero de serie: "+t1.numeroSerie);
        }
    }

