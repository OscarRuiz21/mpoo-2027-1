// CONTEXTO: App de finanzas personales para rastrear el efectivo de bolsillo y tarjetas.
// QUE SABE Y POR QUE: saldoEfectivo (dinero disponible), tarjetasCount (cantidad de plasticos), tipoMoneda (letra identificadora 'M' de MXN o 'U' de USD).
// QUE SABE HACER Y POR QUE: pagar(double) es void porque descuenta efectivo; puedeComprar(double) regresa boolean evaluando si alcanza el dinero.
// QUE IGNORE: el numero de compartimentos internos y la textura del material.

public class Cartera {

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    double saldoEfectivo = 500.0; // tipo: double · nombre: saldoEfectivo · valor inicial: 500.0
    int tarjetasCount = 2;        // tipo: int · nombre: tarjetasCount · valor inicial: 2
    char tipoMoneda = 'M';        // tipo: char · nombre: tipoMoneda · valor inicial: 'M'

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // firma: pagar(double) · retorno: void · parametro: double monto
    public void pagar(double monto) {
        saldoEfectivo = saldoEfectivo - monto; // operador aritmetico -
    }

    // firma: puedeComprar(double) · retorno: boolean · parametro: double precio
    public boolean puedeComprar(double precio) {
        double precioConImpuesto = precio * 1.16; // operador aritmetico *
        return saldoEfectivo >= precioConImpuesto && tarjetasCount > 0; // operadores >= y &&
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Cartera");
        Cartera c = new Cartera();

        System.out.println("[estado inicial]");
        System.out.println("saldoEfectivo = " + c.saldoEfectivo);
        System.out.println("tarjetasCount = " + c.tarjetasCount);
        System.out.println("tipoMoneda = " + c.tipoMoneda);

        System.out.println("[invocando metodos]");
        System.out.println("puedeComprar(200.0) -> boolean; " + c.puedeComprar(200.0));
        c.pagar(232.0);
        System.out.println("pagar(232.0) -> void; saldoEfectivo = " + c.saldoEfectivo);

        System.out.println("[estado final]");
        System.out.println("saldoEfectivo = " + c.saldoEfectivo);
    }
}