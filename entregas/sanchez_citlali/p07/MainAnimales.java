public class MainAnimales {
    public static void main(String[] args) {
        Animal a = new Animal("Lomito", -2);
        Perro p = new Perro("Firulais", 3, "criollo");
        PerroGuia g = new PerroGuia("Max", 5, "labrador", "Marta");
        Gato c = new Gato("Michi", 2, true);

        System.out.println(a + " dice " + a.sonido());
        System.out.println(p + " dice " + p.sonido());
        System.out.println(g + " dice " + g.sonido());
        System.out.println(c + " dice " + c.sonido());
        System.out.println(g.getNombre() + " es " + g.getRaza() + ", edad " + g.getEdad());
    }
}