// CONTEXTO: sistema de rendimiento físico y estadísticas de un tenista profesional en el circuito ATP.
// QUE SABE Y POR QUE: ranking (int, posición mundial), energia (double, porcentaje de condición física), lesionado (boolean, para saber si puede saltar a la cancha).
// QUE SABE HACER Y POR QUE: entrenar(double) es void porque desgasta la energía; aptoParaCompetir() retorna boolean evaluando la salud del deportista.
// QUE IGNORE: los contratos de patrocinio y la indumentaria deportiva ya que no alteran su estado físico o ranking.
public class Jugador {

    int ranking = 10;
    double energia = 100.0;
    boolean lesionado = false;

    void entrenar(double desgaste) {
        energia -= desgaste;
    }

    boolean aptoParaCompetir() {
        return energia > 20.0 && !lesionado;
    }

    double calcularIndice(int torneosJugados) {
        return ranking / (double) torneosJugados;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Jugador");
        Jugador j = new Jugador();
        j.entrenar(25.0);
        System.out.println("energia despues de entrenar = " + j.energia);
        System.out.println("aptoParaCompetir = " + j.aptoParaCompetir());
        System.out.println("calcularIndice = " + j.calcularIndice(4));
    }
}