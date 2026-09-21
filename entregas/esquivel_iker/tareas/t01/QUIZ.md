# QUIZ T01 · Nombre Apellido

> Reglas: con tus palabras (copiar la slide o internet vale 0), maximo 3 renglones por
> respuesta, y donde diga "de tu tarea" pega la linea real de tu codigo.

## 1. Atributo contra variable
Un atributo pertenece a un objeto y guarda información sobre sus características o estado. Una variable puede existir solo dentro de un método y utilizarse para realizar una operación temporal.

## 2. Constructor: que es, cuando corre, cuantas veces
Un constructor sirve para dar valores iniciales a un objeto cuando se crea. Se ejecuta automáticamente al usar `new` y corre una vez por cada objeto creado.

```java
public Laptop(String marca, String modelo, double bateria) {
    this.marca = marca;
    this.modelo = modelo;
    this.bateria = bateria;
    this.encendida = false;
    this.horasUso = 0;
}
```
Sin el constructor, ese objeto habria nacido con:
Los valores por defecto de sus atributos, null para String, 0.0 para double, 0 para int y false para boolean.

## 3. Para que sirve this
'this' se refiere al objeto actual y nos ayuda a diferenciar entre un atributo y un parametro que tiene el mismo nombre.
Si se me llegase a olvidar se usaría el parámetro y no se le asignaría al atributo el valor que yo deseo.

## 4. La firma de un metodo
La firma de un método nos ayuda a saber como se identifica, incluyendo su nombre y parámetros.
Mis dos firmas:
- usar(double minutos)
- estaEncendida()

## 5. Parametro y argumento
Un parámetro es la información que recibe el método y se escribe en su definición, el argumento es el valor real que se le pasa cuando se llama al método
Parametro, en mi codigo:
```java
public void usar(double minutos)
```

Argumento, en mi codigo:
```java
miLaptop.usar(120);
```

## 6. Que significa void
Significa que el método hace acciones pero no devuelve nada, yo decidí usarlo en métodos como usar () prque modifican el estado de la laptop sin ser necesario que devuelva un valor.

## 7. Primitivo contra referencia, y el null
Un primitivo guarda directamente un valor como int o double y noo puede valer null.
Una referencia guarda una referencia a un objeto, como string, y si puede tener valor null.
El int no puede ser null porque es un tipo primitivo de Java, no un objeto.

## 8. Por que 7 / 2 da 3
Porque ambos valores son enteros, por eso Java realiza una división entera, si quisieramos el valor en decimal deberíamoshacer un número a decimal.
Por ejemplo: 7.0/2 = 3.5, o solamente convertir uno de los valores de la división a double.

## 9. El casting y lo que se pierde
El casting sirve para ccambiar el tipo de un valor a otro tipo, en mi código de la laptop lo use para convertir un double a un int, por lo que se pierde la parte decimal.

Mi linea:
```java
horasUso += (int)(minutos / 60);
```

## 10. new, clase e instancia
Una clase es como un molde que define las características de un objeto, new crea un objeto a partir de esa clase y el objeto creado se le llama istancia.