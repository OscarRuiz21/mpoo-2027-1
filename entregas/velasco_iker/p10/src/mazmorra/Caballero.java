package mazmorra;

public class Caballero extends Personaje {
    public Caballero(String nombre) {
        super(nombre, 120);
    }

    @Override
    public String getTipo() {
        return "Caballero";
    }

    // fuerza bruta: 5 más que su herramienta
    @Override
    protected int calcularDanio(int base) {
        return base + 5;
    }
}
