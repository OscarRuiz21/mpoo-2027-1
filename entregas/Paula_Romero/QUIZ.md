# QUIZ T01 · Paula Romero

## 1. Atributo contra variable
Un atributo es una característica propia de mi objeto y existe durante todo su tiempo de vida. Una variable común es solo un dato temporal que se usa en un momento y luego desaparece.
Ejemplo: `String titulo = "Cadaver exquisito";`

## 2. Constructor: qué es, cuándo corre, cuántas veces
Es una función especial que le da sus datos iniciales al objeto cuando recién se crea. Se ejecuta justo al usar la palabra `new` y solo corre una sola vez por cada objeto.

## 3. La palabra this
Sirve para aclararle a Java cuál es el atributo de la clase cuando se llama igual que la variable de entrada. Si no lo pongo, Java se confunde y el atributo se queda vacío.

## 4. Firma de un método
Es la combinación del nombre de la función junto con los datos que recibe entre paréntesis.
Ejemplos de mi tarea: `avanzarPaginas(int)` y `usarPerfume(double)`.

## 5. Parámetro contra argumento
El parámetro es el hueco o casilla donde la función espera un dato, y el argumento es el número o texto real que le envío al usarla.
Parámetro: `public void usarPerfume(double mililitrosUsados)` | Argumento: `miPerfume.usarPerfume(5.5);`

## 6. Métodos void
Significa que la función solo hace un trabajo pero no te devuelve ningún resultado de regreso. Lo usé en `avanzarPaginas` porque solo quería sumar las páginas leídas sin que me calculara nada al final.

## 7. Primitivo contra referencia
Un tipo primitivo guarda un número o valor directo muy simple, mientras que una referencia guarda una estructura o texto más complejo.
Primitivos: `int totalPaginas = 208;` y `double mililitrosRestantes = 50.0;`
Referencias: `String titulo = "Cadaver exquisito";` y `Libro miLibro = new Libro(208);`

## 8. División entera en Java
Porque Java ve que `7` y `2` son enteros, así que tira a la basura la parte decimal sin redondear. Para que dé `3.5` tengo que ponerle punto a algún número: `7.0 / 2`.

## 9. Casting
Es obligar a la fuerza a un dato a convertirse en otro tipo, como pasar de decimal a entero `(int) 3.5`. Al hacerlo se pierde toda la parte decimal.

## 10. La palabra new y la diferencia entre clase y objeto
La palabra `new` es la que manda a construir el objeto. La clase es como el molde o dibujo en papel, y el objeto es la cosa real ya fabricada en la memoria.