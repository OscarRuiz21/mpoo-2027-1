public class PerroGuia extends Perro {
    private String asistido;

    public PerroGuia(String nombre, int edad, String raza, String asistido) {
        // Llama al constructor de Perro
        super(nombre, edad, raza);
        this.asistido = asistido;
    }

    public String getAsistido() {
        return asistido;
    }
        @Override
        public String toString() {
            return super.toString() + " asiste a " + asistido;
        }
}