public class TuTurnoBisiesto {

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        //Casos de prueba
        System.out.println("2024 es bisiesto (Esperado: true): " + esBisiesto(2024));
        System.out.println("1900 es bisiesto (Esperado: false): " + esBisiesto(1900));
        System.out.println("2000 es bisiesto (Esperado: true): " + esBisiesto(2000));
        System.out.println("2026 es bisiesto (Esperado: false): " + esBisiesto(2026));
    }
}