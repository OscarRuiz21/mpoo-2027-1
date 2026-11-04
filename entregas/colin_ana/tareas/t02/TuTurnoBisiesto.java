public class TuTurnoBisiesto {

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        // Casos de prueba obligatorios
        int[] anios = {2024, 1900, 2000, 2026};
        boolean[] esperados = {true, false, true, false};

        System.out.println("=== PRUEBAS DE AÑOS BISIESTOS ===");
        for (int i = 0; i < anios.length; i++) {
            boolean resultado = esBisiesto(anios[i]);
            System.out.println("Año " + anios[i] + ": " + resultado + 
                (resultado == esperados[i] ? " [CORRECTO]" : " [ERROR]"));
        }
    }
}