// CONTEXTO: App para dividir la cuenta y las porciones cuando pido pizza a domicilio con amigos.
// QUE SABE Y POR QUE: rebanadas (para saber cuánto queda), precioTotal (para dividir el costo),
//                     tamano (una letra 'M' o 'G' para el ticket).
// QUE SABE HACER Y POR QUE: comer(int) es void porque solo reduce el inventario;
//                           sePuedeRepartir(int) retorna boolean para saber si nos tocan partes iguales a todos;
//                           precioPorRebanada() retorna double para cobrarle a cada quien lo justo.
// QUE IGNORE: Los ingredientes específicos y la temperatura, porque no afectan la división matemática.
public class CajaDePizza {

    // ===== ATRIBUTOS =====
    int rebanadas = 8;           // tipo: int    · valor inicial: 8
    double precioTotal = 0.0;    // tipo: double · valor inicial: 0.0
    char tamano = 'G';           // tipo: char   · valor inicial: 'G'

    // ===== CONSTRUCTOR =====
    // firma: CajaDePizza(char, double) · mismo nombre de la clase · SIN tipo de retorno
    CajaDePizza(char tamano, double precioTotal) {
        this.tamano = tamano;
        this.precioTotal = precioTotal;
    }

    // ===== METODOS =====
    // firma: comer(int) · retorno: void · parametro: int num
    void comer(int num) {
        rebanadas -= num;                    // operador abreviado -=
    }

    // firma: sePuedeRepartir(int) · retorno: boolean · parametro: int personas
    boolean sePuedeRepartir(int personas) {
        return (rebanadas % personas) == 0;  // operadores % (módulo) y ==
    }

    // firma: precioPorRebanada() · retorno: double · sin parametros
    double precioPorRebanada() {
        return precioTotal / 8.0;            // operador / con double (esquiva la trampa de la división)
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: CajaDePizza");
        CajaDePizza pizza = new CajaDePizza('G', 299.50); // Nace con el constructor

        System.out.println("[estado inicial]");
        System.out.println("rebanadas   = " + pizza.rebanadas);
        System.out.println("tamano      = " + pizza.tamano);
        System.out.println("precioTotal = " + pizza.precioTotal);

        System.out.println("\n[invocando metodos]");
        pizza.comer(2);
        System.out.println("comer(int) -> void; rebanadas = " + pizza.rebanadas);
        System.out.println("sePuedeRepartir(int) -> boolean; " + pizza.sePuedeRepartir(3));
        System.out.println("precioPorRebanada() -> double; " + pizza.precioPorRebanada());
    }
}