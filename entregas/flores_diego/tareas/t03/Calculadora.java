import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Factorial");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Primer numero: ");
                    double numSum1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double numSum2 = sc.nextDouble();
                    double resultadoSum = numSum1 + numSum2;
                    System.out.println("Resultado: " + resultadoSum);
                    break;

                case 2:
                    System.out.print("Primer numero: ");
                    double numRes1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double numRes2 = sc.nextDouble();
                    double resultadoRes = numRes1 - numRes2;
                    System.out.println("Resultado: " + resultadoRes);
                    break;

                case 3:
                    System.out.print("Primer numero: ");
                    double numMul1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double numMul2 = sc.nextDouble();
                    double resultadoMul = numMul1 * numMul2;
                    System.out.println("Resultado: " + resultadoMul);
                    break;

                case 4:
                    System.out.print("Primer numero: ");
                    double numDiv1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double numDiv2 = sc.nextDouble();

                    if (numDiv2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        double resultadoDiv = numDiv1 / numDiv2;
                        System.out.println("Resultado: " + resultadoDiv);
                    }
                    break;

                case 5:
                    System.out.print("Numero: ");
                    int n = sc.nextInt();

                    if (n < 0) {
                        System.out.println("No existe el factorial de un negativo");
                    } else if (n > 20) {
                        System.out.println("Demasiado grande: el maximo es 20");
                    } else {
                        long factorial = 1;
                        for (int i = 1; i <= n; i++) {
                            factorial *= i;
                        }
                        System.out.println("Resultado: " + n + "! = " + factorial);
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

    }
}