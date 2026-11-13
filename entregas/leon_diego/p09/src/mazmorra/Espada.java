package mazmorra;
public class Espada extends Herramienta {
    public Espada(int danio) {
        super("Espada", danio);
    }

    @Overridepublic String grito() {
        return "lanza un corte";
    }

    @Overridepublic int golpear() {
        return usar();
    }
}