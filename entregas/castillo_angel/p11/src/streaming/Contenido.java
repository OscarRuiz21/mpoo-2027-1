package streaming;

public abstract class Contenido {
    
    private final String titulo;
    private final int minutos;

    protected Contenido(String titulo, int minutos){
        this.titulo = titulo;
        this.minutos = minutos;
    }

    public abstract String reproducir();

    public String getTitulo(){
        return titulo;
    }

    public int getMinutos(){
        return minutos;
    }
}
