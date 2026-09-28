public class TuTurnoBisiesto {
    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("2024 es bisiesto? " + esBisiesto(2024) + " (esperado: true)");
        System.out.println("1900 es bisiesto? " + esBisiesto(1900) + " (esperado: false)");
        System.out.println("2000 es bisiesto? " + esBisiesto(2000) + " (esperado: true)");
        System.out.println("2026 es bisiesto? " + esBisiesto(2026) + " (esperado: false)");
    }
}