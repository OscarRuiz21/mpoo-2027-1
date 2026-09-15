# QUIZ T01 · Rodolfo Aragom Sandoval

> Reglas: con tus palabras (copiar la slide o internet vale 0), maximo 3 renglones por
> respuesta, y donde diga "de tu tarea" pega la linea real de tu codigo.

## 1. Atributo contra variable
El atributo pertenece al objeto, define su estado y vive mientras exista la instancia. La variable nace dentro de un método o bloque y se destruye automáticamente en cuanto termina de ejecutarse esa sección de código.

## 2. Constructor: que es, cuando corre, cuantas veces
Es el método especial que inicializa el estado de un objeto; se ejecuta una sola vez al momento exacto de instanciarlo con la palabra reservada `new`.

```java
    public Botella(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal; // this.capacidadTotal = ATRIBUTO · capacidadTotal = PARAMETRO
    }