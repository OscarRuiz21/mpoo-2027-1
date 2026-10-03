// CONTEXTO: Un sistema de inventario para el patrimonio cultural de una universidad.
// QUE SABE Y POR QUE: titulo (para identificar la obra), areaMetrosCuadrados (para calcular recursos de mantenimiento).
// QUE SABE HACER Y POR QUE: registrarRestauracion (void, recibe el año para actualizar el expediente), calcularCostoMantenimiento (retorna double basado en el área).
// QUE IGNORE: La paleta de colores y el tipo de pinceladas, ya que es un registro puramente administrativo.
public class MuralHistorico { 

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    // tipo: String · nombre: titulo · valor inicial: "Sin Título"
    String titulo = "Sin Título"; 
    // tipo: double · nombre: areaMetrosCuadrados · valor inicial: 0.0
    double areaMetrosCuadrados = 0.0;      
    // tipo: int · nombre: anioUltimaRestauracion · valor inicial: 0
    int anioUltimaRestauracion = 0;

    // (Sin constructor explícito, se usará el vacío por defecto)

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // firma: registrarRestauracion(int) · retorno: void · parametro: int anio
    public void registrarRestauracion(int anio) {
        anioUltimaRestauracion = anio;
    }

    // firma: calcularCostoMantenimiento() · retorno: double · parametro: ninguno
    public double calcularCostoMantenimiento() {
        // Supongamos que cuesta 1500 pesos mantener cada metro cuadrado
        return areaMetrosCuadrados * 1500.0;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: MuralHistorico");
        
        // 1: crea tu objeto y asigna lo que falte
        MuralHistorico muralCU = new MuralHistorico();
        muralCU.titulo = "Representación Histórica";
        muralCU.areaMetrosCuadrados = 400.5;
        muralCU.anioUltimaRestauracion = 2010;

        System.out.println("[estado inicial]"); 
        // 2: imprime cada atributo
        System.out.println("Título: " + muralCU.titulo);
        System.out.println("Área (m2): " + muralCU.areaMetrosCuadrados);
        System.out.println("Última restauración: " + muralCU.anioUltimaRestauracion);

        System.out.println("[invocando metodos]"); 
        // 3: firma + invocacion + resultado/efecto
        // firma: registrarRestauracion(int) -> actualizamos el año
        muralCU.registrarRestauracion(2026);
        System.out.println("Se registró una nueva restauración.");
        
        // firma: calcularCostoMantenimiento() -> obtenemos el costo
        double costo = muralCU.calcularCostoMantenimiento();
        System.out.println("Costo calculado exacto: $" + costo);

        // --- CASTING AGREGADO AQUÍ ---
        int costoAproximado = (int) muralCU.calcularCostoMantenimiento();
        System.out.println("Costo aproximado (sin centavos por casting): $" + costoAproximado);

        System.out.println("[estado final]"); 
        // 4: imprime atributos otra vez
        System.out.println("Título: " + muralCU.titulo);
        System.out.println("Área (m2): " + muralCU.areaMetrosCuadrados);
        System.out.println("Última restauración: " + muralCU.anioUltimaRestauracion);
    }
}