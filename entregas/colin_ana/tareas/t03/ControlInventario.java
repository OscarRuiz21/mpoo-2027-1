/*
 * Programa: Sistema de Control de Inventario con reporte de costos y menú interactivo.
 * El for se usó para calcular el costo total acumulado recorriendo un número conocido de productos.
 * El switch se usó para gestionar las opciones del menú principal del sistema.
 */

import java.util.Scanner;

public class ControlInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== CONTROL DE INVENTARIO ===");
            System.out.println("1. Registrar lote y calcular costo total");
            System.out.println("2. Consultar politicas de almacenamiento");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantos productos diferentes tiene el lote?: ");
                    int cantidadProductos = scanner.nextInt();
                    
                    if (cantidadProductos <= 0) {
                        System.out.println("Cantidad no valida. Debe ser mayor a 0.");
                        break;
                    }

                    double costoTotal = 0;
                    for (int i = 1; i <= cantidadProductos; i++) {
                        System.out.print("Costo unitario del producto " + i + ": ");
                        double costoUnitario = scanner.nextDouble();
                        
                        System.out.print("Cantidad en stock del producto " + i + ": ");
                        int stock = scanner.nextInt();

                        if (costoUnitario < 0 || stock < 0) {
                            System.out.println("Error: Los valores no pueden ser negativos. Intente de nuevo.");
                            costoTotal = -1;
                            break;
                        }
                        costoTotal += (costoUnitario * stock);
                    }

                    if (costoTotal >= 0) {
                        System.out.println("Costo total del lote en inventario: $" + costoTotal);
                    }
                    break;

                case 2:
                    System.out.println("Politica: Mantener temperatura controlada y revision semanal.");
                    break;

                case 0:
                    System.out.println("Saliendo del sistema de inventario. Adios.");
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