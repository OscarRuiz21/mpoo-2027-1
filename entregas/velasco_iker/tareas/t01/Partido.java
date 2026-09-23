// CONTEXTO: aplicación para llevar el tanteo exacto y estadísticas de un partido de tenis en tiempo real.
// QUE SABE Y POR QUE: juegosGanados (int, para llevar el marcador), minutosJugados (double, para el tiempo total), superficie (char, para indicar la pista: C=Césped, T=Tierra, R=Rápida).
// QUE SABE HACER Y POR QUE: sumarJuegos(int) es void porque actualiza el marcador; calcularPromedioJuegosPorSet() retorna double para dar precisión matemática.
// QUE IGNORE: el juez de silla y el clima, ya que no intervienen directamente en el marcador matemático del juego.
public class Partido {

    int juegosGanados = 0;
    double minutosJugados = 0.0;
    char superficie = 'T';

    void sumarJuegos(int n) {
        juegosGanados += n;
    }

    void jugarTiempo(double min) {
        minutosJugados = minutosJugados + min;
    }

    boolean esNumeroParDeJuegos() {
        return juegosGanados % 2 == 0;
    }

    int calcularPuntajeTotal(int aces, int dobleFaltas) {
        return (aces * 3) - (dobleFaltas * 2);
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Partido");
        Partido p = new Partido();
        p.sumarJuegos(6);
        p.jugarTiempo(45.5);
        System.out.println("juegosGanados = " + p.juegosGanados);
        System.out.println("minutosJugados = " + p.minutosJugados);
        System.out.println("esNumeroParDeJuegos = " + p.esNumeroParDeJuegos());
        System.out.println("calcularPuntajeTotal = " + p.calcularPuntajeTotal(8, 2));
        int minutosEnteros = (int) p.minutosJugados;
        System.out.println("minutosEnteros (casting) = " + minutosEnteros);
    }
}