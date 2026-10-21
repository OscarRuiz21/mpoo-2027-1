import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.print("\n1.Sumar 2.Restar 3.Multiplicar 4.Dividir 5.Factorial 0.Salir\nOpcion: ");
            op = sc.nextInt();

            // Agrupamos la peticion de numeros para las opciones del 1 al 4
            if (op >= 1 && op <= 4) {
                System.out.print("Primer numero: "); double n1 = sc.nextDouble();
                System.out.print("Segundo numero: "); double n2 = sc.nextDouble();
                
                switch (op) {
                    case 1: System.out.println("Resultado: " + (n1 + n2)); break;
                    case 2: System.out.println("Resultado: " + (n1 - n2)); break;
                    case 3: System.out.println("Resultado: " + (n1 * n2)); break;
                    case 4: System.out.println(n2 == 0 ? "No se puede dividir entre 0" : "Resultado: " + (n1 / n2)); break;
                }
            } else {
                switch (op) {
                    case 5:
                        System.out.print("Numero: "); int num = sc.nextInt();
                        if (num < 0) System.out.println("No existe el factorial de un negativo");
                        else if (num > 20) System.out.println("Demasiado grande: el maximo es 20");
                        else {
                            long fact = 1;
                            for (int i = 1; i <= num; i++) fact *= i;
                            System.out.println("Resultado: " + num + "! = " + fact);
                        }
                        break;
                    case 0: System.out.println("Adios"); break;
                    default: System.out.println("Opcion no valida");
                }
            }
        } while (op != 0);
        sc.close();
    }
}