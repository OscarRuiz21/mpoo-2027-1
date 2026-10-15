#QUIZ T01 · Andre Ajas Ruiz

## 1. Atributo contra variable
Un atributo define el estado del objeto y vive permanentemente en él, mientras que una variable solo existe temporalmente durante la ejecución de un método. Atributo: `private int mlCapacidad;` Variable: `int incremento`.

## 2. Constructor: que es, cuando corre, cuantas veces
Es la función que inicializa los atributos; corre automáticamente una sola vez al instanciar con `new`. Si no lo escribiera, mi objeto nacería con 0 ml de capacidad y no funcionaría correctamente.
```java
public Termo(int mlCapacidad, int mlRestantes) {
    this.mlCapacidad = mlCapacidad;
    this.mlRestantes = mlRestantes;
}

3. **this:** 
Sirve para que el objeto se refiera a sus propios atributos y los diferencie de los parámetros. Si se omite, el parámetro se asigna a sí mismo y el atributo original se queda vacío o en cero.
4. **Firma de un método:** 
Es el sello distintivo del método, formado únicamente por su nombre y la cantidad, orden y tipo de sus parámetros de entrada. Firmas: subirVolumen(int) y tomarAgua(int).

5. **Parámetro vs Argumento:** 
El parámetro es el contenedor declarado en la firma de la función, mientras que el argumento es el dato concreto entregado al momento de invocarla. Parámetro: public void tomarAgua(int ml) Argumento: t.tomarAgua(300);


6. **void:** 
Indica que el método ejecutará un procedimiento que altera el estado interno pero no devolverá ningún resultado al terminar. Elegí void porque solo suma valores; usaría un retorno si necesitara una respuesta.

7. **Primitivos vs Referencias y null:** 
Los primitivos guardan valores puros (un int nunca es null, vale 0 por defecto), mientras que las referencias guardan direcciones de memoria. Un String puede ser null si no apunta a nada.

8. **División entera:** 
Porque es una operación entre números enteros, por lo que Java trunca los decimales del resultado conservando la parte entera. Para que diera 3.5, uno debería ser double (7 / 2.0).

9. **Casting:** 
Es la conversión intencional para transformar el tipo de dato de una expresión[cite: 10, 11]. Forcé una división decimal; si el casting fuera de double a int, se perdería la parte decimal. double proporcion = (double) this.mlRestantes / this.mlCapacidad;
10. **new / clase / instancia:** 
La clase es la plantilla de diseño, la instancia es el objeto concreto creado a partir de ella, y new aparta el espacio en memoria para construirlo[cite: 10, 11]. Instancia: Audifonos a = new Audifonos();