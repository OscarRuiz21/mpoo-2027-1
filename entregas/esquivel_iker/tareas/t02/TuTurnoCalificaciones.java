import java.util.Scanner;

public class TuTurnoCalificaciones {

    static String letraConIf(int calificacion) {
        // TODO: tu escalera if-else-if
        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else if (calificacion >= 0) {
            return "F";
        }
        return "?";
    }

    static String letraConSwitch(int calificacion) {
        // TODO: tu switch moderno, sobre calificacion / 10
        if (calificacion >= 0 && calificacion <= 100) {
            return switch (calificacion / 10) {
                case 10, 9 -> "A";
                case 8     -> "B";
                case 7     -> "C";
                case 6     -> "D";
                default    -> "F";
            };
        }
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
