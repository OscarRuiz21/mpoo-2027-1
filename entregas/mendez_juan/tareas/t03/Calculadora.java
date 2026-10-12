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
                case 1 -> {
                    System.out.print("Primer numero: ");
                    double a = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a + b));
                }
                case 2 -> {
                    System.out.print("Primer numero: ");
                    double a = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a - b));
                }
                case 3 -> {
                    System.out.print("Primer numero: ");
                    double a = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a * b));
                }
                case 4 -> {
                    System.out.print("Primer numero: ");
                    double a = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double b = scanner.nextDouble();
                    if (b == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println("Resultado: " + (a / b));
                    }
                }
                case 5 -> {
                    System.out.print("Numero: ");
                    int num = scanner.nextInt();
                    if (num < 0) {
                        System.out.println("No existe el factorial de un negativo");
                    } else if (num > 20) {
                        System.out.println("Demasiado grande: el maximo es 20");
                    } else {
                        long fact = 1;
                        for (int i = 1; i <= num; i++) {
                            fact *= i;
                        }
                        System.out.println("Resultado: " + num + "! = " + fact);
                    }
                }
                case 0 -> System.out.println("Adios");
                default -> System.out.println("Opcion no valida");
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}