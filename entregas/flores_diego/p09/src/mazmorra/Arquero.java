package mazmorra;

public class Arquero extends Personaje {

    public Arquero(String nombre) {
        super(nombre, 100);
    }

    @Override
    public String getTipo() {
        return "Arquero";
    }

    @Override
    public int calcularDanio(int base) {
        return base + 3;
    }
}

