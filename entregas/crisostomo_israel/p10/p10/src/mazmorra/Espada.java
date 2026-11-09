package mazmorra;

public class Espada extends Herramienta {
    public Espada(int danio) {
        super("Espada", danio);
    }

    @Override
    public String grito() {
        return "lanza un tajo";
    }

    // un tajo: todo el dano, y la espada se desgasta
    @Override
    public int golpear() {
        return usar();
    }
}