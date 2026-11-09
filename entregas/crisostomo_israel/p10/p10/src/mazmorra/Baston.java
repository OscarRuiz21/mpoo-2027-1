package mazmorra;

public class Baston extends Herramienta {
    public Baston(int danio) {
        super("Baston", danio);
    }

    @Override
    public String grito() {
        return "lanza un hechizo";
    }

    // un hechizo: todo el dano, y la magia no desgasta el baston
    @Override
    public int golpear() {
        return getDanio();
    }
}