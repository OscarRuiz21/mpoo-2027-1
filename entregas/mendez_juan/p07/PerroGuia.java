public class PerroGuia extends Perro {
    private String asistido;

    public PerroGuia(String nombre, int edad, String raza, String asistido) {
        super(nombre, edad, raza);
        this.asistido = asistido;
    }

    public String getAsistido() {
        return asistido;
    }

    @Override
    public String toString() {
        // Hereda de Perro: imprime el toString del padre, le agrega "asiste a..." y el sonido lo hereda de Perro
        return super.toString() + " asiste a " + asistido;
    }
}