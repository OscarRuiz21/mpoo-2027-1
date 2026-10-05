// CONTEXTO: Gestor de documentos y hojas contenidas dentro de una carpeta escolar.
// QUE SABE Y POR QUE: Sabe la cantidad de hojas (int) y si esta clasificada (boolean) para organizar la materia.
// QUE SABE HACER Y POR QUE: Sabe agregar hojas (void) y verificar si le caben mas hojas (boolean).
// QUE IGNORO: Ignoro el diseno de la portada, el grosor del aro y la asignatura.

public class Carpeta {

    // Atributos
    private int cantidadHojas;
    private boolean estaLlena;

    // Metodo void con parametro
    // firma: agregarHojas(int)
    public void agregarHojas(int nuevasHojas) {
        this.cantidadHojas = this.cantidadHojas + nuevasHojas; // Operador: +
        this.cantidadHojas++; // Operador: ++
    }

    // Metodo que retorna valor
    // firma: estaSobrepasada(int)
    public boolean estaSobrepasada(int limiteMaximo) {
        return this.cantidadHojas > limiteMaximo; // Operador: >
    }

    public static void main(String[] args) {
        Carpeta c = new Carpeta();
        c.cantidadHojas = 85;
        c.estaLlena = false;

        System.out.println("--- Estado Inicial ---");
        System.out.println("Cantidad de hojas: " + c.cantidadHojas);

        // Invocaciones
        c.agregarHojas(10);
        boolean rebaso = c.estaSobrepasada(90);

        System.out.println("\n--- Estado Final ---");
        System.out.println("Hojas despues de agregar: " + c.cantidadHojas);
        System.out.println("¿Esta sobrepasada?: " + rebaso);
    }
}