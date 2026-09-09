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
//   2. Contesta las 36 predicciones. Si no sabes, ADIVINA: equivocarte y
//      entender por que es exactamente el ejercicio.
//   3. Al final te imprime tu tabla completa y cuantas acertaste.
//   4. TOMA CAPTURA de esa tabla final.
//   5. Escribe el bloque 7 (ahi si escribes codigo tuyo) y vuelve a correr.
//   6. Entrega tu documento con la captura y tu analisis (ver la guia).
//
// COMO SE CALIFICA
//   No se califica cuantas acertaste. Se califica que hayas contestado TODAS y
//   que expliques con tus palabras por que fallaste las que fallaste. Una
//   prediccion equivocada bien explicada vale mas que una tabla perfecta.
//
// NO cambies el codigo de los bloques 1 a 6. El bloque 7 si es tuyo.
// ============================================================================

import java.util.Scanner;
import java.io.PrintWriter;

public class Laboratorio {

    // ===== atributos sin valor inicial, para el bloque 1 =====
    static int enteroSinValor;
    static double decimalSinValor;
    static boolean logicoSinValor;
    static char letraSinValor;
    static String textoSinValor;

    // ===== memoria de tus respuestas =====
    static String[] expresion  = new String[40];
    static String[] prediccion = new String[40];
    static String[] resultado  = new String[40];
    static int[]    delBloque  = new int[40];
    static int total = 0;

    static Scanner sc = new Scanner(System.in);
    static boolean hayTeclado = true;   // se apaga si el programa corre sin consola

    // ------------------------------------------------------------------------
    // Pide una prediccion y la guarda. Aguanta respuestas vacias, respuestas
    // larguisimas y que no haya teclado (por ejemplo si lo corres desde un IDE
    // mal configurado o desde un script).
    // ------------------------------------------------------------------------
    static void predecir(int bloque, String expr) {
        String r = "(sin contestar)";
        int intentos = 0;
        while (hayTeclado) {
            System.out.print("   " + expr + "  =  ");
            System.out.flush();
            String linea;
            try {
                if (!sc.hasNextLine()) { hayTeclado = false; System.out.println(); break; }
                linea = sc.nextLine();
            } catch (Exception e) {
                hayTeclado = false; System.out.println(); break;
            }
            linea = linea.trim();
            intentos++;
            if (linea.isEmpty()) {
                if (intentos >= 3) { r = "(la dejo en blanco)"; break; }
                System.out.println("      ^ no la dejes en blanco: si no sabes, adivina algo");
                continue;
            }
            if (linea.length() > 40) {
                if (intentos >= 3) { r = linea.substring(0, 40); break; }
                System.out.println("      ^ escribe solo el valor que crees que imprime, no la explicacion");
                continue;
            }
            r = linea;
            break;
        }
        expresion[total] = expr;
        prediccion[total] = r;
        delBloque[total] = bloque;
        total++;
    }

    // guarda lo que de verdad imprimio, en el mismo orden en que se pregunto
    static void real(int desde, String... valores) {
        for (int i = 0; i < valores.length; i++) resultado[desde + i] = valores[i];
    }

    // ------------------------------------------------------------------------
    // Compara tu prediccion con el resultado. Es tolerante a proposito: no te
    // penaliza por escribir "verdadero" en vez de "true" ni por poner comillas.
    // ------------------------------------------------------------------------
    static String normalizar(String s) {
        if (s == null) return "";
        String x = s.trim().toLowerCase().replace(" ", "").replace("\"", "").replace("'", "");
        if (x.equals("verdadero") || x.equals("v")) x = "true";
        if (x.equals("falso") || x.equals("f")) x = "false";
        if (x.equals("infinito")) x = "infinity";
        if (x.equals("nulo") || x.equals("nada") || x.equals("vacio")) x = "null";
        if (x.equals("noesnumero")) x = "nan";
        if (x.endsWith(".0")) x = x.substring(0, x.length() - 2);   // 3.0 vale igual que 3
        return x;
    }

    static boolean acerto(int i) {
        return normalizar(prediccion[i]).equals(normalizar(resultado[i]));
    }

    static String corta(String s, int n) {
        if (s == null) return "";
        return s.length() <= n ? s : s.substring(0, n - 1) + "~";
    }

    // muestra la tabla de un bloque, ya con los resultados reales
    static void mostrarBloque(int bloque, String titulo) {
        System.out.println();
        System.out.println("   +--------------------------------+-----------------+-----------+-------+");
        System.out.printf ("   | RESULTADO DEL BLOQUE %-47d |%n", bloque);
        System.out.println("   +--------------------------------+-----------------+-----------+-------+");
        System.out.println("   | expresion                      | predijiste      | salio     |       |");
        System.out.println("   +--------------------------------+-----------------+-----------+-------+");
        int fallos = 0;
        for (int i = 0; i < total; i++) {
            if (delBloque[i] != bloque) continue;
            boolean ok = acerto(i);
            if (!ok) fallos++;
            System.out.printf("   | %-30s | %-15s | %-9s | %-5s |%n",
                corta(expresion[i], 30), corta(prediccion[i], 15),
                corta(resultado[i], 9), ok ? " ok" : "FALLO");
        }
        System.out.println("   +--------------------------------+-----------------+-----------+-------+");
        if (fallos == 0) System.out.println("   Sin fallos en este bloque.");
        else System.out.println("   Fallaste " + fallos + ". Anotalas: explicarlas es lo que se califica.");
    }

    static void titulo(int bloque, String t, String explica) {
        System.out.println();
        System.out.println("========================================================================");
        System.out.println(" BLOQUE " + bloque + " · " + t);
        System.out.println(" " + explica);
        System.out.println("========================================================================");
        System.out.println(" Escribe que crees que va a imprimir cada linea:");
    }

    // ------------------------------------------------------------------------
    static void bloque1() {
        titulo(1, "Con que nace un atributo al que nadie le puso valor",
                  "Estos atributos se declararon, pero nunca se les asigno nada.");
        int d = total;
        predecir(1, "int sin valor");
        predecir(1, "double sin valor");
        predecir(1, "boolean sin valor");
        predecir(1, "char sin valor, como numero");
        predecir(1, "String sin valor");
        real(d, "" + enteroSinValor, "" + decimalSinValor, "" + logicoSinValor,
                "" + (int) letraSinValor, "" + textoSinValor);
        mostrarBloque(1, "Valores por defecto");
    }

    static void bloque2() {
        titulo(2, "La division que miente",
                  "Fijate en el tipo de cada operando y en donde esta puesto el casting.");
        int d = total;
        predecir(2, "7 / 2");
        predecir(2, "7.0 / 2");
        predecir(2, "(double) 7 / 2");
        predecir(2, "(double) (7 / 2)");
        predecir(2, "7.0 / 0");
        predecir(2, "0.0 / 0.0");
        real(d, "" + (7 / 2), "" + (7.0 / 2), "" + ((double) 7 / 2),
                "" + ((double) (7 / 2)), "" + (7.0 / 0), "" + (0.0 / 0.0));
        mostrarBloque(2, "La division que miente");
    }

    static void bloque3() {
        titulo(3, "El modulo, y para que sirve de verdad",
                  "El % da el residuo: sirve para saber si algo es par y para sacar digitos.");
        int d = total;
        predecir(3, "7 % 2");
        predecir(3, "10 % 5");
        predecir(3, "-7 % 2");
        predecir(3, "7 % 2.5");
        predecir(3, "12345 % 10");
        predecir(3, "12345 / 10");
        real(d, "" + (7 % 2), "" + (10 % 5), "" + (-7 % 2),
                "" + (7 % 2.5), "" + (12345 % 10), "" + (12345 / 10));
        mostrarBloque(3, "El modulo");
    }

    static void bloque4() {
        titulo(4, "El casting y lo que se pierde",
                  "Un casting no redondea: corta. Y un tipo chico no aguanta cualquier numero.");
        int d = total;
        predecir(4, "(int) 3.9");
        predecir(4, "(int) -3.9");
        predecir(4, "(char) 65");
        predecir(4, "(int) 'A'");
        predecir(4, "'A' + 1");
        predecir(4, "(char) ('A' + 1)");
        predecir(4, "(byte) 200");
        real(d, "" + (int) 3.9, "" + (int) -3.9, "" + (char) 65, "" + (int) 'A',
                "" + ('A' + 1), "" + (char) ('A' + 1), "" + (byte) 200);
        mostrarBloque(4, "Casting");
    }

    static void bloque5() {
        titulo(5, "Relacionales y logicos",
                  "El && se detiene en cuanto ya sabe la respuesta: eso es el corto circuito.");
        int d = total;
        int vidas = 0;
        predecir(5, "5 > 3");
        predecir(5, "5 == 5.0");
        predecir(5, "0.1 + 0.2 == 0.3");
        predecir(5, "true && false");
        predecir(5, "true || false");
        predecir(5, "vidas>0 && 10/vidas>1  (vidas=0)");
        real(d, "" + (5 > 3), "" + (5 == 5.0), "" + (0.1 + 0.2 == 0.3),
                "" + (true && false), "" + (true || false), "" + (vidas > 0 && 10 / vidas > 1));
        mostrarBloque(5, "Relacionales y logicos");
    }

    static void bloque6() {
        titulo(6, "Las sorpresas",
                  "Aqui es donde casi todos fallan. Por eso existe este laboratorio.");
        int d = total;
        predecir(6, "0.1 + 0.2");
        predecir(6, "Integer.MAX_VALUE + 1");
        predecir(6, "5 + 3");
        predecir(6, "\"5\" + 3");
        predecir(6, "1 + 2 + \"3\"");
        predecir(6, "\"1\" + 2 + 3");
        real(d, "" + (0.1 + 0.2), "" + (Integer.MAX_VALUE + 1), "" + (5 + 3),
                "5" + 3, "" + (1 + 2 + "3"), "1" + 2 + 3);
        mostrarBloque(6, "Las sorpresas");
    }

    // ------------------------------------------------------------------------
    // BLOQUE 7 · AHORA TU · esta parte SI es codigo tuyo
    //
    // Descomenta cada linea y completa lo que falta dentro del parentesis.
    // Cada una tiene que ser una operacion de verdad: no vale escribir el
    // resultado a mano. Deja el comentario diciendo que operador usaste.
    // ------------------------------------------------------------------------
    static void bloque7() {
        System.out.println();
        System.out.println("========================================================================");
        System.out.println(" BLOQUE 7 · AHORA TU  (aqui escribes codigo, no predicciones)");
        System.out.println("========================================================================");

        // 7.1  Que imprima exactamente 2.5, partiendo de los numeros 5 y 2.
        //      Pista: si los dos quedan enteros nunca te dara 2.5. Haz que uno
        //      sea decimal, con un casting o escribiendolo como 2.0
        // System.out.println("7.1 = " + (            ));

        // 7.2  Con % , una expresion que diga si 47 es par. Debe imprimir false
        // System.out.println("7.2 = " + (            ));

        // 7.3  Un casting que convierta 9.99 en entero.
        //      En el comentario escribe cuanto se perdio y por que
        // System.out.println("7.3 = " + (            ));

        // 7.4  Comparar 0.1 + 0.2 contra 0.3 SIN usar == , y que imprima true.
        //      Pista: restalos y pregunta si la diferencia es menor que
        //      0.000001 . Para que la resta nunca salga negativa usa
        //      Math.abs( ... ) , que devuelve el valor absoluto
        // System.out.println("7.4 = " + (            ));

        // 7.5  Un && que aproveche el corto circuito para NO dividir entre cero,
        //      con un int que valga 0. Que no truene
        // int n = 0;
        // System.out.println("7.5 = " + (            ));

        System.out.println(" (si todavia no escribes nada aqui, no se imprime nada: es normal)");
    }

    // ------------------------------------------------------------------------
    static void reporteFinal() {
        int aciertos = 0;
        for (int i = 0; i < total; i++) if (acerto(i)) aciertos++;

        StringBuilder sb = new StringBuilder();
        sb.append("\n\n");
        sb.append("########################################################################\n");
        sb.append("#   TU TABLA FINAL  ·  ESTA ES LA CAPTURA QUE TIENES QUE ENTREGAR      #\n");
        sb.append("########################################################################\n");
        sb.append(String.format("%-4s %-32s %-17s %-11s %s%n", "#", "expresion", "predijiste", "salio", ""));
        sb.append("------------------------------------------------------------------------\n");
        for (int i = 0; i < total; i++) {
            sb.append(String.format("%-4d %-32s %-17s %-11s %s%n", i + 1,
                corta(expresion[i], 32), corta(prediccion[i], 17),
                corta(resultado[i], 11), acerto(i) ? "ok" : "FALLO"));
        }
        sb.append("------------------------------------------------------------------------\n");
        sb.append("ACERTASTE " + aciertos + " DE " + total + "\n\n");
        if (aciertos == total) {
            sb.append("Acertaste todas. En tu documento explica, de las tres mas dificiles,\n");
            sb.append("POR QUE dan ese resultado: no basta con haberle atinado.\n");
        } else {
            sb.append("ESTAS SON LAS QUE TIENES QUE EXPLICAR EN TU DOCUMENTO:\n\n");
            for (int i = 0; i < total; i++) {
                if (!acerto(i)) {
                    sb.append("   · " + expresion[i] + "\n");
                    sb.append("       creiste que daba: " + prediccion[i] + "\n");
                    sb.append("       en realidad da:   " + resultado[i] + "\n");
                    sb.append("       por que me equivoque: __________________________________\n\n");
                }
            }
        }
        sb.append("########################################################################\n");
        String texto = sb.toString();
        System.out.print(texto);

        try {
            PrintWriter pw = new PrintWriter("mis-resultados.txt");
            pw.print(texto);
            pw.close();
            System.out.println("\n(Tambien lo guarde en el archivo  mis-resultados.txt , en esta misma carpeta,");
            System.out.println(" por si la captura te sale cortada.)");
        } catch (Exception e) {
            System.out.println("\n(No pude guardar mis-resultados.txt, pero la tabla de arriba es la que cuenta.)");
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
            System.out.println("Corre el programa desde la terminal con:   java Laboratorio");
        }
    }
}
