import java.util.Scanner;

public class Contrasenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave = "mpoo2027";
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {
            System.out.print("Contrasena: ");
            String pass = sc.nextLine().trim();

            if (pass.equals(clave)) {
                correcta = true;
                System.out.println("Bienvenido");
            } else {
                intentos++;
                if (intentos == 1) {
                    System.out.println("Incorrecta. Te quedan 2 intentos.");
                } else if (intentos == 2) {
                    System.out.println("Incorrecta. Te quedan 1 intento.");
                } else {
                    System.out.println("Cuenta bloqueada");
                }
            }
        }
    }
}