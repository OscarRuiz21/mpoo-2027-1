// MPOO S10 · Tu turno: ¿el anio es bisiesto?
// Correr:  java TuTurnoBisiesto.java
//
// Es bisiesto si es divisible entre 4, EXCEPTO los divisibles entre 100,
// SALVO que tambien lo sean entre 400.
// Pista: combina %, ==, != , && y ||

public class TuTurnoBisiesto {

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println("2024 -> " + esBisiesto(2024) + " (Esperado: true)");
        System.out.println("1900 -> " + esBisiesto(1900) + " (Esperado: false)");
        System.out.println("2000 -> " + esBisiesto(2000) + " (Esperado: true)");
        System.out.println("2026 -> " + esBisiesto(2026) + " (Esperado: false)");
    }
}