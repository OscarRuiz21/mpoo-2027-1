// CONTEXTO: Sistema de control para una cafetera inteligente que mide el llenado de tazas.
// QUE SABE Y POR QUE: mlContenido (volumen actual de liquido), tazasServidas (contador de usos), caliente (saber si la bebida conserva temperatura).
// QUE SABE HACER Y POR QUE: servirLiquido(double) es void porque incrementa el volumen; sorbosEstimados() regresa int usando casting para calcular tragos.
// QUE IGNORE: el diseño del asa y la marca de la taza.

public class Taza {

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    double mlContenido = 0.0; // tipo: double · nombre: mlContenido · valor inicial: 0.0
    int tazasServidas = 0;    // tipo: int · nombre: tazasServidas · valor inicial: 0
    boolean caliente = true;  // tipo: boolean · nombre: caliente · valor inicial: true

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // firma: servirLiquido(double) · retorno: void · parametro: double ml
    public void servirLiquido(double ml) {
        mlContenido = mlContenido + ml; // operador aritmetico +
        tazasServidas++;                // operador contador ++
    }

    // firma: sorbosEstimados() · retorno: int · sin parametros
    public int sorbosEstimados() {
        double calculo = mlContenido / 15.0; // operador / (division double)
        return (int) calculo;                // CASTING EXPLICITO (int)
    }

    // firma: esCapacidadExacta() · retorno: boolean · sin parametros
    public boolean esCapacidadExacta() {
        return ((int) mlContenido % 100 == 0); // operadores % y ==
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Taza");
        Taza t = new Taza();

        System.out.println("[estado inicial]");
        System.out.println("mlContenido = " + t.mlContenido);
        System.out.println("tazasServidas = " + t.tazasServidas);

        System.out.println("[invocando metodos]");
        t.servirLiquido(250.0);
        System.out.println("servirLiquido(250.0) -> void; mlContenido = " + t.mlContenido);
        System.out.println("sorbosEstimados() -> int; " + t.sorbosEstimados());
        System.out.println("esCapacidadExacta() -> boolean; " + t.esCapacidadExacta());

        System.out.println("[estado final]");
        System.out.println("mlContenido = " + t.mlContenido + " | sorbos = " + t.sorbosEstimados());
    }
}