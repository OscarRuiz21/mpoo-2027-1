// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Producto.java
// ============================================================================
public class Producto {

    // --- ATRIBUTOS ---------------------------------------------------------
    // static final define una constante global para la clase
    // es en mayusculas y su valor 10 es la capacidad maxima de piezas.
    static final int CAPACIDAD = 10;[cite: 10]

    // cada objeto Producto tendrá su propio nombre, precio y cantidad de piezas
    String nombre;[cite: 10]
    int precio;   [cite: 10]
    int piezas;   [cite: 10]

    // --- CONSTRUCTOR -------------------------------------------------------
    // El constructor se llama igual que la clase y sirve para inicializar el objeto cuando hacemos un 'new'
    Producto(String nombre, int precio, int piezas) {
        this.nombre = nombre; // 'this.nombre' se refiere al atributo de la clase y 'nombre' al parámetro que le pasamos
        this.precio = precio; 


        if (piezas < 0) {
            this.piezas = 0; // si le mandan un número negativo (como -4), se corrige y se guarda como 0
        } else if (piezas > CAPACIDAD) {
            this.piezas = CAPACIDAD; // se limita a 10
        } else {
            this.piezas = piezas; // si esta entre 0 y 10 esta ok
        }
    }

    // --- METODOS -----------------------------------------------------------

    // regresa el valor del precio guardado en el producto
    int getPrecio() {
        return this.precio;
    }

    // regresa cuantas piezas quedan disponibles
    int getPiezas() {
        return this.piezas;
    }

    // regresa true si queda al menos una pieza (mayor a 0) o false si ya se acabaron
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
            return "ULTIMAS PIEZAS"; // Si quedan 1 o 2
        } else {
            return "DISPONIBLE";     // Si quedan 3 o más
        }
    }
}