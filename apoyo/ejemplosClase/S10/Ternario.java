// MPOO S10 · El operador ternario  condicion ? valorSi : valorNo
// Correr:  java Ternario.java

public class Ternario {
    public static void main(String[] args) {
        int edad = 15;

        // forma larga
        String tipo;
        if (edad >= 18) {
            tipo = "adulto";
        } else {
            tipo = "menor";
        }

        // forma corta: lo mismo en una linea
        String tipo2 = (edad >= 18) ? "adulto" : "menor";

        System.out.println("tipo  = " + tipo);
        System.out.println("tipo2 = " + tipo2);

        int a = 7, b = 12;
        int mayor = (a > b) ? a : b;
        System.out.println("el mayor entre " + a + " y " + b + " es " + mayor);

        System.out.println();
        System.out.println("Sirve para ASIGNAR un valor. Si la logica crece, mejor un if.");
    }
}
