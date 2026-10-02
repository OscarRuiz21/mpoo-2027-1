import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PIN = 1234;
        double saldo = 1000.0;
        boolean acceso = false;
        for (int i = 1; i <= 3 && !acceso; i++) {
            System.out.print("PIN: ");
            int pin = sc.nextInt();
            if (pin == PIN) {
                acceso = true;
            } else {
                System.out.println("PIN incorrecto. Intento " + i + " de 3.");
            }
        }

        if (!acceso) {
            System.out.println("Tarjeta bloqueada");
            sc.close();
            return;
        }

        int opcion;
        do {
            System.out.println("\n=== CAJERO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.print("Cuanto depositas: ");
                    double dep = sc.nextDouble();
                    if (dep <= 0) {
                        System.out.println("Cantidad invalida");
                    } else {
                        saldo += dep;
                        System.out.println("Nuevo saldo: " + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Cuanto retiras: ");
                    double ret = sc.nextDouble();
                    if (ret <= 0) {
                        System.out.println("Cantidad invalida");
                    } else if (ret > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= ret;
                        System.out.println("Nuevo saldo: " + saldo);
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

        sc.close();
    }
}