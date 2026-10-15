import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean correcta = false;

        // Bucle con dos condiciones: intentos menores a 3 y la contraseña aún no es correcta
        while (intentos < 3 && !correcta) {
            System.out.print("Contrasena: ");
            // Se usa nextLine() para leer toda la línea y trim() para eliminar espacios extra
            String input = scanner.nextLine().trim();

            // Comparación de cadenas en Java usando equals() en lugar de ==
            if (input.equals("mpoo2027")) {
                correcta = true;
                System.out.println("Bienvenido");
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Incorrecta. Te quedan " + (3 - intentos) + " intentos.");
                } else {
                    System.out.println("Cuenta bloqueada");
                }
            }
        }
        scanner.close();
    }
}