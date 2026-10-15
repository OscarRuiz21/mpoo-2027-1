import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correcta = "mpoo2027";
        int intentos = 0;
        boolean accedio = false;

        while (intentos < 3 && !accedio) {
            System.out.print("Contrasena: ");
            String input = scanner.nextLine().trim();

            if (input.equals(correcta)) {
                System.out.println("Bienvenido");
                accedio = true;
            } else {
                intentos++;
                int restantes = 3 - intentos;
                if (restantes > 0) {
                    System.out.println("Incorrecta. Te quedan " + restantes + (restantes == 1 ? " intento." : " intentos."));
                } else {
                    System.out.println("Cuenta bloqueada");
                }
            }
        }
        scanner.close();
    }
}