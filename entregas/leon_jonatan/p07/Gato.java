public class Gato extends Animal {
    private boolean interior;

    public Gato(String nombre, int edad, boolean interior) {
        super(nombre, edad);
        this.interior = interior;
    }

    public boolean isInterior() {
        return interior;
    }

    @Override
    public String sonido() {
        return "Miau";
    }

    @Override
    public String toString() {
        String tipo = interior ? "de interior" : "de exterior";
        return super.toString() + " " + tipo;
    }
}