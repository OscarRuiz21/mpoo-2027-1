package streaming;

// Contenido: todo lo que se puede reproducir en la plataforma.
// Es abstracta: no existe "un contenido" a secas; siempre es una cancion, un video o un
//podcast.

public abstract class Contenido {

    private final String titulo;
    private final int minutos;

    protected Contenido(String titulo, int minutos) {
        this.titulo = titulo;
        this.minutos = minutos;
    }

    // Todo contenido se reproduce, pero cada hija dice como
    public abstract String reproducir();

    public String getTitulo() {
        return titulo;
    }

    public int getMinutos() {
        return minutos;
    }
}