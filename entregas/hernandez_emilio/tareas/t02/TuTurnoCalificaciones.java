import java.util.Scanner;

public class TuTurnoCalificaciones {

    static char letraConIf(int calificacion) {
        if (calificacion >= 90) {
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

    static char letraConSwitch(int calificacion) {
        // Al dividir entre 10 obtenemos el rango (ej. 95 / 10 = 9)
        int rango = calificacion / 10;
        
        // Uso de switch moderno de Java 14+
        return switch (rango) {
            case 10, 9 -> 'A';
            case 8     -> 'B';
            case 7     -> 'C';
            case 6     -> 'D';
            default    -> 'F';
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una calificacion (0 - 100): ");
        
        if (scanner.hasNextInt()) {
            int calificacion = scanner.nextInt();
            
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("Error: La calificacion debe estar entre 0 y 100.");
            } else {
                System.out.println("Resultado con if-else: " + letraConIf(calificacion));
                System.out.println("Resultado con switch:  " + letraConSwitch(calificacion));
            }
        } else {
            System.out.println("Error: Debes ingresar un numero entero.");
        }
        
        scanner.close();
    }
}