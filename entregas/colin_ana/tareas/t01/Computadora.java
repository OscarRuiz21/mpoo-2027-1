// CONTEXTO: Vive en un sistema de gestión personal.
// QUE SABE Y POR QUE: capacidadRamGB (int) para identificar la memoria total disponible y estaConectadaRed (boolean) para saber si tiene acceso a internet.
// QUE SABE HACER Y POR QUE: conectarRed (void, sin parámetros) porque cambia el estado de conexión a verdadero sin devolver un valor; ejecutarPrograma (retorna boolean, recibe int) para verificar si hay suficiente memoria RAM libre para abrir una aplicación y devolver true si se logró ejecutar.
// QUE IGNORE: Ignoré el color del chasis/gabinete y el tipo de teclado porque no afectan el rendimiento del sistema.
public class Computadora {

    // ===== ATRIBUTOS =====
    int capacidadRamGB = 16;           // tipo: int · nombre: capacidadRamGB · valor inicial: 16
    boolean estaConectadaRed = false;  // tipo: boolean · nombre: estaConectadaRed · valor inicial: false
    int ramEnUsoGB = 0;                // tipo: int · nombre: ramEnUsoGB · valor inicial: 0

    // ===== CONSTRUCTOR =====
    // firma: Computadora(int) · sin tipo de retorno
    Computadora(int capacidadRamGB) {
        this.capacidadRamGB = capacidadRamGB; // this.capacidadRamGB = ATRIBUTO · capacidadRamGB = PARAMETRO
    }

    // ===== METODOS =====

    // firma: conectarRed() · retorno: void · parametro: ninguno
    void conectarRed() {
        this.estaConectadaRed = true;
    }

    // firma: ejecutarPrograma(int) · retorno: boolean · parametro: int ramRequerida
    boolean ejecutarPrograma(int ramRequerida) {
        if (this.ramEnUsoGB + ramRequerida <= this.capacidadRamGB) {
            this.ramEnUsoGB += ramRequerida;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Computadora");

        // 1. Instanciación usando el constructor (Computadora de 16 GB de RAM para tareas y juegos)
        Computadora miPC = new Computadora(16);

        // 2. Estado inicial
        System.out.println("[estado inicial]");
        System.out.println("Capacidad de RAM total: " + miPC.capacidadRamGB + " GB");
        System.out.println("¿Está conectada a internet?: " + miPC.estaConectadaRed);
        System.out.println("RAM en uso: " + miPC.ramEnUsoGB + " GB");

        // 3. Invocando métodos
        System.out.println("\n[invocando metodos]");

        System.out.println("Invocando: conectarRed()");
        miPC.conectarRed();
        System.out.println("Efecto: La computadora se ha conectado a internet.");

        System.out.println("Invocando: ejecutarPrograma(6)");
        boolean seEjecuto = miPC.ejecutarPrograma(6);
        System.out.println("Resultado: ¿Se pudo abrir el juego/programa de 6 GB de RAM? " + seEjecuto);

        // 4. Estado final
        System.out.println("\n[estado final]");
        System.out.println("Capacidad de RAM total: " + miPC.capacidadRamGB + " GB");
        System.out.println("¿Está conectada a internet?: " + miPC.estaConectadaRed);
        System.out.println("RAM en uso: " + miPC.ramEnUsoGB + " GB");
    }
}