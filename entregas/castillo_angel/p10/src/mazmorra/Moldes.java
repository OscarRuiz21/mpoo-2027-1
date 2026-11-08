package mazmorra;

// La variable es de un tipo; el objeto puede ser de ese tipo o de un hijo.
public class Moldes {
    public static void main(String[] args) {
        Herramienta h = new Arco(15);           // 1 upcast: automatico
        System.out.println("1 " + h.grito());   //   manda el objeto

        
        //h.getFlechas();                      // 2 no compila

        System.out.println("3 " + (h instanceof Arco));
        System.out.println("3 " + (h instanceof Espada));

        Arco a = (Arco) h;                      // 4 downcast: se escribe
        System.out.println("4 flechas: " + a.getFlechas());

        //Espada e = (Espada) h;               // 5 compila, pero truena
    }
}
