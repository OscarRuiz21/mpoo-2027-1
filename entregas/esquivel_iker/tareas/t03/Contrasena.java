import java.util.Scanner;

public class Contrasena{
    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);
        final String contrasena = "mpoo2027";
        int intentos = 0;
        boolean correcta = false;

        while (intentos<3 && !correcta){
            System.out.print("Contraseña: ");
            String entrada = scanner.nextLine().trim();

            if(entrada.equals(contrasena)){
                correcta = true;
                System.out.println("Bienvenido :D");
            }else{
                intentos++;
                int restantes = 3 - intentos;
                if(restantes > 0){
                    System.out.println("Contraseña incorrecta. Te quedan " + restantes + (restantes == 1 ? " intento.": " intentos."));
                }else{
                    System.out.println("Cuenta bloqueada");
                }
            }
        }
        scanner.close();
    }
}