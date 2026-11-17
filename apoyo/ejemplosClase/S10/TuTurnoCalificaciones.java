// MPOO S10 · Tu turno: clasificador de calificaciones
// Correr:  java TuTurnoCalificaciones.java
//
// Lee una calificacion de 0 a 100 y muestra su letra: A, B, C, D o F,
// usando if-else-if. Bonus: hazlo tambien con switch moderno.
// Pista para el switch: divide entre 10 y evalua el resultado.

import java.util.Scanner;

public class TuTurnoCalificaciones {

    static String letraConIf(int calificacion) {
        // TODO: tu escalera if-else-if
        return "?";
    }

    static String letraConSwitch(int calificacion) {
        // TODO: tu switch moderno, sobre calificacion / 10
        return "?";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Calificacion (0 a 100): ");
        int calificacion = sc.nextInt();

        System.out.println("con if     -> " + letraConIf(calificacion));
        System.out.println("con switch -> " + letraConSwitch(calificacion));

        sc.close();
    }
}
