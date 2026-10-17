public class TuTurnoBisiesto {

    static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        // lo que debe dar cada uno:
        System.out.println("2024 -> " + esBisiesto(2024) + "   (deberia ser true)");
        System.out.println("1900 -> " + esBisiesto(1900) + "   (deberia ser false)");
        System.out.println("2000 -> " + esBisiesto(2000) + "   (deberia ser true)");
        System.out.println("2026 -> " + esBisiesto(2026) + "   (deberia ser false)");
    }
}