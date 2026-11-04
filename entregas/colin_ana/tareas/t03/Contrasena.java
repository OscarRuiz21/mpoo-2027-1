import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correcta = "mpoo2027";
        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < 3 && !accesoConcedido) {
            System.out.print("Contrasena: ");
            String input = scanner.nextLine().trim();

            if (input.equals(correcta)) {
                accesoConcedido = true;
                System.out.println("Bienvenido");
            } else {
                intentos++;
                int restantes = 3 - intentos;
                if (restantes > 0) {
                    System.out.println("Incorrecta. Te quedan " + restantes + " intento" + (restantes == 1 ? "." : "s."));
                }
            }
        }

        if (!accesoConcedido) {
            System.out.println("Cuenta bloqueada");
        }

        scanner.close();
    }
}