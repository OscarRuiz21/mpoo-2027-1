// MPOO S10 · switch clasico y la trampa del fall-through
// Correr:  java SwitchClasico.java

public class SwitchClasico {

    static void conBreak(int opcion) {
        System.out.println("con break, opcion " + opcion + ":");
        switch (opcion) {
            case 1:
                System.out.println("   uno");
                break;
            case 2:
                System.out.println("   dos");
                break;
            default:
                System.out.println("   opcion invalida");
        }
    }

    static void sinBreak(int opcion) {
        System.out.println("SIN break, opcion " + opcion + ":");
        switch (opcion) {
            case 1:
                System.out.println("   uno");
            case 2:
                System.out.println("   dos");
            default:
                System.out.println("   opcion invalida");
        }
    }

    public static void main(String[] args) {
        conBreak(1);
        System.out.println();
        sinBreak(1);
        System.out.println();
        System.out.println("Sin break entra en el case que coincide y sigue cayendo en los de abajo.");
    }
}
