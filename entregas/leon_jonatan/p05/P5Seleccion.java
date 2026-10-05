// ============================================================================
// P5  ESTRUCTURAS DE SELECCION  MPOO 2027-1  Grupo 6
//
// ESCRIBE TU NOMBRE AQUI: Leon Carrasco Jonatan Abdel
// ============================================================================
//
// LOS CUATRO ARCHIVOS VAN JUNTOS, EN LA MISMA CARPETA:
//   P5Seleccion.java   este: el main con las pruebas. NO SE TOCA.
//   Moneda.java        el enum de las monedas. Ya esta escrito.
//   Producto.java      paso 1: lo completas tu.
//   Expendedora.java   paso 2: lo completas tu.
//
// COMO SE TRABAJA
//   1. Corre ESTE archivo. Vas a ver 18 FALLA: esta bien, aun no escribes nada.
//        javac P5Seleccion.java      (compila tambien los otros tres)
//        java P5Seleccion
//      En IntelliJ o VS Code: el boton de Run junto al main.
//   2. Completa Producto.java y luego Expendedora.java donde dice TODO.
//   3. Vuelve a correr despues de cada metodo. Terminas cuando diga 18 DE 18.
//   4. Toma captura de la tabla y pegala en la bitacora en PDF.
//
// NO cambies los nombres de los metodos ni este archivo.
// ============================================================================

public class P5Seleccion {

    static int pasadas = 0;
    static int total = 0;

    public static void main(String[] args) {
        System.out.println("=================================================================================");
        System.out.println("  P5  ESTRUCTURAS DE SELECCION");
        System.out.println("=================================================================================");
        System.out.printf("%-3s %-30s %-24s %-24s%n", "#", "prueba", "esperado", "obtuviste");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("    PRODUCTO");
        Producto p = new Producto("papas", 18, 15);
        Producto q = new Producto("chicles", 5, -4);
        Producto r = new Producto("gomitas", 8, 2);
        revisa(1, "papas con 15 piezas", "10", () -> "" + p.getPiezas());
        revisa(2, "chicles con -4 piezas", "0", () -> "" + q.getPiezas());
        revisa(3, "chicles.existencia()", "AGOTADO", () -> q.existencia());
        revisa(4, "gomitas.existencia()", "ULTIMAS PIEZAS", () -> r.existencia());
        revisa(5, "papas.existencia()", "DISPONIBLE", () -> p.existencia());
        r.sacarUna();
        r.sacarUna();
        r.sacarUna();
        revisa(6, "gomitas: sacar 3 de 2", "0", () -> "" + r.getPiezas());

        System.out.println("    EXPENDEDORA");
        Expendedora m = new Expendedora("Edificio Q", 15);
        Expendedora v = new Expendedora("   ", 0);
        revisa(7, "m.etiqueta()", "Edificio Q (DISPONIBLE)", () -> m.etiqueta());
        revisa(8, "v.etiqueta()", "SIN UBICACION (VACIA)", () -> v.etiqueta());
        revisa(9, "buscar(\" a2 \").getPrecio()", "22", () -> "" + m.buscar(" a2 ").getPrecio());
        revisa(10, "Z9 no existe, b1 si", "true, true",
                () -> (m.buscar("Z9") == null) + ", " + (m.buscar("b1") != null));

        m.insertar(Moneda.DIEZ);
        m.insertar(Moneda.CINCO);
        revisa(11, "$15, comprar(\"A1\")", "FALTAN $3", () -> m.comprar("A1"));
        m.insertar(Moneda.DOS);
        m.insertar(Moneda.UNO);
        revisa(12, "+$3, comprar(\"A1\")", "ENTREGADO, CAMBIO $0", () -> m.comprar("A1"));
        revisa(13, "piezas de A1 despues", "9", () -> "" + m.buscar("A1").getPiezas());
        revisa(14, "comprar(\"C3\")", "CODIGO INVALIDO", () -> m.comprar("C3"));
        m.insertar(Moneda.DIEZ);
        m.insertar(Moneda.DIEZ);
        m.insertar(Moneda.DIEZ);
        revisa(15, "$30, comprar(\"B1\")", "ENTREGADO, CAMBIO $15", () -> m.comprar("B1"));

        v.insertar(Moneda.DIEZ);
        revisa(16, "maquina vacia, comprar(\"B1\")", "AGOTADO", () -> v.comprar("B1"));
        revisa(17, "v.cancelar() dos veces", "10, 0", () -> v.cancelar() + ", " + v.cancelar());
        revisa(18, "getVentasTotales()", "2", () -> "" + Expendedora.getVentasTotales());

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("  " + pasadas + " DE " + total);
        if (pasadas == total) {
            System.out.println("  Listo. Toma la captura de esta tabla y pegala en tu bitacora.");
        } else {
            System.out.println("  Te faltan " + (total - pasadas) + ". Resuelvelos en orden.");
        }
        System.out.println("=================================================================================");
    }

    static void revisa(int numero, String prueba, String esperado, java.util.function.Supplier<String> accion) {
        total = total + 1;
        String obtenido;
        try {
            obtenido = String.valueOf(accion.get());
        } catch (RuntimeException e) {
            obtenido = "truena: " + e.getClass().getSimpleName();
        }
        boolean ok = esperado.equals(obtenido);
        if (ok) {
            pasadas = pasadas + 1;
        }
        System.out.printf("%-3d %-30s %-24s %-24s %s%n", numero, prueba, esperado, obtenido, ok ? "ok" : "FALLA");
    }
}