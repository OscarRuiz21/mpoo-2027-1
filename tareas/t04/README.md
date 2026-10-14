# Tarea 4 · Colecciones de Java

**Entrega: miércoles 21 de octubre, antes de la clase (15:00)** · individual · con **push a tu rama**
`entregas_apellido_nombre`, en la carpeta `entregas/apellido_nombre/tareas/t04/` · **sin pull request**.

Con el parcial no alcanzamos a hacer la práctica de estructuras de repetición. El `while`, el `do-while`,
el `for` y el `break` ya los vieron en clase y en el examen. Lo que sí quiero que conozcan es la otra mitad
de esa práctica: las **colecciones**. Están en la **Guía 06 del MADO-21, páginas 90 a 95**
([`guias-laboratorios/MADO-21_MPOO.pdf`](../../guias-laboratorios/MADO-21_MPOO.pdf)).

Una colección es parecida a un arreglo, pero es un **objeto**. No tiene tamaño fijo, crece y se encoge
mientras el programa corre, y ya trae métodos para agregar, quitar, buscar y recorrer. Java las da hechas
en el paquete `java.util`.

La tarea tiene dos partes: una investigación y tres programas.

## 1. Investigación · `investigacion.md` o `investigacion.pdf`

Con tus palabras, no copiado:

1. **Qué es una colección** y en qué se parece y en qué se distingue de un arreglo.
2. **Las tres familias**: listas (`List`), conjuntos (`Set`) y mapas (`Map`). Qué tiene cada una.
3. **Una tabla** con estas cinco clases:

   | Clase | Familia | ¿Mantiene el orden? | ¿Acepta repetidos? | ¿Cómo sacas un elemento? | ¿Para qué la usarías? |
   |---|---|---|---|---|---|
   | `ArrayList` | | | | | |
   | `LinkedList` | | | | | |
   | `HashSet` | | | | | |
   | `HashMap` | | | | | |
   | `Hashtable` | | | | | |

4. **Un escenario real por clase**, por ejemplo "la fila de un banco" o "el directorio de un edificio":
   dónde usarías cada una y por qué esa y no otra.
5. **Mis ejercicios**: por cada programa de la parte 2, qué hace, qué colección usa, **por qué escogiste
   esa** y qué imprime. Esta parte es la que más pesa.
6. **Referencias**, con liga. La documentación oficial de Java 21 (`java.util`) cuenta.

## 2. Tres programas · tres colecciones distintas

Cada programa en su archivo, con su propio `main`, y cada uno con **una colección diferente** de la tabla.

- **Hasta dos** pueden basarse en los ejemplos del MADO-21 (páginas 91 a 95) o de lo que encuentres al
  investigar.
- **Al menos uno es original tuyo**, de un tema que tú escojas.

En cada programa usa por lo menos:

- agregar (`add` o `put`),
- buscar o consultar (`get`, `contains` o `containsKey`),
- quitar (`remove`),
- el tamaño (`size`),
- y un recorrido con `for`.

Arriba de cada archivo, un comentario de una o dos líneas: qué hace el programa y por qué esa colección.

### Cómo se declara una colección

```java
import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<>();
nombres.add("Marta");
nombres.add("Tomas");
System.out.println(nombres.size());   // 2
```

Dos detalles:

- Lo que va entre `< >` es el tipo de lo que guarda. Las colecciones guardan **objetos**, así que para
  números se usa la clase envolvente: `ArrayList<Integer>`, **no** `ArrayList<int>`. Son los *wrappers*
  que vimos con los arreglos.
- El MADO-21 escribe `new ArrayList<Integer>( )`, con el tipo repetido a la derecha. Desde Java 7 basta
  con `new ArrayList<>()`. Las dos formas son válidas.

Ideas para el original, por si no se te ocurre nada (no es obligatorio usarlas):

- **Lista de pendientes** que se puede reordenar y donde un pendiente puede repetirse.
- **Asistencia** donde nadie cuenta dos veces aunque pase lista dos veces.
- **Agenda** que busca el teléfono o la extensión a partir de un nombre.
- **Inventario** de una tienda: producto y existencias.

## Qué subes

```
entregas/apellido_nombre/tareas/t04/
├── investigacion.md   (o investigacion.pdf)
├── Programa1.java     ├── Programa1.class
├── Programa2.java     ├── Programa2.class
└── Programa3.java     └── Programa3.class
```

Los nombres de los programas los escoges tú. El `.class` no es opcional: **yo ejecuto tu `.class`, no lo
recompilo**. Compila con el JDK 21 y pruébalo antes de subir:

```bash
javac Programa1.java
java Programa1
```

## La entrega, paso a paso

```bash
git checkout entregas_apellido_nombre
git pull origin main
mkdir -p entregas/apellido_nombre/tareas/t04
# ... copias tu investigación, tus tres .java y tus tres .class ...
git add entregas/apellido_nombre/tareas/t04
git status                    # aqui deben aparecer los 7 archivos
git commit -m "T04: colecciones"
git push
```

Si los `.class` no aparecen en el `git status`, súbelos a la fuerza:

```bash
git add -f entregas/apellido_nombre/tareas/t04/*.class
```

**No abras pull request**: el push ES la entrega. Si se te complica, escríbeme antes del miércoles.
