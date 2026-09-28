import java.util.Scanner;
public class ClasificadorCalifSwitch{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu Calificacion del 1-100:");
        int CalifIng = sc.nextInt();

        String CalificacionLetra = CalificacionComprobada(CalifIng);
        System.out.println("Tu Calificacion es de " + CalificacionLetra);
        sc.close();
    }
        
    public static String CalificacionComprobada(int calif){
        String letra;
        switch (calif/10){
            case 10:
                letra = "A";
                break;
            case 9:
                letra = "A";
                break;
            case 8:
                letra = "B";
                break;
            case 7  :
                letra = "C";
                break;
            case 6:
                letra = "D";
                break;
            default:
                letra = "F";
        }
        return letra;
    }
}