**#1 ¿Qué es un atributo?¿En que se diferencia de una variable cualquiera?**

Un atributo es una característica de un objeto que se abstrae y se diferencia de una variable ya que las variables son solo la manera lógica de representar a los atributos.

* String constraseña
* String modelo
* boolean Abierta 



**#2 ¿Qué es un constructor, en que momento exacto se ejecuta y cuantas veces?**

Un constructor es una plantilla que nos permite la creación de objetos, se ejecuta en el momento en el que el programa cree el objeto al momento de la compilación, y solo se creara un objeto siempre que se utilice la palabra new.

&#x20;public Paraguas(){

&#x20;       this.Abierta = false;

&#x20;       this.random = new Random();

&#x20;   }

**#3 ¿Para que sirve this adentro de un constructor?¿Que pasa si se te olvida: truena o algo peor?**

El this sirve para referirse a los datos locales de ese constructor en lugar de tomar los datos de los atributos globales, si estos no estuvieran el programa no podría compilarse ya que los datos tomados seria los globales cuyos datos no se establecen al pertenecer a todo el código.



**#4 ¿Qué es la firma de un método?**

La firma de un método es la estructura por la cual se reconoce a un método, teniendo su nombre y los tipos y el orden de sus parámetros.



&#x20;**#5 Parámetro y argumento ¿Cuál es cual?**

* Los parámetros son los espacios definidos en la firma del método que esperan recibir un valor.
* Y los argumentos son los datos en concretos que se envían al llamar los métodos.

Parametro ->  public Celular(String contraseña, int nivelBateria)

Argumento ->  Celular miCelular = new Celular("MPOO", 17)



**#6 ¿Qué significa que un método sea void?** 

El que un método sea void quiere decir que este método va a regresar un valor ya sea vacio o con datos.

&#x20; public void cerrar(){

&#x20;       if (!Abierta){

&#x20;           System.out.println("La sombrilla ya esta cerrada");

&#x20;       } else {

&#x20;           this.Abierta = false;

&#x20;           System.out.println("Cerrando la sombrilla, espere...");

&#x20;           System.out.println("Sombrilla cerrada");

&#x20;       }

&#x20;   }

Por ejemplo aquí se estableció que este código tiene un void ya que al ejecutarlo este método tiene que regresar una respuesta e imprimirla.



**#7 ¿Qué es un tipo primitivo y en que se diferencia de una referencia?¿Porque un int nunca puede valer null pero un String si?**

Un dato de tipo primitivo almacena directamente el valor concreto en la memoria, mientras que un valor de referencia almacena la dirección de memoria que dirige hacia un objeto complejo.

La razón por la que un int no puede regresar un valor null es porque precisamente tiene que valer un numero entero, donde null no es un numero entero y por lo cual no es de acuerdo a el tipo de dato de int, mientras que usando un string es un tipo de dato de cadena por lo que null no infrige su tipo de dato.



**#8 ¿Por qué en Java 7/2 da 3 y no 3.5?¡Que es lo que se cambiaria?**

Esto no sucede debido a que ambos datos son de tipos int y solo regresara datos de tipo int, si quisiéramos cambiar eso deberíamos cambiar un dato a tipo doublé ya sea de la forma 7.0/2 ó 7/2.0.



**#9 ¿Qué hace un casting como (int) y que se pierde al hacerlo?**

El casting lo que hace es cambias los tipos de datos de uno a otro.



**#10 ¿Qué hace new?¿Cual es la diferencia entre una clase y una instancia?**

Lo que hace new crear un objeto haciendo uso del constructo que ya habíamos creado. 

Una clase es el espacio donde todos los objetos interactúan y se mandan mensajes entre sí para la resolución del problema.

