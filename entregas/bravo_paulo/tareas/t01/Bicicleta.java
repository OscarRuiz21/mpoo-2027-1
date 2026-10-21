// CONTEXTO: App de rastreo de bicicletas compartidas en la ciudad.
// QUE SABE Y POR QUE: idBici (para identificarla en el sistema), velocidad (monitorear excesos), luzEncendida (seguridad nocturna).
// QUE SABE HACER Y POR QUE: pedalear(double) es void porque modifica la velocidad; vaSegura() retorna boolean para reglas de tránsito.
// QUE IGNORE: el desgaste de las llantas y la ubicación GPS actual, para enfocar el modelo en la física básica.
// CONSTRUCTOR: idBici y luzEncendida se piden al crear la bicicleta, porque en este sistema no existe una bici sin registro y estado.
public class Bicicleta {

    // ===== ATRIBUTOS =====
    String idBici = "Desconocida"; // tipo: String  · objeto, no primitivo
    double velocidad = 0.0;        // tipo: double  · valor inicial: 0.0
    boolean luzEncendida = false;  // tipo: boolean · valor inicial: false

    // ===== CONSTRUCTOR =====
    // firma: Bicicleta(String) · mismo nombre de la clase · SIN tipo de retorno
    Bicicleta(String idBici) {
        this.idBici = idBici;      // this.idBici es el ATRIBUTO, idBici a secas el PARAMETRO
    }

    // ===== SEGUNDO CONSTRUCTOR (sobrecarga, punto extra) =====
    // firma: Bicicleta(String, boolean)
    Bicicleta(String idBici, boolean luzEncendida) {
        this.idBici = idBici;
        this.luzEncendida = luzEncendida;
    }

    // ===== METODOS =====
    // firma: pedalear(double) · retorno: void · parametro: double aceleracion
    void pedalear(double aceleracion) {
        velocidad = velocidad + aceleracion;
    }

    // firma: toggleLuz() · retorno: void · sin parametros
    void toggleLuz() {
        luzEncendida = !luzEncendida; // operador ! (negación lógica)
    }

    // firma: calcularDistancia(double) · retorno: double · parametro: double horas
    double calcularDistancia(double horas) {
        return velocidad * horas; // operador *
    }

    // firma: vaSegura() · retorno: boolean · sin parametros
    boolean vaSegura() {
        return velocidad <= 25.0 && luzEncendida; // operadores <= y && (AND lógico)
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Bicicleta");

        Bicicleta b = new Bicicleta("ECO-402", true); // Uso de constructor con parametros

        System.out.println("\n[estado inicial]");
        System.out.println("idBici       = " + b.idBici);
        System.out.println("velocidad    = " + b.velocidad);
        System.out.println("luzEncendida = " + b.luzEncendida);

        System.out.println("\n[invocando metodos]");
        b.pedalear(18.5);
        System.out.println("pedalear(double) -> void");
        b.toggleLuz();
        System.out.println("toggleLuz() -> void");

        System.out.println("calcularDistancia(double) -> double; resultado: " + b.calcularDistancia(2.0));
        System.out.println("vaSegura() -> boolean; resultado: " + b.vaSegura());

        System.out.println("\n[estado final]");
        System.out.println("idBici       = " + b.idBici);
        System.out.println("velocidad    = " + b.velocidad);
        System.out.println("luzEncendida = " + b.luzEncendida);
    }
}