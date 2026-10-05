import java.util.Scanner;

public class Contrasena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contrasenaCorrecta = "mpoo2027";
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {
            System.out.print("Contrasena: ");
            String contrasena = scanner.nextLine().trim();

            correcta = contrasena.equals(contrasenaCorrecta);
            intentos++;

            if (correcta) {
                System.out.println("Bienvenido");
            } else if (intentos < 3) {
                int quedan = 3 - intentos;
                System.out.println("Incorrecta. Te quedan " + quedan + " intentos.");
            }
        }

        if (!correcta) {
            System.out.println("Cuenta bloqueada");
        }

        scanner.close();
    }
}