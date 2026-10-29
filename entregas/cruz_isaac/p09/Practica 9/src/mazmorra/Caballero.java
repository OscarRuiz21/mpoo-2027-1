package mazmorra;

public class Caballero extends Personaje {

    public Caballero(String nombre) {
        super(nombre, 120);
    }

    @Override
    public String getTipo() {
        return "Caballero";
    }

    @Override
    protected int calcularDanio(int base) {
        return base + 5;
    }
}
