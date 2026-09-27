// CONTEXTO: Programa para controlar las impresiones en la papeleria de la facultad
// QUE SABE Y POR QUE: hojasDisponibles para no mandar a imprimir a lo tonto, impresionesHechas para el conteo y modelo para saber cual es
// QUE SABE HACER Y POR QUE: imprimir es void porque quita hojas y suma contador; tieneInsumosSuficientes regresa boolean para revisar si hay papel
// QUE IGNORE: el peso de la impresora ni si esta sucia porque no afecta la impresion
public class Impresora {

    // ===== ATRIBUTOS =====
    int hojasDisponibles = 100;     // tipo: int     nombre: hojasDisponibles  inicial: 100
    int impresionesHechas = 0;      // tipo: int     nombre: impresionesHechas inicial: 0
    String modelo = "LaserJet Pro"; // tipo: String  nombre: modelo             inicial: "LaserJet Pro"

    // ===== METODOS =====
    // firma: imprimir(int) retorno:void  parametro:int paginas
    void imprimir(int paginas) {
        hojasDisponibles = hojasDisponibles - paginas;
        impresionesHechas++;        // operador ++
    }

    // firma: tieneInsumosSuficientes(int)  retorno: boolean parametro: int paginas
    boolean tieneInsumosSuficientes(int paginas) {
        return paginas <= hojasDisponibles && hojasDisponibles > 0; // operadores <=, > y &&
    }

    // firma: paginasSobrantesModulo(int)  retorno: int parametro: int bloque
    int paginasSobrantesModulo(int bloque) {
        return hojasDisponibles % bloque; // operador %
    }

    // firma: calcularLotesCompletos(int)  retorno: int  parametro: int tamanoLote
    int calcularLotesCompletos(int tamanoLote) {
        double estimacion = (double) hojasDisponibles / tamanoLote; // operador /
        return (int) estimacion; // casting explicito (int)
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Impresora");

        Impresora imp = new Impresora();

        System.out.println("[estado inicial]");
        System.out.println("hojasDisponibles  = " + imp.hojasDisponibles);
        System.out.println("impresionesHechas = " + imp.impresionesHechas);
        System.out.println("modelo            = " + imp.modelo);

        System.out.println("[invocando metodos]");
        System.out.println("tieneInsumosSuficientes(30) -> boolean; " + imp.tieneInsumosSuficientes(30));
        imp.imprimir(30);
        System.out.println("imprimir(30) -> void; hojasDisponibles = " + imp.hojasDisponibles);
        System.out.println("paginasSobrantesModulo(8) -> int; " + imp.paginasSobrantesModulo(8));

        int lotes = imp.calcularLotesCompletos(8);
        System.out.println("calcularLotesCompletos(8) -> int; " + lotes);

        System.out.println("[estado final]");
        System.out.println("hojasDisponibles = " + imp.hojasDisponibles + " | impresionesHechas = " + imp.impresionesHechas);
    }
}