# QUIZ T01 · Crisostomo Garcia Israel

> Reglas: con tus palabras (copiar la slide o internet vale 0), maximo 3 renglones por
> respuesta, y donde diga "de tu tarea" pega la linea real de tu codigo.

## 1. Atributo contra variable
el atributo vive dentro de la clase y es lo que define el estado de un objeto  y le da su existencia durante tolo el tiempo que este exista, y una variable normal solo vive dentro del metodo mientras este se esta ejecutando

## 2. Constructor: que es, cuando corre, cuantas veces
el contructor es un metodo especial que se va ejecuntando automáticamente al crear un objeto y solo se compila una vez por objeto creado, si se tienes 2 se va a ejecuatr 2 veces 

```java
// Gato(String nombre) {
    this.nombre = nombre;
}

Gato(String nombre, boolean dormido) {
    this.nombre = nombre;
    this.dormido = dormido;
}
```

Sin el constructor, ese objeto habria nacido con:
con los valos por defectos que da java, como el null en el nombre, 0 en el nivel de hambre, false en dormido, y no con los vlores que yo escribi

## 3. Para que sirve this
la palabra reservada this se utiliza para referirse al objeto actual cuando los parametros tienen el mismo nombre que el atributo
(this.nombre = nombre) si se olvida de colocarlo el parametro tapa al atributo este se queda sin inicializar 

## 4. La firma de un metodo
es la identidad que se le da a cada metodo  y esta compuesta unicamente por el nombre y la lista de sus parametros es lo que Java usa para diferenciar métodos aunque compartan em mismo nombre

Mis dos firmas:
- void alimentar(int porcion)
- boolean quiereJugar()

## 5. Parametro y argumento
El parámetro es una variable vacía que declaramos al definir el método para recibir un dato y el argumento es el valor real que le mandas al invocarlo.
Parametro, en mi codigo:
```java
void alimentar(int porcion) {
```
Argumento, en mi codigo:
```java
miGato.alimentar(25);
```

## 6. Que significa void
Significa que el método ejecuta una acción pero no devuelve ningún dato o resultado final. yo Decidí que un método es void si terminaba con return algo.. si necesito que me calcule y entregue un valor

## 7. Primitivo contra referencia, y el null
Un tipo primitivo guarda el valor en memoria, mientras que una referencia guarda la dirección de memoria donde está guardado un objeto po si mismo un int nunca puede ser null porque no es una dirección, es un espacio fijo con un valor numérico, no algo que pueda "no apuntar a nada".

## 8. Por que 7 / 2 da 3
al ser 2 numeos enteros al dividir con java, se realiza la divicion como enteros y la parte decimal no se toma en cuenta, y los que investigue fue que se pude cambiar el valor de 2 a 2.0 ya que uno toma la parte decimal y se la pas al resultado y nos da 3.5  
## 9. El casting y lo que se pierde
Es forzar a que un tipo de dato sea tratado como otro diferente.por ejemplo de double a int. Al ir de un tipo mas grande  a uno más pequeño se pierde información: se desprecia la parte decimal 

Mi linea:
```java
int horasRestantes() {
        return (int) (bateria / 12.5); //se pierde el 0.5 y se queda con 12
    }
```

## 10. new, clase e instancia
La clase es el molde (Gato), que define atributos y métodos y new es el operador que fabrica al objeto en la memoria, y la instancia es ese gato real y único que acabas de crear y guardar en una variable

```java

Gato miGato = new Gato("Belcebú", false);

```
