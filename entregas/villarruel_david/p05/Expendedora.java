// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Expendedora.java
// ============================================================================
// PASO 2 de 2. Completa donde dice TODO y corre P5Seleccion.java:
// las pruebas 7 a 18 son de esta clase.
// ============================================================================


// =============================== EXPENDEDORA ===============================
// La maquina de la Facultad tiene tres productos:
//
//      codigo   producto     precio
//      A1       papas        $18
//      A2       refresco     $22
//      B1       chocolate    $15


public class Expendedora {


    // --- ATRIBUTOS ---------------------------------------------------------
    // TODO: un atributo static que cuente las ventas de TODAS las maquinas.
    // TODO: los atributos de cada maquina: ubicacion, saldo y productos.


    static int ventasTotales = 0;

    String ubicacion;
    int saldo;

    Producto A1;
    Producto A2;
    Producto B1;



    // --- CONSTRUCTOR -------------------------------------------------------
    // Nace con saldo 0 y crea sus tres productos.

    Expendedora(String ubicacion, int piezas) {


        this.ubicacion = ubicacion.isBlank()
                ? "SIN UBICACION"
                : ubicacion;


        this.saldo = 0;


        A1 = new Producto("papas",18,piezas);
        A2 = new Producto("refresco",22,piezas);
        B1 = new Producto("chocolate",15,piezas);

    }



    // --- METODOS -----------------------------------------------------------


    // Regresa el Producto de ese codigo, o null si no existe.
    // Limpia codigo con trim() y toUpperCase().
    // switch clasico con break y default.

    Producto buscar(String codigo) {


        switch(codigo.trim().toUpperCase()) {


            case "A1":

                return A1;


            case "A2":

                return A2;


            case "B1":

                return B1;


            default:

                return null;
        }
    }


    // Suma al saldo el valor de la moneda.
    // switch sobre enum.

    void insertar(Moneda moneda) {


        switch(moneda) {


            case UNO:

                saldo += 1;

                break;


            case DOS:

                saldo += 2;

                break;


            case CINCO:

                saldo += 5;

                break;


            case DIEZ:

                saldo += 10;

                break;
        }

    }


    // Intenta vender.
    // Revisa codigo, piezas, saldo y entrega cambio.

    String comprar(String codigo) {


        Producto p = buscar(codigo);



        if (p == null) {

            return "CODIGO INVALIDO";


        } else if (!p.hayPiezas()) {


            return "AGOTADO";


        } else if (saldo < p.getPrecio()) {


            return "FALTAN $" + (p.getPrecio() - saldo);



        } else {


            int cambio = saldo - p.getPrecio();


            p.sacarUna();


            ventasTotales++;


            saldo = 0;


            return "ENTREGADO, CAMBIO $" + cambio;

        }

    }

    // "VACIA" si ninguno tiene piezas.
    // Si no, "DISPONIBLE".

    String estado() {


        return (A1.hayPiezas() || A2.hayPiezas() || B1.hayPiezas())
                ? "DISPONIBLE"
                : "VACIA";

    }

    // Ubicacion y estado.

    String etiqueta() {


        return ubicacion + " (" + estado() + ")";

    }


    // Devuelve saldo y lo deja en 0.

    int cancelar() {


        int dinero = saldo;


        saldo = 0;


        return dinero;

    }

    // Ventas de todas las maquinas.

    static int getVentasTotales() {


        return ventasTotales;

    }

}