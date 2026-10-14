## 1. Que diferencia hay entre un atributo y una variable local?
Un atributo vive dentro del objeto y existe mientras el objeto exista. Una variable local vive dentro de un metodo y muere cuando el metodo termina. En mi tarea, `capacidadMl` es atributo y `espacioLibre` es variable local.

## 2. Para que sirve un constructor?
Sirve para crear el objeto y dejarlo con un estado inicial valido. Se llama con `new` y tiene el mismo nombre que la clase. En mi tarea, `BotellaAgua(int capacidadMl)` inicializa la botella vacia.

## 3. Que significa `this` y cuando se usa?
`this` se refiere al objeto actual. Se usa para diferenciar un atributo de un parametro con el mismo nombre. En mi tarea: `this.capacidadMl = capacidadMl;`.

## 4. Que es la firma de un metodo?
Es el nombre del metodo mas el tipo y orden de sus parametros. No incluye el tipo de retorno. Ejemplo de mi tarea: `// firma: llenar(int)`.

## 5. Diferencia entre parametro y argumento?
El parametro es la variable que se declara en el metodo. El argumento es el valor real que se pasa al invocarlo. En mi tarea, `int ml` es parametro y `600` es argumento.

## 6. Que significa que un metodo sea `void`?
Que no devuelve ningun valor al terminar. Solo produce un efecto, como cambiar un atributo. En mi tarea, `beber(int)` es void porque solo modifica `cantidadActualMl`.

## 7. Diferencia entre primitivo y referencia?, Que es `null`?
Los primitivos guardan el valor directamente (int, boolean, double). Las referencias guardan la direccion de un objeto. `null` significa que una referencia no apunta a ningun objeto. En mi tarea, `int` es primitivo y `BotellaAgua` es referencia.

## 8. Que pasa en Java con la division entera?
Si divides dos `int`, el resultado es `int` y se descarta la parte decimal. Por ejemplo, `7 / 2` da `3`, no `3.5`. Para obtener decimales hay que usar `double`.

## 9. Que es un casting y cuando lo usaria?
Es convertir un valor de un tipo a otro. Se usa cuando necesito pasar de `double` a `int` o al reves. Por ejemplo: `int x = (int) 3.9;` deja `x = 3`.

## 10. Que relacion hay entre `new`, clase e instancia?
La clase es el molde. `new` crea un objeto a partir de ese molde. Ese objeto creado se llama instancia. En mi tarea, `new BotellaAgua(1000)` crea una instancia de la clase `BotellaAgua`.