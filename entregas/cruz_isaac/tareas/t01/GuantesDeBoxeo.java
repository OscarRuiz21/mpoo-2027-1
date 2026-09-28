// CONTEXTO: App para rastrear el desgaste de mi equipo de entrenamiento en el gimnasio.
// QUE SABE Y POR QUE: marca (para identificar el par), roundsUso (contador de desgaste),
//                     vendajePuesto (medida de seguridad).
// QUE SABE HACER Y POR QUE: entrenarRound() es void porque solo incrementa el uso;
//                           listosParaPelear() retorna boolean para checar si el equipo está seguro;
//                           vidaUtilRestante() retorna int para saber cuántos rounds le quedan al colchón.
// QUE IGNORE: El color de los guantes y el peso en onzas, ya que el desgaste del relleno se mide en rounds.
public class GuantesDeBoxeo {

    // ===== ATRIBUTOS =====
    String marca = "Cleto Reyes";       // tipo: String  · objeto, no primitivo
    int roundsUso = 0;                  // tipo: int     · valor inicial: 0
    boolean vendajePuesto = true;       // tipo: boolean · valor inicial: true

    // ===== METODOS =====
    // firma: entrenarRound() · retorno: void · sin parametros
    void entrenarRound() {
        roundsUso++;                    // operador contador ++
    }

    // firma: listosParaPelear() · retorno: boolean · sin parametros
    boolean listosParaPelear() {
        return vendajePuesto && !(roundsUso > 50); // operadores lógicos &&, !, y relacional >
    }

    // firma: vidaUtilRestante() · retorno: int · sin parametros
    int vidaUtilRestante() {
        return 100 - roundsUso;         // operador aritmético -
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: GuantesDeBoxeo");
        GuantesDeBoxeo guantes = new GuantesDeBoxeo();

        System.out.println("[estado inicial]");
        System.out.println("marca         = " + guantes.marca);
        System.out.println("roundsUso     = " + guantes.roundsUso);
        System.out.println("vendajePuesto = " + guantes.vendajePuesto);

        System.out.println("\n[invocando metodos]");
        guantes.entrenarRound();
        System.out.println("entrenarRound() -> void; roundsUso = " + guantes.roundsUso);
        System.out.println("listosParaPelear() -> boolean; " + guantes.listosParaPelear());
        System.out.println("vidaUtilRestante() -> int; " + guantes.vidaUtilRestante());
    }
}