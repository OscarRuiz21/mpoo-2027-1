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
        if ( calificacion >= 90 && calificacion <= 100){
            return "A";
        } else if (calificacion >= 80 && calificacion < 90){
            return "B";
        } else if (calificacion >= 70 && calificacion < 80){
            return "C";
        } else if (calificacion >= 60 && calificacion < 70){
            return "D";
        } else if(calificacion > 0 && calificacion < 60){
            return "F";
        } else {
            return "Opcion Invalida";
        }
    }

    static String letraConSwitch(int calificacion) {
        // TODO: tu switch moderno, sobre calificacion / 10
        int rango = calificacion/ 10;
        return switch (rango){
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 5, 4, 3, 2, 1 -> "F";
            default -> "Calificacion invalida"; 
        };
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