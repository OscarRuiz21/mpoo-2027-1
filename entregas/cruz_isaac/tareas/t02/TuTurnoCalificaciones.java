import java.util.Scanner;

public class TuTurnoCalificaciones {

    // Método 1: Usando escalera if-else-if
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
            return 'F'; // Menos de 60
        }
    }

    // Método 2: Usando switch (con la pista de dividir entre 10)
    public static char letraConSwitch(int calificacion) {
        // Si el número se sale de rango, retornamos un error
        if (calificacion < 0 || calificacion > 100) return 'X';

        int decena = calificacion / 10;

        switch (decena) {
            case 10: // Caso para el 100 (100 / 10 = 10)
            case 9:  // Caso para los 90s (ej. 95 / 10 = 9)
                return 'A';
            case 8:  // Caso para los 80s
                return 'B';
            case 7:  // Caso para los 70s
                return 'C';
            case 6:  // Caso para los 60s
                return 'D';
            default: // Menos de 60
                return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una calificacion de 0 a 100: ");
        int calif = scanner.nextInt();

        System.out.println("Letra con IF: " + letraConIf(calif));
        System.out.println("Letra con SWITCH: " + letraConSwitch(calif));

        scanner.close();
    }
}