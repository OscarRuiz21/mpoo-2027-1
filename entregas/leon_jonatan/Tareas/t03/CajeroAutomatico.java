// Que hace: Simula un cajero automatico con autenticacion PIN de 3 intentos, menu de operaciones y resumen de movimientos.
// Donde use el for: En la opcion 4 del menu para iterar e imprimir el historial de las ultimas transacciones registradas.
// Donde use el switch: Para controlar la seleccion del menu principal.
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // PIN
        String pinCorrecto = "1234";
        int intentos = 0;
        boolean autenticado = false;

        System.out.println("=== BIENVENIDO AL CAJERO AUTOMATICO ===");
        while (intentos < 3 && !autenticado) {
            System.out.print("Ingrese su PIN de 4 digitos: ");
            String pinIngresado = sc.nextLine().trim();

            if (pinIngresado.equals(pinCorrecto)) {
                autenticado = true;
                System.out.println("Acceso concedido.\n");
            } else {
                intentos++;
                int restantes = 3 - intentos;
                if (restantes > 0) {
                    System.out.println("PIN incorrecto. Intentos restantes: " + restantes);
                } else {
                    System.out.println("PIN incorrecto. Su tarjeta ha sido bloqueada.");
                }
            }
        }

        if (!autenticado) {
            sc.close();
            return;
        }

        // Menu
        double saldo = 1000.00; 
        double[] historial = new double[10]; 
        int numTransacciones = 0;
        int opcion;

        do {
            System.out.println("=== MENU CAJERO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Ver historial de movimientos");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Su saldo actual es: $%.2f\n\n", saldo);
                    break;

                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor a 0.\n");
                    } else {
                        saldo += deposito;
                        System.out.printf("Deposito exitoso. Nuevo saldo: $%.2f\n\n", saldo);
                        if (numTransacciones < historial.length) {
                            historial[numTransacciones] = deposito;
                            numTransacciones++;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a 0.\n");
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. No puede dejar el saldo en negativo.\n");
                    } else {
                        saldo -= retiro;
                        System.out.printf("Retiro exitoso. Nuevo saldo: $%.2f\n\n", saldo);
                        if (numTransacciones < historial.length) {
                            historial[numTransacciones] = -retiro;
                            numTransacciones++;
                        }
                    }
                    break;

                case 4:
                    System.out.println("--- HISTORIAL DE MOVIMIENTOS ---");
                    if (numTransacciones == 0) {
                        System.out.println("No se han realizado transacciones en esta sesion.");
                    } else {
                      
                        for (int i = 0; i < numTransacciones; i++) {
                            double monto = historial[i];
                            if (monto > 0) {
                                System.out.printf("Movimiento %d: Deposito de $%.2f\n", (i + 1), monto);
                            } else {
                                System.out.printf("Movimiento %d: Retiro de $%.2f\n", (i + 1), Math.abs(monto));
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Gracias por usar el cajero automatico. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida.\n");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}