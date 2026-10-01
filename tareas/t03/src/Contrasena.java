import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "mpoo2027";
        int intentos = 0;
        boolean acertada = false;

        // Se repite mientras haya intentos disponibles y no se haya adivinado
        while (intentos < 3 && !acertada) {
            System.out.print("Contrasena: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equals(contrasenaCorrecta)) {
                acertada = true;
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