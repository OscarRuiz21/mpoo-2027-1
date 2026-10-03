// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Producto.java
// ============================================================================
// ================================ PRODUCTO =================================
// Un producto dentro de la maquina: su nombre, su precio y cuantas piezas
// quedan. En cada producto caben como maximo 10 piezas.
public class Producto {

    // --- ATRIBUTOS ---------------------------------------------------------
    static final int CAPACIDAD = 10;
    String nombre;
    int precio;
    int piezas;

    // --- CONSTRUCTOR -------------------------------------------------------
    Producto(String nombre, int precio, int piezas) {
        this.nombre = nombre;
        this.precio = precio;
        if(piezas<0){
            this.piezas = 0;
        }else if(piezas>CAPACIDAD){
            this.piezas = CAPACIDAD;
        }else{
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
        if(piezas>0){
            return true;
        }else{
            return false;
        }
    }

    void sacarUna() {
        if(piezas>0){
            piezas --;
        }
    }

    String existencia() {
        if(piezas>=3){
            return "DISPONIBLE";
        }else if(piezas>0 && piezas<3){
            return "ULTIMAS PIEZAS";
        }else {
            return "AGOTADO";
        }
    }
}