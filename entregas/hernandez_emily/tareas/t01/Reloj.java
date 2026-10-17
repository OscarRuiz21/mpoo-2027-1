// CONTEXTO: programa que representa un reloj para consultar y modificar la hora actual.
// QUE SABE Y POR QUE: hora y minutos guardan la hora actual, formato indica el formato usado,
//                     y funcionando indica si el reloj esta funcionando.
// QUE SABE HACER Y POR QUE: avanzarMinutos(int) modifica la hora; mostrarHora() retorna String
//                           para poder mostrar la hora actual del reloj.
// QUE IGNORE: no modele la marca ni el diseño del reloj porque no afectan el funcionamiento del programa.

public class Reloj {

    // ===== ATRIBUTOS =====
    int hora = 12;                    // tipo: int · nombre: hora · valor inicial: 12
    int minutos = 0;                  // tipo: int · nombre: minutos · valor inicial: 0
    char formato = 'A';               // tipo: char · nombre: formato · valor inicial: 'A'
    boolean funcionando = true;       // tipo: boolean · nombre: funcionando · valor inicial: true
    String nombre = "Reloj";          // tipo: String · nombre: nombre · valor inicial: "Reloj"

    // ===== METODOS =====

    // firma: avanzarMinutos(int) · retorno: void · parametro: int cantidad
    void avanzarMinutos(int cantidad) {
        minutos = minutos + cantidad;

        if (minutos >= 60) {
            hora++;
            minutos = minutos - 60;
        }

        if (hora >= 24) {
            hora = hora - 24;
        }
    }

    // firma: mostrarHora() · retorno: String · sin parametros
    String mostrarHora() {
        return hora + ":" + minutos;
    }

    // firma: minutosTotales() · retorno: int · sin parametros
    int minutosTotales() {
        return hora * 60 + minutos;
    }

    // firma: horaDecimal() · retorno: double · sin parametros
    double horaDecimal() {
        return hora + minutos / 60.0;
    }

    // firma: horaEntera() · retorno: int · sin parametros
    int horaEntera() {
        double horaConMinutos = horaDecimal();

        // Casting explicito de double a int.
        return (int) horaConMinutos;
    }

    public static void main(String[] args) {

        System.out.println("RADIOGRAFIA: Reloj");

        // Crear el objeto.
        Reloj r = new Reloj();

        System.out.println("[estado inicial]");
        System.out.println("nombre = " + r.nombre);
        System.out.println("hora = " + r.hora);
        System.out.println("minutos = " + r.minutos);
        System.out.println("formato = " + r.formato);
        System.out.println("funcionando = " + r.funcionando);

        System.out.println("[invocando metodos]");

        r.avanzarMinutos(75);
        System.out.println("avanzarMinutos(int) -> void");

        System.out.println("mostrarHora() -> String; "
                + r.mostrarHora());

        System.out.println("minutosTotales() -> int; "
                + r.minutosTotales());

        System.out.println("horaDecimal() -> double; "
                + r.horaDecimal());

        System.out.println("horaEntera() -> int; "
                + r.horaEntera());

        System.out.println("[estado final]");
        System.out.println("nombre = " + r.nombre);
        System.out.println("hora = " + r.hora);
        System.out.println("minutos = " + r.minutos);
        System.out.println("formato = " + r.formato);
        System.out.println("funcionando = " + r.funcionando);
    }
}