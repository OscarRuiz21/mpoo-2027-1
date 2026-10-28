// un Perro ES UN Animal
public class Perro extends Animal {
    // solo lo nuevo: nombre y edad vienen de Animal
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        // SIEMPRE la primera línea: Animal guarda lo suyo
        super(nombre, edad);
        this.raza = raza;
        // y luego Perro, lo suyo
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String sonido() {
        return "Guau";
    }

    @Override
    public String toString() {
        // reutiliza el del padre y le agrega la raza
        return super.toString() + " " + raza;
    }
}