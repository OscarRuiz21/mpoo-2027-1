import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CLAVE_CORRECTA = "mpoo2027";
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {
            System.out.print("Contrasena: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equals(CLAVE_CORRECTA)) {
                correcta = true;
                System.out.println("Bienvenido");
            } else {
                intentos++;
                if (intentos < 3) {
                    int restantes = 3 - intentos;
                    System.out.println("Incorrecta. Te quedan " + restantes + (restantes == 1 ? " intento." : " intentos."));
                } else {
                    System.out.println("Cuenta bloqueada");
                }
            }
        }

        scanner.close();
    }
}