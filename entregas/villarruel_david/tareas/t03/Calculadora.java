import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

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

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Primer numero: ");
                    double numero1 = teclado.nextDouble();

                    System.out.print("Segundo numero: ");
                    double numero2 = teclado.nextDouble();

                    System.out.println("Resultado: " + (numero1 + numero2));

                    break;

                case 2:

                    System.out.print("Primer numero: ");
                    numero1 = teclado.nextDouble();

                    System.out.print("Segundo numero: ");
                    numero2 = teclado.nextDouble();

                    System.out.println("Resultado: " + (numero1 - numero2));

                    break;

                case 3:

                    System.out.print("Primer numero: ");
                    numero1 = teclado.nextDouble();

                    System.out.print("Segundo numero: ");
                    numero2 = teclado.nextDouble();

                    System.out.println("Resultado: " + (numero1 * numero2));

                    break;

                case 4:

                    System.out.print("Primer numero: ");
                    numero1 = teclado.nextDouble();

                    System.out.print("Segundo numero: ");
                    numero2 = teclado.nextDouble();

                    if (numero2 == 0) {

                        System.out.println("No se puede dividir entre 0");

                    } else {

                        System.out.println("Resultado: " + (numero1 / numero2));
                    }

                    break;

                case 5:

                    System.out.print("Numero: ");
                    int numero = teclado.nextInt();

                    if (numero < 0) {

                        System.out.println("No existe el factorial de un negativo");

                    } else if (numero > 20) {

                        System.out.println("Demasiado grande: el maximo es 20");

                    } else {

                        long factorial = 1;

                        for (int i = 1; i <= numero; i++) {
                            factorial = factorial * i;
                        }

                        System.out.println("Resultado: " + numero + "! = " + factorial);
                    }

                    break;

                case 0:

                    System.out.println("Adios");

                    break;

                default:

                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);

        teclado.close();
    }
}