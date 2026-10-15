import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Factorial");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Primer numero: ");
                    double n1Sum = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double n2Sum = scanner.nextDouble();
                    System.out.println("Resultado: " + (n1Sum + n2Sum));
                    break;
                case 2:
                    System.out.print("Primer numero: ");
                    double n1Res = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double n2Res = scanner.nextDouble();
                    System.out.println("Resultado: " + (n1Res - n2Res));
                    break;
                case 3:
                    System.out.print("Primer numero: ");
                    double n1Mul = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double n2Mul = scanner.nextDouble();
                    System.out.println("Resultado: " + (n1Mul * n2Mul));
                    break;
                case 4:
                    System.out.print("Primer numero: ");
                    double n1Div = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double n2Div = scanner.nextDouble();
                    if (n2Div == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println("Resultado: " + (n1Div / n2Div));
                    }
                    break;
                case 5:
                    System.out.print("Numero: ");
                    int numFact = scanner.nextInt();
                    if (numFact < 0) {
                        System.out.println("No existe el factorial de un negativo");
                    } else if (numFact > 20) {
                        System.out.println("Demasiado grande: el maximo es 20");
                    } else {
                        long factorial = 1;
                        for (int i = 1; i <= numFact; i++) {
                            factorial *= i;
                        }
                        System.out.println("Resultado: " + numFact + "! = " + factorial);
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}