// MPOO S10 · switch moderno, con flecha, y sobre String
// Correr:  java SwitchModerno.java

public class SwitchModerno {

    static void ejecuta(String comando) {
        switch (comando) {
            case "start" -> System.out.println("arrancando...");
            case "stop"  -> System.out.println("deteniendo...");
            default      -> System.out.println("comando desconocido: " + comando);
        }
    }

    public static void main(String[] args) {
        ejecuta("start");
        ejecuta("stop");
        ejecuta("volar");

        System.out.println();

        // el switch tambien puede DEVOLVER un valor
        int mes = 4;
        String estacion = switch (mes) {
            case 12, 1, 2 -> "invierno";
            case 3, 4, 5  -> "primavera";
            case 6, 7, 8  -> "verano";
            default       -> "otono";
        };
        System.out.println("mes " + mes + " -> " + estacion);

        System.out.println();
        System.out.println("Con flecha no hace falta break y se pueden juntar varios valores en un case.");
    }
}
