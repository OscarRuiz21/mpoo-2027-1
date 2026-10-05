// transforma grados Celsius a Fahrenheit, kilómetros a millas y pesos a dólares.

import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== CONVERTIDOR DE UNIDADES ===");
            System.out.println("1. Celsius a Fahrenheit (multiples valores)");
            System.out.println("2. Kilometros a Millas");
            System.out.println("3. Pesos Mexicanos a Dolares");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantos valores deseas convertir?: ");
                    int total = scanner.nextInt();
                    for (int i = 1; i <= total; i++) {
                        System.out.print("Valor " + i + " en °C: ");
                        double c = scanner.nextDouble();
                        double f = (c * 9/5) + 32;
                        System.out.println(c + " °C equivalen a " + f + " °F");
                    }
                    break;
                case 2:
                    System.out.print("Ingresa los kilometros: ");
                    double km = scanner.nextDouble();
                    if (km < 0) {
                        System.out.println("No se admiten valores negativos.");
                    } else {
                        double millas = km * 0.621371;
                        System.out.println("Resultado: " + millas + " millas");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa los pesos mexicanos: ");
                    double pesos = scanner.nextDouble();
                    if (pesos < 0) {
                        System.out.println("No se admiten valores negativos.");
                    } else {
                  
                        double dolares = pesos / 20.0;
                        System.out.println("Resultado: $" + dolares + " USD");
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}