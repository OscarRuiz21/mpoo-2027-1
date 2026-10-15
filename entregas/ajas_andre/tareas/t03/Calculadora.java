import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("Primer numero: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double num2 = scanner.nextDouble();

                    if (opcion == 1) {
                        System.out.println("Resultado: " + (num1 + num2));
                    } else if (opcion == 2) {
                        System.out.println("Resultado: " + (num1 - num2));
                    } else if (opcion == 3) {
                        System.out.println("Resultado: " + (num1 * num2));
                    } else if (opcion == 4) {
                        if (num2 == 0) {
                            System.out.println("No se puede dividir entre 0");
                        } else {
                            System.out.println("Resultado: " + (num1 / num2));
                        }
                    }
                    break;

                case 5:
                    System.out.print("Numero: ");
                    int n = scanner.nextInt();

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
        } while (opcion != 0);

        scanner.close();
    }
}