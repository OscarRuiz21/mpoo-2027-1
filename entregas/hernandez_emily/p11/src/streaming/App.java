package streaming;

public class App implements Descargable, Calificable {

    private final String nombre;
    private final double tamanio;
    private int sumaEstrellas;
    private int calificaciones;

    public App(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double megas() {
        return tamanio;
    }

    @Override
    public void calificar(int estrellas) {
        if (estrellas < 1 || estrellas > 5) {
            throw new IllegalArgumentException(
                "calificacion invalida: " + estrellas + " (debe ir de 1 a 5)"
            );
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
