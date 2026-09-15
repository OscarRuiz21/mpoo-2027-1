// CONTEXTO: Sistema de cobro rapido en una taqueria de la ciudad.
// QUE SABE Y POR QUE: tacosPedidos (int para inventario), precioTaco (double para la cuenta), tipoSalsa (char 'R' o 'V').
// QUE SABE HACER Y POR QUE: pedir (void, calcula consumo), calcularCambio (retorna int aplicando casting explicito).
// QUE IGNORE: numero de mesa y nombre del mesero, el cobro solo requiere cantidad y precio.
public class Taqueria {
    // ATRIBUTOS
    int tacosPedidos = 0;
    double precioTaco = 22.50;
    char tipoSalsa = 'R';

    // METODO 1
    void pedir(int n) {
        tacosPedidos += n;
    }

    // METODO 2 
    int calcularCambio(double pagoCliente) {
        double total = tacosPedidos * precioTaco; 
        double cambioDecimal = pagoCliente - total; 
        return (int) cambioDecimal; 
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Taqueria");
        System.out.println("[Estado inicial]");
        Taqueria t = new Taqueria();
        System.out.println("Tacos pedidos: " + t.tacosPedidos + " | Salsa: " + t.tipoSalsa);

        System.out.println("[Invocando metodos]");
        t.pedir(4);
        int cambioSencillo = t.calcularCambio(100.0);
        System.out.println("Cambio redondeado a enteros: $" + cambioSencillo);

        System.out.println("[Estado final]");
        System.out.println("Total tacos consumidos: " + t.tacosPedidos);
    }
}