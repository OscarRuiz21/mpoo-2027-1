// CONTEXTO:  programa que simula un refresco que permite saber si esta frio, si sobra e irle tomando
// QUE SABE Y POR QUE:  sorbo(simular cuanto ml tomas), envase(conocer el tipo de envase),mlmax(saber el tamaño del refresco) mlact(saber el avance de como vas toamndo)fria(saber si esta o no fira)
// QUE SABE HACER Y POR QUE:tomar(recibe el numero de sorbos que vas a tomar, y no requiere regresar nada ).porcentaje(no recibe nada y rgresa el resultado de una operacion)sobra(no recibe parametros, y regresa un booleano que se regresa en pantalla),disfrutable(no recibe nada e igual regresa un valor booleano
// QUE IGNORE:  quizas si se comparte con alguien o el precio
public class CocaCola {

    // ===== ATRIBUTOS  =====
    int sorbo = 50;
    String envase = "lata"; //tipo string. nombre envase. valor lata
    int mililitrosmax = 355;// tipo int. nombre mililitrosmax. vaor 355
    int mililitrosact = 355;// tipo int nombre mililitrosact. valor 355
    boolean fria = true; // tipo boolean. nombre fria. valor true

    // ===== CONSTRUCTOR  =====
    CocaCola (String envase, int mililitrosmax,int mililitrosact){
        this.envase = envase;
        this.mililitrosmax = mililitrosmax;
        this.mililitrosact = mililitrosact;
    }

    // ===== METODOS  =====
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

        System.out.println("[estado inicial]");
        System.out.println("envase             = " + Micoca.envase);
        System.out.println("mililitrosmax  = " + Micoca.mililitrosmax);
        System.out.println("mililitrosact = " + Micoca.mililitrosact);
        System.out.println("fria           = " + Micoca.fria);
        System.out.println("[invocando metodos]");
        Micoca.tomar(3);
        System.out.println("tomar(3) -> mililitrosActuales = " + Micoca.mililitrosact);
        System.out.println("[estado final]");
        System.out.println("porcentaje() -> double: " + Micoca.porcentaje() + "%");
        System.out.println("mililitrosact = " + Micoca.mililitrosact);
        System.out.println("sobra()       -> boolean: " + Micoca.sobra());
        System.out.println("fria          = " + Micoca.fria);
        System.out.println("disfrutable()    -> boolean: " + Micoca.disfrutable());

    }
}