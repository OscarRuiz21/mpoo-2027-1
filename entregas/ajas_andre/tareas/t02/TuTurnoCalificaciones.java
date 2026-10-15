import java.util.Scanner;

public class TuTurnoCalificaciones {

    // Método 1: Escalera if-else-if
    public static char letraConIf(int calificacion) {
        if (calificacion >= 90 && calificacion <= 100) {
            return 'A';
        } else if (calificacion >= 80 && calificacion <= 89) {
            return 'B';
        } else if (calificacion >= 70 && calificacion <= 79) {
            return 'C';
        } else if (calificacion >= 60 && calificacion <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Método 2: Switch (sintaxis moderna para JDK 21)
    public static char letraConSwitch(int calificacion) {
        int decena = calificacion / 10;
        
        return switch (decena) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una calificación (0 a 100): ");
        int cal = scanner.nextInt();

        System.out.println("Evaluación con IF-ELSE: " + letraConIf(cal));
        System.out.println("Evaluación con SWITCH: " + letraConSwitch(cal));
        
        scanner.close();
    }
}