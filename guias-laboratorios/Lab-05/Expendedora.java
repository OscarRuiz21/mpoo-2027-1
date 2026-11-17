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
    // TODO: un atributo static que cuente las ventas de TODAS las maquinas.
    // TODO: los atributos de cada maquina: su ubicacion, su saldo y sus tres
    //       productos.
    //
    // Un atributo puede ser un OBJETO de otra clase. EJEMPLO con otra clase,
    // Grupo, que tiene alumnos:
    //     static int totalGrupos = 0;     // static: uno para todos los grupos
    //     String salon;
    //     Alumno jefe;                    // un atributo que es un Alumno


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
    //
    // EJEMPLO con otra clase, Grupo:
    //     Grupo(String salon, String nombreDelJefe) {
    //         this.salon = salon.isBlank() ? "SIN SALON" : salon;   // ternario
    //         this.jefe = new Alumno(nombreDelJefe, 19);             // crea el objeto
    //     }
    Expendedora(String ubicacion, int piezas) {
        // TODO
    }

    // --- METODOS -----------------------------------------------------------

    // Regresa el Producto de ese codigo, o null si no existe.
    // Limpia el codigo con trim() y toUpperCase().
    //                                          (switch clasico con break y default)
    //     buscar("A1")     -> el Producto de las papas
    //     buscar(" b1 ")   -> el Producto del chocolate
    //     buscar("Z9")     -> null
    //
    // EJEMPLO de switch clasico con otra cosa:
    //     int numero;
    //     switch (dia.trim().toUpperCase()) {
    //         case "LUNES":
    //             numero = 1;
    //             break;
    //         case "MARTES":
    //             numero = 2;
    //             break;
    //         default:
    //             numero = -1;
    //     }
    //     return numero;
    Producto buscar(String codigo) {
        return null;   // TODO
    }

    // Suma al saldo el valor de la moneda.            (switch sobre el enum)
    //     saldo 0,  insertar(Moneda.DIEZ)  -> saldo 10
    //     luego     insertar(Moneda.DOS)   -> saldo 12
    //
    // En un switch de enum el case se escribe sin "Moneda.":
    //     switch (moneda) {
    //         case UNO:
    //             ...
    //             break;
    //         ...
    //     }
    void insertar(Moneda moneda) {
        // TODO
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
    //
    // Pista: empieza con   Producto p = buscar(codigo);
    //        y despues pregunta   p == null,  p.hayPiezas(),  p.getPrecio() ...
    String comprar(String codigo) {
        return "";   // TODO
    }

    // "VACIA" si NINGUNO de sus tres productos tiene piezas; si no, "DISPONIBLE".
    //                                                           (ternario)
    //     new Expendedora("Q", 15)  -> "DISPONIBLE"
    //     new Expendedora("Q", 0)   -> "VACIA"
    String estado() {
        return "";   // TODO
    }

    // La ubicacion y, entre parentesis, el estado:
    //     "Edificio Q (DISPONIBLE)"        "SIN UBICACION (VACIA)"
    String etiqueta() {
        return "";   // TODO
    }

    // Devuelve el saldo que habia y lo deja en 0.
    //     saldo 10:  cancelar() -> 10,  y otra vez  cancelar() -> 0
    int cancelar() {
        return -1;   // TODO
    }

    // Las ventas de TODAS las maquinas juntas (el atributo static).
    //     si la maquina A vendio 2 y la B vendio 1  -> 3
    static int getVentasTotales() {
        return -1;   // TODO
    }
}
