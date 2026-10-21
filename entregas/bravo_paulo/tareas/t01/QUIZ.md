# QUIZ T01 · Paulo César Bravo Olmedo

## 1. Atributo contra variable
Un atributo pertenece al objeto y define su estado durante toda su vida, mientras que una variable normal (o local) solo existe temporalmente dentro de un método o bloque.
- **Atributo:** `double pesoKg` (existe siempre que exista la Mochila).
- **Variable:** `int pesoAproximado` (solo vive adentro del `main` de Mochila).

## 2. Constructor: que es, cuando corre, cuantas veces
Es un bloque de código especial para inicializar el objeto. Se ejecuta **exactamente una sola vez** por cada objeto, justo en el instante en que usamos la palabra `new`. Si no lo hubiera escrito en `Bicicleta`, Java habría puesto uno vacío invisible, y tendríamos bicicletas "fantasma" sin un ID registrado desde que nacen.

```java
    // firma: Bicicleta(String) · mismo nombre de la clase · SIN tipo de retorno
    Bicicleta(String idBici) {
        this.idBici = idBici;      // this.idBici es el ATRIBUTO, idBici a secas el PARAMETRO
    }
```

## 3. Para que sirve this
Sirve para diferenciar el atributo del objeto del parámetro del método cuando ambos se llaman exactamente igual. Si se te olvida, no truena ni da error de compilación (pasa algo peor): el parámetro se asigna el valor a sí mismo (shadowing) y el atributo del objeto se queda vacío o con su valor por defecto.

## 4. La firma de un metodo
Es la combinación del nombre del método y los tipos de parámetros que recibe, lo que le permite a Java identificarlo.
- `meter(double)`
- `calcularDistancia(double)`

## 5. Parametro y argumento
El parámetro es la variable que declaras en la definición del método (el hueco que va a recibir un dato). El argumento es el valor real que le pasas cuando lo llamas.
- **Parámetro:** `void rellenar(int extraMl)` (en la clase Cafetera).
- **Argumento:** `c.rellenar(150);` (el 150 es el argumento real en el main).

## 6. Que significa void
Significa que el método hace un trabajo o cambia el estado interno del objeto, pero no le devuelve ninguna respuesta o cálculo al programa que lo llamó. En mi código, `servir()` en Cafetera es `void` porque solo resta agua internamente. En cambio, `litrosRestantes()` retorna un `double` porque el sistema necesita ese número.

## 7. Primitivo contra referencia, y el null
Un tipo primitivo (int, double, char) guarda el valor real directamente en la memoria. Una referencia (String) guarda la "dirección" donde vive el objeto. Un `int` nunca puede valer null porque por defecto guarda un cero; siempre tiene un valor numérico. Un `String` sí puede ser null porque significa que esa referencia "no apunta a nada".

## 8. Por que 7 / 2 da 3
Porque al ser los dos números de tipo `int`, Java asume que quieres una división entera y tira la parte decimal sin avisar (es la trampa de la división). Lo mínimo que cambiaría para que diera 3.5 es volver uno de los números un double: `7 / 2.0` o `7.0 / 2`.

## 9. El casting y lo que se pierde
El casting fuerza a Java a convertir un tipo de dato en otro. En el caso de pasar de `double` a `int`, se pierde toda la información decimal (se trunca, no se redondea).
Línea de mi tarea (en Mochila):
`int pesoAproximado = (int) m.pesoKg;`
Ahí se perdieron los gramos/decimales de la mochila para dejar solo los kilos enteros.

## 10. new, clase e instancia
La palabra `new` reserva espacio en la memoria para un objeto nuevo y llama a su constructor.
La **clase** es el plano o molde escrito en el archivo `.java` (ej. `Cafetera.java`), mientras que la **instancia** es el objeto real y utilizable que creaste con `new` y que ya vive en la memoria de la computadora (ej. la cafetera particular `c` en el main).