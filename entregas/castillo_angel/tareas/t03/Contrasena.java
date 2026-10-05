import java.util.Scanner;
public class Contrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validarContrasena(sc);

        sc.close();
    }

    public static void validarContrasena(Scanner sc) {
        int intentos = 1;
        boolean correcta = false;

        while (intentos <= 3 && !correcta) {
            System.out.println("Contrasena:");
            String contrasenaing = sc.nextLine().trim();

            if (contrasenaing.equals("mpoo2027")) {
                System.out.println("Bienvenido");
                correcta = true;
            } else if (intentos == 3) {
                System.out.println("Cuenta Bloqueada");
                intentos++;
            } else {
                System.out.println("Incorrecta. Te quedan " + (3 - intentos) + " intentos");
                intentos++;
            }
        }
    }
}