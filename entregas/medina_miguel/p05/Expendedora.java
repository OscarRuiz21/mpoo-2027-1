// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Expendedora.java
// ============================================================================

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
        
        // Se corrige el constructor para pasar el nombre, precio y piezas
        this.papas = new Producto("papas", 18, piezas);
        this.refresco = new Producto("refresco", 22, piezas);
        this.chocolate = new Producto("chocolate", 15, piezas);
    }

    // --- METODOS -----------------------------------------------------------

    Producto buscar(String codigo) {
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

    String comprar(String codigo) {
        Producto p = buscar(codigo);

        if (p == null) {
            return "CODIGO INVALIDO";
        } else if (!p.hayPiezas()) { 
            return "AGOTADO";
        } else if (saldo < p.getPrecio()) {
            return "FALTAN $" + (p.getPrecio() - saldo);
        } else {
            p.sacarUna(); // Se corrige al nombre del método definido en Producto.java
            ventasTotales++;
            int cambio = saldo - p.getPrecio();
            saldo = 0;
            return "ENTREGADO, CAMBIO $" + cambio;
        }
    }

    String estado() {
        return (!papas.hayPiezas() && !refresco.hayPiezas() && !chocolate.hayPiezas()) ? "VACIA" : "DISPONIBLE";
    }

    String etiqueta() {
        return ubicacion + " (" + estado() + ")";
    }

    int cancelar() {
        int saldoDevuelto = saldo;
        saldo = 0;
        return saldoDevuelto;
    }

    static int getVentasTotales() {
        return ventasTotales;
    }
}