import java.util.Scanner;

public class ComprobarAnoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un Anio");
        int anoComprobar = sc.nextInt();

        boolean EsBisiestoResultado = EsBisiestoProceso(anoComprobar);
        
        if(EsBisiestoResultado){
            System.out.println("El anio " + anoComprobar + " SI es Bisiesto");
        } else {
            System.out.println("El anio " + anoComprobar + " NO es Bisisesto");
        }
        sc.close();
    }
    
        public static boolean EsBisiestoProceso(int anio){
            if((anio % 4 == 0 && anio % 100 !=0)  || (anio % 400 == 0)){
                return true;
            } else {
                return false;
            }

        }

}