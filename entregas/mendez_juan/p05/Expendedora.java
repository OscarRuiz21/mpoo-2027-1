// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Expendedora.java
// ============================================================================
// PASO 2 de 2. Completa donde dice TODO y corre P5Seleccion.java:
// las pruebas 7 a 18 son de esta clase. Usa a Producto, asi que va despues.
//
// Cada TODO trae un EJEMPLO de como se usa y que debe salir.
// ============================================================================

// =============================== EXPENDEDORA ===============================
// La maquina de la Facultad tiene tres productos:
//
//      codigo   producto     precio
//      A1       papas        $18
//      A2       refresco     $22
//      B1       chocolate    $15
//
// Recibe monedas, guarda el saldo y, al comprar, entrega el producto y el
// cambio.
//
// ASI LA USA EL MAIN (una compra de principio a fin):
//     Expendedora m = new Expendedora("Edificio Q", 15);   // 10 piezas de cada uno
//     m.insertar(Moneda.DIEZ);                              // saldo 10
//     m.insertar(Moneda.CINCO);                             // saldo 15
//     m.comprar("A1")   -> "FALTAN $3"                      // papas cuestan 18
//     m.insertar(Moneda.DOS);                               // saldo 17
//     m.insertar(Moneda.UNO);                               // saldo 18
//     m.comprar("A1")   -> "ENTREGADO, CAMBIO $0"           // saldo 0, papas: 9
// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Expendedora.java
// ============================================================================

public class Expendedora {

    // --- ATRIBUTOS ---------------------------------------------------------
    static int ventasTotales = 0; // Acumula las ventas de TODAS las máquinas

    String ubicacion;
    int saldo;
    Producto papas;
    Producto refresco;
    Producto chocolate;

    // --- CONSTRUCTOR -------------------------------------------------------
    Expendedora(String ubicacion, int piezas) {
        this.ubicacion = (ubicacion == null || ubicacion.isBlank()) ? "SIN UBICACION" : ubicacion;
        this.saldo = 0;
        
        // Creación de los tres productos con los precios correspondientes:
        // A1 -> papas ($18), A2 -> refresco ($22), B1 -> chocolate ($15)
        this.papas = new Producto("papas", 18, piezas);
        this.refresco = new Producto("refresco", 22, piezas);
        this.chocolate = new Producto("chocolate", 15, piezas);
    }

    // --- METODOS -----------------------------------------------------------

    // Regresa el Producto de ese código, o null si no existe.
    Producto buscar(String codigo) {
        if (codigo == null) {
            return null;
        }
        
        Producto resultado;
        switch (codigo.trim().toUpperCase()) {
            case "A1":
                resultado = papas;
                break;
            case "A2":
                resultado = refresco;
                break;
            case "B1":
                resultado = chocolate;
                break;
            default:
                resultado = null;
                break;
        }
        return resultado;
    }

    // Suma al saldo el valor de la moneda usando switch sobre el enum Moneda
    void insertar(Moneda moneda) {
        if (moneda == null) {
            return;
        }

        switch (moneda) {
            case UNO:
                this.saldo += 1;
                break;
            case DOS:
                this.saldo += 2;
                break;
            case CINCO:
                this.saldo += 5;
                break;
            case DIEZ:
                this.saldo += 10;
                break;
        }
    }

    // Intenta vender revisando estrictamente en el orden solicitado
    String comprar(String codigo) {
        Producto p = buscar(codigo);

        // 1. Código que no existe
        if (p == null) {
            return "CODIGO INVALIDO";
        }
        // 2. No quedan piezas
        else if (!p.hayPiezas()) {
            return "AGOTADO";
        }
        // 3. El saldo no alcanza
        else if (this.saldo < p.getPrecio()) {
            int falta = p.getPrecio() - this.saldo;
            return "FALTAN $" + falta;
        }
        // 4. Compra exitosa
        else {
            p.sacarUna(); // Corregido: en la clase Producto el método es sacarUna()
            int cambio = this.saldo - p.getPrecio();
            this.saldo = 0;
            ventasTotales++;
            return "ENTREGADO, CAMBIO $" + cambio;
        }
    }

    // "VACIA" si NINGUNO de sus tres productos tiene piezas; si no, "DISPONIBLE"
    String estado() {
        boolean sinPiezas = !papas.hayPiezas() && !refresco.hayPiezas() && !chocolate.hayPiezas();
        return sinPiezas ? "VACIA" : "DISPONIBLE";
    }

    // Ubicación y estado entre paréntesis
    String etiqueta() {
        return this.ubicacion + " (" + estado() + ")";
    }

    // Devuelve el saldo acumulado y lo restablece a 0
    int cancelar() {
        int saldoDevuelto = this.saldo;
        this.saldo = 0;
        return saldoDevuelto;
    }

    // Ventas acumuladas de todas las máquinas
    static int getVentasTotales() {
        return ventasTotales;
    }
}