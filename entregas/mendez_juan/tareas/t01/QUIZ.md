#QUIZ T01 MENDEZREYES JUANDIEGO

Reglas: con tus palabras (copiar la slide o internet vale 0), maximo 3 renglones por respuesta, y donde diga "de tu tarea" pega la linea real de tu codigo.

1. Atributo contra variable
el atributo es lo que el objeto recuerda siempre, tipo cuántos focos hay prendidos, la variable solo existe mientras corres el método, luego se borra. En mi Casa `focosEncendidos` es atributo porque la casa recuerda cuantos focos tiene prendidos, pero `n` en `encenderFocos(int n)` es una variable temporal que desaparece al terminar el metodo.

2. Constructor: que es, cuando corre, cuantas veces
es lo primero que corre cuando pones new. Le pones los datos al objeto cuando nace, si no lo pones, se crea con lo que trae por defecto.

Casa(int cuartos) {
    this.cuartos = cuartos;
}

Sin el constructor, ese objeto habria nacido con: los valores por defecto definidos en la clase (3 cuartos) sin dejarme especificar que esta casa en particular tenia 4 cuartos al momento de crearla.

3. Para que sirve this
Sirve para decirle a java cual es el atributo del objeto y cual es el parametro cuando se llaman exactamente igual, si se me olvida poner this y escribo cuartos = cuartos, el parametro se asigna a si mismo y el atributo del objeto no recibe nada.

4. La firma de un metodo
Es el nombre del metodo junto con los tipos de datos que recibe como parametros.
Mis dos firmas:

encenderFocos(int)

esEficiente()

5. Parametro y argumento
El parametro es la variable que pongo cuando declaro el metodo para recibir un dato, el argumento es el valor real que le paso al llamarlo en el main.
Parametro, en mi codigo:
void encenderFocos(int n)

Argumento, en mi codigo:
c.encenderFocos(5);

6. Que significa void
Significa que el metodo solo hace una accion sobre el objeto pero no regresa ningun dato al finalizar. comer(int n) es void porque solo descuenta rebanadas internamente. esEficiente() si regresa boolean porque la app necesita esa respuesta para saber si avisa o no

7. Primitivo contra referencia, y el null
El primitivo guarda un numero o valor directo en memoria, mientras que la referencia guarda la direccion de memoria donde vive un objeto, un int no puede valer null porque siempre tiene un espacio binario apartado para un numero, mientras que un String si puede valer null si no apunta a ninguna parte

8. Por que 7 / 2 da 3
Da 3 porque como los dos son enteros (int), Java hace una division entera y tira los decimales sin redondear. Lo minimo que cambiaria para que de 3.5 seria poner uno con punto decimal como 7.0 / 2 o usar casting (double) 7 / 2

9. El casting y lo que se pierde
Sirve para obligar a Java a convertir un tipo de dato en otro de diferente precision, perdiendo la parte que no quepa.
Mi linea:
return (int) estimacion;

10. new, clase e instancia
El operador new le pide memoria a la computadora para crear un objeto nuevo usando su plantilla. La clase es la plantilla Casa.java y la instancia es la casa real que cree en el main con new Casa(4)