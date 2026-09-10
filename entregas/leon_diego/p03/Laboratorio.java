// ============================================================================
// P3 · LABORATORIO DE PREDICCIONES · MPOO 2027-1 · Grupo 6
//
// ESCRIBE TU NOMBRE AQUI:
// ============================================================================
//
// QUE HACE ESTE PROGRAMA
//   Te va a preguntar, una por una, que crees que va a imprimir cada linea de
//   codigo. Tu escribes tu prediccion y le das Enter. Al terminar cada bloque
//   te muestra, lado a lado, lo que predijiste y lo que de verdad salio.
//
// COMO SE TRABAJA
//   1. Compila y corre:   javac Laboratorio.java    y luego    java Laboratorio
//      Correlo desde la TERMINAL: necesita teclado para preguntarte.
//   2. Contesta las 36 predicciones. Si no sabes, ADIVINA: equivocarte y
//      entender por que es exactamente el ejercicio.
//   3. Al final te imprime tu tabla completa y cuantas acertaste.
//   4. TOMA CAPTURA de esa tabla final.
//   5. Escribe el bloque 7 (ahi si escribes codigo tuyo) y vuelve a correr.
//   6. Entrega tu documento con la captura y tu analisis (ver la guia).
//
// COMO SE CALIFICA
//   No se califica cuantas acertaste. Se califica que hayas contestado TODAS y
//   que expliques con tus palabras por que fallaste las que fallaste.
//
// FIJATE EN COMO ESTAN ESCRITOS LOS NOMBRES DE ESTE PROGRAMA
//   Es la convencion de Java, y la vamos a usar todo el semestre:
//     · variables y metodos en camelCase, empezando en minuscula
//         totalDePreguntas    mostrarBloque()    hayTeclado
//     · constantes en MAYUSCULAS, separadas con guion bajo
//         MAX_PREGUNTAS       INTENTOS_MAXIMOS
//     · clases en PascalCase, empezando en mayuscula
//         Laboratorio         String        Scanner
//   El nombre dice QUE guarda o QUE hace. Nada de a, x, dato1 ni aux.
//
// NO cambies el codigo de los bloques 1 a 6. El bloque 7 si es tuyo.
// ============================================================================

import java.util.Scanner;
import java.io.PrintWriter;

public class Laboratorio {

    // ===== constantes: van en MAYUSCULAS porque su valor nunca cambia =====
    static final int MAX_PREGUNTAS          = 40;
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
    // Pide una prediccion y la guarda. Aguanta respuestas vacias, respuestas
    // larguisimas y que no haya teclado (por ejemplo si lo corres desde un IDE
    // mal configurado o desde un script).
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

    // guarda lo que de verdad imprimio, en el mismo orden en que se pregunto
    static void registrarResultados(int desde, String... valores) {
        for (int i = 0; i < valores.length; i++) resultadosReales[desde + i] = valores[i];
    }

    // ------------------------------------------------------------------------
    // Compara tu prediccion con el resultado. Es tolerante a proposito: no te
    // penaliza por escribir "verdadero" en vez de "true" ni por poner comillas.
    // ------------------------------------------------------------------------
    static String normalizar(String texto) {
        if (texto == null) return "";
        String limpio = texto.trim().toLowerCase().replace(" ", "").replace("\"", "").replace("'", "");
        if (limpio.equals("verdadero") || limpio.equals("v")) limpio = "true";
        if (limpio.equals("falso")     || limpio.equals("f")) limpio = "false";
        if (limpio.equals("infinito"))                        limpio = "infinity";
        if (limpio.equals("nulo") || limpio.equals("nada"))   limpio = "null";
        if (limpio.equals("noesnumero"))                      limpio = "nan";
        if (limpio.endsWith(".0")) limpio = limpio.substring(0, limpio.length() - 2);  // 3.0 vale igual que 3
        return limpio;
    }

    static boolean leAtino(int indice) {
        return normalizar(predicciones[indice]).equals(normalizar(resultadosReales[indice]));
    }

    static String recortar(String texto, int largoMaximo) {
        if (texto == null) return "";
        return texto.length() <= largoMaximo ? texto : texto.substring(0, largoMaximo - 1) + "~";
    }

    // muestra la tabla de un bloque, ya con los resultados reales
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

    // ------------------------------------------------------------------------
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
static void bloque7() {
    System.out.println();
    System.out.println(" BLOQUE 7 ");

    // Usamos 2.0 en lugar de 2 para que Java haga division de punto flotante
    // Si usaramos 5 / 2 daria 2 (division entera), pero con 2.0 da 2.5
    System.out.println("7.1 = " + (5 / 2.0));

    // Usamos % para obtener el residuo de la division entre 2
    // 47 % 2 = 1 (residuo), entonces 47 es impar
    // 47 % 2 != 0 es true (es impar), que es lo que pide el enunciado
    System.out.println("7.2 = " + (47 % 2 != 0));

    // Usamos (int) para hacer un casting explicito de double a int
    // Esto trunca el numero, eliminando la parte decimal
    // Se perdio 0.99 porque el casting a int corta (trunca) el valor, no redondea
    System.out.println("7.3 = " + ((int) 9.99));

    // Usamos Math.abs() para obtener el valor absoluto de la resta
    // Esto evita que la resta sea negativa y nos permite comparar la magnitud
    // Usamos < 0.000001 (epsilon) en lugar de == por errores de precision en punto flotante
    // 0.1 + 0.2 no es exactamente 0.3 en binario, pero la diferencia es minima
    System.out.println("7.4 = " + (Math.abs((0.1 + 0.2) - 0.3) < 0.000001));


    int divisor = 0;
    // Usamos && que evalua de izquierda a derecha (corto circuito)
    // Primero verifica divisor != 0 que es false
    // Como es false, nunca evalua 10 / divisor > 5, evitando la division entre cero
    // Si usaramos & (sin corto circuito) o invirtieramos el orden, daria error
    System.out.println("7.5 = " + (divisor != 0 && 10 / divisor > 5));

    System.out.println(" (si todavia no escribes nada aqui, no se imprime nada: es normal)");
}
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
        System.out.println(" Te voy a preguntar 36 veces que crees que imprime una linea de codigo.");
        System.out.println(" Contesta con tu mejor intento y dale Enter. Si no sabes, adivina:");
        System.out.println(" fallar y entender por que es justo el ejercicio.");
        System.out.println();
        System.out.println(" Escribe el valor como crees que se veria en pantalla. Por ejemplo:");
        System.out.println("   3     3.5     true     A     null     Infinity");

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
