// Este programa calcula el promedio de calificaciones de un grupo de alumnos y evalua aprobados.
// El switch se usa para elegir las distintas opciones del menu de reportes y calculos.
// El ciclo for recorre la cantidad de alumnos para solicitar y procesar cada calificacion.
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== SISTEMA DE CALIFICACIONES DE ALUMNOS ===");
            System.out.println("1. Registrar grupo y calcular promedio");
            System.out.println("2. Ver criterios de evaluacion");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = scanner.nextInt();
            
            
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantos alumnos hay en el grupo?: ");
                    int totalAlumnos = scanner.nextInt();

                    if (totalAlumnos <= 0) {
                        System.out.println("El numero de alumnos debe ser mayor a 0.");
                    } else {
                        double sumaCalificaciones = 0;
                        int aprobados = 0;
                        int reprobados = 0;

                        for (int i = 1; i <= totalAlumnos; i++) {
                            double calificacion;
                            
                            do {
                                System.out.print("Ingresa la calificacion del alumno " + i + " (0 - 10): ");
                                calificacion = scanner.nextDouble();

                                if (calificacion < 0 || calificacion > 10) {
                                    System.out.println("Calificacion invalida. Debe estar entre 0 y 10.");
                                }
                            } while (calificacion < 0 || calificacion > 10);

                            sumaCalificaciones += calificacion;

                            if (calificacion >= 6.0) {
                                aprobados++;
                            } else {
                                reprobados++;
                            }
                        }

                        double promedio = sumaCalificaciones / totalAlumnos;

                        System.out.println("\n--- RESUMEN DEL GRUPO ---");
                        System.out.println("Promedio general: " + promedio);
                        System.out.println("Alumnos aprobados: " + aprobados);
                        System.out.println("Alumnos reprobados: " + reprobados);
                    }
                    break;

                case 2:
                    System.out.println("\n--- CRITERIOS DE EVALUACION ---");
                    System.out.println("Calificacion minima aprobatoria: 6.0");
                    System.out.println("Rango de calificaciones: 0.0 a 10.0");
                    break;

                case 0:
                    System.out.println("Apagando el sistema...");
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion invalida. Intenta nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}