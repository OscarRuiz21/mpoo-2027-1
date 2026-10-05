import java.util.Scanner;

public class SemaforoEpidemiologico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADOR DE SEMAFORO EPIDEMIOLOGICO ===");
            System.out.println("1. Evaluar semaforo segun numero de contagios");
            System.out.println("2. Simular proyeccion de contagios a 5 dias");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("\nIntroduce el numero de contagios actual por favor: ");
                    int contagios = sc.nextInt();

                    if (contagios >= 0 && contagios <= 500) {
                        System.out.println("Estas en semaforo VERDE, favor de salir con cubrebocas.");
                    } else if (contagios >= 501 && contagios <= 2090) {
                        System.out.println("Estas en semaforo AMARILLO, favor de salir con precaucion.");
                    } else if (contagios >= 2091 && contagios <= 8679) {
                        System.out.println("Estas en semaforo NARANJA, favor de no salir comunmente.");
                    } else if (contagios >= 8680 && contagios <= 200090) {
                        System.out.println("Estas en semaforo ROJO, favor de mantenerte en cuarentena.");
                    } else {
                        System.out.println("FAVOR DE REVISAR TUS DATOS (numero fuera de rango valido).");
                    }
                }
                case 2 -> {
                    System.out.print("\nIntroduce los contagios base para la proyeccion: ");
                    int contagiosBase = sc.nextInt();

                    if (contagiosBase < 0) {
                        System.out.println("El numero de contagios no puede ser negativo.");
                    } else {
                        System.out.println("\n--- Proyeccion estimada a 5 dias ---");
                        for (int dia = 1; dia <= 5; dia++) {
                            contagiosBase += (int) (contagiosBase * 0.10); // Aumento del 10% diario
                            System.out.println("Dia " + dia + ": " + contagiosBase + " contagios estimados.");
                        }
                    }
                }
                case 0 -> System.out.println("\nGracias por su tiempo. :)");
                default -> System.out.println("\nOpcion invalida. Revisa tus datos.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

/** Nota: Profesor, ese es uno de los proyectos que habia hecho en la preparatoria, creí que sería buena idea el reutilizarlo para este proyecto
 * siendo la escritura del do while para completar los requisitos del ejercicio
 * este ejercicio lo hice en C.
 */