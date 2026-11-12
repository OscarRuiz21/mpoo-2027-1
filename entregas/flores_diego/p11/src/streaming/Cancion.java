package streaming;

// Cancion: se reproduce y se descarga. No se califica.
public class Cancion extends Contenido implements Descargable {

    public Cancion(String titulo, int minutos) {
        super(titulo, minutos);
    }

    @Override
    public String reproducir() {
        return "Sonando la cancion " + getTitulo();
    }

    // 1 mega por minuto
    @Override
    public double megas() {
        return getMinutos() * 1.0;
    }
}