// CONTEXTO? Software de configuracion de perifericos para llevar estadisticas de uso y control de perfiles.
// QUE SABE Y POR QUE? teclasPresionadas (estadistica de desgaste), luzEncendida (estado visual), perfil (letra del perfil de macros actual).
// QUE SABE HACER Y POR QUE? presionar() es void porque solo cuenta una interaccion; esPerfilGaming() retorna boolean para saber si aplicar macros.
// QUE IGNORE? el tipo de switches (mecanicos/membrana) y el idioma, porque el programa solo cuenta pulsaciones y controla estados.

public class Teclado {

    //  ATRIBUTOS (etiqueta cada parte) 
    int teclasPresionadas = 0;   // tipo: int · nombre: teclasPresionadas · valor inicial: 0
    boolean luzEncendida = true; // tipo: boolean · nombre: luzEncendida · valor inicial: true
    char perfil = 'A';           // tipo: char · nombre: perfil · valor inicial: 'A'

    //  CONSTRUCTOR (obligatorio en UNA de tus tres clases) 
    // firma: Teclado(char) · sin tipo de retorno
    public Teclado(char perfil) {
        this.perfil = perfil; // this.perfil = ATRIBUTO · perfil = PARAMETRO
    }

    //  METODOS (etiqueta cada parte y su firma) 
    // firma: presionar() · retorno: void · sin parametros
    public void presionar() {
        teclasPresionadas++; // operador contador 
    }

    // firma: esPerfilGaming() · retorno: boolean · sin parametros
    public boolean esPerfilGaming() {
        return perfil == 'G' && luzEncendida; // operadores relacionales y logicos
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Teclado");
        Teclado t = new Teclado('G'); // usa el constructor con datos

        System.out.println("estado inicial");
        System.out.println("teclasPresionadas = " + t.teclasPresionadas);
        System.out.println("luzEncendida = " + t.luzEncendida);
        System.out.println("perfil = " + t.perfil);

        System.out.println("invocando metodos");
        t.presionar();
        t.presionar();
        System.out.println("presionar() x2 -> void; teclasPresionadas = " + t.teclasPresionadas);
        System.out.println("esPerfilGaming() -> boolean; " + t.esPerfilGaming());

        System.out.println("estado final");
        System.out.println("teclasPresionadas = " + t.teclasPresionadas + " | esPerfilGaming = " + t.esPerfilGaming());
    }
}