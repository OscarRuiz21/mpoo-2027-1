// CONTEXTO: Modulo de control integrado en el firmware de una lavadora inteligente del hogar.
// QUE SABE Y POR QUE: capacidadKg (double, peso maximo de ropa soportado), nivelAguaLitros (int, volumen cargado en la tina), enCentrifugado (boolean, estado de ejecucion del motor), ciclosRestantes (int, conteo regresivo de etapas), modelo (String, identificador comercial).
// QUE SABE HACER Y POR QUE: consumirAgua(int) es void porque descuenta agua y ciclos; estaListaParaCentrifugar() retorna boolean para autorizar el motor de alta velocidad.
// QUE IGNORE: La marca del detergente o el color de las prendas introducidas, ya que no afectan los sensores de peso ni de volumen de agua.
public class Lavadora {

    // CONSTANTE 
    public static final int CAPACIDAD_MAXIMA_LITROS = 80; // constante static final

    //  ATRIBUTOS
    String modelo = "Lavadora mamalostrofica";  // tipo: String  · modelo del aparato
    double capacidadKg = 15.5;        // tipo: double  · capacidad nominal
    int nivelAguaLitros = 50;         // tipo: int     · volumen actual de agua
    boolean enCentrifugado = false;   // tipo: boolean · estado del motor
    int ciclosRestantes = 3;          // tipo: int     · numero de ciclos (lavado, enjuague, exprimir)

    //  METODOS 
    // firma: consumirAgua(int) · retorno: void · parametro: int litros
    public void consumirAgua(int litros) {
        this.nivelAguaLitros = this.nivelAguaLitros - litros; // operador - (aritmetico)
        this.ciclosRestantes--;                               // operador -- (abreviado/contador)
    }

    // firma: estaListaParaCentrifugar() · retorno: boolean · sin parametros
    public boolean estaListaParaCentrifugar() {
        // operadores >, !, || (relacional y logicos)
        return (this.nivelAguaLitros > 10) || (!this.enCentrifugado);
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Lavadora");

        Lavadora l = new Lavadora();

        System.out.println("[estado inicial]");
        System.out.println("modelo           = " + l.modelo);
        System.out.println("capacidadKg      = " + l.capacidadKg);
        System.out.println("nivelAguaLitros  = " + l.nivelAguaLitros);
        System.out.println("enCentrifugado   = " + l.enCentrifugado);
        System.out.println("ciclosRestantes  = " + l.ciclosRestantes);

        System.out.println("[invocando metodos]");
        l.consumirAgua(15);
        System.out.println("consumirAgua(15) -> void; nivelAguaLitros = " + l.nivelAguaLitros + " | ciclosRestantes = " + l.ciclosRestantes);

        System.out.println("estaListaParaCentrifugar() -> boolean; " + l.estaListaParaCentrifugar());

        System.out.println("[estado final]");
        System.out.println("nivelAguaLitros = " + l.nivelAguaLitros + " | ciclosRestantes = " + l.ciclosRestantes);
    }
}