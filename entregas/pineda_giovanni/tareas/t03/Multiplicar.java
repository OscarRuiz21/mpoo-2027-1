// El programa imprime las tablas de multiplicar elegidas por el usuario.
// Usa un 'switch' para validar si se imprime la tabla o se cierra el programa.
// Usa un 'for' para calcular e imprimir los 10 multiplos.

import java.util.Scanner;

// Son tablas de multiplicar solo que para que sea mas facil solo le puse Multiplicar

public class Multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla;

        do {
            System.out.print("Que tabla quieres? (1-10, o 0 para salir): ");
            tabla = sc.nextInt();

            if (tabla < 0 || tabla > 10) {
                System.out.println("Numero fuera de rango.");
                continue;
            }

            switch (tabla) {
                case 0:
                    System.out.println("adios (hasta la vista babyyyyyyyy)");
                    break;
                default:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tabla + " x " + i + " = " + (tabla * i));
                    }
            }
        } while (tabla != 0);
        
        sc.close();
    }
}