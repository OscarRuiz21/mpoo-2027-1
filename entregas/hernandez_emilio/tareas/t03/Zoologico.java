// Este programa simula la visita a un zoologico interactivo para escuchar los sonidos de los animales.
// Use el for en la opcion de ver lista completa para recorrer y contar la cantidad de animales del zoo.
// Use el switch para desplegar el menu de seleccion de animales y reproducir su onomatopeya.
//Codigo por Emilio Hernandez Crisostomo :DDD

import java.util.Scanner;

public class Zoologico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uso de while para pedir boleto con 3 intentos
        int boletoCorrecto = 2024;
        int intentos = 0;
        boolean acceso = false;

        while (intentos < 3 && !acceso) {
            System.out.print("Ingresa tu numero de boleto (4 digitos): ");
            int boleto = sc.nextInt();

            if (boleto == boletoCorrecto) {
                acceso = true;
            } else {
                intentos++;
                if (intentos == 1) {
                    System.out.println("Boleto invalido. Te quedan 2 intentos.");
                } else if (intentos == 2) {
                    System.out.println("Boleto invalido. Te queda 1 intento.");
                } else {
                    System.out.println("Acceso denegado. Ve a taquilla.");
                }
            }
        }

        if (!acceso) {
            return;
        }

        int opcion = 0;
        int contadorVisitas = 0;

        // Uso de do-while para el menu del zoologico
        do {
            System.out.println("\n=== BIENVENIDO AL ZOOLOGICO ===");
            System.out.println("1. Visitar al Leon");
            System.out.println("2. Visitar al Perro");
            System.out.println("3. Visitar al Gato");
            System.out.println("4. Visitar a la Vaca");
            System.out.println("5. Visitar al Pato");
            System.out.println("6. Ver lista de todos los animales");
            System.out.println("0. Salir del zoologico");
            System.out.print("¿A que animal quieres visitar?: ");
            opcion = sc.nextInt();

            // Uso de switch para las opciones
            switch (opcion) {
                case 1:
                    System.out.println("El Leon dice: ¡Roaaar!");
                    contadorVisitas++;
                    break;

                case 2:
                    System.out.println("El Perro dice: ¡Guau guau!");
                    contadorVisitas++;
                    break;

                case 3:
                    System.out.println("El Gato dice: ¡Miau miau!");
                    contadorVisitas++;
                    break;

                case 4:
                    System.out.println("La Vaca dice: ¡Muuuu!");
                    contadorVisitas++;
                    break;

                case 5:
                    System.out.println("El Pato dice: ¡Cuac cuac!");
                    contadorVisitas++;
                    break;

                case 6:
                    System.out.println("--- ANIMALES EN EL ZOOLOGICO ---");
                    int totalAnimales = 5;
                    // Uso de for para contar y enlistar los animales disponibles
                    for (int i = 1; i <= totalAnimales; i++) {
                        if (i == 1) System.out.println(i + ". Leon");
                        if (i == 2) System.out.println(i + ". Perro");
                        if (i == 3) System.out.println(i + ". Gato");
                        if (i == 4) System.out.println(i + ". Vaca");
                        if (i == 5) System.out.println(i + ". Pato");
                    }

                    // Uso de if para mensaje sobre las visitas
                    if (contadorVisitas > 0) {
                        System.out.println("Llevas " + contadorVisitas + " visita(s) a los animales.");
                    } else {
                        System.out.println("Aun no has visitado a ningun animal.");
                    }
                    break;

                case 0:
                    System.out.println("Gracias por visitar el zoologico. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion invalida. Ese animal no esta en el zoologico.");
                    break;
            }

        } while (opcion != 0);
    }
}