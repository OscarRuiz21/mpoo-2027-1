import java.util.Scanner;
public class Contrasena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasenaCorrecta="mpoo2027";
        String contrasenaSin="";
        int intentos=0;
        while(intentos<3 && !contrasenaCorrecta.equals(contrasenaSin)){
            System.out.print("Contrasena: ");
            String contrasena = sc.nextLine();
             contrasenaSin=contrasena.trim();
            if(!contrasenaSin.equals(contrasenaCorrecta)){
                intentos=intentos+1;
                int restantes=3-intentos;
                if(restantes>0){
                    System.out.println("Incorrecta. Te quedan " + restantes + " intentos");
                }
            }
        }

        if(contrasenaCorrecta.equals(contrasenaSin)){
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("Cuenta bloqueada");
        }
        sc.close();

    }
}




