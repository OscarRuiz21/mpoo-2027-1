package mazmorra;

// La variable es de un tipo; el objeto puede ser de ese tipo o de un hijo.
public class Moldes {
    public static void main(String[] args) {
        Herramienta h = new Arco(15);

        System.out.println("1 " + h.grito());
        // 1 upcast: automatico
        // manda el objeto

        // h.getFlechas();
        // 2 no compila

        System.out.println("3 " + (h instanceof Arco));
        System.out.println("3 " + (h instanceof Espada));

        Arco a = (Arco) h;
        System.out.println("4 flechas: " + a.getFlechas());
        // 4 downcast: se escribe

        Espada e = (Espada) h;
        System.out.println(e.getNombre());
        // 5 compila, pero truena
    }
}