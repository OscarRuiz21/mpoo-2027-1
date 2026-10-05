//Elegi el programa "Tablas de Multiplicar" donde se imprime la tabla
// del numero que se ingrese hasta el numero que se requiera, utilice el for para
//iterar cada multiplicacion y el switch para seleccionar las opciones del menu.
import java.util.Scanner;
public class TablasMultiplicar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\n===TABLAS DE MULTIPLICAR===");
            System.out.println("1. Crear tabla");
            System.out.println("0. Salir");
            System.out.println("Opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearTabla(sc);
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no Valida");
            }
        } while (opcion != 0);
        sc.close();
    }

    public static void crearTabla(Scanner sc){
        System.out.println("¿Que tabla de multiplicar quieres?");
        int tabla = sc.nextInt();
        System.out.println("Hasta que numero quieres multiplicar");
        int numFinal = sc.nextInt();

        if(numFinal <= 0){
            System.out.println("El limite debe ser mayor a 0");
        } else {
            System.out.println("\n===Tabla del " + tabla + "===");
            for(int i = 1 ; i<=numFinal; i++){
                System.out.println(tabla + " * " + i + " = " + (tabla*i));
            }
        }
    }
}