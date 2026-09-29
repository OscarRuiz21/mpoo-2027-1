public class TuTurnoBisiesto {

    // Método que evalúa la regla del año bisiesto
    public static boolean esBisiesto(int anio) {
        // Si es divisible entre 400, siempre es bisiesto
        if (anio % 400 == 0) {
            return true;
        }
        // Si es divisible entre 100 (pero ya sabemos que no entre 400 por el if anterior), NO es bisiesto
        else if (anio % 100 == 0) {
            return false;
        }
        // Si es divisible entre 4, sí es bisiesto
        else if (anio % 4 == 0) {
            return true;
        }
        // Si no cumple nada de lo anterior, no es bisiesto
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Pruebas que vienen indicadas en las instrucciones
        System.out.println("2024 (Debe ser true): " + esBisiesto(2024));
        System.out.println("1900 (Debe ser false): " + esBisiesto(1900));
        System.out.println("2000 (Debe ser true): " + esBisiesto(2000));
        System.out.println("2026 (Debe ser false): " + esBisiesto(2026));
    }
}

