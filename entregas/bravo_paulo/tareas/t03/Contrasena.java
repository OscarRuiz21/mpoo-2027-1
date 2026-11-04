import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctaStr = "mpoo2027";
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {
            System.out.print("Contrasena: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equals(correctaStr)) {
                System.out.println("Bienvenido");
                correcta = true;
            } else {
                intentos++;
                if (intentos == 3) {
                    System.out.println("Cuenta bloqueada");
                } else {
                    if ((3 - intentos) == 1) {
                        System.out.println("Incorrecta. Te quedan 1 intento.");
                    } else {
                        System.out.println("Incorrecta. Te quedan " + (3 - intentos) + " intentos.");
                    }
                }
            }
        }
        
        scanner.close();
    }
}