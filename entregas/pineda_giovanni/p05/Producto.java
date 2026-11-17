// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Producto.java
// ============================================================================

public class Producto {

    // --- ATRIBUTOS ---------------------------------------------------------
    static final int CAPACIDAD = 10;
    int precio;
    int piezas;
    String nombre;



    Producto(String nombre, int precio, int piezas) {
    this.nombre = nombre; 
    this.precio = precio; 

    if (piezas < 0){
        this.piezas = 0; 
    } else if (piezas > CAPACIDAD){
        this.piezas = CAPACIDAD;
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
        if (hayPiezas()){
            piezas--;
        }
    }

    String existencia() {
    if (this.piezas == 0){
        return "AGOTADO"; 
    } else if (this.piezas <= 2){
        return "ULTIMAS PIEZAS";
    } else {
       return "DISPONIBLE";
    }
    }
}
