// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Producto.java
// ============================================================================
// PASO 1 de 2. Completa donde dice TODO y corre P5Seleccion.java:
// las pruebas 1 a 6 son de esta clase.
//
// Cada TODO trae un EJEMPLO de como se usa y que debe salir.
// ============================================================================

// ================================ PRODUCTO =================================
// Un producto dentro de la maquina: su nombre, su precio y cuantas piezas
// quedan. En cada producto caben como maximo 10 piezas.

public class Producto {

    // --- ATRIBUTOS ---------------------------------------------------------
    // TODO: una constante static final con la capacidad: 10 piezas.
    // TODO: los atributos de cada producto: nombre, precio y piezas.

    static final int CAPACIDAD = 10;

    String nombre;
    int precio;
    int piezas;


    // --- CONSTRUCTOR -------------------------------------------------------
    // Guarda nombre y precio (this.atributo = parametro). Valida las piezas:
    // menor que 0: se guarda 0
    // mayor que la capacidad: se guarda la capacidad
    // si no: tal cual.

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


    // --- METODOS -----------------------------------------------------------

    // Regresa el precio.
    int getPrecio() {

        return precio;
    }


    // Regresa las piezas.
    int getPiezas() {

        return piezas;
    }


    // true si queda al menos una pieza.
    boolean hayPiezas() {

        return piezas > 0;
    }


    // Quita una pieza, pero solo si hay.
    void sacarUna() {

        if (piezas > 0) {
            piezas--;
        }
    }


    // Describe cuanto queda:
    // 0 piezas       -> "AGOTADO"
    // 1 o 2 piezas   -> "ULTIMAS PIEZAS"
    // 3 o mas        -> "DISPONIBLE"

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