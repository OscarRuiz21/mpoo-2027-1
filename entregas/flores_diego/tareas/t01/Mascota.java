// CONTEXTO:  programa que simula si una mascota esta feliz, tiene sueño y jugar con ella)
// QUE SABE Y POR QUE:  nombre(para saber como se llama), energia(para saber si puede jugar),felicidad(para que conforme juegas con ella aumente),dormido(para saber si puede o no jugar)
// QUE SABE HACER Y POR QUE:  jugar(recibe minutos que va a jugar, y no regresa nada porque no se requiere, despetar(no recibe nada y no regresa nada, no se requiere)feliz(no recibe parametros y regresa un booleano para mostrar en pantalla)
// QUE IGNORE:  quizas si tiene hambre la mascota, y si tiene o no sed)
public class Mascota{

    // ===== ATRIBUTOS  =====
    String nombre ="Sin nombre"; //tipo string. nombre nombre. valor sin nombre
    int energia = 100; //tipo int. nombre energia. valor 100
    int felicidad = 50; //tipo int. nombre felicidad. valor 50
    boolean dormido = false; // tipo boolean. nombre dormido. valor false.

    // ===== CONSTRUCTOR  =====
    Mascota(String nombre){
        this.nombre=nombre;
    }

    // ===== METODOS  =====
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

    //firma feliz().return booleano, sin parametros
    boolean feliz(){
        return felicidad>80;
    }
    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: MiMascota");
        Mascota miMascota = new Mascota("Barbie");

        System.out.println("Estado Inicial");
        System.out.println("Nombre: " + miMascota.nombre);
        System.out.println("Energía: " + miMascota.energia);
        System.out.println("Felicidad: " + miMascota.felicidad);

        System.out.println("[invocando metodos]");
        miMascota.jugar(20);

        System.out.println("[estado final]");
        System.out.println("Energía restante: " + miMascota.energia);
        System.out.println("Felicidad actual: " + miMascota.felicidad);
        System.out.println("¿Esta  feliz?: " + miMascota.feliz());


    }
}