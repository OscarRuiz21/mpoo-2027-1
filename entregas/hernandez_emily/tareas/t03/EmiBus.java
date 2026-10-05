import java.util.Scanner;

//Este programa simula la compra de boletos de la linea de autobuses EmiBus.
//El for se utiliza para calcular el total de los boletos seleccionados.
//El switch se utiliza para seleccionar el destino del viaje.

public class EmiBus {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int cantidad;
        double precio = 0;
        String destino = "";
        double total;

        System.out.println("======================================");
        System.out.println(" Bienvenido a la Central de Autobuses");
        System.out.println("             del Norte");
        System.out.println("======================================");
        System.out.println("Linea de autobuses: EmiBus");
        System.out.println();

        do {

            System.out.println("¿A donde desea viajar?");
            System.out.println();
            System.out.println("========== DESTINOS EMIBUS ==========");
            System.out.println("1. Pachuca              $120");
            System.out.println("2. Puebla               $250");
            System.out.println("3. Zacualtipan          $250");
            System.out.println("4. Queretaro            $350");
            System.out.println("5. Alamo Temapache      $280");
            System.out.println("6. Acapulco             $500");
            System.out.println("7. IXhuatlan de Madero  $300");
            System.out.println("8. Guadalajara          $600");
            System.out.println("0. Salir");
            System.out.println("======================================");
            System.out.print("Opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    destino = "Pachuca";
                    precio = 120;
                    break;

                case 2:
                    destino = "Puebla";
                    precio = 250;
                    break;

                case 3:
                    destino = "Zacualtipan";
                    precio = 250;
                    break;

                case 4:
                    destino = "Queretaro";
                    precio = 350;
                    break;

                case 5:
                    destino = "Alamo Temapache";
                    precio = 280;
                    break;

                case 6:
                    destino = "Acapulco";
                    precio = 500;
                    break;

                case 7:
                    destino = "IXhuatlan de Madero";
                    precio = 300;
                    break;

                case 8:
                    destino = "Guadalajara";
                    precio = 600;
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Gracias por viajar con EmiBus.");
                    System.out.println("¡Disfruta tu viaje!");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

            if (opcion >= 1 && opcion <= 8) {

                System.out.println();
                System.out.println("Destino seleccionado: " + destino);
                System.out.println("Precio por boleto: $" + precio);

                System.out.print("Cuantos boletos desea comprar: ");
                cantidad = entrada.nextInt();

                if (cantidad <= 0) {

                    System.out.println("La cantidad de boletos debe ser mayor a 0.");

                } else {

                    total = 0;

                    for (int i = 1; i <= cantidad; i++) {
                        total = total + precio;
                    }

                    System.out.println();
                    System.out.println("========== RESUMEN ==========");
                    System.out.println("Destino: " + destino);
                    System.out.println("Boletos: " + cantidad);
                    System.out.println("Precio por boleto: $" + precio);
                    System.out.println("Total a pagar: $" + total);
                    System.out.println("==============================");
                }

                System.out.println();
            }

        } while (opcion != 0);

    }
}