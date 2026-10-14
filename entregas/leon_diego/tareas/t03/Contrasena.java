import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CORRECTA = "mpoo2027";
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {
            System.out.print("Contrasena: ");
            String entrada = sc.nextLine().trim();

            if (entrada.equals(CORRECTA)) {
                correcta = true;
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Incorrecta. Te quedan " + (3 - intentos) + " intentos.");
                }
            }
        }

        if (correcta) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Cuenta bloqueada");
        }

        sc.close();
    }
}