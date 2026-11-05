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
    static int ventasTotales = 0;
    String ubicacion;
    int saldo;
    Producto papas;
    Producto refresco;
    Producto chocolate;


    // --- CONSTRUCTOR -------------------------------------------------------
    Expendedora(String ubicacion, int piezas) {
        this.ubicacion = ubicacion.isBlank() ? "SIN UBICACION" : ubicacion;
        this.saldo = 0;
        this.papas = new Producto("papas", 18, piezas);
        this.refresco = new Producto("refresco", 22, piezas);
        this.chocolate = new Producto("chocolate", 15, piezas);
    }

    // --- METODOS -----------------------------------------------------------

    // Regresa el Producto de ese codigo, o null si no existe.
    Producto buscar(String codigo) {
        if (codigo == null) {
            return null;
        }
        switch (codigo.trim().toUpperCase()) {
            case "A1":
                return papas;
            case "A2":
                return refresco;
            case "B1":
                return chocolate;
            default:
                return null;
        }
    }

    // Suma al saldo el valor de la moneda.
    void insertar(Moneda moneda) {
        switch (moneda) {
            case UNO:
                saldo += 1;
                break;
            case DOS:
                saldo += 2;
                break;
            case CINCO:
                saldo += 5;
                break;
            case DIEZ:
                saldo += 10;
                break;
        }
    }

    // Intenta vender. Revisa en ESTE orden y regresa el primer caso que aplique:
    String comprar(String codigo) {
        Producto p = buscar(codigo);
        if (p == null) {
            return "CODIGO INVALIDO";
        } else if (!p.hayPiezas()) {
            return "AGOTADO";
        } else if (saldo < p.getPrecio()) {
            int faltante = p.getPrecio() - saldo;
            return "FALTAN $" + faltante;
        } else {
            int cambio = saldo - p.getPrecio();
            p.sacarUna();
            ventasTotales++;
            saldo = 0;
            return "ENTREGADO, CAMBIO $" + cambio;
        }
    }

    // "VACIA" si NINGUNO de sus tres productos tiene piezas; si no, "DISPONIBLE".
    String estado() {
        return (!papas.hayPiezas() && !refresco.hayPiezas() && !chocolate.hayPiezas()) ? "VACIA" : "DISPONIBLE";
    }

    // La ubicacion y, entre parentesis, el estado:
    String etiqueta() {
        return ubicacion + " (" + estado() + ")";
    }

    // Devuelve el saldo que habia y lo deja en 0.
    int cancelar() {
        int temp = saldo;
        saldo = 0;
        return temp;
    }

    // Las ventas de TODAS las maquinas juntas (el atributo static).
    static int getVentasTotales() {
        return ventasTotales;
    }
}