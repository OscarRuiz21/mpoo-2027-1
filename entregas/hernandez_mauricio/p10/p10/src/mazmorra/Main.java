package mazmorra;
public class Main {
    public static void main(String[] args) {
        Herramienta arco = new Arco(15); // tipo Herramienta, objeto

        Personaje legolas = new Arquero("Legolas");
        Personaje conan = new Caballero("Conan");
        legolas.equipar(arco);
        System.out.println("Legolas " + arco.grito());
        legolas.atacar(conan);
        System.out.println(conan);
        System.out.println(arco.getNombre() + ": durabilidad "
                + arco.getDurabilidad());
    }
}