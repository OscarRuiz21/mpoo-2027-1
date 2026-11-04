/*
 * Este programa calcula la resistencia equivalente (serie/paralelo) o el voltaje en un circuito.
 * El ciclo 'for' se usa para pedir y sumar dinamicamente los valores de N resistencias.
 * El 'switch' se usa para controlar el menu principal que permite elegir el tipo de calculo.
 */
import java.util.Scanner;

public class AnalisisCircuitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== ANALIZADOR DE CIRCUITOS ===");
            System.out.println("1. Calcular Resistencias en Serie");
            System.out.println("2. Calcular Resistencias en Paralelo");
            System.out.println("3. Calcular Voltaje (Ley de Ohm)");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantas resistencias vas a sumar? ");
                    int nSerie = scanner.nextInt();
                    if (nSerie > 0) {
                        double reqSerie = 0;
                        for (int i = 1; i <= nSerie; i++) {
                            System.out.print("Valor de R" + i + " (Ohms): ");
                            reqSerie += scanner.nextDouble();
                        }
                        System.out.println("Resistencia Equivalente en Serie: " + reqSerie + " Ohms\n");
                    } else {
                        System.out.println("Cantidad no valida.\n");
                    }
                    break;

                case 2:
                    System.out.print("¿Cuantas resistencias en paralelo vas a calcular? ");
                    int nParalelo = scanner.nextInt();
                    if (nParalelo > 0) {
                        double reqParalelo = 0;
                        boolean error = false;
                        for (int i = 1; i <= nParalelo; i++) {
                            System.out.print("Valor de R" + i + " (Ohms): ");
                            double r = scanner.nextDouble();
                            if (r == 0) {
                                System.out.println("Error: La resistencia no puede ser 0.\n");
                                error = true;
                                break;
                            }
                            reqParalelo += (1.0 / r);
                        }
                        if (!error) {
                            System.out.println("Resistencia Equivalente en Paralelo: " + (1.0 / reqParalelo) + " Ohms\n");
                        }
                    } else {
                        System.out.println("Cantidad no valida.\n");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa la Corriente (Amperes): ");
                    double i = scanner.nextDouble();
                    System.out.print("Ingresa la Resistencia (Ohms): ");
                    double r = scanner.nextDouble();
                    System.out.println("Voltaje calculado: " + (i * r) + " Volts\n");
                    break;

                case 0:
                    System.out.println("Cerrando analizador...\n");
                    break;

                default:
                    System.out.println("Opcion no valida.\n");
            }
        } while (opcion != 0);

        scanner.close();
    }
}