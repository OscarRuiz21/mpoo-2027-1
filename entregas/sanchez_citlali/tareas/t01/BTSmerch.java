// CONTEXTO: App de inventario personal para mercancia de BTS ouo
// QUE SABE Y POR QUE: nombreItem (descripcion del producto), precioMxn (costo), nivelBateria (porcentaje de carga de la armybomb), LimitedEdition (saber si es merch rara)
// QUE SABE HACER Y POR QUE: usarLightstick(int) es void porque reduce la bateria; esBateriaPar() retorna boolean comprobando si la carga es divisible entre 2; requiereCambioBateria() retorna boolean si la bateria es muy baja
// QUE IGNORE: las dimensiones del paquete, color y peso porque no es revelante

public class BTSmerch {

    // ===== ATRIBUTOS (etiquetados) =====
    String nombreItem = "army bomb Ver. 4"; // tipo: String · nombre: nombreItem · valor inicial: "army bomb Ver. 4"
    double precioMxn = 1500.0;              // tipo: double · nombre: precioMxn · valor inicial: 1400.0
    int nivelBateria = 100;                 // tipo: int · nombre: nivelBateria · valor inicial: 100
    boolean LimitedEdition = true;       // tipo: boolean · nombre: esEdicionLimitada · valor inicial: true

    // ===== METODOS (etiquetados) =====
    // firma: usarLightstick(int) · retorno: void · parametro: int horasUso
    void usarLightstick(int horasUso) {
        nivelBateria -= (horasUso * 15); // operadores -= y *
    }

    // firma: esBateriaPar() · retorno: boolean · sin parametros
    boolean esBateriaPar() {
        return nivelBateria % 2 == 0; // operadores % y ==
    }

    // firma: requiereCambioBateria() · retorno: boolean · sin parametros
    boolean requiereCambioBateria() {
        return nivelBateria < 15; // operador relacional <
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: BTSmerch");
        BTSmerch item = new BTSmerch();

        // 1: imprime estado inicial
        System.out.println("[estado inicial]");
        System.out.println("nombreItem = " + item.nombreItem);
        System.out.println("precioMxn = $" + item.precioMxn);
        System.out.println("nivelBateria = " + item.nivelBateria + "%");
        System.out.println("LimitedEdition = " + item.LimitedEdition);

        // 2: firma + invocacion + resultado
        System.out.println("\n[invocando metodos]");
        item.usarLightstick(5);
        System.out.println("usarLightstick(int) -> void; nivelBateria = " + item.nivelBateria + "%");
        System.out.println("esBateriaPar() -> boolean; " + item.esBateriaPar());
        System.out.println("requiereCambioBateria() -> boolean; " + item.requiereCambioBateria());

        // 3: imprime estado final
        System.out.println("\n[estado final]");
        System.out.println("nivelBateria final = " + item.nivelBateria + "%");
    }
}