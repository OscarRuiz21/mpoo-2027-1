public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad < 0 ? 0 : edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String sonido() {
        return "...";
    }

    @Override
    public String toString() {
        return nombre + ", edad " + edad;
    }
}