// CONTEXTO: App de inventario para senderismo que calcula la carga del usuario.
// QUE SABE Y POR QUE: pesoKg (para el esfuerzo físico), objetos (para saber cantidad de cosas), cerrada (seguridad al caminar).
// QUE SABE HACER Y POR QUE: meter(double) es void porque modifica la mochila; estaPesada() retorna boolean para alertar al usuario.
// QUE IGNORE: el color y la marca, porque no afectan la mecánica del peso y espacio en la simulación.
public class Mochila {

    // ===== ATRIBUTOS =====
    double pesoKg = 0.0;     // tipo: double  · valor inicial: 0.0
    int objetos = 0;         // tipo: int     · valor inicial: 0
    boolean cerrada = false; // tipo: boolean · valor inicial: false

    // ===== METODOS =====
    // firma: meter(double) · retorno: void · parametro: double kg
    void meter(double kg) {
        pesoKg += kg;        // operador += (abreviado)
        objetos++;           // operador ++ (contador)
    }

    // firma: cerrar() · retorno: void · sin parametros
    void cerrar() {
        cerrada = true;
    }

    // firma: estaPesada() · retorno: boolean · sin parametros
    boolean estaPesada() {
        return pesoKg > 5.0; // operador relacional >
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Mochila");
        Mochila m = new Mochila();

        System.out.println("\n[estado inicial]");
        System.out.println("pesoKg  = " + m.pesoKg);
        System.out.println("objetos = " + m.objetos);
        System.out.println("cerrada = " + m.cerrada);

        System.out.println("\n[invocando metodos]");
        m.meter(2.5);
        System.out.println("meter(double) -> void");
        m.meter(3.0);
        System.out.println("meter(double) -> void");
        m.cerrar();
        System.out.println("cerrar() -> void");
        System.out.println("estaPesada() -> boolean; resultado: " + m.estaPesada());

        int pesoAproximado = (int) m.pesoKg; // casting: double a int (explícito)
        System.out.println("casting (int) " + m.pesoKg + " = " + pesoAproximado);

        System.out.println("\n[estado final]");
        System.out.println("pesoKg  = " + m.pesoKg);
        System.out.println("objetos = " + m.objetos);
        System.out.println("cerrada = " + m.cerrada);
    }
}