import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasenaCorrecta = "mpoo2027";
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {
            System.out.print("Contrasena: ");
            String entrada = sc.nextLine().trim();

            if (entrada.equals(contrasenaCorrecta)) {
                correcta = true;
                System.out.println("Bienvenido");
            } else {
                intentos++;
                int restantes = 3 - intentos;
                if (restantes > 0) {
                    if (restantes == 1) {
                        System.out.println("Incorrecta. Te quedan 1 intento.");
                    } else {
                        System.out.println("Incorrecta. Te quedan " + restantes + " intentos.");
                    }
                } else {
                    System.out.println("Cuenta bloqueada");
                }
            }
        }
        sc.close();
    }
}