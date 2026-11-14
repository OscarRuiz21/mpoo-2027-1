package streaming;

public class Podcast extends Contenido implements Descargable, Calificable {

    private int sumaEstrellas;
    private int calificaciones;

    public Podcast(String titulo, int minutos) {
        super(titulo, minutos);
    }

    @Override
    public String reproducir() {
        return "Escuchando el podcast " + getTitulo();
    }
    
    @Override
    public double megas() {
        return getMinutos() * 0.5;
    }
    
    @Override
    public void calificar(int estrellas) {
        if (estrellas < 1 || estrellas > 5) {
            throw new IllegalArgumentException("calificacion invalida: " + estrellas + " (debe ir de 1 a 5)");
        }
        sumaEstrellas += estrellas;
        calificaciones++;
    }

    @Override
    public double promedio() {
        if (calificaciones == 0) {
            return 0;
        }
        return (double) sumaEstrellas / calificaciones;
    }
}