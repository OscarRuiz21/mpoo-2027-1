import java.util.Scanner;

public class Contrasena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correcta = "mpoo2027";
        int intentos = 0;
        boolean esCorrecta = false;

        while (intentos < 3 && !esCorrecta) {
            System.out.print("Contrasena: ");
            String entrada = sc.nextLine().trim();

            if (entrada.equals(correcta)) {
                esCorrecta = true;
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

        sc.close();
    }
}