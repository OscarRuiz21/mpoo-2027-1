// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Producto.java
// ============================================================================
// PASO 1 de 2. Completa donde dice TODO y corre P5Seleccion.java:
// las pruebas 1 a 6 son de esta clase.
//
// Cada TODO trae un EJEMPLO de como se usa y que debe salir. Los ejemplos
// de sintaxis usan otra clase (Alumno) para que veas la forma sin la respuesta.
// ============================================================================

// ================================ PRODUCTO =================================
// Un producto dentro de la maquina: su nombre, su precio y cuantas piezas
// quedan. En cada producto caben como maximo 10 piezas.
//
// ASI LO USA EL MAIN:
//     Producto p = new Producto("papas", 18, 15);
//     p.getPiezas()     -> 10    (pidio 15, pero solo caben 10)
//     p.existencia()    -> "DISPONIBLE"
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
        
        // Validación de los límites de piezas con if / else if / else
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
        return precio;
    }

    int getPiezas() {
        return piezas;
    }

    boolean hayPiezas() {
        // Retorna el resultado lógico directamente
        return piezas > 0; 
    }

    void sacarUna() {
        // Solo resta si todavía queda inventario
        if (piezas > 0) {
            piezas--;
        }
    }

    String existencia() {
        // Escalera lógica para determinar el estado del producto
        if (piezas == 0) {
            return "AGOTADO";
        } else if (piezas <= 2) {
            return "ULTIMAS PIEZAS";
        } else {
            return "DISPONIBLE";
        }
    }
}