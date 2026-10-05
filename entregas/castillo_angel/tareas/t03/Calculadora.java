import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            opcion = imprimirMenu(sc);//Fue interesante la parte del argumento de Scanner, ya que no sabia que se podia hacer eso y
            //  me parecio muy util para no tener que crear un nuevo scanner en cada metodo, lo tuve que buscar ya que no se me
            //  ocurria como hacerlo, despues lo implemente en los demas metodos.

            switch (opcion) {
                case 1:
                    System.out.println("Sumar\n");
                    double resultadoS = sumar(sc);
                    System.out.println("Resultado: " + resultadoS);
                    break;
                case 2:
                    System.out.println("Restar\n");
                    double resultadoR = restar(sc);
                    System.out.println("Resultado: " + resultadoR);
                    break;
                case 3:
                    System.out.println("Multiplicar\n");
                    double resultadoM = multiplicar(sc);
                    System.out.println("Resultado: " + resultadoM);
                    break;
                case 4:
                    System.out.println("Dividir");
                    double resultadoD = dividir(sc);
                    if(!Double.isNaN(resultadoD)) {
                        System.out.println("Resultado: " + resultadoD);
                    }
                    break;
                case 5:
                    System.out.println("Factorial");
                    long ResultadoF = factorial(sc);
                    if (ResultadoF != -1) {
                        System.out.println("Resultado: " + ResultadoF);
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    public static int imprimirMenu(Scanner sc) {
        System.out.println("\n=== CALCULADORA ===");
        System.out.println("1. Sumar"); 
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Factorial");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");

        int opcioning = sc.nextInt();
        return opcioning;
    }
    public static double sumar(Scanner sc){
        double suma = 0;
        System.out.println("Primer Numero:");
        double priNum = sc.nextDouble();
        System.out.println("Segundo Numero:");
        double segNum = sc.nextDouble();
        suma = priNum+segNum;

        return suma;
    }
    public static double restar(Scanner sc){
        double resta = 0;
        System.out.println("Primer Numero:");
        double priNum = sc.nextDouble();
        System.out.println("Segundo Numero:");
        double segNum = sc.nextDouble();
        resta = priNum-segNum;

        return resta;
    }
    public static double multiplicar(Scanner sc){
        double multiplicacion = 0;
        System.out.println("Primer Numero:");
        double priNum = sc.nextDouble();
        System.out.println("Segundo Numero:");
        double segNum = sc.nextDouble();
        multiplicacion = priNum*segNum;

        return multiplicacion;
    }
    public static double dividir(Scanner sc){
        double division = 0;
        System.out.println("Primer Numero:");
        double priNum = sc.nextDouble();
        System.out.println("Segundo Numero:");
        double segNum = sc.nextDouble();

        if (segNum == 0){
            System.out.println("No se puede dividir entre 0");
            return Double.NaN;
        } else {
        division = priNum/segNum;
        }

        return division;
    }
    public static long factorial(Scanner sc){
        long factorial = 1;
        System.out.println("Numero:");
        int numero = sc.nextInt();
        if (numero < 0){
            System.out.println("No existe factorial de un negativo");
            return -1;
        } else if (numero > 20){
            System.out.println("Demasiado grande: el maximo es 20");
            return -1;
        } else {
            for (int i = 1; i <= numero; i++){
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}







