// MPOO S10 · El menu de la clase, con Scanner
// Correr:  java MenuInteractivo.java

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Saludar   2) Despedir");
        System.out.print("Elige una opcion: ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> System.out.println("Hola!");
            case 2 -> System.out.println("Adios!");
            default -> System.out.println("Opcion invalida");
        }

        sc.close();
    }
}
