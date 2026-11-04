package mazmorra;

public class Main {
    public static void main(String[] args) {
        Herramienta espada = new Herramienta("Espada", 20);
        Herramienta baston = new Herramienta("Baston", 10);
        Herramienta arco = new Herramienta("Arco", 15);

        Personaje conan = new Caballero("Conan");
        Personaje merlin = new Mago("Merlin");
        Personaje legolas = new Arquero("Legolas");
        conan.equipar(espada);
        merlin.equipar(baston);
        legolas.equipar(arco);
        merlin.setCompanero(conan);

        System.out.println("Al empezar:");
        System.out.println(conan);
        System.out.println(merlin);
        System.out.println(legolas);

        conan.atacar(legolas);
        merlin.atacar(conan);
        legolas.atacar(merlin);
        merlin.ayudarCompanero();

        System.out.println("Despues de una ronda:");
        System.out.println(conan);
        System.out.println(merlin);
        System.out.println(legolas);
        System.out.println(espada.getNombre() + ": durabilidad " + espada.getDurabilidad());
    }
}
