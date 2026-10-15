// Programa para la conversión de unidades que permite elegir entre diferentes tipos de conversiones mediante un menú interactivo.
// Utiliza la estructura 'switch' para seleccionar la opción del menú y un bucle 'for' para generar una tabla de valores consecutivos.
// Valida los datos de entrada con 'if' y se repite usando 'do-while' hasta que el usuario decide salir.

import java.util.Scanner;

public class ConvertidorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== CONVERTIDOR DE UNIDADES ===");
            System.out.println("1. Celsius a Fahrenheit (con tabla de rango)");
            System.out.println("2. Kilometros a Millas");
            System.out.println("3. Pesos Mexicanos a Dolares");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa los grados Celsius iniciales: ");
                    double c = scanner.nextDouble();
                    System.out.print("Cuantos valores consecutivos deseas calcular?: ");
                    int pasos = scanner.nextInt();
                    if (pasos <= 0) {
                        System.out.println("El numero de pasos debe ser mayor a 0.");
                    } else {
                        System.out.println("--- Tabla de Conversion ---");
                        for (int i = 0; i < pasos; i++) {
                            double f = (c + i) * 9.0 / 5.0 + 32.0;
                            System.out.println((c + i) + " °C = " + f + " °F");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingresa los kilometros: ");
                    double km = scanner.nextDouble();
                    if (km < 0) {
                        System.out.println("Los kilometros no pueden ser negativos.");
                    } else {
                        double millas = km * 0.621371;
                        System.out.println("Resultado: " + km + " km = " + millas + " millas");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa los pesos mexicanos (MXN): ");
                    double pesos = scanner.nextDouble();
                    if (pesos < 0) {
                        System.out.println("La cantidad no puede ser negativa.");
                    } else {
                        double tipoCambio = 20.0;
                        double dolares = pesos / tipoCambio;
                        System.out.println("Resultado: " + pesos + " MXN = " + dolares + " USD (aprox.)");
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
        } while (opcion != 0);
        scanner.close();
    }
}