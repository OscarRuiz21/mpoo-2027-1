// ============================================================================
// P4 · ARREGLOS CON TUS MANOS · MPOO 2027-1 · Grupo 6
//
// ESCRIBE TU NOMBRE AQUI: SANCHEZ MENDEZ CITLALI ITZEL Y HERNANDEZ NIEVES EMILY
// ============================================================================
//
// QUE HACE ESTE PROGRAMA
//   Trae diez metodos. Los dos primeros ya estan resueltos: son tus ejemplos.
//   Los otros ocho estan vacios y los completas tu. Al correrlo, el programa
//   prueba cada metodo con datos conocidos y te dice cual pasa y cual no.
//
// COMO SE TRABAJA
//   1. Compila y corre:   javac P4Arreglos.java    y luego    java P4Arreglos
//   2. Vas a ver ocho FALLA. Esta bien: todavia no escribes nada.
//   3. Resuelve de uno en uno, en orden. Vuelve a compilar y a correr despues
//      de cada uno: la tabla te dice si ya quedo.
//   4. Termina cuando la ultima linea diga 8 de 8.
//   5. Toma captura de esa tabla.
//
// SI NUNCA HAS ESCRITO UN for
//   Lee el EJEMPLO A. Es el recorrido de un arreglo, entero:
//
//       for (int i = 0; i < numeros.length; i++) { ... numeros[i] ... }
//            ^inicia     ^mientras se cumpla     ^y suma 1 cada vuelta
//
//   i es la POSICION, no el valor. numeros[i] es el valor que vive ahi.
//   Las posiciones van de 0 a length - 1. Por eso la condicion es < y no <=.
//   El EJEMPLO B usa la otra forma, el for-each, cuando no necesitas la posicion.
//
// COMO SE CALIFICA
//   Se califica que los ocho pasen y que el codigo sea tuyo. Si alguno no te
//   sale, entregalo igual y escribe en tu README donde te atoraste: eso cuenta.
//
// NO cambies el nombre ni la firma de los metodos, ni el codigo de la
// verificacion de abajo. Solo escribes dentro de los metodos con TODO.
// ============================================================================

import java.util.Arrays;

public class P4Arreglos {

    // ========================== EJEMPLO A (resuelto) ==========================
    // Suma todos los numeros de un arreglo y devuelve el total.
    // Este es el recorrido clasico: la variable i es la posicion.
    static int suma(int[] numeros) {
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            total = total + numeros[i];
        }
        return total;
    }

    // ========================== EJEMPLO B (resuelto) ==========================
    // Cuenta cuantos numeros son mayores que el umbral.
    // Este es el for-each: se usa cuando NO necesitas la posicion, solo el valor.
    static int cuantosPasan(int[] numeros, int umbral) {
        int cuantos = 0;
        for (int valor : numeros) {
            if (valor > umbral) {
                cuantos = cuantos + 1;
            }
        }
        return cuantos;
    }

    // =============================== EJERCICIO 1 ===============================
    // Crea y devuelve un arreglo de int con estos cinco valores, en este orden:
    // 10, 20, 30, 40, 50.  Aqui no hace falta ningun for.
    static int[] primerosCinco() {
        int[] numeros ={10, 20, 30, 40, 50};
        return numeros;
    }

    // =============================== EJERCICIO 2 ===============================
    // Devuelve el promedio de los numeros. Ojo con la division entera:
    // si sumas int y divides entre int, Java te devuelve int.
    // Pista: puedes apoyarte en suma(numeros), que ya esta resuelto.
    static double promedio(int[] numeros) {
        // TODO: escribe tu codigo aqui
        return 0.0;
    }

    // =============================== EJERCICIO 3 ===============================
    // Devuelve el numero mas grande del arreglo.
    // Pista: guarda el primero como candidato y recorre el resto comparando.
    static int maximo(int[] numeros) {
        // TODO: escribe tu codigo aqui
        return 0;
    }

    // =============================== EJERCICIO 4 ===============================
    // Devuelve la POSICION donde vive el valor buscado, o -1 si no esta.
    // Si aparece dos veces, devuelve la primera.
    static int posicionDe(int[] numeros, int buscado) {
        // TODO: escribe tu codigo aqui
        return -1;
    }

    // =============================== EJERCICIO 5 ===============================
    // Devuelve un arreglo NUEVO con los mismos valores al reves.
    // El arreglo que recibes no se toca.
    static int[] invertido(int[] numeros) {
        // TODO: escribe tu codigo aqui
        return null;
    }

    // =============================== EJERCICIO 6 ===============================
    // Recibe un arreglo de objetos Alumno y devuelve el nombre del que tiene
    // la calificacion mas alta. La clase Alumno esta hasta abajo.
    // Se llega al dato asi:  alumnos[i].nombre     alumnos[i].calificacion
    static String nombreDelMasAlto(Alumno[] alumnos) {
        // TODO: escribe tu codigo aqui
        return "";
    }

    // =============================== EJERCICIO 7 ===============================
    // Suma los valores de UNA fila de una matriz.
    // En una matriz, matriz[fila] es a su vez un arreglo: matriz[fila][columna].
    static int sumaDeFila(int[][] matriz, int fila) {
        // TODO: escribe tu codigo aqui
        return 0;
    }

    // =============================== EJERCICIO 8 ===============================
    // Recibe una linea con nombres separados por coma, posiblemente con espacios
    // de sobra, y devuelve un solo String con los nombres limpios y separados
    // por " | ".   "  ana , beto ,cris "   ->   "ana | beto | cris"
    // Pistas: linea.split(",") te devuelve un arreglo de String;
    //         texto.trim() quita los espacios de las orillas.
    static String limpiaYJunta(String linea) {
        // TODO: escribe tu codigo aqui
        return "";
    }

    // ============================================================================
    // DE AQUI PARA ABAJO NO SE TOCA: es la verificacion.
    // ============================================================================

    static int pasadas = 0;
    static int total = 0;

    public static void main(String[] args) {
        System.out.println("========================================================================");
        System.out.println("  P4 · ARREGLOS CON TUS MANOS");
        System.out.println("========================================================================");
        System.out.printf("%-3s %-26s %-22s %-22s %s%n", "#", "ejercicio", "esperado", "obtuviste", "");
        System.out.println("------------------------------------------------------------------------");

        int[] notas = { 7, 9, 5, 10, 8 };
        int[][] matriz = { { 1, 2, 3 }, { 10, 20, 30 } };
        Alumno[] grupo = { new Alumno("Ana", 78), new Alumno("Beto", 91), new Alumno("Cris", 85) };

        revisa(1, "primerosCinco()", "[10, 20, 30, 40, 50]", texto(primerosCinco()));
        revisa(2, "promedio({7,9,5,10,8})", "7.8", String.valueOf(promedio(notas)));
        revisa(3, "maximo({7,9,5,10,8})", "10", String.valueOf(maximo(notas)));
        revisa(4, "posicionDe(.., 5)", "2", String.valueOf(posicionDe(notas, 5)));
        revisa(5, "invertido({7,9,5,10,8})", "[8, 10, 5, 9, 7]", texto(invertido(notas)));
        revisa(6, "nombreDelMasAlto(grupo)", "Beto", String.valueOf(nombreDelMasAlto(grupo)));
        revisa(7, "sumaDeFila(matriz, 1)", "60", String.valueOf(sumaDeFila(matriz, 1)));
        revisa(8, "limpiaYJunta(linea)", "ana | beto | cris", String.valueOf(limpiaYJunta("  ana , beto ,cris ")));

        System.out.println("------------------------------------------------------------------------");
        System.out.println("  " + pasadas + " DE " + total);
        if (pasadas == total) {
            System.out.println("  Listo. Toma la captura de esta tabla y entregala.");
        } else {
            System.out.println("  Te faltan " + (total - pasadas) + ". Resuelvelos en orden, de uno en uno.");
        }
        System.out.println("========================================================================");

        // comprobacion extra del ejercicio 5: el arreglo original no se toca
        int[] copia = { 7, 9, 5, 10, 8 };
        invertido(copia);
        if (!Arrays.equals(copia, notas)) {
            System.out.println("  AVISO: el ejercicio 5 modifico el arreglo que recibio. Debe devolver uno nuevo.");
        }
    }

    static void revisa(int numero, String ejercicio, String esperado, String obtenido) {
        total = total + 1;
        boolean ok = esperado.equals(obtenido);
        if (ok) {
            pasadas = pasadas + 1;
        }
        System.out.printf("%-3d %-26s %-22s %-22s %s%n", numero, ejercicio, esperado, obtenido, ok ? "ok" : "FALLA");
    }

    static String texto(int[] arreglo) {
        return arreglo == null ? "null" : Arrays.toString(arreglo);
    }
}

// Clase de apoyo del ejercicio 6. No la modifiques.
class Alumno {
    String nombre;
    int calificacion;

    Alumno(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
}