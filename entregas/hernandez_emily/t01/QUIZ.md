# QUIZ - Radiografías con contexto

### 1. ¿Qué es un atributo y en qué se diferencia de una variable cualquiera?

Un atributo es una variable que pertenece a una clase y guarda información sobre sus objetos. Por ejemplo, en `Refrigerador`, `alimentos` es un atributo porque representa una característica que el objeto debe recordar.

### 2. ¿Qué es un constructor, cuándo se ejecuta y cuántas veces?

Un constructor sirve para darle valores iniciales a un objeto cuando se crea. Se ejecuta automáticamente al usar `new` y se ejecuta una vez por cada objeto que se crea.

### 3. ¿Para qué sirve `this` dentro de un constructor?

`this` sirve para indicar que estamos hablando del atributo del objeto. Por ejemplo, en `Cartera`, `this.dinero = dinero;` guarda el parámetro `dinero` dentro del atributo `dinero`.

### 4. ¿Qué es la firma de un método?

La firma identifica un método por su nombre y los parámetros que recibe. Por ejemplo, en mi código `guardarAlimentos(int)` indica que el método se llama `guardarAlimentos` y recibe un `int`.

### 5. Parámetro y argumento: ¿cuál es cuál?

El parámetro es la variable que aparece cuando se define el método. El argumento es el valor que se le manda al método cuando lo utilizamos, como el `6` en `r.guardarAlimentos(6)`.

### 6. ¿Qué significa que un método sea `void`?

Significa que el método realiza una acción, pero no devuelve ningún valor. Por ejemplo, `agregarDinero(double)` modifica el dinero de la cartera, pero no necesita regresar un resultado.

### 7. ¿Qué es un tipo primitivo y qué diferencia hay con una referencia?

Un tipo primitivo guarda directamente un valor, como `int`, `double` o `boolean`. Una referencia, como una variable de tipo `Cartera`, sirve para referirse a un objeto creado en memoria.

### 8. ¿Por qué `7 / 2` da `3` y no `3.5`?

Porque `7` y `2` son valores enteros (`int`), por lo que Java hace una división entera y elimina la parte decimal. Para obtener `3.5`, uno de los valores debe ser `double`, como en `7 / 2.0`.

### 9. ¿Qué hace un casting como `(int)` y qué se pierde?

El casting convierte un valor de un tipo a otro. Al convertir un `double` a `int`, se elimina la parte decimal, por ejemplo, `(int) 3.8` queda en `3`.

### 10. ¿Qué hace `new` y cuál es la diferencia entre clase e instancia?

`new` crea un objeto a partir de una clase. La clase es el modelo que define cómo será el objeto, mientras que la instancia es el objeto que realmente se crea, como `new Refrigerador()`.
