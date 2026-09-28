import java.util.Scanner;
public class ClasificadorCalificaciones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu Calificacion del 1-100:");
        int CalifIng = sc.nextInt();

        String CalificacionLetra = CalificacionComprobada(CalifIng);
        System.out.println("Tu Calificacion es de " + CalificacionLetra);
        sc.close();
    }
    
    public static String CalificacionComprobada(int calif){
        String letra;
        if(calif >= 90){
            letra = "A";
        } else if(calif >= 80){
            letra = "B";
        } else if(calif >= 70){
            letra = "C";
        } else if(calif >= 60){
            letra = "D";
        } else {
            letra = "F";
        }
        return letra;
    }
}
