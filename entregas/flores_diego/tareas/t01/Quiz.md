# QUIZ T01 · Diego Flores


## 1. Atributo contra variable
Un atributo es una caracteristica que pertenece a todo el objeto,y la variable solo se declara en donde se requiere para algo en especifico 

## 2. Constructor: que es, cuando corre, cuantas veces
funcion para crear un nuevo objeto y darle valores, se ejecuta al utilizar el new, una vez cada que se usa el new

```java
//   Mascota miMascota = new Mascota("Barbie");
```

Sin el constructor, ese objeto habria nacido con:
los valores iniciales

## 3. Para que sirve this
ayuda a apunar directamente al objeto y no al atributo, si se olvida el programa confunde atributo y metodos

## 4. La firma de un metodo
identifica a los metodos, lleva nombre y puede o no llevarparametros, y puede o no regresar algo

Mis dos firmas:
- boolean feliz(){
  return felicidad>80;
-void despertar(){
dormido=false;
System.out.println(nombre+ "desperto");
}

## 5. Parametro y argumento
parametro es la variable que se da al declarar metodos, y argumento es el valor que se da al metodo cuando se llama

Parametro, en mi codigo:
```java
jugar(int minutos)
```

Argumento, en mi codigo:
```java
miMascota.jugar(20);
```

## 6. Que significa void
void se significa que un metodo no va a retornar ningun valor, y decidi usarlo cuando sabia que lo que saliera de la funcion no era lo que iba a utilizar y lo use cuando necesitaba que lo que regresara, saliera con un tipo que yo quisiera

## 7. Primitivo contra referencia, y el null
los primitivos son tipos de datos que almacenan un cierto valor en la memoria y los de referencia almacenan la direccion de memoria donde se encuentra el valor, el int no puede ser null porque a este se le da un valor de 0 y este se guarda en la memoria, no la direccion.

## 8. Por que 7 / 2 da 3
da 3.5 pero al ser valor int este se cortara tomando solo los eneteros, y para que de exacto lo 3.5 uno de los dos numeros lo cambiaria a tipo double que son los decimales. 7/2.0

## 9. El casting y lo que se pierde
es algo que hace que una variable de un tipo se comporte como otro diferente tipo, se pierde alguna informacion, en el caso de double a int se pierden decimales y con ello precision tambien.

Mi linea:
```java
        int kmEnteros = (int) miBici.kilometraje;

```

## 10. new, clase e instancia
(        Mascota miMascota = new Mascota("Barbie");
public class Mascota)