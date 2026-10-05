// Programa que convierte diferentes unidades.
// El for se usa para realizar varias conversiones.
// El switch se usa para elegir el tipo de conversion.

import java.util.Scanner;

public class ConvertidorUnidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        int cantidad;

        do {
            System.out.println("**** CONVERTIDOR DE UNIDADES ******");
            System.out.println("1. Kilometros a metros");
            System.out.println("2. Metros a centimetros");
            System.out.println("3. Celsius a Fahrenheit");
            System.out.println("4. Kilogramos a gramos");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Cuantas conversiones quieres hacer: ");
                cantidad = scanner.nextInt();

                if (cantidad > 0) {

                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Valor " + i + ": ");
                        double valor = scanner.nextDouble();

                        switch (opcion) {
                            case 1:
                                System.out.println(
                                    valor + " km = " + (valor * 1000) + " metros"
                                );
                                break;

                            case 2:
                                System.out.println(
                                    valor + " metros = " + (valor * 100) + " centimetros"
                                );
                                break;

                            case 3:
                                System.out.println(
                                    valor + " C = " + ((valor * 9 / 5) + 32) + " F"
                                );
                                break;

                            case 4:
                                System.out.println(
                                    valor + " kg = " + (valor * 1000) + " gramos"
                                );
                                break;
                        }
                    }

                } else {
                    System.out.println("La cantidad debe ser mayor que 0");
                }

            } else if (opcion == 0) {
                System.out.println("Adios");

            } else {
                System.out.println("Opcion no valida");
            }

            System.out.println();

        } while (opcion != 0);

        scanner.close();
    }
}