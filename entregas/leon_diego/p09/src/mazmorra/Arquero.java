package mazmorra;

public class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, 100);
    }

    @Override
    protected int calcularDanio(int base) {
        return base + 3;
    }
}