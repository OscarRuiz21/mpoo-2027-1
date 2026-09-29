// MPOO S10 · Booleanos y condiciones
// Correr:  java Booleanos.java

public class Booleanos {

    // devuelve lo que le pidan, pero deja rastro: sirve para ver el cortocircuito
    static boolean pregunta(String nombre, boolean valor) {
        System.out.println("   ...se evalua " + nombre);
        return valor;
    }

    public static void main(String[] args) {
        int edad = 20;

        boolean mayorDeEdad = (edad >= 18);
        boolean enRango = (edad > 0) && (edad < 100);

        System.out.println("edad        = " + edad);
        System.out.println("mayorDeEdad = " + mayorDeEdad);
        System.out.println("enRango     = " + enRango);

        System.out.println();
        System.out.println("&& se corta en cuanto algo es false:");
        boolean r1 = pregunta("A, que es false", false) && pregunta("B", true);
        System.out.println("resultado = " + r1 + "   (B nunca se evaluo)");

        System.out.println();
        System.out.println("|| se corta en cuanto algo es true:");
        boolean r2 = pregunta("A, que es true", true) || pregunta("B", false);
        System.out.println("resultado = " + r2 + "   (B nunca se evaluo)");

        System.out.println();
        System.out.println("Lo que vimos la clase pasada:");
        System.out.println("0.1 + 0.2        -> " + (0.1 + 0.2));
        System.out.println("0.1 + 0.2 == 0.3 -> " + (0.1 + 0.2 == 0.3));

        String a = "hola";
        String b = new String("hola");
        System.out.println("a == b           -> " + (a == b) + "   (compara objetos)");
        System.out.println("a.equals(b)      -> " + a.equals(b) + "    (compara contenido)");
    }
}
