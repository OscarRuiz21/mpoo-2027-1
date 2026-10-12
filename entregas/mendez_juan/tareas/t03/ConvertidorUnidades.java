/*
 * Programa: Convertidor de unidades de uso cotidiano.
 * Uso del 'for': Genera la tabla de conversion de km a millas en la opcion 2.
 * Uso del 'switch': Maneja el menu de opciones del programa.
 */

import java.util.Scanner;

public class ConvertidorUnidades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while (op != 0) {
            System.out.println("\n--- MENU CONVERTIDOR ---");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Tabla de kilometros a millas");
            System.out.println("3. Pesos a dolares");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingresa los grados Celsius: ");
                    double c = sc.nextDouble();
                    double f = (c * 1.8) + 32;
                    System.out.println(c + " C equivalen a " + f + " F");
                    break;

                case 2:
                    System.out.print("¿Hasta cuantos km quieres la tabla?: ");
                    int limite = sc.nextInt();
                    if (limite <= 0) {
                        System.out.println("El numero debe ser mayor a cero.");
                    } else {
                        System.out.println("\nKm\tMillas");
                        for (int i = 1; i <= limite; i++) {
                            double mi = i * 0.621371;
                            System.out.println(i + "\t" + mi);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingresa la cantidad en pesos (MXN): ");
                    double mxn = sc.nextDouble();
                    if (mxn < 0) {
                        System.out.println("No puedes ingresar valores negativos.");
                    } else {
                        double usd = mxn / 20.0; // Tipo de cambio 1 USD = 20 MXN
                        System.out.println("$" + mxn + " MXN = $" + usd + " USD");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
                    break;
            }
        }

        sc.close();
    }
}