import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Factorial");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Primer numero: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double n2 = sc.nextDouble();
                    System.out.println("Resultado: " + (n1 + n2));
                    break;

                case 2:
                    System.out.print("Primer numero: ");
                    double r1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double r2 = sc.nextDouble();
                    System.out.println("Resultado: " + (r1 - r2));
                    break;

                case 3:
                    System.out.print("Primer numero: ");
                    double m1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double m2 = sc.nextDouble();
                    System.out.println("Resultado: " + (m1 * m2));
                    break;

                case 4:
                    System.out.print("Primer numero: ");
                    double d1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    double d2 = sc.nextDouble();
                    if (d2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println("Resultado: " + (d1 / d2));
                    }
                    break;

                case 5:
                    System.out.print("Numero: ");
                    int num = sc.nextInt();
                    if (num < 0) {
                        System.out.println("No existe el factorial de un negativo");
                    } else if (num > 20) {
                        System.out.println("Demasiado grande: el maximo es 20");
                    } else {
                        long fact = 1;
                        for (int i = 1; i <= num; i++) {
                            fact = fact * i;
                        }
                        System.out.println("Resultado: " + num + "! = " + fact);
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

        } while (opc != 0);
    }
}