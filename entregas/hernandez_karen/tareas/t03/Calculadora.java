import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double primero,segundo,resultado;

        do{
            System.out.println("***Calculadora***");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Factorial");
            System.out.println("0.Salir");
            System.out.print("Elige una opcion: ");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Primer numero: ");
                    primero=sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    segundo=sc.nextDouble();
                    resultado=primero+segundo;
                    System.out.println("Resultado: "+resultado);
                    break;
                case 2:
                    System.out.print("Primer numero: ");
                    primero=sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    segundo=sc.nextDouble();
                    resultado=primero-segundo;
                    System.out.println("Resultado: "+resultado);
                    break;
                case 3:
                    System.out.print("Primer numero: ");
                    primero=sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    segundo=sc.nextDouble();
                    resultado=primero*segundo;
                    System.out.println("Resultado: "+resultado);
                    break;
                case 4:
                    System.out.print("Primer numero: ");
                    primero=sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    segundo=sc.nextDouble();
                    if(segundo==0){
                        System.out.println("No se puede dividir entre 0");
                    }else{
                        resultado=primero/segundo;
                        System.out.println("Resultado: "+resultado);
                    }
                    break;
                case 5:
                    System.out.print("Numero: ");
                    int numero=sc.nextInt();
                    if(numero<0 || numero>20){
                        System.out.println("Ingresa un numero entre 0 y 20");
                    }else{
                        long resultadoL=1;
                        for(int i=1;i<=numero;i++){
                            resultadoL=resultadoL*i;
                        }
                        System.out.println("Resultado:"+numero+"! = "+ resultadoL);
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while(opcion!=0);
    }
}
