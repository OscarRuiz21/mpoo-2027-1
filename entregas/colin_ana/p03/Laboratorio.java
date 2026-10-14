// ============================================================================
// P3 · LABORATORIO DE PREDICCIONES · MPOO 2027-1 · Grupo 6
// ============================================================================

import java.io.PrintWriter;
import java.util.Scanner;

public class Laboratorio {

    // ===== constantes: van en MAYUSCULAS porque su valor nunca cambia =====
    static final int MAX_PREGUNTAS          = 45;
    static final int INTENTOS_MAXIMOS       = 3;
    static final int LARGO_MAXIMO_RESPUESTA = 40;
    static final String ARCHIVO_DE_SALIDA   = "mis-resultados.txt";

    // ===== atributos declarados pero SIN valor inicial, para el bloque 1 =====
    static int     enteroSinValor;
    static double  decimalSinValor;
    static boolean logicoSinValor;
    static char    letraSinValor;
    static String  textoSinValor;

    // ===== aqui se guardan tus respuestas mientras corre el programa =====
    static String[] expresiones      = new String[MAX_PREGUNTAS];
    static String[] predicciones     = new String[MAX_PREGUNTAS];
    static String[] resultadosReales = new String[MAX_PREGUNTAS];
    static int[]    numeroDeBloque   = new int[MAX_PREGUNTAS];
    static int      totalDePreguntas = 0;

    static Scanner entrada    = new Scanner(System.in);
    static boolean hayTeclado = true;   // se apaga si el programa corre sin consola

    // ------------------------------------------------------------------------
    static void predecir(int bloque, String expresion) {
        String respuesta = "(sin contestar)";
        int intentos = 0;

        while (hayTeclado) {
            System.out.print("   " + expresion + "  =  ");
            System.out.flush();

            String linea;
            try {
                if (!entrada.hasNextLine()) { hayTeclado = false; System.out.println(); break; }
                linea = entrada.nextLine();
            } catch (Exception error) {
                hayTeclado = false; System.out.println(); break;
            }

            linea = linea.trim();
            intentos++;

            if (linea.isEmpty()) {
                if (intentos >= INTENTOS_MAXIMOS) { respuesta = "(la dejo en blanco)"; break; }
                System.out.println("      ^ no la dejes en blanco: si no sabes, adivina algo");
                continue;
            }
            if (linea.length() > LARGO_MAXIMO_RESPUESTA) {
                if (intentos >= INTENTOS_MAXIMOS) { respuesta = linea.substring(0, LARGO_MAXIMO_RESPUESTA); break; }
                System.out.println("      ^ escribe solo el valor que crees que imprime, no la explicacion");
                continue;
            }
            respuesta = linea;
            break;
        }

        expresiones[totalDePreguntas]    = expresion;
        predicciones[totalDePreguntas]   = respuesta;
        numeroDeBloque[totalDePreguntas] = bloque;
        totalDePreguntas++;
    }

    static void registrarResultados(int desde, String... valores) {
        for (int i = 0; i < valores.length; i++) resultadosReales[desde + i] = valores[i];
    }

    static String normalizar(String texto) {
        if (texto == null) return "";
        String limpio = texto.trim().toLowerCase().replace(" ", "").replace("\"", "").replace("'", "");
        if (limpio.equals("verdadero") || limpio.equals("v")) limpio = "true";
        if (limpio.equals("falso")     || limpio.equals("f")) limpio = "false";
        if (limpio.equals("infinito"))                        limpio = "infinity";
        if (limpio.equals("nulo") || limpio.equals("nada"))   limpio = "null";
        if (limpio.equals("noesnumero"))                      limpio = "nan";
        if (limpio.endsWith(".0")) limpio = limpio.substring(0, limpio.length() - 2);
        return limpio;
    }

    static boolean leAtino(int indice) {
        return normalizar(predicciones[indice]).equals(normalizar(resultadosReales[indice]));
    }

    static String recortar(String texto, int largoMaximo) {
        if (texto == null) return "";
        return texto.length() <= largoMaximo ? texto : texto.substring(0, largoMaximo - 1) + "~";
    }

    static void mostrarBloque(int bloque) {
        System.out.println();
        System.out.println("   +--------------------------------+-----------------+-----------+-------+");
        System.out.printf ("   | RESULTADO DEL BLOQUE %-47d |%n", bloque);
        System.out.println("   +--------------------------------+-----------------+-----------+-------+");
        System.out.println("   | expresion                      | predijiste      | salio     |       |");
        System.out.println("   +--------------------------------+-----------------+-----------+-------+");

        int fallos = 0;
        for (int i = 0; i < totalDePreguntas; i++) {
            if (numeroDeBloque[i] != bloque) continue;
            boolean atinada = leAtino(i);
            if (!atinada) fallos++;
            System.out.printf("   | %-30s | %-15s | %-9s | %-5s |%n",
                recortar(expresiones[i], 30), recortar(predicciones[i], 15),
                recortar(resultadosReales[i], 9), atinada ? " ok" : "FALLO");
        }
        System.out.println("   +--------------------------------+-----------------+-----------+-------+");
        if (fallos == 0) System.out.println("   Sin fallos en este bloque.");
        else System.out.println("   Fallaste " + fallos + ". Anotalas: explicarlas es lo que se califica.");
    }

    static void mostrarTitulo(int bloque, String tema, String explicacion) {
        System.out.println();
        System.out.println("========================================================================");
        System.out.println(" BLOQUE " + bloque + " · " + tema);
        System.out.println(" " + explicacion);
        System.out.println("========================================================================");
    }

    static void bloque1() {
        mostrarTitulo(1, "Con que nace un atributo al que nadie le puso valor",
                          "Estos atributos se declararon, pero nunca se les asigno nada.");
        System.out.println(" Asi estan declarados, fijate en el camelCase de cada nombre:");
        System.out.println("     int     enteroSinValor;");
        System.out.println("     double  decimalSinValor;");
        System.out.println("     boolean logicoSinValor;");
        System.out.println("     char    letraSinValor;");
        System.out.println("     String  textoSinValor;");
        System.out.println();
        System.out.println(" Que imprime cada uno?");

        int desde = totalDePreguntas;
        predecir(1, "enteroSinValor");
        predecir(1, "decimalSinValor");
        predecir(1, "logicoSinValor");
        predecir(1, "(int) letraSinValor");
        predecir(1, "textoSinValor");
        registrarResultados(desde, "" + enteroSinValor, "" + decimalSinValor, "" + logicoSinValor,
                                   "" + (int) letraSinValor, "" + textoSinValor);
        mostrarBloque(1);
    }

    static void bloque2() {
        mostrarTitulo(2, "La division que miente",
                          "Fijate en el tipo de cada operando y en donde esta puesto el casting.");
        System.out.println(" Que imprime cada expresion?");

        int desde = totalDePreguntas;
        predecir(2, "7 / 2");
        predecir(2, "7.0 / 2");
        predecir(2, "(double) 7 / 2");
        predecir(2, "(double) (7 / 2)");
        predecir(2, "7.0 / 0");
        predecir(2, "0.0 / 0.0");
        registrarResultados(desde, "" + (7 / 2), "" + (7.0 / 2), "" + ((double) 7 / 2),
                                   "" + ((double) (7 / 2)), "" + (7.0 / 0), "" + (0.0 / 0.0));
        mostrarBloque(2);
    }

    static void bloque3() {
        mostrarTitulo(3, "El modulo, y para que sirve de verdad",
                          "El % da el residuo: sirve para saber si algo es par y para sacar digitos.");
        System.out.println(" Que imprime cada expresion?");

        int desde = totalDePreguntas;
        predecir(3, "7 % 2");
        predecir(3, "10 % 5");
        predecir(3, "-7 % 2");
        predecir(3, "7 % 2.5");
        predecir(3, "12345 % 10");
        predecir(3, "12345 / 10");
        registrarResultados(desde, "" + (7 % 2), "" + (10 % 5), "" + (-7 % 2),
                                   "" + (7 % 2.5), "" + (12345 % 10), "" + (12345 / 10));
        mostrarBloque(3);
    }

    static void bloque4() {
        mostrarTitulo(4, "El casting y lo que se pierde",
                          "Un casting no redondea: corta. Y un tipo chico no aguanta cualquier numero.");
        System.out.println(" Que imprime cada expresion?");

        int desde = totalDePreguntas;
        predecir(4, "(int) 3.9");
        predecir(4, "(int) -3.9");
        predecir(4, "(char) 65");
        predecir(4, "(int) 'A'");
        predecir(4, "'A' + 1");
        predecir(4, "(char) ('A' + 1)");
        predecir(4, "(byte) 200");
        registrarResultados(desde, "" + (int) 3.9, "" + (int) -3.9, "" + (char) 65, "" + (int) 'A',
                                   "" + ('A' + 1), "" + (char) ('A' + 1), "" + (byte) 200);
        mostrarBloque(4);
    }

    static void bloque5() {
        mostrarTitulo(5, "Relacionales y logicos",
                          "El && se detiene en cuanto ya sabe la respuesta: eso es el corto circuito.");
        System.out.println(" Aqui  vidasRestantes  vale 0. Que imprime cada expresion?");

        int vidasRestantes = 0;
        int desde = totalDePreguntas;
        predecir(5, "5 > 3");
        predecir(5, "5 == 5.0");
        predecir(5, "0.1 + 0.2 == 0.3");
        predecir(5, "true && false");
        predecir(5, "true || false");
        predecir(5, "vidasRestantes > 0 && 10 / vidasRestantes > 1");
        registrarResultados(desde, "" + (5 > 3), "" + (5 == 5.0), "" + (0.1 + 0.2 == 0.3),
                                   "" + (true && false), "" + (true || false),
                                   "" + (vidasRestantes > 0 && 10 / vidasRestantes > 1));
        mostrarBloque(5);
    }

    static void bloque6() {
        mostrarTitulo(6, "Las sorpresas",
                          "Aqui es donde casi todos fallan. Por eso existe este laboratorio.");
        System.out.println(" Que imprime cada expresion?");

        int desde = totalDePreguntas;
        predecir(6, "0.1 + 0.2");
        predecir(6, "Integer.MAX_VALUE + 1");
        predecir(6, "5 + 3");
        predecir(6, "\"5\" + 3");
        predecir(6, "1 + 2 + \"3\"");
        predecir(6, "\"1\" + 2 + 3");
        registrarResultados(desde, "" + (0.1 + 0.2), "" + (Integer.MAX_VALUE + 1), "" + (5 + 3),
                                   "5" + 3, "" + (1 + 2 + "3"), "1" + 2 + 3);
        mostrarBloque(6);
    }

    // ------------------------------------------------------------------------
    // BLOQUE 7 · AHORA TU
    // ------------------------------------------------------------------------
    static void bloque7() {
        mostrarTitulo(7, "AHORA TU (aqui escribes codigo)",
                         "Comprueba tus expresiones mediante la prediccion.");

        int desde = totalDePreguntas;
        int divisorParaVerificar = 0;

        predecir(7, "5 / 2.0");
        predecir(7, "47 % 2 == 0");
        predecir(7, "(int) 9.99");
        predecir(7, "Math.abs((0.1+0.2)-0.3)<0.000001");
        predecir(7, "divisor!=0 && (10/divisor)>0");

        registrarResultados(desde,
            "" + (5 / 2.0),
            "" + (47 % 2 == 0),
            "" + ((int) 9.99),
            "" + (Math.abs((0.1 + 0.2) - 0.3) < 0.000001),
            "" + (divisorParaVerificar != 0 && (10 / divisorParaVerificar) > 0)
        );

        mostrarBloque(7);
    }

    // ------------------------------------------------------------------------
    static void reporteFinal() {
        int aciertos = 0;
        for (int i = 0; i < totalDePreguntas; i++) if (leAtino(i)) aciertos++;

        StringBuilder reporte = new StringBuilder();
        reporte.append("\n\n");
        reporte.append("########################################################################\n");
        reporte.append("#   TU TABLA FINAL  ·  ESTA ES LA CAPTURA QUE TIENES QUE ENTREGAR      #\n");
        reporte.append("########################################################################\n");
        reporte.append(String.format("%-4s %-32s %-17s %-11s %s%n", "#", "expresion", "predijiste", "salio", ""));
        reporte.append("------------------------------------------------------------------------\n");

        for (int i = 0; i < totalDePreguntas; i++) {
            reporte.append(String.format("%-4d %-32s %-17s %-11s %s%n", i + 1,
                recortar(expresiones[i], 32), recortar(predicciones[i], 17),
                recortar(resultadosReales[i], 11), leAtino(i) ? "ok" : "FALLO"));
        }

        reporte.append("------------------------------------------------------------------------\n");
        reporte.append("ACERTASTE " + aciertos + " DE " + totalDePreguntas + "\n\n");

        if (aciertos == totalDePreguntas) {
            reporte.append("Acertaste todas. En tu documento explica, de las tres mas dificiles,\n");
            reporte.append("POR QUE dan ese resultado: no basta con haberle atinado.\n");
        } else {
            reporte.append("ESTAS SON LAS QUE TIENES QUE EXPLICAR EN TU DOCUMENTO:\n\n");
            for (int i = 0; i < totalDePreguntas; i++) {
                if (!leAtino(i)) {
                    reporte.append("   · " + expresiones[i] + "\n");
                    reporte.append("       creiste que daba: " + predicciones[i] + "\n");
                    reporte.append("       en realidad da:   " + resultadosReales[i] + "\n");
                    reporte.append("       por que me equivoque: __________________________________\n\n");
                }
            }
        }
        reporte.append("########################################################################\n");

        String texto = reporte.toString();
        System.out.print(texto);

        try {
            PrintWriter archivo = new PrintWriter(ARCHIVO_DE_SALIDA);
            archivo.print(texto);
            archivo.close();
            System.out.println("\n(Tambien lo guarde en  " + ARCHIVO_DE_SALIDA + " , en esta misma carpeta,");
            System.out.println(" por si la captura te sale cortada.)");
        } catch (Exception error) {
            System.out.println("\n(No pude guardar " + ARCHIVO_DE_SALIDA + ", pero la tabla de arriba es la que cuenta.)");
        }
    }

    public static void main(String[] args) {
        System.out.println("========================================================================");
        System.out.println(" LABORATORIO P3 · PREDICCIONES · MPOO 2027-1");
        System.out.println("========================================================================");
        System.out.println(" Te voy a preguntar las predicciones linea por linea.");
        System.out.println(" Contesta con tu mejor intento y dale Enter. Si no sabes, adivina:");
        System.out.println();

        bloque1();
        bloque2();
        bloque3();
        bloque4();
        bloque5();
        bloque6();
        bloque7();
        reporteFinal();

        if (!hayTeclado) {
            System.out.println();
            System.out.println("AVISO: no encontre teclado, asi que las respuestas quedaron en blanco.");
            System.out.println("Correlo desde la terminal con:   java Laboratorio");
        }
    }
}