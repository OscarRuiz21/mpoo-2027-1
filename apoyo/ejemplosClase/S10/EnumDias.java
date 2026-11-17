// MPOO S10 · enum: un tipo con una lista fija de valores
// Correr:  java EnumDias.java

public class EnumDias {

    enum Dia { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES }

    static void queToca(Dia dia) {
        switch (dia) {
            case LUNES     -> System.out.println(dia + ": teoria, en linea");
            case MIERCOLES -> System.out.println(dia + ": laboratorio, en Q007");
            default        -> System.out.println(dia + ": ni teoria ni laboratorio");
        }
    }

    public static void main(String[] args) {
        queToca(Dia.LUNES);
        queToca(Dia.MIERCOLES);
        queToca(Dia.VIERNES);

        System.out.println();
        Dia hoy = Dia.LUNES;
        System.out.println("hoy            = " + hoy);
        System.out.println("hoy.ordinal()  = " + hoy.ordinal() + "   (su posicion en la lista)");
        System.out.println("Dia.values().length = " + Dia.values().length + "  (cuantos valores existen)");

        System.out.println();
        System.out.println("Con int o String cabe cualquier valor; con enum, solo estos cinco.");
    }
}
