// P7 · Parte 2 · No se modifica: si tus clases están bien, la salida es la de la guía.
public class MainPersonajes {
    public static void main(String[] args) {
        Personaje aldeano = new Personaje("Aldeano", 150);
        Caballero g = new Caballero("Brakus", 80, 15);
        Paladin p = new Paladin("Lunara", -5, 12, 40);
        Mago m = new Mago("Zafiro", 60, 50);

        System.out.println(aldeano + " ataca con " + aldeano.atacar());
        System.out.println(g + " ataca con " + g.atacar());
        System.out.println(p + " ataca con " + p.atacar());
        System.out.println(m + " ataca con " + m.atacar());
        System.out.println(p.getNombre() + " tiene fuerza " + p.getFuerza() + " y fe " + p.getFe());
    }
}