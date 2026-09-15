# QUIZ T01 · David Uriel Villarruel Sánchez

## 1. Atributo contra variable

Un atributo es algo que el objeto guarda como parte de su estado. En mi Mochila, `pesoKg` es un atributo porque la mochila conserva ese dato. En cambio, `peso` de `agregarPeso(double peso)` solo existe mientras corre ese método.

## 2. Constructor: que es, cuando corre, cuantas veces

El constructor sirve para darle datos iniciales al objeto y se ejecuta cuando usamos `new`. En mi caso se ejecuta cuando creo la Mochila.

```java
Mochila(double pesoKg) {
    this.pesoKg = pesoKg;
}

## 3. Para que sirve this
this sirve para indicar que estoy hablando del atributo del objeto y no del parámetro. Si lo olvido y pongo pesoKg = pesoKg, el atributo no recibe correctamente el valor.

## 4. La firma de un metodo
La firma indica el nombre del método y los parámetros que recibe.
agregarPeso(double)
pesoTotal()

## 5. Parametro y argumento
El parámetro es el dato que recibe el método:
void agregarPeso(double peso)
El argumento es el valor que mando al llamar al método:
mochila.agregarPeso(1.5);

## 6. Que significa void
void significa que el método no regresa ningún valor. En mi tarea agregarPeso(double) es void porque cambia el peso de la mochila, mientras que pesoTotal() regresa un double.

## 7. Primitivo contra referencia, y el null
Un tipo primitivo guarda un valor, como int, double, boolean o char. Una referencia apunta a un objeto, como String. Un int no puede ser null, pero una referencia sí.

## 8. Por que 7 / 2 da 3
Porque 7 y 2 son enteros y Java hace una división entera. Para obtener 3.5, uno de los valores debe ser double, por ejemplo 7 / 2.0

## 9. El casting y lo que se pierde
El casting cambia temporalmente un valor a otro tipo. Con (int) se elimina la parte decimal.
return (int) (hojas / 10.0);
## 10. new, clase e instancia
new sirve para crear una instancia de una clase. La clase es el modelo y la instancia es el objeto creado.
Mochila mochila = new Mochila(2.5);