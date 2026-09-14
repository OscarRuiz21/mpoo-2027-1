// CONTEXTO: (¿en que programa vive este objeto? programa que simula un refresco que permite saber si esta frio, si sobra e irle tomando)
// QUE SABE Y POR QUE: (cada atributo. sorbo(simular cuanto ml tomas), envase(conocer el tipo de envase),mlmax(saber el tamaño del refresco) mlact(saber el avance de como vas toamndo)fria(saber si esta o no fira)
// QUE SABE HACER Y POR QUE: (cada metodo: por que void o por que retorna,
//                            tomar(recibe el numero de sorbos que vas a tomar, y no requiere regresar nada ).porcentaje(no recibe nada y rgresa el resultado de una operacion)sobra(no recibe parametros, y regresa un booleano que se regresa en pantalla),disfrutable(no recibe nada e igual regresa un valor booleano
// QUE IGNORE: (1 o 2 cosas del objeto real que no modelaste, quizas si se comparte con alguien o algo asi)
public class CocaCola {   // TODO: renombra la clase Y el archivo (PascalCase)

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    // ej:  double saldo = 0;   // tipo: double · nombre: saldo · valor inicial: 0
    int sorbo = 50;
    String envase = "lata"; //tipo string. nombre envase. valor lata
    int mililitrosmax = 355;// tipo int. nombre mililitrosmax. vaor 355
    int mililitrosact = 355;// tipo int nombre mililitrosact. valor 355
    boolean fria = true; // tipo boolean. nombre fria. valor true

    // ===== CONSTRUCTOR (obligatorio en UNA de tus tres clases) =====
    // Mismo nombre que la clase, SIN tipo de retorno (ni void).
    // Pon aqui los datos sin los que el objeto no tiene sentido; el resto dejalos con su valor inicial.
    // ej:  // firma: MiObjeto(double) · sin tipo de retorno
    //      MiObjeto(double saldo) {
    //          this.saldo = saldo;   // this.saldo = ATRIBUTO · saldo a secas = PARAMETRO
    //      }
    // OJO: si escribes este, new MiObjeto() deja de existir. O lo llamas con sus datos,
    //      o escribes tambien el constructor vacio: MiObjeto() { }
    CocaCola (String envase, int mililitrosmax,int mililitrosact){
        this.envase = envase;
        this.mililitrosmax = mililitrosmax;
        this.mililitrosact = mililitrosact;
    }

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // ej:  // firma: retirar(double) · retorno: void · parametro: double monto
    // tomar(int). retorno void. parametro int sorbos
    void tomar(int sorbos){
        mililitrosact-= (sorbos* sorbo);
        if (mililitrosact <0){
            mililitrosact = 0;
        }
    }

    //porcentaje(). retorno double. sin parametros
    double porcentaje(){
        return((double)mililitrosact/mililitrosmax)*100;
    }

    //sobra(). retorno boolean. sin parametros.
    boolean sobra(){
        return mililitrosact > 0;
    }

    //disfrutable(). retorno boolean. sin parametros.
    boolean disfrutable(){
        return fria && mililitrosact > 0;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: CocaCola");
        CocaCola Micoca = new CocaCola("Botella de Vidrio", 500,500);

        System.out.println("[estado inicial]");    // 2: imprime cada atributo
        System.out.println("envase             = " + Micoca.envase);
        System.out.println("mililitrosmax  = " + Micoca.mililitrosmax);
        System.out.println("mililitrosact = " + Micoca.mililitrosact);
        System.out.println("fria           = " + Micoca.fria);
        System.out.println("[invocando metodos]"); // 3: firma + invocacion + resultado
        Micoca.tomar(3);
        System.out.println("tomar(3) -> mililitrosActuales = " + Micoca.mililitrosact);
        System.out.println("[estado final]");      // 4: imprime atributos otra vez
        System.out.println("porcentaje() -> double: " + Micoca.porcentaje() + "%");
        System.out.println("mililitrosact = " + Micoca.mililitrosact);
        System.out.println("sobra()       -> boolean: " + Micoca.sobra());
        System.out.println("fria          = " + Micoca.fria);
        System.out.println("disfrutable()    -> boolean: " + Micoca.disfrutable());

    }
}