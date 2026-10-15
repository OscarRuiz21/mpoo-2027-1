// Que hace: Simula las operaciones de un cajero automatico (NIP, consultar, depositar y retirar).
// Uso de for: Se utiliza al retirar efectivo para imprimir un comprobante visual con asteriscos.
// Uso de switch: Evalua la opcion elegida por el usuario en el menu principal de transacciones.

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nipCorrecto = 1234;
        int intentos = 0;
        boolean accesoConcedido = false;

        // 1. while: Repetir hasta acceso concedido o superar intentos
        while (intentos < 3 && !accesoConcedido) {
            System.out.print("Ingrese su NIP: ");
            int nipIngresado = scanner.nextInt();

            // 2. if: Validar el NIP
            if (nipIngresado == nipCorrecto) {
                accesoConcedido = true;
            } else {
                intentos++;
                System.out.println("NIP incorrecto. Intento " + intentos + " de 3.");
            }
        }

        if (!accesoConcedido) {
            System.out.println("Tarjeta retenida por seguridad.");
        } else {
            int opcion;
            double saldo = 1000.0;

            // 3. do-while: Repetir el menu hasta elegir salir
            do {
                System.out.println("\n--- CAJERO AUTOMATICO ---");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Retirar");
                System.out.println("0. Salir");
                System.out.print("Elija una opcion: ");
                // 4. Scanner: Leer opcion
                opcion = scanner.nextInt();

                // 5. switch: Ejecutar transaccion segun menu
                switch (opcion) {
                    case 1:
                        System.out.println("Su saldo actual es: $" + saldo);
                        break;
                    case 2:
                        System.out.print("Cantidad a depositar: $");
                        double deposito = scanner.nextDouble();
                        if (deposito > 0) {
                            saldo += deposito;
                            System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
                        } else {
                            System.out.println("Cantidad invalida.");
                        }
                        break;
                    case 3:
                        System.out.print("Cantidad a retirar: $");
                        double retiro = scanner.nextDouble();
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("Retiro exitoso. Entregando billetes...");
                            
                            // 6. for: Simular barra de progreso/comprobante
                            System.out.print("Imprimiendo recibo: ");
                            for (int i = 0; i < 15; i++) {
                                System.out.print("*");
                            }
                            System.out.println("\nNuevo saldo: $" + saldo);
                        } else {
                            System.out.println("Saldo insuficiente o cantidad invalida.");
                        }
                        break;
                    case 0:
                        System.out.println("Gracias por usar el cajero.");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            } while (opcion != 0);
        }
        scanner.close();
    }
}