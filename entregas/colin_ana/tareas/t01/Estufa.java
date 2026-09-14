// CONTEXTO: Vive en un sistema de gestión de hogar.
// QUE SABE Y POR QUE: modelo (String), cantidadQuemadores (int), temperaturaHorno (double) y estaEncendida (boolean).
// QUE SABE HACER Y POR QUE: encenderQuemadores (void, CON parámetros) para activar quemadores; calcularTiempoCoccion (retorna double) aplicando operaciones aritméticas.
// QUE IGNORE: Ignoré si el acabado es de acero inoxidable o esmalte.

public class Estufa {

    // ===== ATRIBUTOS (4 tipos de datos distintos) =====
    String modelo = "Mabe Master";       // tipo: String
    int cantidadQuemadores = 6;          // tipo: int
    double temperaturaHorno = 180.5;     // tipo: double
    boolean estaEncendida = false;       // tipo: boolean
    int quemadoresActivos = 0;

    // ===== CONSTRUCTOR =====
    Estufa(String modelo, int cantidadQuemadores, double temperaturaHorno) {
        this.modelo = modelo;
        this.cantidadQuemadores = cantidadQuemadores;
        this.temperaturaHorno = temperaturaHorno;
    }

    // ===== METODOS =====

    // Método void CON parámetros
    void encenderQuemadores(int cuantos, String zona) {
        // Uso de suma (+) y módulo (%)
        int nuevosActivos = (this.quemadoresActivos + cuantos) % (this.cantidadQuemadores + 1);
        this.quemadoresActivos = nuevosActivos;
        this.estaEncendida = this.quemadoresActivos > 0;
        System.out.println("Encendidos " + cuantos + " quemadores en la zona " + zona);
    }

    // Método con retorno
    double calcularTiempoCoccion(double pesoKilos) {
        // Uso de multiplicación (*), división (/), resta (-)
        double tiempoBase = (pesoKilos * 45.0) / (this.temperaturaHorno / 100.0);
        double tiempoAjustado = tiempoBase - 5.0; // Resta 5 min de precalentamiento
        return tiempoAjustado;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Estufa");

        Estufa miEstufa = new Estufa("Whirlpool Pro", 4, 200.0);

        System.out.println("[estado inicial]");
        System.out.println("Modelo: " + miEstufa.modelo);
        System.out.println("Quemadores totales: " + miEstufa.cantidadQuemadores);
        System.out.println("Temperatura Horno: " + miEstufa.temperaturaHorno + " °C");
        System.out.println("¿Encendida?: " + miEstufa.estaEncendida);

        System.out.println("\n[invocando metodos]");

        System.out.println("Invocando: encenderQuemadores(2, \"Frontal\")");
        miEstufa.encenderQuemadores(2, "Frontal");

        System.out.println("Invocando: calcularTiempoCoccion(2.5)");
        double minutos = miEstufa.calcularTiempoCoccion(2.5);
        System.out.println("Resultado: Tiempo estimado de cocción = " + minutos + " minutos");

        System.out.println("\n[estado final]");
        System.out.println("Quemadores activos: " + miEstufa.quemadoresActivos);
        System.out.println("¿Encendida?: " + miEstufa.estaEncendida);
    }
}