// MPOO S10 · La clase Math
// Correr:  java MathDemo.java

public class MathDemo {
    public static void main(String[] args) {
        int a = 7, b = 12;

        System.out.println("Math.abs(-7)     = " + Math.abs(-7));
        System.out.println("Math.max(7, 12)  = " + Math.max(a, b));
        System.out.println("Math.min(7, 12)  = " + Math.min(a, b));
        System.out.println("Math.round(3.6)  = " + Math.round(3.6));
        System.out.println("Math.pow(2, 10)  = " + Math.pow(2, 10));
        System.out.println("Math.sqrt(144)   = " + Math.sqrt(144));
        System.out.println("Math.random()    = " + Math.random() + "   (cambia en cada corrida)");

        System.out.println();
        double x = 0.1 + 0.2;
        double y = 0.3;
        System.out.println("x == y                       -> " + (x == y));
        System.out.println("Math.abs(x - y) < 0.0000001  -> " + (Math.abs(x - y) < 0.0000001));

        System.out.println();
        System.out.println("Los decimales no se comparan con ==: se compara su diferencia contra una tolerancia.");
        System.out.println("Math son metodos static: se llaman con el nombre de la clase, sin crear un objeto.");
    }
}
