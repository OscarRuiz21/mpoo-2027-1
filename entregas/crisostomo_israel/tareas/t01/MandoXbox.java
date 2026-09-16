 /*  CONTEXTO: Interfaz cundo no utilize mi consola de Xbox, ayudaria para monitorear el estado de los controles conectados.
QUE SABE Y POR QUE: bateria (para avisarme del estado de batria), tipoConexion (W de Wireless o A de Alámbrico),
                    botonesPresionados (para calcular el desgaste físico con el tiempo o algun falso contaco que sulen tener ).
QUE SABE HACER Y POR QUE: jugar(double) es void porque altera la batería y el desgaste interno del control;
                          horasRestantes() retorna int usando casting para dar un porcentaje sin decimales.
QUE IGNORE: El color y si tiene luz RGB, porque la consola solo necesita saber la energía y conexión.
*/
public class MandoXbox {

    // ===== ATRIBUTOS =====
    double bateria = 100.0;        // tipo: double · nombre: bateria            · valor inicial: 100.0
    char tipoConexion = 'W';       // tipo: char   · nombre: tipoConexion       · valor inicial: 'W'
    int botonesPresionados = 0;    // tipo: int    · nombre: botonesPresionados · valor inicial: 0
    // ===== METODOS =====
    // firma: jugar(double)
    void jugar(double horas) {
        bateria = bateria - (horas * 12.5); // los operadores que se usan - y *
        botonesPresionados += 1500;         // el operador abreviado que tengo  +=
    }

    // firma: horasRestantes() · retorno: int · sin parametros
    int horasRestantes() {
        return (int) (bateria / 12.5);      // operador / y casting (int)
    }

    // firma: necesitaCarga() · retorno: boolean · sin parametros
    boolean necesitaCarga() {
        return bateria <= 15.0;             // operador relacional <=
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: MandoXbox");
        
        MandoXbox miControl = new MandoXbox();

        System.out.println("[estado inicial]");
        System.out.println("bateria            = " + miControl.bateria);
        System.out.println("tipoConexion       = " + miControl.tipoConexion);
        System.out.println("botonesPresionados = " + miControl.botonesPresionados);

        System.out.println("[invocando metodos]");
        miControl.jugar(3.5);
        System.out.println("jugar(double) -> void; bateria = " + miControl.bateria);
        System.out.println("horasRestantes() -> int; " + miControl.horasRestantes());
        System.out.println("necesitaCarga() -> boolean; " + miControl.necesitaCarga());

        System.out.println("[estado final]");
        System.out.println("bateria = " + miControl.bateria + " | botonesPresionados = " + miControl.botonesPresionados);
    }
}