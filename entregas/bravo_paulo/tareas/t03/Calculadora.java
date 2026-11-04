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
                    double s1 = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double s2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (s1 + s2) + "\n");
                    break;
                case 2:
                    System.out.print("Primer numero: ");
                    double r1 = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double r2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (r1 - r2) + "\n");
                    break;
                case 3:
                    System.out.print("Primer numero: ");
                    double m1 = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double m2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (m1 * m2) + "\n");
                    break;
                case 4:
                    System.out.print("Primer numero: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("Segundo numero: ");
                    double d2 = scanner.nextDouble();
                    if (d2 == 0) {
                        System.out.println("No se puede dividir entre 0\n");
                    } else {
                        System.out.println("Resultado: " + (d1 / d2) + "\n");
                    }
                    break;
                case 5:
                    System.out.print("Numero: ");
                    int n = scanner.nextInt();
                    if (n < 0) {
                        System.out.println("No existe el factorial de un negativo\n");
                    } else if (n > 20) {
                        System.out.println("Demasiado grande: el maximo es 20 (21! ya no cabe en un long)\n");
                    } else {
                        long factorial = 1;
                        for (int i = 1; i <= n; i++) {
                            factorial *= i;
                        }
                        System.out.println("Resultado: " + n + "! = " + factorial + "\n");
                    }
                    break;
                case 0:
                    System.out.println("Adios\n");
                    break;
                default:
                    System.out.println("Opcion no valida\n");
            }
        } while (opcion != 0);

        scanner.close();
    }
}