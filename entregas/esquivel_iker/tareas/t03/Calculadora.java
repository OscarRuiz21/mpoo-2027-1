import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Factorial");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Primer numero: ");
                    double num1S = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double num2S = scanner.nextDouble();
                    System.out.println("Resultado de la suma: " + (num1S+num2S));
                    break;
                
                case 2:
                    System.out.print("Primer numero: ");
                    double num1R = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double num2R = scanner.nextDouble();
                    System.out.println("Resultado de la resta: " + (num1R-num2R));
                    break;

                case 3:
                    System.out.print("Primer numero: ");
                    double num1M = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double num2M = scanner.nextDouble();
                    System.out.println("Resultado de la multiplicacion: " + (num1M*num2M));
                    break;

                case 4:
                    System.out.print("Primer numero: ");
                    double num1D = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double num2D = scanner.nextDouble();
                    if(num2D==0){
                        System.out.println("La division entre cero no esta definda.");
                    }else{
                        System.out.println("Resultado de la division: " + (num1D/num2D));
                    }
                    break;
                    
                case 5:
                    System.out.print("Numero que desea obtener su factorial: ");
                    int numF = scanner.nextInt();
                    if(numF<0){
                        System.out.println("No existe el facotrial de numeros negativos");
                    }else if(numF>20){
                        System.out.println("Demasiado grande: el maximo es 20");
                    }else{
                        long factorial = 1;
                        for(int i = 1; i<=numF; i++){
                            factorial*=i;
                        }
                        System.out.println("Resultado de: " + numF + "! = " + factorial);
                    }
                    break;
                
                    case 0:
                        System.out.println("Apagando calculadora...");
                        System.out.println("Adios");
                        break;

                    default:
                        System.out.println("Opcion no valida");
            }
            System.out.println();
        }while (opcion != 0);
    
        scanner.close();
    }
}
