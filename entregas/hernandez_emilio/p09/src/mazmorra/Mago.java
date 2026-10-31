package mazmorra;

public class Mago extends Personaje {

    public Mago(String nombre) {
        super(nombre, 80);
    }

    @Override
    public String getTipo() {
        return "Mago";
    }

    @Override
    protected int calcularDanio(int base) {
        return base * 2;
    }
}