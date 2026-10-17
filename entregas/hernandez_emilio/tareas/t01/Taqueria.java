// CONTEXTO: Sistema de punto de venta (POS) para administracion de pedidos en una taqueria local.
// QUE SABE Y POR QUE: nombreLocal (String, nombre del establecimiento), tacosVendidos (int, contador acumulado de tacos servidos), precioTaco (double, costo unitario por taco), tipoSalsa (char, 'R' roja, 'V' verde, 'M' macho), totalRecaudado (double, caja general).
// QUE SABE HACER Y POR QUE: registrarPedido(int) es void porque actualiza el inventario/caja; tacosPorOrden(int, int) retorna int (division entera); tacosSobrantes(int, int) retorna int con modulo (%).
// QUE IGNORE: El tipo de carne exacto (suadero, pastor, tripa) o si la tortilla es de harina o maiz, ya que el precio base y la contabilidad son uniformes.
public class Taqueria {

    //  ATRIBUTOS :DD
    String nombreLocal = "Los Tacuaches"; // tipo: String · identificador del negocio
    int tacosVendidos = 0;              // tipo: int    · valor inicial: 0
    double precioTaco = 22.50;          // tipo: double · valor inicial: 22.50 pesos
    char tipoSalsa = 'R';               // tipo: char   · 'R' para Roja, 'V' para Verde
    double totalRecaudado = 0.0;        // tipo: double · valor acumulado en caja

    //  METODOS :DDD
    // firma: registrarPedido(int) · retorno: void · parametro: int cantidad
    public void registrarPedido(int cantidad) {
        this.tacosVendidos += cantidad; // operador += (abreviado)
        double subtotal = cantidad * this.precioTaco; // operador * (aritmetico)
        this.totalRecaudado = this.totalRecaudado + subtotal;
    }

    // firma: tacosPorOrden(int, int) · retorno: int · parametros: int totalTacos, int personas
    public int tacosPorOrden(int totalTacos, int personas) {
        return totalTacos / personas;   // operador / (division ENTERA)
    }

    // firma: tacosSobrantes(int, int) · retorno: int · parametros: int totalTacos, int personas
    public int tacosSobrantes(int totalTacos, int personas) {
        return totalTacos % personas;   // operador % (modulo / residuo)
    }

    // firma: esCajaSuficiente(double) · retorno: boolean · parametro: double meta
    public boolean esCajaSuficiente(double meta) {
        return this.totalRecaudado >= meta; // operador >= (relacional)
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Taqueria");

        Taqueria t = new Taqueria();

        System.out.println("[estado inicial]");
        System.out.println("nombreLocal    = " + t.nombreLocal);
        System.out.println("tacosVendidos  = " + t.tacosVendidos);
        System.out.println("precioTaco     = " + t.precioTaco);
        System.out.println("tipoSalsa      = " + t.tipoSalsa);
        System.out.println("totalRecaudado = " + t.totalRecaudado);

        System.out.println("[invocando metodos]");
        t.registrarPedido(10);
        System.out.println("registrarPedido(10) -> void; totalRecaudado = " + t.totalRecaudado);

        int porPersona = t.tacosPorOrden(10, 3); // 10 / 3 = 3
        System.out.println("tacosPorOrden(10, 3) -> int (div entera); tacos = " + porPersona);

        int sobrantes = t.tacosSobrantes(10, 3); // 10 % 3 = 1
        System.out.println("tacosSobrantes(10, 3) -> int (modulo %); sobrantes = " + sobrantes);

        System.out.println("esCajaSuficiente(200.0) -> boolean; " + t.esCajaSuficiente(200.0));

        // CASTING EXPLICITO
        double pagoTotal = t.totalRecaudado;
        int pagoEntero = (int) pagoTotal; // casting explicito de double a int
        System.out.println("casting explicito: (int) " + pagoTotal + " = " + pagoEntero);

        System.out.println("[estado final]");
        System.out.println("tacosVendidos = " + t.tacosVendidos + " | totalRecaudado = " + t.totalRecaudado);
    }
}