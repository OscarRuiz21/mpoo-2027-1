# Quiz de Vocabulario

1. **Atributo vs Variable:** 
Un atributo es una variable declarada dentro de la clase que define una propiedad del objeto y dura toda su vida útil. Una variable local nace y muere únicamente durante la ejecución del método donde fue creada.
```java
private int mlCapacidad;

2. **Constructor:** 
Es la función especial de una clase que se invoca de manera automática al instanciar un objeto, usada principalmente para darle valores iniciales a sus atributos.
public Termo(int mlCapacidad, int mlRestantes) {
    this.mlCapacidad = mlCapacidad; // this.mlCapacidad = ATRIBUTO · mlCapacidad = PARAMETRO
    this.mlRestantes = mlRestantes;
}

3. **this:** 
Es la palabra clave que usa el objeto para referirse a sus propios atributos o métodos internos cuando necesita diferenciarlos de variables externas o parámetros.
this.volumen += incremento;


4. **Firma de un método:** 
Es el sello distintivo de un método, formado por su nombre y la cantidad, orden y tipo de sus parámetros de entrada.
subirVolumen(int)



5. **Parámetro vs Argumento:** 
El parámetro es el contenedor o variable declarada en la firma de la función, mientras que el argumento es el dato concreto entregado al momento de llamar a la función.
// Parámetro (en el método):
public void tomarAgua(int ml)

// Argumento (al invocar):
t.tomarAgua(300);;`

6. **void:** 
Es la palabra que le indica al compilador que un método ejecutará un procedimiento pero no devolverá ningún resultado al terminar.
public void agregarHojas(int nuevasHojas)

7. **Primitivos vs Referencias y null:** 
Los tipos primitivos guardan valores puros (como números o banderas), mientras que las variables de referencia guardan la dirección de memoria donde vive un objeto. La palabra `null` indica que la referencia está vacía.
int cantidadHojas;

8. **División entera:** 
Es una operación entre números enteros en la que Java trunca los decimales del resultado, conservando únicamente el valor entero final.
int residuo = this.mlRestantes % 10;

9. **Casting:** 
Es la conversión intencional que hace el programador para transformar el tipo de dato de una expresión a otro tipo compatible.
double proporcion = (double) this.mlRestantes / this.mlCapacidad;

10. **new / clase / instancia:** 
La clase es la plantilla de diseño, la instancia es el objeto concreto derivado de ella, y la instrucción `new` ordena crear ese objeto y apartar su espacio en memoria.
Audifonos a = new Audifonos();