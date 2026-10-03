// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Producto.java
// ============================================================================
//HERNANDEZ CRISOSTOMO EMILIO
public class Producto {

    // --- ATRIBUTOS ---------------------------------------------------------
    static final int CAPACIDAD_MAXIMA = 10;
    
    String nombre;
    int precio;
    int piezas;

    // --- CONSTRUCTOR -------------------------------------------------------
    Producto(String nombre, int precio, int piezas) {
        this.nombre = nombre;
        this.precio = precio;

        if (piezas < 0) {
            this.piezas = 0;
        } else if (piezas > CAPACIDAD_MAXIMA) {
            this.piezas = CAPACIDAD_MAXIMA;
        } else {
            this.piezas = piezas;
        }
    }

    // --- METODOS -----------------------------------------------------------

    int getPrecio() {
        return this.precio;
    }

    int getPiezas() {
        return this.piezas;
    }

    boolean hayPiezas() {
        return this.piezas > 0;
    }

    void sacarUna() {
        if (this.piezas > 0) {
            this.piezas--;
        }
    }

    String existencia() {
        if (this.piezas == 0) {
            return "AGOTADO";
        } else if (this.piezas <= 2) {
            return "ULTIMAS PIEZAS";
        } else {
            return "DISPONIBLE";
        }
    }
}