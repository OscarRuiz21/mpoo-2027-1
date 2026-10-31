// CONTEXTO: Aplicacion de cicloturismo y registro de rutas urbanas en bicicleta.
// QUE SABE Y POR QUE: marca (String, para identificar el modelo), cambio (int, para saber en que velocidad va), velocidad (double, para registrar el ritmo actual en km/h), luzEncendida (boolean, para saber si cuenta con visibilidad nocturna), cambioMaximo (int, limite fisico de engranajes).
// QUE SABE HACER Y POR QUE: subirCambio() es void porque solo incrementa el engranaje; acelerar(double) es void porque modifica la velocidad actual; vaSegura() retorna boolean porque la app determina si cumple normatividad nocturna.
// QUE IGNORE: El color del marco y la presion exacta de las llantas, ya que no influyen en el calculo de velocidad o seguridad nocturna del trayecto.
public class Bicicleta {

    //  ATRIBUTOS :D
    String marca = "Sin marca";       // tipo: String  · objeto para identificar la bicicleta
    int cambio = 1;                  // tipo: int     · valor inicial: 1 (primer cambio)
    double velocidad = 0.0;          // tipo: double  · valor inicial: 0.0 km/h
    boolean luzEncendida = false;    // tipo: boolean · valor inicial: false (apagada)
    int cambioMaximo = 7;            // tipo: int     · valor inicial: 7 velocidades

    //  CONSTRUCTOR 1 (Constructor requerido) 
    // firma: Bicicleta(String, int) · inicializa objeto obligando a definir marca y limite de cambios
    public Bicicleta(String marca, int cambioMaximo) {
        this.marca = marca;                 // this.marca es ATRIBUTO, marca a secas es PARAMETRO
        this.cambioMaximo = cambioMaximo;   // asignacion explicita de parametro a atributo
    }

    //  CONSTRUCTOR 2 (Poblado opcional / Sobrecarga - PUNTO EXTRA) =====
    // firma: Bicicleta() · constructor por defecto que inicializa valores base
    public Bicicleta() {
        this.marca = "Generica";
        this.cambioMaximo = 6;
    }

    //  METODOS :D
    // firma: subirCambio() · retorno: void · sin parametros
    public void subirCambio() {
        if (this.cambio < this.cambioMaximo) {
            this.cambio++;           // operador ++ (abreviado/contador)
        }
    }

    // firma: acelerar(double) · retorno: void · parametro: double incremento
    public void acelerar(double incremento) {
        this.velocidad = this.velocidad + incremento;  // operador + (aritmetico)
    }

    // firma: encenderLuz() · retorno: void · sin parametros
    public void encenderLuz() {
        this.luzEncendida = true;
    }

    // firma: vaSegura() · retorno: boolean · sin parametros
    public boolean vaSegura() {
        // operadores <=, == y && (relacionales y logico)
        return (this.velocidad <= 25.0) && (this.luzEncendida == true);
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Bicicleta");

        // Uso del constructor :D
        Bicicleta b = new Bicicleta("Trek Marlyn Bv", 12);

        System.out.println("[estado inicial]");
        System.out.println("marca         = " + b.marca);
        System.out.println("cambio        = " + b.cambio);
        System.out.println("velocidad     = " + b.velocidad);
        System.out.println("luzEncendida  = " + b.luzEncendida);
        System.out.println("cambioMaximo  = " + b.cambioMaximo);

        System.out.println("[invocando metodos]");
        b.subirCambio();
        System.out.println("subirCambio() -> void; cambio = " + b.cambio);

        b.acelerar(18.5);
        System.out.println("acelerar(18.5) -> void; velocidad = " + b.velocidad);

        b.encenderLuz();
        System.out.println("encenderLuz() -> void; luzEncendida = " + b.luzEncendida);

        System.out.println("vaSegura() -> boolean; " + b.vaSegura());

        System.out.println("[estado final]");
        System.out.println("marca = " + b.marca + " | cambio = " + b.cambio + " | velocidad = " + b.velocidad + " | luz = " + b.luzEncendida);
    }
}