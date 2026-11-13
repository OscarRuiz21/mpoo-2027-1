package mazmorra;
public class Arco extends Herramienta {
    public Arco(int danio) {
        super("Arco", danio);
    }

    @Override
    public String grito() {
        return "dispara dos flechas"
    }

    public int getFlechas() {
        return 2;
    }

    @Overridepublic int golpear() {
        return usar() + usar();
    }
}