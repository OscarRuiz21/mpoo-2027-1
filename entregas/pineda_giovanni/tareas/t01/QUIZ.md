# QUIZ T01 · Giovanni Pineda Chavez

> Reglas: con tus palabras (copiar la slide o internet vale 0), maximo 3 renglones por
> respuesta, y donde diga "de tu tarea" pega la linea real de tu codigo.

## 1. Atributo contra variable
Un atributo define las características permanentes de un objeto y existe en toda la clase. Una variable es temporal, vive únicamente dentro del método o bloque donde la declaraste y desaparece al terminar.

## 2. Constructor: que es, cuando corre, cuantas veces
Es un método especial diseñado para inicializar un objeto dándole sus primeros valores. Corre automáticamente cuando utilizas la palabra `new` y se ejecuta exactamente una sola vez por cada objeto que creas.

```java
// AuricularesInalambricos(int nivelBateria, int volumen) {
    this.nivelBateria = nivelBateria; 
    this.volumen = volumen; 
//}
```

Sin el constructor, ese objeto habria nacido con:
Valores nulos o por defecto asignados por Java (como 0 para números, null para textos y false para booleanos).

## 3. Para que sirve this
Sirve para hacer referencia al objeto actual y diferenciar sus atributos de las variables locales cuando comparten el mismo nombre.

## 4. La firma de un metodo
Es la identidad única de un método ante el compilador. Está formada exclusivamente por el nombre del método y su lista de parámetros (cantidad, tipo y orden), sin importar lo que retorna.

Mis dos firmas:
- ajustarVolumen(int)
- obtenerDiagnostico()

## 5. Parametro y argumento
Un parámetro es la variable vacía en la definición del método preparada para recibir un dato. El argumento es el valor real y concreto que le envías al método cuando lo invocas en el programa.

Parametro, en mi codigo:
```java
//public void ajustarVolumen(int cambio) {
```

Argumento, en mi codigo:
```java
//misAudifonos.ajustarVolumen(20);
```

## 6. Que significa void
Significa que el método ejecuta una acción pero no te devuelve ningún dato de regreso. Decidí que ajustarVolumen era void porque solo altera el estado interno, mientras que obtenerDiagnostico retorna un String.

## 7. Primitivo contra referencia, y el null
Los primitivos guardan valores crudos en memoria, las referencias guardan la dirección de un objeto. Un int no puede valer null porque null indica "ausencia de dirección", y un primitivo exige siempre un valor base.

## 8. Por que 7 / 2 da 3
Porque al dividir dos números enteros, Java realiza una división entera y trunca los decimales automáticamente. Lo mínimo que cambiaría es poner 7 / 2.0 para forzar una división de punto flotante.

## 9. El casting y lo que se pierde
El casting es forzar la conversión de un tipo de dato a otro. Si conviertes de double a int, pierdes los decimales porque el lenguaje los recorta por completo sin redondear al valor más cercano.

Mi linea:
```java
//int costoAproximado = (int) muralCU.calcularCostoMantenimiento();
```

## 10. new, clase e instancia
Una clase es el plano de construcción de un concepto (AuricularesInalambricos), new es la orden o fábrica que lo construye en memoria, y la instancia es el objeto real y utilizable (misAudifonos).
