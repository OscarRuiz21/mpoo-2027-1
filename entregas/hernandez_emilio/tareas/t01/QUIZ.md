# Quiz de Vocabulario y Conceptos - Tarea 01

### 1. ¿Cuál es la diferencia entre una clase y un objeto?
Una clase es la plantilla que define las propiedades (atributos) y los comportamientos (métodos) que compartirán los objetos de ese tipo. No ocupa espacio dinámico en memoria para datos específicos pero un objeto es una instancia concreta de una clase creada en tiempo de ejecución mediante la palabra reservada `new`, poseyendo su propio estado alojado en memoria Heap.

### 2. ¿Para qué sirve el operador `this` en Java y cuándo es obligatorio usarlo?
El operador this es una referencia implícita al objeto actual que está ejecutando el métodoconstructor. Es obligatorio usarlo cuando un parámetro de un método o constructor tiene exactamente el mismo nombre que un atributo de la clase, permitiendo al compilador diferenciar el atributo del parámetro local.

### 3. Explica qué sucede al realizar una división entera (`int / int`) frente a una división con coma flotante (`double / double`).
En Java, cuando se dividen dos operandos de tipo entero, el resultado se vuelve raro perdiendo completamente la parte decimal sin redondear . Pero si al menos uno de los operandos es de tipo de punto flotante, el compilador realiza una operacion numérica a double y conserva la parte fraccionaria. 

### 4. ¿Qué es la firma de un método y por qué es fundamental en Java?
La firma de un método en Java consiste en el nombre del método y la lista ordenada de tipos de sus parámetros. No incluye el tipo de retorno ni los modificadores de acceso. Es fundamental porque el compilador de Java utiliza la firma para identificar unívocamente a qué método se está llamando, lo que hace posible la sobrecarga de métodos.

### 5. ¿Cuál es la diferencia entre un tipo primitivo y un tipo por referencia (objeto) en memoria?
Los tipos primitivos almacenan directamente su valor primitivo en la pila de ejecución . Los tipos por referencia almacenan en el Stack únicamente una dirección de memoria que apunta al lugar real donde residen los datos e información dentro de la memoria.