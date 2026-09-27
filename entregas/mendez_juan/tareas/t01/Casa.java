// CONTEXTO: App para controlar las luces y la seguridad de mi casa desde el cel
// QUE SABE Y POR QUE: cuartos para saber el tamaño, habitada para saber si hay alguien y focosEncendidos para no gastar luz
// QUE SABE HACER Y POR QUE: encenderFocos no regresa nada solo prende focos; esEficiente regresa boolean para ver si nos estamos pasando de luz 
// QUE IGNORE: el color de la pintura y la direccion porque no importan para prender un foco
public class Casa {

    // ===== ATRIBUTOS =====
    int cuartos = 3;             // tipo: int      nombre: cuartos          inicial: 3
    boolean habitada = true;     // tipo: boolean  nombre: habitada         inicial: true
    int focosEncendidos = 0;     // tipo: int      nombre: focosEncendidos  inicial: 0

    // ===== CONSTRUCTOR =====
    // firma: Casa(int) sin retorno
    Casa(int cuartos) {
        this.cuartos = cuartos;  // this.cuartos es atributo, cuartos es parametro
    }

    // ===== METODOS =====
    // firma: encenderFocos(int)  retorno: void  parametro: int n
    void encenderFocos(int n) {
        focosEncendidos += n;    // operador +=
    }

    // firma: esEficiente() · retorno: boolean · sin parametros
    boolean esEficiente() {
        return !habitada || focosEncendidos <= cuartos; // operadores !, || y <=
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Casa");

        Casa c = new Casa(4);    // crea la casa con 4 cuartos

        System.out.println("[estado inicial]");
        System.out.println("cuartos         = " + c.cuartos);
        System.out.println("habitada        = " + c.habitada);
        System.out.println("focosEncendidos = " + c.focosEncendidos);

        System.out.println("[invocando metodos]");
        c.encenderFocos(5);
        System.out.println("encenderFocos(int) -> void; focosEncendidos = " + c.focosEncendidos);
        System.out.println("esEficiente() -> boolean; " + c.esEficiente());

        System.out.println("[estado final]");
        System.out.println("cuartos = " + c.cuartos + " | focosEncendidos = " + c.focosEncendidos);
    }
}