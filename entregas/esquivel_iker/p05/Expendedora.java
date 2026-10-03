// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Expendedora.java
// ============================================================================
//Hernandez Crisostomo Emilio
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

    Producto buscar(String codigo) {
        if (codigo == null) {
            return null;
        }

        Producto p;
        switch (codigo.trim().toUpperCase()) {
            case "A1":
                p = this.papas;
                break;
            case "A2":
                p = this.refresco;
                break;
            case "B1":
                p = this.chocolate;
                break;
            default:
                p = null;
                break;
        }
        return p;
    }

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

    String comprar(String codigo) {
        Producto p = buscar(codigo);

        if (p == null) {
            return "CODIGO INVALIDO";
        } else if (!p.hayPiezas()) {
            return "AGOTADO";
        } else if (this.saldo < p.getPrecio()) {
            int falta = p.getPrecio() - this.saldo;
            return "FALTAN $" + falta;
        } else {
            p.sacarUna();
            ventasTotales++;

            int cambio = this.saldo - p.getPrecio();
            this.saldo = 0;

            return "ENTREGADO, CAMBIO $" + cambio;
        }
    }

    String estado() {
        boolean vacia = !this.papas.hayPiezas() && !this.refresco.hayPiezas() && !this.chocolate.hayPiezas();
        return vacia ? "VACIA" : "DISPONIBLE";
    }

    String etiqueta() {
        return this.ubicacion + " (" + estado() + ")";
    }

    int cancelar() {
        int devuelto = this.saldo;
        this.saldo = 0;
        return devuelto;
    }

    static int getVentasTotales() {
        return ventasTotales;
    }
}