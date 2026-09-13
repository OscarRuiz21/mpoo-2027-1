// CONTEXTO: Vive en un sistema de gestión de hogar.
// QUE SABE Y POR QUE: cantidadQuemadores (int) para saber cuántos tiene disponibles y estaEncendida (boolean) para conocer si la estufa está encendida o apagada.
// QUE SABE HACER Y POR QUE: encender (void, sin parámetros) ya que solo cambia el estado a encendida sin devolver nada; cambiarTemperatura (retorna boolean, recibe int) para ajustar la potencia y confirmar true si el nivel de temperatura es válido (entre 1 y 5).
// QUE IGNORE: Ignoré si es de gas o eléctrica.

public class Estufa {

    // ===== ATRIBUTOS =====
    int cantidadQuemadores = 6;      // tipo: int · nombre: cantidadQuemadores · valor inicial: 4
    boolean estaEncendida = false;   // tipo: boolean · nombre: estaEncendida · valor inicial: false
    int temperaturaNivel = 0;        // tipo: int · nombre: temperaturaNivel · valor inicial: 0

    // ===== CONSTRUCTOR =====
    // firma: Estufa(int) · sin tipo de retorno
    Estufa(int cantidadQuemadores) {
        this.cantidadQuemadores = cantidadQuemadores; // this.cantidadQuemadores = ATRIBUTO · cantidadQuemadores = PARAMETRO
    }

    // ===== METODOS =====

    // firma: encender() · retorno: void · parametro: ninguno
    void encender() {
        this.estaEncendida = true;
        this.temperaturaNivel = 1; // Nivel mínimo al encender
    }

    // firma: cambiarTemperatura(int) · retorno: boolean · parametro: int nuevoNivel
    boolean cambiarTemperatura(int nuevoNivel) {
        if (this.estaEncendida && nuevoNivel >= 1 && nuevoNivel <= 5) {
            this.temperaturaNivel = nuevoNivel;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Estufa");

        // 1. Instanciación usando el constructor
        Estufa miEstufa = new Estufa(6);

        // 2. Estado inicial (imprime cada atributo)
        System.out.println("[estado inicial]");
        System.out.println("Cantidad de quemadores: " + miEstufa.cantidadQuemadores);
        System.out.println("¿Está encendida?: " + miEstufa.estaEncendida);
        System.out.println("Nivel de temperatura: " + miEstufa.temperaturaNivel);

        // 3. Invocando métodos (firma + invocación + resultado/efecto)
        System.out.println("\n[invocando metodos]");

        System.out.println("Invocando: encender()");
        miEstufa.encender();
        System.out.println("Efecto: La estufa se ha encendido al nivel 1.");

        System.out.println("Invocando: cambiarTemperatura(3)");
        boolean seCambio = miEstufa.cambiarTemperatura(3);
        System.out.println("Resultado: ¿Se logró cambiar la temperatura a nivel 3? " + seCambio);

        // 4. Estado final (imprime atributos otra vez)
        System.out.println("\n[estado final]");
        System.out.println("Cantidad de quemadores: " + miEstufa.cantidadQuemadores);
        System.out.println("¿Está encendida?: " + miEstufa.estaEncendida);
        System.out.println("Nivel de temperatura: " + miEstufa.temperaturaNivel);
    }
}