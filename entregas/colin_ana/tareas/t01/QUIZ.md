# QUIZ T01 · Colin Torres Ana Ivonne

> Reglas: con tus palabras (copiar la slide o internet vale 0), maximo 3 renglones por
> respuesta, y donde diga "de tu tarea" pega la linea real de tu codigo.

## 1. Atributo contra variable
Un atributo es una característica del objeto que no cambia, mientras una variable es un dato temporal del mismo objeto.

## 2. Constructor: que es, cuando corre, cuantas veces
Es un método que inicializa un objeto, corre automáticamente al usar la palabra new y se ejecuta una sola vez por objeto.

```java
Television(String marca, int resolucionVertical, double tamanoPulgadas) {
        this.marca = marca;
        this.resolucionVertical = resolucionVertical;
        this.tamanoPulgadas = tamanoPulgadas;
    }
```

Sin el constructor, ese objeto habria nacido con:
El valor inicial por defecto defininido, en este caso 1080.

## 3. Para que sirve this
Para diferenciar el atributo del objeto de parámetro que recibe el constructor, especialmente cuando se llaman igual.

## 4. La firma de un metodo
Es el nombre del método junto con los tipos de parámetros y su orden.

Mis dos firmas:
- ajustarConfiguracion()
- calcularPrecioPulgada()

## 5. Parametro y argumento
El parámetro es la variable declarada, en el método, que recibe los datos. El argumento es un valor real que enviás al ejecutarlo.

Parametro, en mi codigo:
```java
void ajustarConfiguracion(int nuevoVolumen, String modoImagen)
```

Argumento, en mi codigo:
```java
miTV.ajustarConfiguracion(15, "Cine");
```

## 6. Que significa void
Significa que el método realiza alguna acción pero no regresa ningún valor.

## 7. Primitivo contra referencia, y el null
Un primitivo guarda un valor director en memoria, mientras un referencia guarda la dirección de un objeto. Null es la ausencia de un objeto, una refrencia que no apunta a nada.

## 8. Por que 7 / 2 da 3
En Java la división entre dos números enteros trunca los decimales y devuelve solo un entero.

## 9. El casting y lo que se pierde
Es forzar la conversión de un tipo de dato a otro. Se pierden los decimales y se trunca.

Mi linea:
```java
double precioPorPulgada = (precioConDescuento * 1.16) / this.tamanoPulgadas;
```

## 10. new, clase e instancia
new es la orden para construir un objeto en memoria, la clase es el modelo y la instancia es un objeto creado a partir de la clase.
