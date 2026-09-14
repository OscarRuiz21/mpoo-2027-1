// CONTEXTO: Vive en un sistema de entretenimiento para una casa.
// QUE SABE Y POR QUE: marca (String), resolucionVertical (int), tamanoPulgadas (double) y estaEncendida (boolean).
// QUE SABE HACER Y POR QUE: ajustarConfiguracion (void, CON parámetros) para modificar volumen y brillo; calcularPrecioPulgada (retorna double) usando operadores aritméticos.
// QUE IGNORE: Ignoré el color del marco y si está colgada o sobre un mueble.

public class Television {

    // ===== ATRIBUTOS (4 tipos de datos distintos) =====
    String marca = "Samsung";            // tipo: String
    int resolucionVertical = 1080;       // tipo: int
    double tamanoPulgadas = 55.5;        // tipo: double
    boolean estaEncendida = false;       // tipo: boolean
    int volumen = 10;

    // ===== CONSTRUCTOR =====
    Television(String marca, int resolucionVertical, double tamanoPulgadas) {
        this.marca = marca;
        this.resolucionVertical = resolucionVertical;
        this.tamanoPulgadas = tamanoPulgadas;
    }

    // ===== METODOS =====

    // Método void CON parámetros
    void ajustarConfiguracion(int nuevoVolumen, String modoImagen) {
        this.estaEncendida = true;
        // Uso de suma (+) y módulo (%)
        this.volumen = (this.volumen + nuevoVolumen) % 100;
        System.out.println("Modo " + modoImagen + " aplicado a la TV " + this.marca);
    }

    // Método con retorno
    double calcularPrecioPulgada(double precioTotal, double descuento) {
        // Uso de multiplicación (*), división (/), resta (-)
        double precioConDescuento = precioTotal - descuento;
        double precioPorPulgada = (precioConDescuento * 1.16) / this.tamanoPulgadas; // 1.16 incluye IVA
        return precioPorPulgada;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Television");

        Television miTV = new Television("LG 4K", 2160, 65.0);

        System.out.println("[estado inicial]");
        System.out.println("Marca: " + miTV.marca);
        System.out.println("Resolución: " + miTV.resolucionVertical + "p");
        System.out.println("Tamaño: " + miTV.tamanoPulgadas + " pulgadas");
        System.out.println("¿Encendida?: " + miTV.estaEncendida);

        System.out.println("\n[invocando metodos]");
        
        System.out.println("Invocando: ajustarConfiguracion(15, \"Cine\")");
        miTV.ajustarConfiguracion(15, "Cine");

        System.out.println("Invocando: calcularPrecioPulgada(12000.0, 1000.0)");
        double costo = miTV.calcularPrecioPulgada(12000.0, 1000.0);
        System.out.println("Resultado: Precio final por pulgada = $" + costo);

        System.out.println("\n[estado final]");
        System.out.println("Volumen actual: " + miTV.volumen);
        System.out.println("¿Encendida?: " + miTV.estaEncendida);
    }
}