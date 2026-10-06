// CONTEXTO: aplicación para registrar y gestionar el inventario y estado de raquetas de un tenista profesional.
// QUE SABE Y POR QUE: marca (String, para identificar el fabricante), tensionLibras (double, porque la tensión afecta el control y puede tener decimales), cuerdasRotas (int, para saber cuántas se rompieron), encordada (boolean, para saber si está lista para jugar).
// QUE SABE HACER Y POR QUE: tensar(double) es void porque solo modifica la tensión; requiereCambio() retorna boolean porque el equipo técnico necesita decidir si se cambia o no la raqueta.
// QUE IGNORE: el color del grip y el diseño estético porque no afectan el rendimiento mecánico del encordado.
public class Raqueta {

    String marca = "Wilson";
    double tensionLibras = 55.0;
    int cuerdasRotas = 0;
    boolean encordada = true;

    Raqueta(String marca, double tensionLibras) {
        this.marca = marca;
        this.tensionLibras = tensionLibras;
    }

    void romperCuerda() {
        cuerdasRotas++;
    }

    boolean requiereCambio() {
        return cuerdasRotas >= 3 || !encordada;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Raqueta");
        Raqueta r = new Raqueta("Babolat", 58.5);
        System.out.println("marca = " + r.marca);
        System.out.println("tensionLibras = " + r.tensionLibras);
        System.out.println("cuerdasRotas = " + r.cuerdasRotas);
        System.out.println("encordada = " + r.encordada);
        r.romperCuerda();
        System.out.println("cuerdasRotas despues de romper: " + r.cuerdasRotas);
        System.out.println("requiereCambio: " + r.requiereCambio());
    }
}