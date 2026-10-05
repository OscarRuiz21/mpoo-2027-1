import java.util.Scanner;

public class Contrasena {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String contrasenaCorrecta = "mpoo2027";
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {

            System.out.print("Contrasena: ");
            String contrasena = teclado.nextLine().trim();

            if (contrasena.equals(contrasenaCorrecta)) {

                correcta = true;
                System.out.println("Bienvenido");

            } else {

                intentos++;

                if (intentos < 3) {
                    int quedan = 3 - intentos;
                    System.out.println("Incorrecta. Te quedan " + quedan + " intentos.");
                }
            }
        }

        if (!correcta) {
            System.out.println("Cuenta bloqueada");
        }

        teclado.close();
    }
}