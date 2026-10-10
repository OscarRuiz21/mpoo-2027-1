1. ¿Qué es un atributo? ¿En qué se diferencia de una variable cualquiera? Pon un ejemplo de cada uno sacado de tu tarea.
un atributo esta permanentemente porque esta declarado en la clase y se guarda en la memoria, mientras que una varible es temporral, dentro de mi tarea ocupé double contML = 50.0 en ProtectorSolar.java, este es mi atributo, una variable en mi codigo del protector solar pues es double mlUsados en el parametro del metodo reaplicar(double mlUsados)



2 ¿Qué es un constructor, en qué momento exacto se ejecuta y cuántas veces? Pega el tuyo y di qué habría pasado con ese objeto si no lo hubieras escrito.
un constructor es un bloque de codigo especial con el nombre de la clase y sin retorno, este inicializa los atributos del objeto con los datos necesarios para que si ejecute bien. El constructor se ejecuta una sola vez en la vida del objeto, solo cuando se usa la palabra new, esto porque si no se pone java asigna valores nulos o ceros sin pedir los datos obligatorios al crearlo. El constructor que yo use fue 
```java
CodigoComida(String folioCodigo, double promedio, int materiasReprobadas) {
    this.folioCodigo = folioCodigo;
    this.promedio = promedio;
    this.materiasReprobadas = materiasReprobadas;
}



3 ¿Para qué sirve this adentro de un constructor? ¿Qué pasa si se te olvida: truena, o pasa algo peor? this es un puntero que nos sirve para saber que estamos hablando del objeto. Es para ubicarse bien porque hay veces en donde los nombres son iguales que los atributos. Por ejemplo, dentro del codigo de comida si pongo this.promedio=promedio le asigno el valor del parametro promedio al atributo this.promedio del objeto. Si le pongo promedio=promedio el parametro se asigna a él mismo y pues se queda con su valor por defecto 



4 ¿Qué es la firma de un método? Escribe la firma de dos métodos tuyos, tal como se escriben. La firma de un metodo es la identidad que tiene una funcion dentro de java para que la computadora sepa de quien hablas, esta ocupa el nombre del metodo y los tipos de datos de sus parámetros. No incluye el tipo de retorno (void, int...) ni el nombre de las variables de los parametros, solo su tipo de datos. Por ejemplos:
- void reaplicar(double mlUsados)
aquí el nombre de la función es reaplicar y su parámetroi es de tipo double, la firma seria reaplicar(double) lo demás ya no entraría
- void usarLightstick(int horaUso)
el nombre del metodo es usarLightstick y su parametro es int, entonces la firma seria usarLightstick(int)



5 Parámetro y argumento: ¿cuál es cuál? Pon una línea de tu código donde se vea el parámetro y otra donde se vea el argumento.
el parametro es la variable termporal dentro de la firma, no tiene un valor real y solo recibe datos cuando alguien use la funcion 
- void usarLightstick(int horasUso) // horasUso de tipo int es el parametro
El argumento es el valor especifico que le mandas al metodo cuando lo mandas a llamar al main
item.usarLightstick(5); // El 5 es el argumento



6 ¿Qué significa que un método sea void? Viendo tu propio código: ¿cómo decidiste cuál era void y cuál tenía que retornar? void se usa cuando no te devuelve nada y no se ocupa return, cuando usamos los metodos de retorno es porque entregan una respuesta entonces si se tiene que especificar que tipo de dato es la respuesta y necesitas un return



7 ¿Qué es un tipo primitivo y en qué se diferencia de una referencia? ¿Por qué un int nunca puede valer null y un String sí?
los tipos primitivos son int, double, boolean y char, estos guardan un valor numerico, los tipos de referencia no guardan el contenido directamente en la casilla de la varibale, lo hacen en una direccion de memoria que indica en donde vive el objeto real. 
null significa ausencia de direccion y como las varibales por referencia guardan direcciones de memoria si pueden ser null si no apuntan a un objeto, los tipos primitivos no usan direccionies entonces no pueden ser null, pasa directo a ser cero


8 ¿Por qué en Java 7 / 2 da 3 y no 3.5? ¿Qué es lo mínimo que cambiarías para que diera 3.5?
es porque son enteros y java lo que hace es truncar el resultado quedandose con el numero entero, aunque sea 3.99 queda como 3 porque es el unico entero, no redondea. si quieres decimales debes de poner double



9 ¿Qué hace un casting como (int) y qué se pierde al hacerlo? Pega la línea de tu tarea donde lo usaste y di qué se perdió ahí.
el casting explicito es una instruccioin forzada que escribes manualmente, en el codigo se escribe entre parentesis poniendo el tipo que quieres invertir justo antes del dato. por ejemplo, si tienes un mumero decimal y lo quieres entero pues pones (int)variable pero cuando haces un casting de decimal a entero, java elimina la parte decimal sin redondear, dejando solo al numero entero



10 ¿Qué hace new? ¿Cuál es la diferencia entre la clase y una instancia, dicha con uno de tus tres objetos
el operador new le solicita al sistema que reserve espacio numero en la memoria ram para contruir un objeto. por ejemplos, la clase CodigoComida representa el molde o plantilla abstracta donde se definen los atributos y metodos que tendran los objetos, mientras que la instancia (vale) es el objeto concreto que ya fue construido en la memoria con sus valores reales asignados 
CodigoComida vale = new CodigoComida("BECA-UNAM-892", 6.8, 1);