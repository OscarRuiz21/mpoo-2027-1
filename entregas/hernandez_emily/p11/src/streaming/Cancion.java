package streaming;

public class Cancion extends Contenido implements Descargable {

    public Cancion(String titulo, int minutos) {
        super(titulo, minutos);
    }

    @Override
    public String reproducir() {
        return "Sonando la cancion " + getTitulo();
    }

    @Override
    public double megas() {
        return getMinutos() * 1.0;
    }
}
