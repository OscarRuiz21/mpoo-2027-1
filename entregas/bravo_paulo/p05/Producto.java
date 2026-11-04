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
    static final int CAPACIDAD = 10;
    String nombre;
    int precio;
    int piezas;


    // --- CONSTRUCTOR -------------------------------------------------------
    // Guarda nombre y precio (this.atributo = parametro). Valida las piezas:
    //   menor que 0: se guarda 0 · mayor que la capacidad: se guarda la
    //   capacidad · si no: tal cual.                     (if / else if / else)
    //
    // QUE DEBE PASAR:
    //     new Producto("papas", 18, 15)   -> guarda 10 piezas
    //     new Producto("chicles", 5, -4)  -> guarda 0 piezas
    //     new Producto("gomitas", 8, 2)   -> guarda 2 piezas
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

    // Regresa el precio.         papas -> 18
    int getPrecio() {
        return this.precio;
    }

    // Regresa las piezas.        papas creadas con 15 -> 10
    int getPiezas() {
        return this.piezas;
    }

    // true si queda al menos una pieza.
    //     con 3 piezas -> true        con 0 piezas -> false
    boolean hayPiezas() {
        return this.piezas > 0;
    }

    // Quita una pieza, pero solo si hay: nunca baja de 0.            (if)
    //     gomitas con 2:  sacarUna() -> 1,  sacarUna() -> 0,  sacarUna() -> 0
    void sacarUna() {
        if (this.piezas > 0) {
            this.piezas--;
        }
    }

    // Describe cuanto queda:                              (if / else if / else)
    //     0 piezas       -> "AGOTADO"
    //     1 o 2 piezas   -> "ULTIMAS PIEZAS"
    //     3 o mas        -> "DISPONIBLE"
    String existencia() {
        if (this.piezas == 0) {
            return "AGOTADO";
        } else if (this.piezas == 1 || this.piezas == 2) {
            return "ULTIMAS PIEZAS";
        } else {
            return "DISPONIBLE";
        }
    }
}