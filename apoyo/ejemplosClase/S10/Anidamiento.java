// MPOO S10 · Anidar ifs contra salidas tempranas
// Correr:  java Anidamiento.java

public class Anidamiento {

    static void retiroAnidado(String cuenta, double saldo, double monto) {
        if (cuenta != null) {
            if (saldo >= monto) {
                System.out.println("   retiro de " + monto + " aplicado");
            } else {
                System.out.println("   saldo insuficiente");
            }
        } else {
            System.out.println("   la cuenta no existe");
        }
    }

    static void retiroConSalidasTempranas(String cuenta, double saldo, double monto) {
        if (cuenta == null) {
            System.out.println("   la cuenta no existe");
            return;
        }
        if (saldo < monto) {
            System.out.println("   saldo insuficiente");
            return;
        }
        System.out.println("   retiro de " + monto + " aplicado");
    }

    public static void main(String[] args) {
        System.out.println("anidado:");
        retiroAnidado("0021800001", 1000, 200);
        retiroAnidado("0021800001", 100, 200);
        retiroAnidado(null, 1000, 200);

        System.out.println();
        System.out.println("con salidas tempranas:");
        retiroConSalidasTempranas("0021800001", 1000, 200);
        retiroConSalidasTempranas("0021800001", 100, 200);
        retiroConSalidasTempranas(null, 1000, 200);

        System.out.println();
        System.out.println("Misma salida, la mitad de sangria: cada condicion dice de que te protege.");
    }
}
