import java.util.Scanner;

public class Laboratorio {
    static final String[] EXPRESIONES = {
        "enteroSinValor", "decimalSinValor", "logicoSinValor", "(int) letraSinValor",
        "textoSinValor", "7 / 2", "7.0 / 2", "(double) 7 / 2", "(double) (7 / 2)",
        "7.0 / 0", "0.0 / 0.0", "7 % 2", "10 % 5", "-7 % 2", "7 % 2.5",
        "12345 % 10", "12345 / 10", "(int) 3.9", "(int) -3.9", "(char) 65",
        "(int) 'A'", "'A' + 1", "(char) ('A' + 1)", "(byte) 200", "5 > 3",
        "5 == 5.0", "0.1 + 0.2 == 0.3", "true && false", "true || false",
        "vidasRestantes > 0 && 10 / vidasRestantes", "0.1 + 0.2",
        "Integer.MAX_VALUE + 1", "5 + 3", "\"5\" + 3", "1 + 2 + \"3\"", "\"1\" + 2 + 3"
    };

    static final String[] RESULTADOS = {
        "0", "0.0", "false", "0", "null", "3", "3.5", "3.5", "3.0", "Infinity",
        "NaN", "1", "0", "-1", "2.0", "5", "1234", "3", "-3", "A", "65", "66",
        "B", "-56", "true", "true", "false", "false", "true", "false",
        "0.30000000000000004", "-2147483648", "8", "53", "33", "123"
    };

    static final String[] predicciones = new String[EXPRESIONES.length];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("LABORATORIO P3 - PREDICCIONES - MPOO 2027-1");
        System.out.println("Escribe tu prediccion para cada expresion y presiona Enter.");

        for (int indice = 0; indice < EXPRESIONES.length; indice++) {
            System.out.printf("%2d) %-35s = ", indice + 1, EXPRESIONES[indice]);
            predicciones[indice] = entrada.hasNextLine() ? entrada.nextLine().trim() : "";
        }

        int aciertos = 0;
        System.out.println();
        System.out.printf("%-4s %-35s %-18s %-12s %s%n", "#", "expresion", "predijiste", "salio", "resultado");
        System.out.println("------------------------------------------------------------------------");
        for (int indice = 0; indice < EXPRESIONES.length; indice++) {
            boolean acierto = normalizar(predicciones[indice]).equals(normalizar(RESULTADOS[indice]));
            if (acierto) {
                aciertos++;
            }
            System.out.printf("%-4d %-35s %-18s %-12s %s%n", indice + 1, EXPRESIONES[indice],
                    predicciones[indice], RESULTADOS[indice], acierto ? "ok" : "FALLO");
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("ACERTASTE %d DE %d%n", aciertos, EXPRESIONES.length);
        entrada.close();
    }

    static String normalizar(String valor) {
        return valor == null ? "" : valor.trim().toLowerCase();
    }
}