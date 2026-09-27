// CONTEXTO: Sistema para cobrar en una pizzeria
// QUE SABE Y POR QUE: rebanadas para ver cuanto queda, precio para saber cuanto cuesta y tamanio ('C', 'M', 'G') para el pedido 
// QUE SABE HACER Y POR QUE: comer es void porque solo resta rebanadas, calcularTotal regresa double para dar la cuenta con propina
// QUE IGNORE: la marca de la caja ni si trae servilletas porque no cambia la cuenta 
public class Pizza {

    // ===== CONSTANTE STATIC FINAL =====
    static final double IVA = 0.16; // constante static final

    // ===== ATRIBUTOS =====
    int rebanadas = 8;          // tipo: int     nombre: rebanadas  inicial: 8
    double precio = 150.0;      // tipo: double  nombre: precio     inicial: 180.0
    char tamanio = 'G';         // tipo: char    nombre: tamanio    inicial: 'G'

    // ===== METODOS =====
    // firma: comer(int) · retorno: void · parametro: int n
    void comer(int n) {
        rebanadas = rebanadas - n; // operador -
    }

    // firma: calcularTotal(double) · retorno: double · parametro: double propina
    double calcularTotal(double propina) {
        double subtotal = precio + propina; // operador +
        return subtotal * (1.0 + IVA);      // operadores * y +
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Pizza");

        Pizza p = new Pizza();

        System.out.println("[estado inicial]");
        System.out.println("rebanadas = " + p.rebanadas);
        System.out.println("precio    = " + p.precio);
        System.out.println("tamanio   = " + p.tamanio);

        System.out.println("[invocando metodos]");
        p.comer(3);
        System.out.println("comer(int) -> void; rebanadas = " + p.rebanadas);
        double total = p.calcularTotal(20.0);
        System.out.println("calcularTotal(double) -> double; total = " + total);

        System.out.println("[estado final]");
        System.out.println("rebanadas = " + p.rebanadas + " | precio = " + p.precio);
    }
}