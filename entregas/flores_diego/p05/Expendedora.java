// ============================================================================
// P5 · ESTRUCTURAS DE SELECCION · MPOO 2027-1 · Grupo 6 · Expendedora.java
// ============================================================================
// =============================== EXPENDEDORA ===============================
// La maquina de la Facultad tiene tres productos:
//
//      codigo   producto     precio
//      A1       papas        $18
//      A2       refresco     $22
//      B1       chocolate    $15
//
public class Expendedora {
    static int VENTASTOTALES = 0;
    String ubicacion;
    int saldo;
    Producto papas;
    Producto chocolate;
    Producto refresco;

    // --- CONSTRUCTOR -------------------------------------------------------
    Expendedora(String ubicacion, int piezas) {
        this.saldo = 0;
        this.ubicacion = ubicacion.isBlank()? "SIN UBICACION" : ubicacion;
        this.papas = new Producto("Papas",18 ,piezas);
        this.refresco = new Producto("Refresco",22 ,piezas);
        this.chocolate = new Producto("Chocolate",15 ,piezas);
    }

    // --- METODOS -----------------------------------------------------------
    Producto buscar(String codigo) {
        Producto product = null;
        switch(codigo.trim().toUpperCase()){
            case "A1":
                product = papas;
                break;
            case "A2":
                product = refresco;
                break;
            case "B1":
                product = chocolate ;
                break;
            default:
                product = null;
        }
        return product;
    }

    void insertar(Moneda moneda) {
        switch(moneda){
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
            default:
                break;
        }
    }

    String comprar(String codigo) {
        Producto p = buscar(codigo);
        if(p == null){
            return "CODIGO INVALIDO";
        }
        if(!p.hayPiezas()){
            return "AGOTADO";
        }
        if(this.saldo < p.getPrecio()){
            int falta = p.getPrecio() - this.saldo;
            return "FALTAN $" + falta;
        }
        p.sacarUna();
            this.VENTASTOTALES ++;
            int cambio = this.saldo -p.getPrecio();
            this.saldo = 0;
        return "ENTREGADO, CAMBIO $" +cambio;   // TODO
    }

    String estado() {
        return (this.papas.piezas == 0 && this.refresco.piezas == 0 && this.chocolate.piezas == 0)? "VACIA" : "DISPONIBLE";   // TODO
    }

    String etiqueta() {
        if(this.ubicacion == null){
            return "SIN UBICACION (" + estado() + ")";
        } else {
            return "" + this.ubicacion + " (" + estado() + ")";
        }

    }

    int cancelar() {
        int saldoanterior = this.saldo;
        this.saldo = 0;
        return saldoanterior;   // TODO
    }

    static int getVentasTotales() {
        return VENTASTOTALES;   // TODO
    }
}