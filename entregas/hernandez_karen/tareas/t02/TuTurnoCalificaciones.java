// MPOO S10 · Tu turno: clasificador de calificaciones
// Correr:  java TuTurnoCalificaciones.java
//
// Lee una calificacion de 0 a 100 y muestra su letra: A, B, C, D o F,
// usando if-else-if. Bonus: hazlo tambien con switch moderno.
// Pista para el switch: divide entre 10 y evalua el resultado.

import java.util.Scanner;

public class TuTurnoCalificaciones {

    static String letraConIf(int calificacion) {

        if (calificacion >= 90 && calificacion <= 100) {
            return "A";
        } else if (calificacion >= 80 && calificacion <= 89) {
            return "B";
        } else if (calificacion >= 70 && calificacion <= 79) {
            return "C";
        } else if (calificacion >= 60 && calificacion <= 69) {
            return "D";
        } else if (calificacion >= 0 && calificacion <= 59) {
            return "F";
        } else {
            return "La calificacion no entra en el rango";
        }
    }


    static String letraConSwitch(int calificacion) {
        if (calificacion < 0 || calificacion > 100) {
            return "No entra en el rango";
        }
        int op=calificacion / 10;
        return switch (op){
            case 9,10-> "A";
            case 8->  "B";
            case 7-> "C";
            case 6-> "D";
            default -> "F";
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