// CONTEXTO: programa que lleva el control del dinero y las tarjetas que guardo en mi cartera.
// QUE SABE Y POR QUE: dinero representa el efectivo disponible y tarjetas la cantidad de tarjetas;
//                     abierta indica si la cartera esta abierta y material identifica de que esta hecha.
// QUE SABE HACER Y POR QUE: agregarDinero(double) modifica el dinero disponible; puedePagar(double)
//                           retorna boolean para indicar si alcanza el dinero para una compra.
// QUE IGNORE: no modele el tamaño ni el diseño de la cartera porque no afectan el funcionamiento del programa.

public class Cartera {

    // ===== CONSTANTE (opcional, punto extra) =====
    static final int MAX_TARJETAS = 8;    // tipo: int · nombre: MAX_TARJETAS · valor fijo

    // ===== ATRIBUTOS =====
    String material = "cuero";            // tipo: String · nombre: material · valor inicial: "cuero"
    double dinero = 0.0;                  // tipo: double · nombre: dinero · valor inicial: 0.0
    int tarjetas = 0;                     // tipo: int · nombre: tarjetas · valor inicial: 0
    boolean abierta = false;              // tipo: boolean · nombre: abierta · valor inicial: false

    // ===== CONSTRUCTOR =====
    // firma: Cartera(double, String) · sin tipo de retorno
    Cartera(double dinero, String material) {
        this.dinero = dinero;             // this.dinero = ATRIBUTO · dinero = PARAMETRO
        this.material = material;         // this.material = ATRIBUTO · material = PARAMETRO
    }

    // ===== METODOS =====

    // firma: agregarDinero(double) · retorno: void · parametro: double monto
    void agregarDinero(double monto) {
        dinero = dinero + monto;          // operador +
    }

    // firma: retirarDinero(double) · retorno: void · parametro: double monto
    void retirarDinero(double monto) {
        if (monto <= dinero) {             // operador <=
            dinero = dinero - monto;       // operador -
        }
    }

    // firma: agregarTarjeta() · retorno: void · sin parametros
    void agregarTarjeta() {
        if (tarjetas < MAX_TARJETAS) {     // operador <
            tarjetas++;                    // operador ++
        }
    }

    // firma: puedePagar(double) · retorno: boolean · parametro: double precio
    boolean puedePagar(double precio) {
        return abierta && dinero >= precio; // operadores && y >=
    }

    public static void main(String[] args) {

        System.out.println("RADIOGRAFIA: Cartera");

        // Crear el objeto utilizando el constructor con parametros.
        Cartera c = new Cartera(500.0, "cuero");

        System.out.println("[estado inicial]");
        System.out.println("material = " + c.material);
        System.out.println("dinero = " + c.dinero);
        System.out.println("tarjetas = " + c.tarjetas);
        System.out.println("abierta = " + c.abierta);

        System.out.println("[invocando metodos]");

        c.abierta = true;
        System.out.println("La cartera fue abierta.");

        c.agregarDinero(100.0);
        System.out.println("agregarDinero(double) -> void; dinero = " + c.dinero);

        c.retirarDinero(50.0);
        System.out.println("retirarDinero(double) -> void; dinero = " + c.dinero);

        c.agregarTarjeta();
        System.out.println("agregarTarjeta() -> void; tarjetas = " + c.tarjetas);

        System.out.println("puedePagar(double) -> boolean; "
                + c.puedePagar(300.0));

        System.out.println("[estado final]");
        System.out.println("material = " + c.material);
        System.out.println("dinero = " + c.dinero);
        System.out.println("tarjetas = " + c.tarjetas);
        System.out.println("abierta = " + c.abierta);
    }
}