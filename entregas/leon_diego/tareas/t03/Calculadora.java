import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Factorial");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.print("Primer numero: ");
                    double a = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double b = sc.nextDouble();
                    System.out.println("Resultado: " + (a + b));
                    break;
                }
                case 2: {
                    System.out.print("Primer numero: ");
                    double a = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double b = sc.nextDouble();
                    System.out.println("Resultado: " + (a - b));
                    break;
                }
                case 3: {
                    System.out.print("Primer numero: ");
                    double a = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double b = sc.nextDouble();
                    System.out.println("Resultado: " + (a * b));
                    break;
                }
                case 4: {
                    System.out.print("Primer numero: ");
                    double a = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double b = sc.nextDouble();
                    if (b == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println("Resultado: " + (a / b));
                    }
                    break;
                }
                case 5: {
                    System.out.print("Numero: ");
                    int n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("No existe el factorial de un negativo");
                    } else if (n > 20) {
                        System.out.println("Demasiado grande: el maximo es 20");
                    } else {
                        long fact = 1;
                        for (int i = 1; i <= n; i++) {
                            fact *= i;
                        }
                        System.out.println("Resultado: " + n + "! = " + fact);
                    }
                    break;
                }
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0); // se repite hasta que elijan 0

        sc.close();
    }
}