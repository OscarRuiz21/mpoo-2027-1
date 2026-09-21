import java.util.Scanner;
/**Para la clase de la impresora lo que se busca es primero desplegar un pequeño menu donde se le de la opcion de elegir si se desea imprimir o escanear
para eso importando la biblioteca que nos da la funcion de escaner para que nos permita leer las respuestas del usuario.
Primeramente estableciendo los atributos de la clase siendo que ocupamos dos uno llamado modelo que nos va a poder permitir referirnos a la impresora.
y otro llamado scanner que nos va a permitir usar las respuestas del usuario para poder emplearlas en el resto de la resolución del problema.
 */
public class Impresora{
    String modelo;
    Scanner scanner;
//Aqui se desarrollo el constructor con un parametro para poder introducirle el dato de que tipo de impresora.
    public Impresora(String modelo){
        this.modelo = modelo;
        this.scanner = new Scanner(System.in);
    }
    /*Aqui es donde vamos a dezplegar el menu donde utilizamos una estructura de switch para poder colocar las opciones siendo imprimir y escanear
    ademas de una opcion default que va a regresar al intento si se introduce una opcion que no esta establecida.
    Ademas que se hace uso de una estructura if para que la opcion que se pueda ver si la opcion que se introduzca sea igual a alguna de las opciones que se ofrecen para la impresion o para el escaneo
    */
    public void menu(){
        int opcion = 0;
        System.out.println("Escoge la opción que desees usar");
        System.out.println("1- Imprimir");
        System.out.println("2- Escanear");
        if (scanner.hasNextInt()){
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    imprimir();
                    break;
                case 2:
                    escanear();
                    break;
                default:
                    System.out.println("Opcion invalida. Intentalo de nuevo");
            }
        } else {
            System.out.println("Opcion invalida. Intentalo de nuevo");
            scanner.nextLine();
        } while (opcion != 2);
    }
/*Aqui es donde colocamos el 1er metodo que es el de imprimir, que aunque no se tiene conexión con alguna impresora se busca recrear el proceso de imprimir
donde haciendo usos de estructuras de if se logra el poner la cantidad de copias que se buscan imprimir con la condicion de que el numero solicitado sea un numero entero, si esta condición no se cumple entonces el
programa no seguira con la ejecución y volvera al punto de partida. Si la condicion se cumple entonces el programa imprimira una serie de mensajes que copias listas en base al numero de copias que se han solicitado.*/
    public void imprimir(){
        System.out.println("¿Cuantas copias se desea imprimir?");
        if (scanner.hasNextInt()){
            int copias = scanner.nextInt();
            scanner.nextLine();
            if (copias > 0){
                System.out.println("Imprimiendo " + copias + " copia(s)");
                for(int i=1; i <= copias; i++){
                    System.out.println(" -> Copia " + i + " lista.");
                }
                System.out.println("Impresión finalizada correctamente");
            } else {
                System.out.println("Error, pruebe ingresando corractamente la cantidad de copias que desee");
            }
        } else {
            System.out.println("Opción invalida, ingrese un numero entero de copias");
            scanner.nextLine();
        }
    }
    /*El metodo de escanear es un metodo sencillo donde al usuario solo se le pide que inserte un nombre del documento que busca escanear, ya que sera el nombre con el que se guardara el archivo
    se establecen una estructura if para que se verifique que el nombre se ha escrito y pueda seguir con el proceso de escaneo. Donde una vez verificado que el documento ya cuenta con un nombre entonces se imprime una serie de mensajes
    que hacen el efecto de que el documento esta en proceso de ser escaneado y cuando termine suelte un ultimo mensaje de que el documento ha sido escaneado correctamente.*/
    public void escanear(){
        System.out.println("Ingrese el nombre del documentos a escanear: ");
        String nombreDoc = scanner.nextLine();
        if (!nombreDoc.trim().isEmpty()){
            System.out.println("Escaneando documento " + nombreDoc + "...");
            System.out.println("Procesando la imagen, espere");
            System.out.println("El documento " + nombreDoc + " ha sido escaneado correctamente");
        } else {
            System.out.println("Debe introducir un nombre para poder escanear el documentos");
        }
    }
    /*Aquí esta el metodo main que le permite correr al programa que manda a llamar los anteriores metodos ya con datos establecidos como lo es el modelo 
    ademas que se manda a llamar el metodo que abre el menu para poder dar paso a lo que son las opciones de imprimir o escanear. */
    public static void main(String[] args){
        Impresora miImpresora = new Impresora("HP SmartPrint 300");
        miImpresora.menu();
    }
}