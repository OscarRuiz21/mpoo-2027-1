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
public class Expendedora {

    // --- ATRIBUTOS ---------------------------------------------------------
    static int ventasTotales = 0; //[cite: 10]
    String ubicacion;             //[cite: 10]
    int saldo;                    //[cite: 10]
    Producto papas;               //[cite: 10]
    Producto refresco;            //[cite: 10]
    Producto chocolate;           //[cite: 10]

    // --- CONSTRUCTOR -------------------------------------------------------
    Expendedora(String ubicacion, int piezas) {
        this.ubicacion = ubicacion.isBlank() ? "SIN UBICACION" : ubicacion; //[cite: 1, 10]
        this.saldo = 0;
        this.papas = new Producto("papas", 18, piezas);         //[cite: 1, 9, 10]
        this.refresco = new Producto("refresco", 22, piezas);   //[cite: 1, 9, 10]
        this.chocolate = new Producto("chocolate", 15, piezas); //[cite: 1, 9, 10]
    }

    // --- METODOS -----------------------------------------------------------
    Producto buscar(String codigo) {
        String limpio = codigo.trim().toUpperCase(); //[cite: 1, 10]
        switch (limpio) {
            case "A1":
                return this.papas;
            case "A2":
                return this.refresco;
            case "B1":
                return this.chocolate;
            default:
                return null;
        }
    }

    void insertar(Moneda moneda) {
        switch (moneda) { //[cite: 1, 10]
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

    String comprar(String codigo) {
        Producto p = buscar(codigo); //[cite: 1, 10]
        if (p == null) {
            return "CODIGO INVALIDO";
        }
        if (!p.hayPiezas()) {
            return "AGOTADO";
        }
        if (this.saldo < p.getPrecio()) {
            return "FALTAN $" + (p.getPrecio() - this.saldo);
        }
        
        // Si todo está bien:
        int cambio = this.saldo - p.getPrecio();
        p.sacarUna();
        ventasTotales++;
        this.saldo = 0;
        return "ENTREGADO, CAMBIO $" + cambio;
    }

    String estado() {
        boolean hayAlguno = this.papas.hayPiezas() || this.refresco.hayPiezas() || this.chocolate.hayPiezas();
        return hayAlguno ? "DISPONIBLE" : "VACIA"; //[cite: 1, 10]
    }

    String etiqueta() {
        return this.ubicacion + " (" + estado() + ")"; //[cite: 1, 10]
    }

    int cancelar() {
        int devolucion = this.saldo; //[cite: 1, 10]
        this.saldo = 0;
        return devolucion;
    }

    static int getVentasTotales() {
        return ventasTotales; //[cite: 1, 10]
    }
}