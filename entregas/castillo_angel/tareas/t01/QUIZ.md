# QUIZ T01 · Nombre Apellido

> Reglas: con tus palabras (copiar la slide o internet vale 0), maximo 3 renglones por
> respuesta, y donde diga "de tu tarea" pega la linea real de tu codigo.

## 1. Atributo contra variable
Un atributo a lo que entendi, es la variable que esta dentro de nuestra clase, es decir como la propiedad o caracteristica que nuestro objeto tiene. Por otro lado una variable cualquiera simplemente es la que se declara dentro de algun metodo o de un bloque.

ATRIBUTO: (code audifonos)
    double bateria = 85.0 ; propiedad que vive en nuestro objeto

VARIABLE: (code audifonos)
    void usar(double horas) ; en este caso horas es nuestra variable que estamos declarando para usar dentro de ese metodo, no es una caracteristica que vivira en nuestro objeto.

## 2. Constructor: que es, cuando corre, cuantas veces
Un constructor es como la manera de incializar los atributos de un objeto cuando este va a crearse, asi le podemos pasar valores reales que queramos a sus atributos. Se ejecuta cuando usamos el new y pasa una sola vez cada que nazca.

Pelicula(String titulo, int duracionMin) {
        this.titulo = titulo;
        this.duracionMin = duracionMin;
}

Sin el constructor, ese objeto habria nacido con:
Con los valores inciales que trae por defecto en el apartado de atributos, en este caso seria "Sin Titulo" y "120".

## 3. Para que sirve this
Nos ayuda a indicar cual es el atributo y cual es el parametro, sin este java se confunde pq tiene a dos variables llamadas igual y no sabe distinguir.

## 4. La firma de un metodo
Es el nombre mas el tipo de parametro.

Mis dos firmas:
-  void bajarVolumen(int puntos)  // firma: bajarVolumen(int)
-  void reproducir(double minutos) // firma: reproducir(double)

## 5. Parametro y argumento
A lo que tengo entendido el parametro es la variable en si que declaramos para que usemos en un metodo por ejemplo, en cambio el argumento ya es el dato real que ocupamos al momento de llamar al metodo en el main.

Parametro, en mi codigo:
    void usar(double horas)     ;  parametro: double horas
        this.bateria -= horas * 10.0;

Argumento, en mi codigo:
    au.usar(2.0)    ;   2.0 es el argumento

(MISMO CODIGO AUDIFONOS)
    

## 6. Que significa void
Esto se usaba bastante al hacer funciones en c, el void es solamente para cuando el metodo ejecuta una accion dentro del objeto pero no devuelve ningin resultado a la linea que lo invoco. Y pues decidi como usarlos dependiendo de si necesitaba alguna respuesta mas que un cambio.

## 7. Primitivo contra referencia, y el null
Para ser sinceros no se si estoy bien en estas comparaciones, me suena a que un tipo primitivo es el que guarda los valores asi como directamente, y la referencia me suena a un apuntador, como cuando veimaos colas y asi en EDA. Eso responderia a pq un int no puede ser null pero un string si por ejemplo, ya que el segundo seria un apuntador que indica a una direccion nula o vacia, pero no se pq string lo seria. :(

## 8. Por que 7 / 2 da 3
Pq ambos son de tipo entero, se pierde la parte decimal, solo toma los valores enteros del resultado, lo que cambiaria seria poner alguno de los dos valores como double ya sea 7.0/ 2 por ejemplo.

## 9. El casting y lo que se pierde
Como que obligamos a convertir un valor de cierto tipo a otro, en el caso de mi tarea se pierde la parte decimal del 74.0 a 74

Mi linea:
int minutosCompletos = (int) p.minutosVistos

## 10. new, clase e instancia
En el caso de mi codigo de la tv por ejemplo: La instancia es como la television construida realmente ocupando valores y atributos convenientes al plano (la clase).
