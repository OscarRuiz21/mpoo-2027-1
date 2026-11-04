import java.util.Scanner;

public class TuTurnoCalificaciones {

    public static char letraConIf(int calif) {
        if (calif >= 90 && calif <= 100) {
            return 'A';
        } else if (calif >= 80 && calif <= 89) {
            return 'B';
        } else if (calif >= 70 && calif <= 79) {
            return 'C';
        } else if (calif >= 60 && calif <= 69) {
            return 'D';
        } else if (calif >= 0 && calif < 60) {
            return 'F';
        } else {
            System.out.println("Calificación fuera de rango (0-100).");
            return 'X';
        }
    }

    public static char letraConSwitch(int calif) {
        if (calif < 0 || calif > 100) {
            System.out.println("Calificación fuera de rango (0-100).");
            return 'X';
        }
        
        // Pista: dividir entre 10 agrupa las decenas (ej. 95/10 = 9, 82/10 = 8)
        int categoria = calif / 10;
        switch (categoria) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default: // Para 5, 4, 3, 2, 1, 0 (< 60)
                return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una calificación de 0 a 100: ");
        int calif = scanner.nextInt();
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Resultado con if-else-if: " + letraConIf(calif));
        System.out.println("Resultado con switch:     " + letraConSwitch(calif));
        
        scanner.close();
    }
}