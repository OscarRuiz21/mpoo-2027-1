// CONTEXTO: Vive en un sistema de entretenimiento para una casa.
// QUE SABE Y POR QUE: resolucionVertical (int) para identificar la calidad de imagen soportada y estaEncendida (boolean) para conocer si el aparato está en uso.
// QUE SABE HACER Y POR QUE: encender (void, sin parámetros) porque solo cambia el estado de la pantalla a encendida y no requiere retornar nada; cambiarCanal (retorna boolean, recibe int) para ajustar la sintonía e indicar true si el canal está en el rango permitido (1 a 100).
// QUE IGNORE: Ignoré la marca/modelo exacto y si está colgada en la pared o sobre un mueble.

public class Television {

    // ===== ATRIBUTOS =====
    int resolucionVertical = 1080;  // tipo: int · nombre: resolucionVertical · valor inicial: 1080
    boolean estaEncendida = false;  // tipo: boolean · nombre: estaEncendida · valor inicial: false
    int canalActual = 1;            // tipo: int · nombre: canalActual · valor inicial: 1

    // ===== CONSTRUCTOR =====
    // firma: Television(int) · sin tipo de retorno
    Television(int resolucionVertical) {
        this.resolucionVertical = resolucionVertical; // this.resolucionVertical = ATRIBUTO · resolucionVertical = PARAMETRO
    }

    // ===== METODOS =====

    // firma: encender() · retorno: void · parametro: ninguno
    void encender() {
        this.estaEncendida = true;
    }

    // firma: cambiarCanal(int) · retorno: boolean · parametro: int nuevoCanal
    boolean cambiarCanal(int nuevoCanal) {
        if (this.estaEncendida && nuevoCanal >= 1 && nuevoCanal <= 100) {
            this.canalActual = nuevoCanal;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Television");

        // 1. Instanciación usando el constructor (2160 para calidad 4K)
        Television miTV = new Television(2160);

        // Ejemplo de casting explícito (convierte double a int)
        int resolucionAproximada = (int) 1079.9;

        // 2. Estado inicial
        System.out.println("[estado inicial]");
        System.out.println("Resolución vertical: " + miTV.resolucionVertical + "p");
        System.out.println("¿Está encendida?: " + miTV.estaEncendida);
        System.out.println("Canal actual: " + miTV.canalActual);

        // 3. Invocando métodos
        System.out.println("\n[invocando metodos]");

        System.out.println("Invocando: encender()");
        miTV.encender();
        System.out.println("Efecto: Se ha encendido la televisión.");

        System.out.println("Invocando: cambiarCanal(7)");
        boolean seCambio = miTV.cambiarCanal(7);
        System.out.println("Resultado: ¿Se logró cambiar al canal 7? " + seCambio);

        // 4. Estado final
        System.out.println("\n[estado final]");
        System.out.println("Resolución vertical: " + miTV.resolucionVertical + "p");
        System.out.println("¿Está encendida?: " + miTV.estaEncendida);
        System.out.println("Canal actual: " + miTV.canalActual);
    }
}