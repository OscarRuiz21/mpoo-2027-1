public class TuTurnoBisiesto {
    
    public static boolean esBisiesto(int anio) {
        // Un año es bisiesto si es divisible entre 4, excepto los divisibles entre 100,
        // salvo que también lo sean entre 400.
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        // Los cuatro casos de prueba requeridos que deben imprimir: true, false, true, false
        System.out.println("2024: " + esBisiesto(2024)); // true
        System.out.println("1900: " + esBisiesto(1900)); // false
        System.out.println("2000: " + esBisiesto(2000)); // true
        System.out.println("2026: " + esBisiesto(2026)); // false
    }
}