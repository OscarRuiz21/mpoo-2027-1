import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){

        double Suma, Resta, Division, Multi, Valor1, Valor2;
        int opcion, Factorial,numero;
        
        Scanner seleccion = new Scanner(System.in);

        do{
            System.out.println("BIENVENIDO A LA CALCULADORA");
            System.out.println("1.- SUMAR");
            System.out.println("2.- RESTAR");
            System.out.println("3.- MULTIPLICAR");
            System.out.println("4.- DIVIDIR");
            System.out.println("5.- FACTORIAL");
            System.out.println("0.- SALIR");

            opcion = seleccion.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer valor");
                    Valor1 = seleccion.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    Valor2 = seleccion.nextDouble();

                    Suma = Valor1 + Valor2;

                    System.out.println("El resultado es "+Suma);

                break;

                case 2:
                    System.out.println("Ingrese el primer valor");
                    Valor1 = seleccion.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    Valor2 = seleccion.nextDouble();
                    
                    Resta = Valor1 - Valor2;

                    System.out.println("El resultado es "+Resta);

                break;

                case 3:
                    System.out.println("Ingrese el primer valor");
                    Valor1 = seleccion.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    Valor2 = seleccion.nextDouble();
                    
                    Multi = Valor1 * Valor2;

                    System.out.println("El resultado es "+Multi);

                break;

                case 4:
                    System.out.println("Ingrese el primer valor");
                    Valor1 = seleccion.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    Valor2 = seleccion.nextDouble();
                    if (Valor2 != 0) {

                        Division = Valor1 / Valor2;
                        System.out.println("El resultado es " + Division);
                    
                    } else {

                        System.out.println("No se puede dividir entre cero");
                    
                    }
                break;

                case 5:
                    System.out.println("Ingrese el numero para calcular su factorial");
                    numero = seleccion.nextInt();
                   
                    if(numero < 0){
                        System.out.println("No se puede calcular el factorial de un numero negativo");
                    }else{
                        Factorial = 1;

                        for (int i = 1; i <= numero; i++) {
                            Factorial = Factorial * i;
                        }
                        
                        System.out.println("El factorial de " + numero + " es " + Factorial);
                    }
                break;

                case 0:
                    System.out.println("Hasta pronto");
                break;

                default:
                    System.out.println("Operacion invalida");
                    System.out.println("Ingrese una opcion valida");
                break;
            }

        } while(opcion != 0);
    }
}