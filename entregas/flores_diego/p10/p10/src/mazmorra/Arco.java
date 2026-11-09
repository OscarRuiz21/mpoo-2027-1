package mazmorra;

public class Arco extends Herramienta {
    public Arco(int danio) {
        super("Arco", danio);
    }

    @Override
    public String grito() {
        return "dispara dos flechas";
    }

    // solo el arco tiene flechas: Herramienta no sabe de esto
    public int getFlechas() {
        return 2;
    }

    // dos flechas: el arco se usa dos veces en un solo golpe
    @Override
    public int golpear() {
        return usar() + usar();
    }
}

