/*
Este programa convierte diferentes unidades.
El for se usa para repetir una conversion varias veces.
El switch se usa para elegir el tipo de conversion.
*/

import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {

            System.out.println();
            System.out.println("=== CONVERTIDOR DE UNIDADES ===");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Kilometros a Millas");
            System.out.println("3. Metros a Centimetros");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Cuantas conversiones quieres hacer: ");
                    int cantidad = entrada.nextInt();

                    if (cantidad > 0) {

                        for (int i = 1; i <= cantidad; i++) {

                            System.out.print("Temperatura " + i + " en Celsius: ");
                            double celsius = entrada.nextDouble();

                            double fahrenheit = (celsius * 9 / 5) + 32;

                            System.out.println("Resultado: " + fahrenheit + " Fahrenheit");
                        }

                    } else {
                        System.out.println("La cantidad debe ser mayor que 0");
                    }

                    break;

                case 2:

                    System.out.print("Cuantas conversiones quieres hacer: ");
                    cantidad = entrada.nextInt();

                    if (cantidad > 0) {

                        for (int i = 1; i <= cantidad; i++) {

                            System.out.print("Distancia " + i + " en kilometros: ");
                            double kilometros = entrada.nextDouble();

                            double millas = kilometros * 0.621371;

                            System.out.println("Resultado: " + millas + " millas");
                        }

                    } else {
                        System.out.println("La cantidad debe ser mayor que 0");
                    }

                    break;

                case 3:

                    System.out.print("Cuantas conversiones quieres hacer: ");
                    cantidad = entrada.nextInt();

                    if (cantidad > 0) {

                        for (int i = 1; i <= cantidad; i++) {

                            System.out.print("Distancia " + i + " en metros: ");
                            double metros = entrada.nextDouble();

                            double centimetros = metros * 100;

                            System.out.println("Resultado: " + centimetros + " centimetros");
                        }

                    } else {
                        System.out.println("La cantidad debe ser mayor que 0");
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

        entrada.close();
    }
}