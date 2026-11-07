package mazmorra;

public class Baston extends Herramienta {

    public Baston(int danio) {
        super("Baston", danio);
    }

    @Override
    public String grito() {
        return "lanza un hechizo";
    }

    @Override
    public int golpear() {
        return getDanio();
    }
}