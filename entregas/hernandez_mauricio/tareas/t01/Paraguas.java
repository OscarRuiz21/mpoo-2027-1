/*La clase del Paraguas abstrae un paraguas donde se busca el poder determinar si un paraguas se abre, se cierra o si se queda atascado al abrir.
Para eso importamos la biblioteca Random para que el atascamiento sea al azar sin que el usuario lo espere.
Por lo que primeramente se establecen los atributos, hablando primeramente del atributo boolean Abierta que es el qua nos da paso para abrir la sombrilla.
Y tambien definiendo al atributo random que va a ser el que establezca si la sombrilla se atasca en el proceso o si no. */
import java.util.Random;
public class Paraguas{
    boolean Abierta;
    Random random;
//Aqui se establece el constructor paraguas que se utilizara en el metodo main para dar paso a compilar el programa
    public Paraguas(){
        this.Abierta = false;
        this.random = new Random();
    }
    /*El metodo abrir es el metodo que va a permitir abrir, cerrar o ver si la sombrilla se atasca. Haciendo uso de estructuras if podemos determinar si la sombrilla se abre, pero 
    ademas tiene integrado la opcion de que el paraguas no se abrar e imprima un mensaje de que la sombrilla se ha estancado y con eso deteniendo el programa.*/ 
    public void abrir(){
        if (Abierta){
            System.out.println("La sombrilla esta abierta.");
            return;
        }
        System.out.println("Intentando abrir la sombrilla");
        int probabilidad = random.nextInt(100);
        if (probabilidad < 40){
            System.out.println("OH NO, la sombrilla se ha atascado, intentelo de nuevo");
        } else {
            this.Abierta = true;
            System.out.println("Genial, la sombrilla se ha abierto");
        }
    }
    /*Este es el metodo para cerrar la sombrilla donde si la sombrilla esta abierta este sera el metodo que le siga marcando la pauta para cerrarla y finalizar el programa */
    public void cerrar(){
        if (!Abierta){
            System.out.println("La sombrilla ya esta cerrada");
        } else {
            this.Abierta = false;
            System.out.println("Cerrando la sombrilla, espere...");
            System.out.println("Sombrilla cerrada");
        }
    }
    public boolean isAbierta(){
            return Abierta;
        }
    /**Este es el metodo main que le dara el inicio a el programa y que marcara 3 pruebas distintas para ver si el programa en alguna de estas pruebas se atasca la sombrilla
     *Donde en cada prueba se manda a llamar al constructor y al metodo de abrir. 
     */
    public static void main(String[] args) {
        Paraguas miParaguas = new Paraguas();


        System.out.println("=== PRUEBA 1 ===");
        miParaguas.abrir();

        // Si logró abrirse, la cerramos para probar de nuevo
        if (miParaguas.isAbierta()) {
            miParaguas.cerrar();
        }

        System.out.println("\n=== PRUEBA 2 ===");
        miParaguas.abrir();

        if (miParaguas.isAbierta()) {
            miParaguas.cerrar();
        }

        System.out.println("\n=== PRUEBA 3 ===");
        miParaguas.abrir();
    }
}