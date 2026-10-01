// CONTEXTO: App para gestionar almacenamiento y batería durante sesiones de fotografía urbana.
// QUE SABE Y POR QUE: ubicacion (texto para las etiquetas de las fotos), fotosTomadas (espacio usado), 
//                     bateria (porcentaje de energía).
// QUE SABE HACER Y POR QUE: dispararRafaga(int) es void porque cambia los valores internos de memoria y energía;
//                           necesitaAtencion() retorna boolean para saber si hay que cargarla o vaciar memoria.
// QUE IGNORE: El ISO, la velocidad de obturación y el enfoque, porque el programa solo gestiona recursos físicos.
public class CamaraFotografica {

    // ===== CONSTANTE (Punto extra de la tarea) =====
    static final int MEMORIA_TOTAL = 1000;      // tipo: int · constante inmutable en MAYUSCULAS

    // ===== ATRIBUTOS =====
    String ubicacion = "Alameda Central";       // tipo: String  · objeto, no primitivo
    int fotosTomadas = 0;                       // tipo: int     · valor inicial: 0
    double bateria = 100.0;                     // tipo: double  · valor inicial: 100.0

    // ===== METODOS =====
    // firma: dispararRafaga(int) · retorno: void · parametro: int cantidad
    void dispararRafaga(int cantidad) {
        fotosTomadas = fotosTomadas + cantidad;            // operador aritmético +
        bateria = bateria - (cantidad * 0.15);             // operador aritmético *
    }

    // firma: necesitaAtencion() · retorno: boolean · sin parametros
    boolean necesitaAtencion() {
        return fotosTomadas >= MEMORIA_TOTAL || bateria <= 10.0; // operadores relacionales >=, <= y lógico ||
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: CamaraFotografica");
        CamaraFotografica camara = new CamaraFotografica();

        System.out.println("[estado inicial]");
        System.out.println("ubicacion    = " + camara.ubicacion);
        System.out.println("fotosTomadas = " + camara.fotosTomadas);
        System.out.println("bateria      = " + camara.bateria);

        System.out.println("\n[invocando metodos]");
        camara.dispararRafaga(30);
        System.out.println("dispararRafaga(int) -> void; fotosTomadas = " + camara.fotosTomadas + ", bateria = " + camara.bateria);
        System.out.println("necesitaAtencion() -> boolean; " + camara.necesitaAtencion());

        int bateriaEntera = (int) camara.bateria;          // casting explícito (de double a int)
        System.out.println("casting (int) a la bateria = " + bateriaEntera);
    }
}