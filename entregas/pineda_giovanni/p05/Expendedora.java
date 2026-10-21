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
        this.saldo = 0;
        this.ubicacion = ubicacion.isBlank() ? "SIN UBICACION" : ubicacion;
        
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
            case DIEZ:
                saldo = saldo + 10;
                break;
            case CINCO:
                saldo = saldo + 5;
                break;
            case DOS:
                saldo = saldo + 2;
                break;
            case UNO:
                saldo = saldo + 1;
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
            p.sacarUna();
            ventasTotales = ventasTotales + 1;
            
            int cambio = saldo - p.getPrecio();
            saldo = 0;
            
            return "ENTREGADO, CAMBIO $" + cambio;
        }
    }

    String estado() {
        boolean sinPiezas = !papas.hayPiezas() && !refresco.hayPiezas() && !chocolate.hayPiezas();
        
        return sinPiezas ? "VACIA" : "DISPONIBLE";
    }

    String etiqueta() {
        return ubicacion + " (" + estado() + ")";
    }

    int cancelar() {
        int devolver = saldo;
        saldo = 0;
        return devolver;
    }

    static int getVentasTotales() {
        return ventasTotales;
    }
}