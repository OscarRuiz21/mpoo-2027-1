/* Programa: Cajero automático básico con autenticación de PIN y operaciones bancarias.
 * Uso del for: Simular la entrega secuencial de billetes al realizar un retiro de efectivo.
 * Uso del switch: Controlar el menú principal de operaciones (consultar, depositar, retirar, salir).
 */
import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nipCorrecto = "1234";
        int intentos = 0;
        boolean autenticado = false;

        while (intentos < 3 && !autenticado) {
            System.out.print("Ingrese su NIP (4 digitos): ");
            String nip = scanner.nextLine().trim();
            if (nip.equals(nipCorrecto)) {
                autenticado = true;
                System.out.println("Acceso concedido.");
            } else {
                intentos++;
                System.out.println("NIP incorrecto. Te quedan " + (3 - intentos) + " intentos.");
            }
        }

        if (!autenticado) {
            System.out.println("Cuenta bloqueada por seguridad.");
            scanner.close();
            return;
        }

        double saldo = 5000.0;
        int opcion;

        do {
            System.out.println("\n=== CAJERO AUTOMATICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                       System.out.println("Cantidad no valida.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Desglosando billetes:");
                        int billetes = (int) (retiro / 100);
                        for (int i = 1; i <= billetes && i <= 5; i++) {
                            System.out.println("Entregando billete " + i + " de $100...");
                        }
                        System.out.println("Saldo restante: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes o cantidad invalida.");
                    }
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 4);

        scanner.close();
    }
}