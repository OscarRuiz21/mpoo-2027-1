// CONTEXTO: Sistema de control de capacidad e hidratacion para un termo de agua.
// QUE SABE Y POR QUE: Sabe la capacidad total (int) y la cantidad de agua servida (int) para no desbordarse.
// QUE SABE HACER Y POR QUE: Sabe servir liquido (void) y calcular el porcentaje de agua restante (int).
// QUE IGNORO: Ignoro el material, el color, la temperatura exacta y la marca.

public class Termo {

    // Atributos
    private int mlCapacidad;
    private int mlRestantes;

    // Constructor con parametros (mismo nombre, sin retorno, usa 'this')
    public Termo(int mlCapacidad, int mlRestantes) {
        this.mlCapacidad = mlCapacidad;
        this.mlRestantes = mlRestantes;
    }

    // Metodo void con parametro
    // firma: tomarAgua(int)
    public void tomarAgua(int ml) {
        this.mlRestantes = this.mlRestantes - ml; // Operador: -
    }

    // Metodo que retorna valor
    // firma: porcentajeRestante()
    public int porcentajeRestante() {
        // Uso de casting explícito, multiplicación (*), división (/) y modulo (%)
        double proporcion = (double) this.mlRestantes / this.mlCapacidad; // Operadores: casting (double) y /
        int porcentaje = (int) (proporcion * 100); // Operadores: casting (int) y *
        int residuo = this.mlRestantes % 10; // Operador: %
        return porcentaje;
    }

    public static void main(String[] args) {
        // Estado inicial mediante constructor
        Termo t = new Termo(1000, 800);

        System.out.println("--- Estado Inicial ---");
        System.out.println("Capacidad: " + t.mlCapacidad + " ml, Restantes: " + t.mlRestantes + " ml");

        // Invocaciones
        t.tomarAgua(300);
        int porc = t.porcentajeRestante();

        System.out.println("\n--- Estado Final ---");
        System.out.println("Ml despues de tomar: " + t.mlRestantes);
        System.out.println("Porcentaje restante: " + porc + "%");
    }
}