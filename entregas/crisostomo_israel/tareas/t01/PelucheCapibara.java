 // CONTEXTO: Inventario de mi cuarto para saber el estado de mis peluches y cuándo darles mantenimiento.
// QUE SABE Y POR QUE: nivelSuavidad (para saber qué tan cómodo es), diasSinLavar (para agendar su limpieza),
//                     tieneSombrerito (porque es un accesorio clave que lo hace especial).
// QUE SABE HACER Y POR QUE: abrazar(double) es void porque altera físicamente la suavidad del peluche;
//                           tocaLavado() retorna boolean para que el sistema decida si ya debo lavarlo.
// QUE IGNORE: La marca y el precio que costó, porque ya es mío y solo me importa su estado físico actual.
public class PelucheCapibara {

    // ===== ATRIBUTOS =====
    double nivelSuavidad = 100.0;  
    int diasSinLavar = 0;          
    boolean tieneSombrerito = true;

    // ===== METODOS =====
    void abrazar(double fuerza) {
        diasSinLavar++;                           // operador contador ++
        nivelSuavidad = nivelSuavidad - fuerza;   // reduce la suavidad temporalmente
    }

    // firma: lavar(int) 
    void lavar(int extraSuavizante) {
        nivelSuavidad = nivelSuavidad + extraSuavizante; // operador +
        diasSinLavar = 0;
    }

    // firma: tocaLavado() 
    boolean tocaLavado() {
        return diasSinLavar % 15 == 0 || nivelSuavidad == 0.0; // operadores %, == y || (OR)
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: PelucheCapibara");
        
        PelucheCapibara miCapibara = new PelucheCapibara();

        System.out.println("[estado inicial]");
        System.out.println("nivelSuavidad   = " + miCapibara.nivelSuavidad);
        System.out.println("diasSinLavar    = " + miCapibara.diasSinLavar);
        System.out.println("tieneSombrerito = " + miCapibara.tieneSombrerito);

        System.out.println("[invocando metodos]");
        miCapibara.abrazar(15.5);
        miCapibara.abrazar(10.0);
        System.out.println("abrazar(double) -> void; diasSinLavar = " + miCapibara.diasSinLavar);
        System.out.println("tocaLavado() -> boolean; " + miCapibara.tocaLavado());
        miCapibara.lavar(20);
        System.out.println("lavar(int) -> void; nivelSuavidad = " + miCapibara.nivelSuavidad);

        System.out.println("[estado final]");
        System.out.println("nivelSuavidad = " + miCapibara.nivelSuavidad + " | diasSinLavar = " + miCapibara.diasSinLavar);
    }
}