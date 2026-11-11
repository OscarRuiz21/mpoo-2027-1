package streaming;

public final class Pelicula extends Video implements Descargable {

    public Pelicula(String titulo, int minutos) {
        super(titulo, minutos);
    }

    @Override
    public String reproducir() {
        return "Proyectando la pelicula " + getTitulo();
    }

    @Override
    public double megas() {
        return getMinutos() * 25.0;
    }
}