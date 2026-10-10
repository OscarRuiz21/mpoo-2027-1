import java.util.Scanner;

public class Contrasena{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String contrasena;
        boolean correcta = false;
        int intentos = 0;

        while(intentos < 3 && !correcta){
            System.out.println("Contrasena: ");
            contrasena = entrada.nextLine().trim();

            if(contrasena.equals("mpoo2027")){
                correcta = true;
            }else{
                intentos ++;
                if(intentos < 3){
                System.out.println("Incorrecta. Te quedan: " +(3 - intentos)+ " intentos");
                }
            }
        }

        if(correcta){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Cuenta bloqueadam");
        }
    }
}
