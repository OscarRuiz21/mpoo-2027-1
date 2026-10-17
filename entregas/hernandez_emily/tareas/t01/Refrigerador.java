// CONTEXTO: programa que lleva el control de los alimentos y el espacio disponible en mi refrigerador.
// QUE SABE Y POR QUE: alimentos y capacidadMaxima indican cuanto contiene y cuanto puede guardar,
//                     temperatura indica los grados actuales y puertaAbierta indica si esta abierta.
// QUE SABE HACER Y POR QUE: guardarAlimentos(int) modifica la cantidad; tieneEspacio() retorna
//                           boolean para indicar si aun queda espacio en el refrigerador.
// QUE IGNORE: no modele la marca ni el color porque no afectan el control de los alimentos.

public class Refrigerador {

    // ===== ATRIBUTOS =====
    int alimentos = 12;                 // tipo: int · nombre: alimentos · valor inicial: 12
    int capacidadMaxima = 30;           // tipo: int · nombre: capacidadMaxima · valor inicial: 30
    double temperatura = 4.0;           // tipo: double · nombre: temperatura · valor inicial: 4.0
    boolean puertaAbierta = false;      // tipo: boolean · nombre: puertaAbierta · valor inicial: false

    // ===== METODOS =====

    // firma: guardarAlimentos(int) · retorno: void · parametro: int cantidad
    void guardarAlimentos(int cantidad) {
        if (alimentos + cantidad <= capacidadMaxima) {
            // operador +
            // operador <=
            alimentos = alimentos + cantidad;
            // operador +
        }
    }

    // firma: tieneEspacio() · retorno: boolean · sin parametros
    boolean tieneEspacio() {
        // operador <
        return alimentos < capacidadMaxima;
    }

    // firma: espacioDisponible() · retorno: int · sin parametros
    int espacioDisponible() {
        // operador -
        return capacidadMaxima - alimentos;
    }

    // firma: porcentajeOcupado() · retorno: double · sin parametros
    double porcentajeOcupado() {
        // operador *
        // operador /
        return alimentos * 100.0 / capacidadMaxima;
    }

    // firma: cantidadEsPar() · retorno: boolean · sin parametros
    boolean cantidadEsPar() {
        // operador %
        // operador ==
        return alimentos % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println("RADIOGRAFIA: Refrigerador");

        // Crear el objeto.
        Refrigerador r = new Refrigerador();

        System.out.println("[estado inicial]");
        System.out.println("alimentos = " + r.alimentos);
        System.out.println("capacidadMaxima = " + r.capacidadMaxima);
        System.out.println("temperatura = " + r.temperatura);
        System.out.println("puertaAbierta = " + r.puertaAbierta);

        System.out.println("[invocando metodos]");

        r.guardarAlimentos(6);
        System.out.println("guardarAlimentos(int) -> void; alimentos = "
                + r.alimentos);

        System.out.println("tieneEspacio() -> boolean; "
                + r.tieneEspacio());

        System.out.println("espacioDisponible() -> int; "
                + r.espacioDisponible());

        System.out.println("porcentajeOcupado() -> double; "
                + r.porcentajeOcupado());

        System.out.println("cantidadEsPar() -> boolean; "
                + r.cantidadEsPar());

        System.out.println("[estado final]");
        System.out.println("alimentos = " + r.alimentos);
        System.out.println("capacidadMaxima = " + r.capacidadMaxima);
        System.out.println("temperatura = " + r.temperatura);
        System.out.println("puertaAbierta = " + r.puertaAbierta);
    }
}