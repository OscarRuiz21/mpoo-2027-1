import java.util.Scanner;
/* Esta es la clase de celular, donde trabaje en dos clases una que me permite establecer los constructores y los metodos para que el programa compile.
En esta clase se busco conseguir un programa de un celular con dos metodos, el primero que pida una constraseña para poder desbloquear el celular.
Y como segundo metodo se busca que el celular al ser desbloqueado si el celular esta con un nivel de bateria menos al 20% de un mensaje de poner a cargar el celular. 
Para esto lo primero que hacemos es establecer la clase llamada Celular, y estableciendo los atributos, uno de tipo String para la contraseña y uno tipo int para indicar el nivel de bateria que tuviera el celular*/
public class Celular{
    String contraseña;
    int nivelBateria;
//Aqui se establece el constructor del celular con parametros ya establecidos, siendo que vamos a utilizar este constructor en los metodos siguientes.
    public Celular(String contraseña, int nivelBateria){
        this.contraseña = contraseña;
        this.nivelBateria = nivelBateria;
    }
    /*Aqui se establece el primer metodo que es para poder pedir una contraseña con ayuda de la herramienta escanner cuya biblioteca la importamos al principio de la clase.
    Ademas que usando varias lineas para imprimir mensajes que pidan la constraseña y nos digan si es correcta o si es erronea. 
    Cuando se pide la constraseña luego se pasa a una estructura de if donde es que se compara la contraseña ingresada con la contraseña correcta y que permite que se desbloquee o no el celular. */
    public boolean introduceConstraseña(){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Por favor, introduce tu constraseña para iniciar");
        String contraseñaIngresada = scanner.nextLine();

        if(this.contraseña.equals(contraseñaIngresada)){
            System.out.println("Acceso concedido");
            return true;
        } else{
            System.out.println("Acceso denegado");
            return false;
        }
    }
/* Una vez que se coloca la constraseña se pasa a lo que es metodo que nos indica si el celular tiene carga superior al 20% con otra estructura if que dependiendo el valor de bateria
nos puede imprimir un mensaje de cargar el celular o sin la necesidad de regresar algun mensaje*/
    public int consultarBateria(){
        System.out.println("El nivel de la bateria es:" + this.nivelBateria + "%");
        if (this.nivelBateria < 20){
            System.out.println("Advertencia, nivel de batería bajo. Favor de conectar el cargador");
        }
        return this.nivelBateria;
    } 
}