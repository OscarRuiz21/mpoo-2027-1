// CONTEXTO: (¿en que programa vive este objeto? programa que simula si una mascota esta feliz, tiene sueño y jugar con ella)
// QUE SABE Y POR QUE: (cada atributo, nombre(para saber como se llama), energia(para saber si puede jugar),felicidad(para que conforme juegas con ella aumente),dormido(para saber si puede o no jugar)
// QUE SABE HACER Y POR QUE: (cada metodo: por que void o por que retorna,
//                            jugar(recibe minutos que va a jugar, y no regresa nada porque no se requiere, despetar(no recibe nada y no regresa nada, no se requiere)feliz(no recibe parametros y regresa un booleano para mostrar en pantalla)
// QUE IGNORE: (1 o 2 cosas del objeto real que no modelaste, quizas si tiene hambre la mascota, y si tiene o no sed)
public class Mascota{   // TODO: renombra la clase Y el archivo (PascalCase)

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    // ej:  double saldo = 0;   // tipo: double · nombre: saldo · valor inicial: 0
    String nombre ="Sin nombre"; //tipo string. nombre nombre. valor sin nombre
    int energia = 100; //tipo int. nombre energia. valor 100
    int felicidad = 50; //tipo int. nombre felicidad. valor 50
    boolean dormido = false; // tipo boolean. nombre dormido. valor false.

    // ===== CONSTRUCTOR (obligatorio en UNA de tus tres clases) =====
    // Mismo nombre que la clase, SIN tipo de retorno (ni void).
    // Pon aqui los datos sin los que el objeto no tiene sentido; el resto dejalos con su valor inicial.
    // ej:  // firma: MiObjeto(double) · sin tipo de retorno
    //      MiObjeto(double saldo) {
    //          this.saldo = saldo;   // this.saldo = ATRIBUTO · saldo a secas = PARAMETRO
    //      }
    // OJO: si escribes este, new MiObjeto() deja de existir. O lo llamas con sus datos,
    //      o escribes tambien el constructor vacio: MiObjeto() { }
    Mascota(String nombre){
        this.nombre=nombre;
    }

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // ej:  // firma: retirar(double) · retorno: void · parametro: double monto
    // firma jugar(int). retorno void. parametro int minutos.
    void jugar(int minutos){
        if(!dormido){
            felicidad+=minutos*2;
            energia-=minutos;
            System.out.println(nombre + " Jugo");
        } else{
            System.out.println(nombre + "Esta dormido");
        }
    }

    //firma despertar(). retorno void. sin parametros
    void despertar(){
        dormido=false;
        System.out.println(nombre+ "desperto");
    }

    //
    boolean feliz(){
        return felicidad>80;
    }
    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: MiMascota");
        // 1: crea tu objeto (con new MiObjeto(...) si le pusiste constructor) y asigna lo que falte
        Mascota miMascota = new Mascota("Barbie");

        System.out.println("Estado Inicial");
        System.out.println("Nombre: " + miMascota.nombre);
        System.out.println("Energía: " + miMascota.energia);
        System.out.println("Felicidad: " + miMascota.felicidad);

        System.out.println("[invocando metodos]");// 3: firma + invocacion + resultado
        miMascota.jugar(20); // Juega 20 minutos

        System.out.println("[estado final]");      // 4: imprime atributos otra vez
        System.out.println("Energía restante: " + miMascota.energia);
        System.out.println("Felicidad actual: " + miMascota.felicidad);
        System.out.println("¿Esta  feliz?: " + miMascota.feliz());


    }
}