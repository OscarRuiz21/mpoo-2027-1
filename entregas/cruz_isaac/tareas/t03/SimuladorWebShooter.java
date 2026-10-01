import java.util.Scanner;

// PROGRAMA: Simulador de pruebas neumaticas para el prototipo "SP/DR MK 01" Web-Shooter.
// EL FOR SE USA EN: La opcion 2, para simular la rafaga continua de los cables.
// EL SWITCH SE USA EN: El menu principal para leer las acciones del prototipo.
public class SimuladorWebShooter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double presionAirePsi = 0.0;
        int cablesRestantes = 5;

        do {
            System.out.println("\n--- PANEL DE CONTROL NEUMATICO ---");
            System.out.println("1. Cargar tanque de aire comprimido");
            System.out.println("2. Prueba de disparo en rafaga (Requiere > 50 PSI)");
            System.out.println("3. Estado del sistema");
            System.out.println("0. Apagar modulo");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa los PSI a inyectar al tanque: ");
                    double psi = scanner.nextDouble();
                    if (psi < 0) {
                        System.out.println("Error: No puedes inyectar presion negativa.");
                    } else {
                        presionAirePsi += psi;
                        System.out.println("Presion actual: " + presionAirePsi + " PSI.");
                    }
                    break;
                case 2:
                    if (presionAirePsi <= 50) {
                        System.out.println("Falla: Presion insuficiente en el tanque de aire.");
                    } else if (cablesRestantes <= 0) {
                        System.out.println("Falla: El cartucho no tiene cables de acero de alta tension.");
                    } else {
                        System.out.print("Cuantos disparos en rafaga probaras? (Max " + cablesRestantes + "): ");
                        int rafaga = scanner.nextInt();

                        if (rafaga > cablesRestantes || rafaga <= 0) {
                            System.out.println("Cantidad invalida para el sistema.");
                        } else {
                            System.out.println("¡Iniciando motor de retraccion y disparo!");

                            // Uso del for para ejecutar la rafaga de acuerdo al numero introducido
                            for (int i = 1; i <= rafaga; i++) {
                                System.out.println(" THWIP! Cable " + i + " disparado.");
                                cablesRestantes--;
                                presionAirePsi -= 15.5; // Cada disparo resta la presion del sistema
                            }
                            System.out.println("Rafaga completada.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Presion actual: " + presionAirePsi + " PSI");
                    System.out.println("Cables de acero listos: " + cablesRestantes);
                    break;
                case 0:
                    System.out.println("Apagando prototipo...");
                    break;
                default:
                    System.out.println("Opcion no reconocida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}