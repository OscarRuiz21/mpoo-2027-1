
public class Expendedora {

    static int ventasTotales = 0;

    String ubicacion;
    int saldo;
    Producto papas;
    Producto refresco;
    Producto chocolate;

    Expendedora(String ubicacion, int piezas) {
        this.ubicacion = ubicacion.isBlank()
                ? "SIN UBICACION" : ubicacion;
        this.saldo = 0;

        this.papas = new Producto("papas", 18, piezas);
        this.refresco = new Producto("refresco", 22, piezas);
        this.chocolate = new Producto("chocolate", 15, piezas);
    }

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
            int cambio = saldo - p.getPrecio();

            p.sacarUna();
            ventasTotales++;
            saldo = 0;

            return "ENTREGADO, CAMBIO $" + cambio;
        }
    }

    String estado() {
        return (!papas.hayPiezas()
                && !refresco.hayPiezas()
                && !chocolate.hayPiezas())
                ? "VACIA" : "DISPONIBLE";
    }

    String etiqueta() {
        return ubicacion + " (" + estado() + ")";
    }

    int cancelar() {
        int devolucion = saldo;
        saldo = 0;
        return devolucion;
    }

    static int getVentasTotales() {
        return ventasTotales;
    }
}
