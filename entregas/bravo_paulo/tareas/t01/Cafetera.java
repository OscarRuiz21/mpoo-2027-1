// CONTEXTO: Sistema de domótica (smart home) para gestionar los electrodomésticos de la cocina.
// QUE SABE Y POR QUE: mlAgua (para saber si puede hacer café), tazasServidas (estadística de uso), tamanoTaza (S, M o L para ajustar dosis).
// QUE SABE HACER Y POR QUE: servir() es void porque solo altera el estado interno; litrosRestantes() retorna double para la app.
// QUE IGNORE: la temperatura del agua y el nivel de granos de café, para simplificar el modelo base.
public class Cafetera {

    // ===== CONSTANTE (punto extra) =====
    static final int ML_POR_TAZA = 250; // tipo: int · nombre en MAYUSCULAS · no cambia nunca

    // ===== ATRIBUTOS =====
    int mlAgua = 1000;       // tipo: int  · valor inicial: 1000
    int tazasServidas = 0;   // tipo: int  · valor inicial: 0
    char tamanoTaza = 'M';   // tipo: char · valor inicial: 'M' (Mediano)

    // ===== METODOS =====
    // firma: servir() · retorno: void · sin parametros
    void servir() {
        mlAgua = mlAgua - ML_POR_TAZA;     // operador -
        tazasServidas = tazasServidas + 1; // operador +
    }

    // firma: rellenar(int) · retorno: void · parametro: int extraMl
    void rellenar(int extraMl) {
        mlAgua = mlAgua + extraMl; // operador +
    }

    // firma: sobraParaOtra() · retorno: boolean · sin parametros
    boolean sobraParaOtra() {
        return (mlAgua % ML_POR_TAZA) == 0; // operadores % (módulo) y == (igualdad)
    }

    // firma: litrosRestantes() · retorno: double · sin parametros
    double litrosRestantes() {
        return mlAgua / 1000.0; // operador / (división con double para no perder decimales, evita la trampa de la división)
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Cafetera");
        Cafetera c = new Cafetera();

        System.out.println("\n[estado inicial]");
        System.out.println("mlAgua        = " + c.mlAgua);
        System.out.println("tazasServidas = " + c.tazasServidas);
        System.out.println("tamanoTaza    = " + c.tamanoTaza);

        System.out.println("\n[invocando metodos]");
        c.servir();
        System.out.println("servir() -> void");
        c.rellenar(150);
        System.out.println("rellenar(int) -> void");

        System.out.println("sobraParaOtra() -> boolean; resultado: " + c.sobraParaOtra());
        System.out.println("litrosRestantes() -> double; resultado: " + c.litrosRestantes());

        System.out.println("\n[estado final]");
        System.out.println("mlAgua        = " + c.mlAgua);
        System.out.println("tazasServidas = " + c.tazasServidas);
        System.out.println("tamanoTaza    = " + c.tamanoTaza);
    }
}