import java.util.Scanner;
//el programa calcula el total en base a cuantos tacos pida el usuario
//el for lo use para calcular el total de otra manera diferente al if, aunque ambas son correctas
//el switch lo use para que dependiendo de que opcion eligiera el usuario entre en el caso que le corresponde
public class Tacos {
    public static void main(String[] args){
        int opcion;
        int suadero;
        int pastor;
        int campechano;
        int longaniza;
        int total=0;
        do{
            System.out.println("***MENU DE TACOS***");
            System.out.println("1.Suadero $25");
            System.out.println("2.Pastor $30, al 2x1");
            System.out.println("3.Campechano $25");
            System.out.println("4.Longaniza $25");
            System.out.println("5.Salir");
            System.out.println("Elige una opcion: ");
            Scanner sc = new Scanner(System.in);
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("¿Cuantos tacos?");
                    suadero=sc.nextInt();
                    if(suadero>0){
                        total=suadero*25;
                        System.out.println("El total de la cuenta es: $"+total);
                    }else{
                        System.out.println("Ingresa un numero mayor a 0");
                    }
                    break;
                case 2:
                    System.out.println("¿Cuantos tacos?");
                    pastor=sc.nextInt();
                    int promo=pastor*2;
                    total=0;
                    if(pastor>0){
                        for(int i=1;i<=pastor;i++){
                            total=total+30;
                        }
                        System.out.println("El total de la cuenta es: $" + total);
                        System.out.println("Los tacos totales por la promocion 2x1 fueron: "+promo);
                    } else {
                        System.out.println("Ingresa un numero mayor a 0");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuantos tacos?");
                    campechano=sc.nextInt();
                    total=0;
                    if(campechano>0){
                        total=campechano*25;
                        System.out.println("El total de la cuenta es: $"+total);
                    }else{
                        System.out.println("Ingresa un numero mayor a 0");
                    }
                    break;
                case 4:
                    System.out.println("¿Cuantos tacos?");
                    longaniza=sc.nextInt();
                    total=0;
                    if(longaniza>0){
                        total=longaniza*25;
                        System.out.println("El total de la cuenta es: $"+total);
                    }else{
                        System.out.println("Ingresa un numero mayor a 0");
                    }
                    break;
                case 5:
                    System.out.println("Hasta luego ;)");
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    }
        }while(opcion !=5);
    }
}
