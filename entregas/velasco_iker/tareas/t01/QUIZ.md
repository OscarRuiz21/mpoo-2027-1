# QUIZ T01 · Velasco Gómez Iker Alejandro

## 1. Atributo contra variable
Un atributo es lo que el objeto recuerda siempre para mantener su estado. En cambio, una variable normal o local solo existe y vive los segundos que dura ejecutándose y luego puff se borra.
Ejemplo de atributo: `double tensionLibras = 55.0;` en Raqueta. Ejemplo de variable: el parámetro `double desgaste` dentro del método entrenar.

## 2. Constructor: que es, cuando corre, cuantas veces
Es el método especial que le da forma inicial al objeto y se ejecuta automáticamente una sola vez en la vida del objeto, justo en el milisegundo exacto en que usas la palabra `new`.
```java
Raqueta(String marca, double tensionLibras) {
    this.marca = marca;
    this.tensionLibras = tensionLibras;
}
Si no lo hubiera escrito, Java le pone valores por defecto (null y 0.0) y mi raqueta nacería sin marca ni tensión asignada.

3. Para que sirve this
Sirve para aclararle a Java que te refieres al atributo global de la clase y no al parámetro que se llama igualito. Si se te olvida, pasa algo va a compilar pero  simplemente el objeto se queda con sus valores predeterminados porque el parámetro se asigna a sí mismo y el atributo real nunca cambia.

4. La firma de un metodo
Es el nombre del método junto con los tipos de datos de sus paréntesis . No incluye el tipo de retorno ni la palabra void.
Firmas mías: void romperCuerda() y double calcularIndice(int torneosJugados).

5. Parametro y argumento
El parámetro es la variable vacía que declaras esperando recibir un dato en la firma, y el argumento es el valor real y con números que le mandas cuando lo ejecutas.
Línea de parámetro: void sumarJuegos(int n). Línea de argumento: p.sumarJuegos(6);.

6. Que significa void
Significa que el método hace su trabajo (modifica algo o imprime) pero no te regresa ningún resultado final a cambio. Decidí que entrenar() fuera void porque solo resta energía pero no produce un nuevo valor que deba regresar.

7. Primitivo contra referencia, y el null
Un primitivo guarda directamente el numerito en la memoria, mientras que una referencia guarda una flecha o dirección que apunta a un objeto complejo. Por eso un primitivo como int no puede ser null (porque un número vacío no existe), pero un String sí puede ser null porque la flecha puede no apuntar a nada.

8. Por que 7 / 2 da 3
Porque al dividir dos números enteros (int), Java hace una división entera y trunca o borra los decimales por completo

9. El casting y lo que se pierde
Sirve para forzar a que un tipo de dato se convierta a otro a la fuerza.
Línea: int minutosEnteros = (int) p.minutosJugados;. Ahí se perdió la parte decimal (.5) de los minutos jugados.

10. new, clase e instancia
new es la orden exacta para reservar memoria y construir físicamente el objeto. La clase es el plano o molde de papel (por ejemplo, Jugador), y la instancia es el objeto real y tangible que ya vive en la memoria de la compu con sus valores propios (j).

