// CONTEXTO: Es una app para administrar los codigos de la beca nutricional de la UNAM
// QUE SABE Y POR QUE: folioCodigo (para identificar el boleto digital), promedio (saber el promedio actual), materiasReprobadas (estado de irregular), usadoHoy (un uso por dia)
// QUE SABE HACER Y POR QUE: esElegibleBeca() retorna boolean porque responde true o false si cumple el requisito de promedio <= 7 o si debe materias; canjearComida(double) es void porque solo marca la comida como usada en el sistema
// QUE IGNORE: el menu de la cafeteria porque no aporta info

public class CodigoComida {

    // ===== CONSTANTE =====
    static final double PROMEDIO_MAXIMO_BECA = 7.0; 

    // ===== ATRIBUTOS (Variables permanentes del objeto) =====
    String folioCodigo;                 // tipo: String · nombre: folioCodigo · valor inicial por defecto: null
    double promedio;                    // tipo: double · nombre: promedio · valor inicial por defecto: 0.0
    int materiasReprobadas;             // tipo: int · nombre: materiasReprobadas · valor inicial por defecto: 0
    boolean usadoHoy = false;           // tipo: boolean · nombre: usadoHoy · valor inicial explicitado: false

    // ===== CONSTRUCTOR =====
    // firma: CodigoComida(String, double, int) · sin tipo de retorno
    CodigoComida(String folioCodigo, double promedio, int materiasReprobadas) {
        this.folioCodigo = folioCodigo;                 // this.folioCodigo es el ATRIBUTO · folioCodigo sin this es el PARAMETRO
        this.promedio = promedio;                       // this.promedio es el ATRIBUTO · promedio sin this es el PARAMETRO
        this.materiasReprobadas = materiasReprobadas;   // asignamos el dato del parametro directo al atributo
    }

    // ===== METODOS (que sabe hacer? funcioness) =====

    // firma: esElegibleBeca() · retorno: boolean · sin parametros
    boolean esElegibleBeca() {
        return promedio <= PROMEDIO_MAXIMO_BECA || materiasReprobadas > 0;
    }

    // firma: canjearComida(double) · retorno: void · parametro: double valorMenu
    void canjearComida(double valorMenu) {
        usadoHoy = true;
    }

    // firma: esRegular() · retorno: boolean · sin parametros
    boolean esRegular() {
        return materiasReprobadas == 0 && promedio > PROMEDIO_MAXIMO_BECA;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: CodigoComida");
        
        // 1: creamos el objeto con sus datos iniciales (promedio de 6.8 y 1 materia reprobada)
        CodigoComida vale = new CodigoComida("BECA-UNAM-892", 6.8, 1);

        // 2: imprimimos como inicia el objeto
        System.out.println("[estado inicial]");
        System.out.println("folioCodigo = " + vale.folioCodigo);
        System.out.println("promedio = " + vale.promedio);
        System.out.println("materiasReprobadas = " + vale.materiasReprobadas);
        System.out.println("usadoHoy = " + vale.usadoHoy);

        // 3: llamamos a las funciones y mostramos firmas y resultados
        System.out.println("\n[invocando metodos]");
        System.out.println("esElegibleBeca() -> boolean; " + vale.esElegibleBeca());
        System.out.println("esRegular() -> boolean; " + vale.esRegular());
        
        vale.canjearComida(65.0); // Canjeamos un menu de $65
        System.out.println("canjearComida(double) -> void; usadoHoy = " + vale.usadoHoy);

        // 4: imprimimos como quedo el objeto al final
        System.out.println("\n[estado final]");
        System.out.println("usadoHoy = " + vale.usadoHoy);
    }
}