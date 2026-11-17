// MPOO S10 · if, if-else y la escalera else-if
// Correr:  java Ifs.java

public class Ifs {

    static String clasifica(int temperatura) {
        if (temperatura >= 35) {
            return "calor extremo";
        } else if (temperatura >= 25) {
            return "calor";
        } else if (temperatura >= 15) {
            return "templado";
        } else {
            return "frio";
        }
    }

    public static void main(String[] args) {
        System.out.println("38 grados -> " + clasifica(38));
        System.out.println("27 grados -> " + clasifica(27));
        System.out.println("18 grados -> " + clasifica(18));
        System.out.println(" 5 grados -> " + clasifica(5));

        System.out.println();
        System.out.println("El orden importa: la escalera se detiene en la primera condicion verdadera.");
        System.out.println("Si 'temperatura >= 15' estuviera arriba, 38 tambien entraria ahi.");

        System.out.println();
        int saldo = 100;
        if (saldo > 0) {
            System.out.println("Hay saldo: " + saldo);
        }
        System.out.println("Con llaves siempre, aunque sea una sola linea: se evita un bug silencioso.");
    }
}
