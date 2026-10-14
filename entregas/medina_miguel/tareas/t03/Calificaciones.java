import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);

        int opcion = 0, alumnos = 0, aprobados = 0, reprobados = 0;
        double[] calificaciones;
        double suma = 0, promedio = 0;
        boolean salir = false;

        System.out.println("Ingrese eñ numero de alumnos: ");
        alumnos = entrada.nextInt();

        calificaciones = new double[alumnos];

         while (!salir) {

            System.out.println("SISTEMA DE CALIFICACIONES");
            System.out.println("Que desea realizar");
            System.out.println("1.- Registrar calificaciones");
            System.out.println("2.- Mostrar calificaciones");
            System.out.println("3.- Calcular promedio");
            System.out.println("4.- Contar aprobados y reprobados ");
            System.out.println("0.- Salir");
            System.out.println("Seleccione una opccion");

            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste registrar calificaciones");

                        for(int i = 0; i < alumnos; i++){

                            System.out.println("Ingresa la calificacion del alumno " + (i + 1) + ": ");
                            calificaciones[i] = entrada.nextDouble();

                            while(calificaciones[i] < 0 || calificaciones[i] > 10){

                                System.out.println("Calificacion no valida.");
                                System.out.println("Ingresa una calificacion entre 0 y 10: ");

                                calificaciones[i] = entrada.nextDouble();
                            }
                        }

                break;

                case 2:
                    System.out.println("Ingresaste a mostrar las calificaciones");


                    System.out.println("Calificaciones");
                     for(int i = 0; i < alumnos; i++){

                    System.out.println("Alumno" +(i + 1)+": "+calificaciones[i]);
                    }
                break;
            
                case 3:
                    suma = 0;

                    System.out.println("seleccione");
                    
                        for(int i = 0; i < alumnos; i++){
                            suma = suma + calificaciones[i];
                        }

                        promedio = suma / alumnos;
                        System.out.println("El promedio del grupo es: " + promedio);

                break;
                
                case 4:
                    System.out.println("Ingresaste a numero de Aprobados y Reprobados");
                    
                    aprobados = 0;
                    reprobados = 0;   

                    for(int i = 0; i < alumnos; i++){

                        if(calificaciones[i] >= 6){
                            aprobados++;
                        }
                        else{
                            reprobados++;
                        }
                    }

                    System.out.println("Alumnos aprobados: " + aprobados);
                    System.out.println("Alumnos reprobados: " + reprobados);
                break;

                case 0:
                    salir = true;

                    System.out.println("Hasta pronto");
                break;

                default:
                    System.out.println("Error. Opcion no valida");
                break;
            }
        }
            entrada.close();
    }
}
