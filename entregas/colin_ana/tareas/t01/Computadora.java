// CONTEXTO: Vive en un sistema de gestión personal.
// QUE SABE Y POR QUE: nombreEquipo (String), capacidadRamGB (int), almacenamientoLibreGB (double) y estaConectadaRed (boolean).
// QUE SABE HACER Y POR QUE: conectarRed (void, CON parámetros) para conectar a WiFi; calcularEspacioRestante (retorna double) tras descargar archivos.
// QUE IGNORE: Ignoré el color del chasis y las luces RGB.

public class Computadora {

    // ===== ATRIBUTOS (4 tipos de datos distintos) =====
    String nombreEquipo = "ASUS-TUF";        // tipo: String
    int capacidadRamGB = 16;                 // tipo: int
    double almacenamientoLibreGB = 450.5;    // tipo: double
    boolean estaConectadaRed = false;        // tipo: boolean

    // ===== CONSTRUCTOR =====
    Computadora(String nombreEquipo, int capacidadRamGB, double almacenamientoLibreGB) {
        this.nombreEquipo = nombreEquipo;
        this.capacidadRamGB = capacidadRamGB;
        this.almacenamientoLibreGB = almacenamientoLibreGB;
    }

    // ===== METODOS =====

    // Método void CON parámetros
    void conectarRed(String nombreRed, int velocidadMbps) {
        this.estaConectadaRed = true;
        // Uso de suma (+) y módulo (%)
        int canalAsignado = (velocidadMbps + 5) % 12;
        System.out.println("Conectado a: " + nombreRed + " en el canal " + canalAsignado + " del equipo " + this.nombreEquipo);
    }

    // Método con retorno
    double calcularEspacioRestante(double tamaArchivoGB, int cantidad) {
        // Uso de multiplicación (*), división (/), resta (-)
        double totalDescargado = tamaArchivoGB * cantidad;
        double reservaSistema = (totalDescargado / 100.0);
        double espacioFinal = (this.almacenamientoLibreGB - totalDescargado) - reservaSistema;
        return espacioFinal;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Computadora");

        Computadora miPC = new Computadora("RogStrix", 32, 500.0);

        System.out.println("[estado inicial]");
        System.out.println("Equipo: " + miPC.nombreEquipo);
        System.out.println("RAM Total: " + miPC.capacidadRamGB + " GB");
        System.out.println("Almacenamiento Libre: " + miPC.almacenamientoLibreGB + " GB");
        System.out.println("¿Conectada a red?: " + miPC.estaConectadaRed);

        System.out.println("\n[invocando metodos]");

        System.out.println("Invocando: conectarRed(\"Infinitum_5G\", 100)");
        miPC.conectarRed("Infinitum_5G", 100);

        System.out.println("Invocando: calcularEspacioRestante(45.0, 2)");
        double espacio = miPC.calcularEspacioRestante(45.0, 2);
        System.out.println("Resultado: Almacenamiento libre restante = " + espacio + " GB");

        System.out.println("\n[estado final]");
        System.out.println("¿Conectada a red?: " + miPC.estaConectadaRed);
    }
}