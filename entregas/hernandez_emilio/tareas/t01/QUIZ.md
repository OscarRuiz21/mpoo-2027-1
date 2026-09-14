# QUIZ T01 · Emilio Hernández

## 1. Atributo contra variable
Un atributo guarda un dato del objeto que se mantiene vivo en toda la clase (`marca`), mientras que una variable normal solo vive dentro de su método (`incrementoKm`).

## 2. Constructor: que es, cuando corre, cuantas veces
Es el método que inicializa el objeto cuando usas `new` y solo corre una vez por objeto. Si no lo escribo Java pone uno vacío y mis atributos se quedan en `0` o `null`.

```java
public Bicicleta(String marca, int velocidadActual, double presionLlantasPsi, boolean tieneLucesEncendidas) {
    this.marca = marca;
    this.velocidadActual = velocidadActual;
    this.presionLlantasPsi = presionLlantasPsi;
    this.tieneLucesEncendidas = tieneLucesEncendidas;
}

##3. Para que sirve this
Sirve para decirle a Java cuál es el atributo del objeto y cuál es el parámetro cuando se llaman igual. Si se me olvida, el parámetro se asigna a sí mismo y el atributo se queda en cero/vacío.

##4. La firma de un metodo
Es el nombre del método más los datos que recibe entre paréntesis. Mis dos firmas son acelerar(int) y tomarOrden(String, int, double).

##5. Parametro y argumento
El parámetro es la variable que declaras en la función y el argumento es el valor real que le mandas al usarla.
Parámetro: public void acelerar(int incrementoKm)
Argumento: miBici.acelerar(5);

##6. Que significa void
Que el método solo hace una acción y no regresa ninguna variable de vuelta. Usé void para acciones como encender() y puse tipo de retorno cuando ocupaba el resultado como calcularTotal().

##7. Primitivo contra referencia, y el null
El primitivo guarda el valor directo en memoria y la referencia guarda la dirección de donde está el objeto. int es primitivo y siempre tiene un número binario, mientras que String es objeto y puede apuntar a nada (null).

##8. Por que 7 / 2 da 3
Porque ambos son enteros y Java corta los decimales sin redondear. Para que dé 3.5 cambiaría un número a decimal poniéndole 7.0 / 2.

##9. El casting y lo que se pierde
Es forzar a una variable a cambiar de tipo recortando lo que no cabe.
Línea usada: int propinaEntera = (int) propinaCalculada;
Ahí perdí todos los centavos de la propina al quitarle los decimales.

##10. new, clase e instancia
new es la palabra que manda crear el objeto en memoria. Taqueria es solo el plano en código y miTaqueria es el objeto real construido a partir de ese plano.