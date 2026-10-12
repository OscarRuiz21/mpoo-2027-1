import java.util.Scanner;

public class TuTurnoCalificaciones {

    public static char letraConIf(int calificacion) {
        if (calificacion >= 90 && calificacion <= 100) {
            return 'A';
        } else if (calificacion >= 80) {
            return 'B';
        } else if (calificacion >= 70) {
            return 'C';
        } else if (calificacion >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static char letraConSwitch(int calificacion) {
        int decenas = calificacion / 10;
        return switch (decenas) {
            case 10, 9 -> 'A';
            case 8     -> 'B';
            case 7     -> 'C';
            case 6     -> 'D';
            default    -> 'F';
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una calificación (0 a 100): ");
        int calificacion = scanner.nextInt();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Calificación fuera del rango válido (0-100).");
        } else {
            System.out.println("Resultado con if-else: " + letraConIf(calificacion));
            System.out.println("Resultado con switch: " + letraConSwitch(calificacion));
        }

        scanner.close();
    }
}