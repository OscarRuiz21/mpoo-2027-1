package mazmorra;

public class Hacha extends Herramienta {
    public Hacha(int danio) {
        super("Hacha", danio);
    }

    @Override
    public String grito() {
        return "da un hachazo colosal";
    }

    @Override
    public int golpear() {
        return usar();
    }
}