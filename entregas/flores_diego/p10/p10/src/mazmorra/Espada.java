package mazmorra;

public class Espada extends Herramienta {
    public Espada(int danio) {
        super("Espada", danio);
    }

    @Override
    public String grito() {
        return "lanza un tajo";
    }


    @Override
    public int golpear() {
        return usar();
    }
}

