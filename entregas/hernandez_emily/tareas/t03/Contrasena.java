import java.util.Scanner;

public class Contrasena {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int intentos = 0;
        boolean correcta = false;// iniciamos diciendo que es falsa para que pueda entrar al while 

        while (intentos < 3 && !correcta) {

            System.out.print("Contrasena: ");
            String contrasena = entrada.nextLine().trim();

            if (contrasena.equals("mpoo2027")) {
                correcta = true;
                System.out.println("Bienvenido");
            } else {
                intentos++;
                System.out.println("Incorrecta. Te quedan " + (3 - intentos) + " intentos.");
            }
        }
        //Despues de que acabe de acabe dejecutarsse el while, en caso de no haber acertado, es decir
        //si correcta = false se ejecuta lo de abajo, imprime que la cuenta esta bloqueada

        if (!correcta) {
            System.out.println("Cuenta bloqueada");
        }
    }
}