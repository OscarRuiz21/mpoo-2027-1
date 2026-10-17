// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Expendedora.java
// ============================================================================
// PASO 2 de 2. Completa donde dice TODO y corre P5Seleccion.java:
// las pruebas 7 a 18 son de esta clase. Usa a Producto, asi que va despues.
//
// Cada TODO trae un EJEMPLO de como se usa y que debe salir.
// ============================================================================

// =============================== EXPENDEDORA ===============================
// La maquina de la Facultad tiene tres productos:
//
//      codigo   producto     precio
//      A1       papas        $18
//      A2       refresco     $22
//      B1       chocolate    $15
//
// Recibe monedas, guarda el saldo y, al comprar, entrega el producto y el
// cambio.
//
// ASI LA USA EL MAIN (una compra de principio a fin):
//     Expendedora m = new Expendedora("Edificio Q", 15);   // 10 piezas de cada uno
//     m.insertar(Moneda.DIEZ);                              // saldo 10
//     m.insertar(Moneda.CINCO);                             // saldo 15
//     m.comprar("A1")   -> "FALTAN $3"                      // papas cuestan 18
//     m.insertar(Moneda.DOS);                               // saldo 17
//     m.insertar(Moneda.UNO);                               // saldo 18
//     m.comprar("A1")   -> "ENTREGADO, CAMBIO $0"           // saldo 0, papas: 9
public class Expendedora {

    // --- ATRIBUTOS ---------------------------------------------------------
    static int ventasTotales = 0;
    
    String ubicacion;
    int saldo;
    Producto papas;
    Producto refresco;
    Producto chocolate;


    // --- CONSTRUCTOR -------------------------------------------------------
    // Nace con saldo 0 y crea sus tres productos con new, cada uno con su
    // precio de la tabla y con las piezas que te pasan.
    // Si la ubicacion viene en blanco, guarda "SIN UBICACION".   (ternario)
    // Pista: texto.isBlank() es true si solo trae espacios.
    //
    // QUE DEBE PASAR:
    //     new Expendedora("Edificio Q", 15)  -> ubicacion "Edificio Q",
    //                                           papas, refresco y chocolate con 10
    //     new Expendedora("   ", 0)          -> ubicacion "SIN UBICACION",
    //                                           los tres con 0 piezas
    Expendedora(String ubicacion, int piezas) {
        this.ubicacion = ubicacion.isBlank() ? "SIN UBICACION" : ubicacion;
        this.saldo = 0;
        this.papas = new Producto("papas", 18, piezas);
        this.refresco = new Producto("refresco", 22, piezas);
        this.chocolate = new Producto("chocolate", 15, piezas);
    }

    // --- METODOS -----------------------------------------------------------

    // Regresa el Producto de ese codigo, o null si no existe.
    // Limpia el codigo con trim() y toUpperCase().
    //                                          (switch clasico con break y default)
    //     buscar("A1")     -> el Producto de las papas
    //     buscar(" b1 ")   -> el Producto del chocolate
    //     buscar("Z9")     -> null
    Producto buscar(String codigo) {
        Producto encontrado;
        switch (codigo.trim().toUpperCase()) {
            case "A1":
                encontrado = this.papas;
                break;
            case "A2":
                encontrado = this.refresco;
                break;
            case "B1":
                encontrado = this.chocolate;
                break;
            default:
                encontrado = null;
        }
        return encontrado;
    }

    // Suma al saldo el valor de la moneda.            (switch sobre el enum)
    //     saldo 0,  insertar(Moneda.DIEZ)  -> saldo 10
    //     luego     insertar(Moneda.DOS)   -> saldo 12
    void insertar(Moneda moneda) {
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

    // Intenta vender. Revisa en ESTE orden y regresa el primer caso que aplique:
    //   1. codigo que no existe    -> "CODIGO INVALIDO"
    //   2. no quedan piezas        -> "AGOTADO"
    //   3. el saldo no alcanza     -> "FALTAN $" y lo que falta (el saldo se queda)
    //   4. si todo esta bien       -> saca una pieza, suma 1 a las ventas,
    //                                 regresa el cambio y deja el saldo en 0
    //                                                     (if / else if / else)
    //     saldo 15, comprar("A1")   -> "FALTAN $3"
    //     saldo 18, comprar("A1")   -> "ENTREGADO, CAMBIO $0"
    //     saldo 30, comprar("B1")   -> "ENTREGADO, CAMBIO $15"
    //     comprar("C3")             -> "CODIGO INVALIDO"
    //     maquina sin piezas        -> "AGOTADO"
    String comprar(String codigo) {
        Producto p = buscar(codigo);
        
        if (p == null) {
            return "CODIGO INVALIDO";
        } else if (!p.hayPiezas()) {
            return "AGOTADO";
        } else if (this.saldo < p.getPrecio()) {
            return "FALTAN $" + (p.getPrecio() - this.saldo);
        } else {
            p.sacarUna();
            ventasTotales++;
            int cambio = this.saldo - p.getPrecio();
            this.saldo = 0;
            return "ENTREGADO, CAMBIO $" + cambio;
        }
    }

    // "VACIA" si NINGUNO de sus tres productos tiene piezas; si no, "DISPONIBLE".
    //                                                           (ternario)
    //     new Expendedora("Q", 15)  -> "DISPONIBLE"
    //     new Expendedora("Q", 0)   -> "VACIA"
    String estado() {
        boolean vacia = !papas.hayPiezas() && !refresco.hayPiezas() && !chocolate.hayPiezas();
        return vacia ? "VACIA" : "DISPONIBLE";
    }

    // La ubicacion y, entre parentesis, el estado:
    //     "Edificio Q (DISPONIBLE)"        "SIN UBICACION (VACIA)"
    String etiqueta() {
        return this.ubicacion + " (" + estado() + ")";
    }

    // Devuelve el saldo que habia y lo deja en 0.
    //     saldo 10:  cancelar() -> 10,  y otra vez  cancelar() -> 0
    int cancelar() {
        int dineroDevuelto = this.saldo;
        this.saldo = 0;
        return dineroDevuelto;
    }

    // Las ventas de TODAS las maquinas juntas (el atributo static).
    //     si la maquina A vendio 2 y la B vendio 1  -> 3
    static int getVentasTotales() {
        return ventasTotales;
    }
}