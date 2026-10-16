// ============================================================================
// P4 · ARREGLOS CON TUS MANOS · MPOO 2027-1 · Grupo 6
//
// ESCRIBE TU NOMBRE AQUI: Flores Diego
// ============================================================================
import java.util.Arrays;

public class P4Arreglos {


    // =============================== EJERCICIO 1 ===============================
    static int[] primerosCinco() {
        int [] primeros = {10,20,30,40,50};
        return primeros;
    }

    // =============================== EJERCICIO 2 ===============================
    static double promedio(int[] numeros) {
        int total = 0;
        for(int i = 0; i < numeros.length; i++){
            total = total + numeros[i];
        }
        return (double)total/ numeros.length;
    }

    // =============================== EJERCICIO 3 ===============================
    static int maximo(int[] numeros) {
        int mayor = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    // =============================== EJERCICIO 4 ===============================
    static int posicionDe(int[] numeros, int buscado) {
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] ==buscado){
                return i;
            }
        }
        return -1;
    }

    // =============================== EJERCICIO 5 ===============================
    static int[] invertido(int[] numeros) {
        int [] nuevoarr = new int[numeros.length];
        for(int i = 0; i < numeros.length; i++){
            nuevoarr[i] = numeros[numeros.length -1 -i];
        }
        return nuevoarr;
    }

    // =============================== EJERCICIO 6 ===============================
    static String nombreDelMasAlto(Alumno[] alumnos) {
        Alumno masAlto = alumnos[0];
        for (int i = 0; i < alumnos.length; i++){
            if(alumnos[i].calificacion > masAlto.calificacion){
                masAlto = alumnos[i];
            }
        }
        return masAlto.nombre;
    }

    // =============================== EJERCICIO 7 ===============================
    static int sumaDeFila(int[][] matriz, int fila) {
        int suma = 0;
        for(int j = 0; j < matriz[fila].length; j++){
            suma += matriz[fila][j];
        }
        return suma;
    }

    // =============================== EJERCICIO 8 ===============================
    static String limpiaYJunta(String linea) {
        String[] nombres = linea.split(",");
        String resultado = "";
        for(int i = 0; i < nombres.length; i++){
            resultado += nombres[i].trim();
            if(i < nombres.length -1){
                resultado += " | ";
            }
        }
        return resultado;
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