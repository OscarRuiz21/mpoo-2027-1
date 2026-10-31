public class Animal {

    // private: ni sus hijos los tocan
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        // la cápsula: el constructor valida
        if (edad < 0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String sonido() {
        return "...";                // un animal a secas
    }

    // sobrescribe el toString de Object
    @Override
    public String toString() {
        return nombre + ", edad " + edad;
    }
}
