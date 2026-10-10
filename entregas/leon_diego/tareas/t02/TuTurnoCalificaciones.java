import java.util.Scanner;

public class TuTurnoCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una calificación de 0 a 100: ");
        int calificacion = scanner.nextInt();
        String letraConIf = obtenerLetraConIf(calificacion);
        System.out.println("Letra (con if-else-if): " + letraConIf);
        String letraConSwitch = obtenerLetraConSwitch(calificacion);
        System.out.println("Letra (con switch): " + letraConSwitch);

        scanner.close();
    }
    public static String obtenerLetraConIf(int calificacion) {
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
            return "Calificación inválida";
        }
    }
    public static String obtenerLetraConSwitch(int calificacion) {
        switch (calificacion / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                return "F";
            default:
                return "Calificación inválida";
        }
    }
}