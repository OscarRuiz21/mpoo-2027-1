import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String correcta = "mpoo2027";
        int intentos = 0;
        boolean correctabool = false;

        while(intentos < 3 && !correctabool){
            System.out.print("Contraseña:  ");
            String ingreso = scanner.nextLine().trim();
            if(ingreso.equals(correcta)){
                System.out.println("Bienvenido");
                correctabool = true;
            } else{
                intentos ++;
                int restantes = 3 - intentos;
                if(restantes > 0){
                    System.out.println("Incorrecta. Te quedan " + restantes + "  intentos");
                } else{
                    System.out.println ("Cuenta bloqueada");
                }
            }
        }
    }
}