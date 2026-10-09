
public class Producto {

    static final int CAPACIDAD = 10;

    String nombre;
    int precio;
    int piezas;

    Producto(String nombre, int precio, int piezas) {
        this.nombre = nombre;
        this.precio = precio;

        if (piezas < 0) {
            this.piezas = 0;
        } else if (piezas > CAPACIDAD) {
            this.piezas = CAPACIDAD;
        } else {
            this.piezas = piezas;
        }
    }

    int getPrecio() {
        return precio;
    }

    int getPiezas() {
        return piezas;
    }

    boolean hayPiezas() {
        return piezas > 0;
    }

    void sacarUna() {
        if (piezas > 0) {
            piezas--;
        }
    }

    String existencia() {
        if (piezas == 0) {
            return "AGOTADO";
        } else if (piezas <= 2) {
            return "ULTIMAS PIEZAS";
        } else {
            return "DISPONIBLE";
        }
    }
}
