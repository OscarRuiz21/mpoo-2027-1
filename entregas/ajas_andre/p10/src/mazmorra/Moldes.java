package mazmorra;

public class Moldes {
    public static void main(String[] args) {
        Herramienta h = new Arco(15);        
        System.out.println("1 " + h.grito());  

        

        System.out.println("3 " + (h instanceof Arco));
        System.out.println("3 " + (h instanceof Espada));

        Arco a = (Arco) h;                
        System.out.println("4 flechas: " + a.getFlechas());

    }
}
