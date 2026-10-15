\# Tarea 4: Colecciones de Java



\*\*1. ¿Qué es una colección?\*\*

Una colección es un objeto en Java diseñado para almacenar, organizar y manipular un grupo de otros objetos de forma dinámica. A diferencia de un arreglo convencional que tiene un tamaño fijo y estático desde que nace, una colección crece o se encoge automáticamente en la memoria mientras el programa se ejecuta. Además, las colecciones ya incluyen métodos programados internamente para añadir, borrar, buscar y ordenar datos sin que tengamos que hacer la lógica desde cero.



\*\*2. Las tres familias principales\*\*

\*   \*\*List (Listas):\*\* Guardan los elementos en un orden secuencial estricto (tienen índices, como los arreglos). Permiten tener elementos repetidos.

\*   \*\*Set (Conjuntos):\*\* Inspirados en los conjuntos matemáticos. No garantizan mantener un orden específico y prohíben estrictamente los elementos repetidos.

\*   \*\*Map (Mapas/Diccionarios):\*\* No guardan elementos individuales, sino pares de "Clave-Valor". Las claves no pueden repetirse, pero los valores sí.



\*\*3. Tabla de Colecciones\*\*



| Clase | Familia | ¿Mantiene el orden? | ¿Acepta repetidos? | ¿Cómo sacas un elemento? | ¿Para qué la usarías? |

|---|---|---|---|---|---|

| `ArrayList` | List | Sí | Sí | `get(indice)` | Para listas donde busco leer datos rápido y por su posición numérica. |

| `LinkedList` | List | Sí | Sí | `get(indice)` | Para listas donde voy a estar insertando o borrando datos constantemente a la mitad. |

| `HashSet` | Set | No | No | No se saca directo, se busca con `contains()` o iterando. | Para depurar listas y garantizar que nadie esté duplicado. |

| `HashMap` | Map | No | Claves No, Valores Sí | `get(clave)` | Para buscar precios, contactos o configuraciones a través de un nombre. |

| `Hashtable` | Map | No | Claves No, Valores Sí | `get(clave)` | Igual que HashMap, pero en sistemas legacy con múltiples hilos simultáneos. |



\*\*4. Escenarios reales por clase\*\*

\*   \*\*ArrayList:\*\* El historial de reproducciones de un usuario en Spotify. Importa el orden exacto en que escuchó las canciones y puede escuchar la misma repetidas veces.

\*   \*\*LinkedList:\*\* El botón de "Atrás / Adelante" del navegador web, ya que constantemente se apilan y quitan URLs en los extremos.

\*   \*\*HashSet:\*\* El registro de matrículas de autos en un estacionamiento. No puede haber dos autos con las mismas placas adentro al mismo tiempo.

\*   \*\*HashMap:\*\* El directorio de contactos del celular. Buscas por el nombre de la persona (Clave única) para que te devuelva su número (Valor).

\*   \*\*Hashtable:\*\* Un sistema de inventario bancario muy antiguo donde varias terminales intentan modificar el saldo al mismo tiempo (requiere sincronización estricta).



\*\*5. Mis ejercicios\*\*

\*   \*\*HistorialNavegador.java:\*\* Simula el registro de las páginas web visitadas en una pestaña de navegador. Usa un `ArrayList` porque me interesa registrar el orden exacto cronológico de las visitas, y una misma página se puede visitar varias veces.

\*   \*\*MenuComidaRapida.java:\*\* Gestiona los precios del menú de una cadena de pizzas. Utiliza un `HashMap` porque es la estructura perfecta para asociar un producto directamente con su precio, permitiendo actualizaciones rápidas a través de su nombre.

\*   \*\*AsistenciaUNAM.java:\*\* Lleva el control de asistencia para una entrega de laboratorio. Utiliza un `HashSet` porque si un alumno intenta registrar su entrega dos veces, la colección bloqueará el duplicado automáticamente.



\*\*6. Referencias\*\*

\*   Oracle Corporation. (2023). \*Java Collections Framework\*. Documentación oficial de Java SE 21. Disponible en: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/doc-files/coll-index.html

