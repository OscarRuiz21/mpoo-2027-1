// CONTEXTO: Un panel de control de audio en el sistema operativo de una computadora.
// QUE SABE Y POR QUE: nivelBateria (para alertar si necesitan carga), volumen (para regular la salida de audio).
// QUE SABE HACER Y POR QUE: ajustarVolumen (void, recibe parámetro para cambiar el nivel), obtenerDiagnostico (retorna un texto con el estado general).
// QUE IGNORE: El peso físico y la frecuencia de radio, porque al sistema operativo solo le importan los datos digitales.
public class AuricularesInalambricos { 

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    // tipo: int · nombre: nivelBateria · valor inicial: 0
    int nivelBateria = 0; 
    // tipo: int · nombre: volumen · valor inicial: 0
    int volumen = 0;      

    // ===== CONSTRUCTOR =====
    // Mismo nombre que la clase, SIN tipo de retorno (ni void).
    // firma: AuricularesInalambricos(int, int) · sin tipo de retorno
    AuricularesInalambricos(int nivelBateria, int volumen) {
        this.nivelBateria = nivelBateria; // this.nivelBateria = ATRIBUTO · nivelBateria a secas = PARAMETRO
        this.volumen = volumen;           // this.volumen = ATRIBUTO · volumen a secas = PARAMETRO
    }

    // ===== METODOS =====
    // firma: ajustarVolumen(int) · retorno: void · parametro: int cambio
    public void ajustarVolumen(int cambio) {
        volumen = volumen + cambio;
    }

    // firma: obtenerDiagnostico() · retorno: String · parametro: ninguno
    public String obtenerDiagnostico() {
        return "Batería al " + nivelBateria + "% con volumen en " + volumen;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: AuricularesInalambricos");
        
        // 1: crea tu objeto y asigna lo que falte
        AuricularesInalambricos misAudifonos = new AuricularesInalambricos(100, 50);

        System.out.println("[estado inicial]"); 
        // 2: imprime cada atributo
        System.out.println("Batería: " + misAudifonos.nivelBateria);
        System.out.println("Volumen: " + misAudifonos.volumen);

        System.out.println("[invocando metodos]"); 
        // 3: firma + invocacion + resultado/efecto
        // firma: ajustarVolumen(int) -> subimos el volumen en 20
        misAudifonos.ajustarVolumen(20);
        System.out.println("Se ajustó el volumen.");
        
        // firma: obtenerDiagnostico() -> obtenemos el resumen
        String diagnostico = misAudifonos.obtenerDiagnostico();
        System.out.println("Resultado del diagnóstico: " + diagnostico);

        System.out.println("[estado final]"); 
        // 4: imprime atributos otra vez
        System.out.println("Batería: " + misAudifonos.nivelBateria);
        System.out.println("Volumen: " + misAudifonos.volumen);
    }
}