import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        boolean correcta = false;

        while (intentos < 3 && !correcta) {
            System.out.print("Contrasena: ");
            if (sc.nextLine().trim().equals("mpoo2027")) {
                System.out.println("contraseña correcta, tu muy bien");
                correcta = true;
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Incorrecta. Te quedan " + (3 - intentos) + (intentos == 2 ? " intento." : " intentos."));
                } else {
                    System.out.println("Cuenta bloqueada, haz memoria");
                }
            }
        }
        sc.close();
    }
}