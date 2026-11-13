package mazmorra;

public class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, 100);
    }

    @Override
    public String getTipo() {
        return "Arquero";
    }

    // puntería: 3 más que su herramienta
    @Override
    protected int calcularDanio(int base) {
        return base + 3;
    }
}
