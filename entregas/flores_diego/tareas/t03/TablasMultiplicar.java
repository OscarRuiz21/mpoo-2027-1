// El programa multiplica un numero que se ingrese hasta el limite que elijamos.
// El ciclo 'for' se utiliza para imprimir la tabla desde el 1 hasta el límite elegido.
// La estructura 'switch' nos permite elegir si queremos una tabla de multiplicar o si queremos salir del programa.

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("--- MENÚ DE TABLAS DE MULTIPLICAR ---");
            System.out.println("1. Tabla de multiplicar");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    int tabla = -1;
                    while (tabla < 0) {
                        System.out.print("¿Qué numero quieres multiplicar?  : ");
                        tabla = teclado.nextInt();

                        if (tabla < 0) {
                            System.out.println("No se permiten números negativos.");
                        }
                    }

                    System.out.print("¿Hasta qué número deseas multiplicarla?: ");
                    int limite = teclado.nextInt();

                    System.out.println("--- TABLA DEL " + tabla + " ---");
                    for (int i = 1; i <= limite; i++) {
                        int resultado = tabla * i;
                        System.out.println(tabla + " x " + i + " = " + resultado);
                    }
                    break;

                case 2:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta con un número del menu.");
                    break;
            }

        } while (opcion != 2);

    }
}