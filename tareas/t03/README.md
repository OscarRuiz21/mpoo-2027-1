# Tarea 3 · Contraseña, calculadora y un programa tuyo

**Entrega: domingo 4 de octubre, 23:59** · individual · con **push a tu rama** `entregas_apellido_nombre`,
en la carpeta `entregas/apellido_nombre/tareas/t03/` · **sin pull request**.

Son los ejercicios que quedaron de la clase del lunes 28 de septiembre, la de `while`, `do-while` y
`Scanner`. Tres programas, cada uno en su archivo y con su propio `main`.

## 1. Contraseña con tres intentos · `Contrasena.java`

El que planteamos al final de la clase y no alcanzamos a codificar entre todos.

- La contraseña correcta es `mpoo2027`.
- Pídela con `Scanner` y `nextLine()`, limpiando los espacios con `trim()`.
- Compárala con `equals`, **no con** `==`.
- Máximo **tres intentos**. Después de cada error, di cuántos quedan.
- Si acierta: `Bienvenido`. Si falla tres veces: `Cuenta bloqueada`.

Pista: un `while` con dos condiciones, `intentos < 3 && !correcta`.

Así se ve cuando acierta al segundo intento (los espacios de sobra no importan):

```
Contrasena: hola
Incorrecta. Te quedan 2 intentos.
Contrasena:   mpoo2027
Bienvenido
```

Y así cuando falla tres veces:

```
Contrasena: a
Incorrecta. Te quedan 2 intentos.
Contrasena: b
Incorrecta. Te quedan 1 intento.
Contrasena: c
Cuenta bloqueada
```

## 2. Calculadora · `Calculadora.java`

Un menú que se repite hasta que el usuario elija salir.

```
=== CALCULADORA ===
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Factorial
0. Salir
Opcion:
```

- El menú se repite **hasta que elijan 0**. Pista: `do-while`, porque el menú se muestra al menos una vez.
- La opción se decide con un **`switch`**; una opción que no existe cae en `default`.
- Las opciones 1 a 4 piden **dos números** (pueden traer decimales: `nextDouble()`).
- La opción 5 pide **un entero** y calcula su factorial con un **`for`**: 5! = 1 × 2 × 3 × 4 × 5 = 120.
  Guárdalo en un `long`, porque crece muy rápido.
- Valida con `if`:
  - dividir entre 0 → `No se puede dividir entre 0`
  - factorial de un negativo → `No existe el factorial de un negativo`
  - factorial de más de 20 → `Demasiado grande: el maximo es 20` (21! ya no cabe en un `long`)

Así se ve una sesión (lo que teclea el usuario va después de los dos puntos):

```
Opcion: 1
Primer numero: 7
Segundo numero: 5
Resultado: 12.0

Opcion: 4
Primer numero: 9
Segundo numero: 0
No se puede dividir entre 0

Opcion: 5
Numero: 5
Resultado: 5! = 120

Opcion: 8
Opcion no valida

Opcion: 0
Adios
```

(Entre una operación y otra se vuelve a mostrar el menú completo; aquí se omite para que se lea mejor.)

## 3. Tu ejercicio libre · el nombre que tú quieras

Un programa **tuyo**, del tema que quieras, que use **las cinco cosas**:

| Debe usar | Para qué, por ejemplo |
|---|---|
| `Scanner` | pedir datos al usuario |
| `while` o `do-while` | repetir hasta que el usuario quiera salir, o hasta que un dato sea válido |
| `for` | recorrer o contar un número conocido de veces |
| `if` | validar o decidir |
| `switch` | un menú o varias opciones |

Arriba del archivo, un comentario de **tres líneas**: qué hace el programa, dónde usaste el `for` y
dónde el `switch`.

Ideas, por si no se te ocurre nada (no es obligatorio usarlas):

- **Cajero automático**: PIN con tres intentos, luego un menú de consultar, depositar y retirar, sin
  dejar el saldo en negativo.
- **Tablas de multiplicar**: un menú que pregunta qué tabla y hasta dónde, y la imprime con `for`.
- **Convertidor de unidades**: menú de conversiones (°C a °F, km a millas, pesos a dólares) que se
  repite hasta salir.
- **Promedio del grupo**: pide cuántos alumnos, lee cada calificación validando que esté entre 0 y 10,
  y al final dice el promedio y cuántos aprobaron.

Lo único que no vale: la calculadora o la contraseña con otro nombre.

## Qué subes

```
entregas/apellido_nombre/tareas/t03/
├── Contrasena.java       ├── Contrasena.class
├── Calculadora.java      ├── Calculadora.class
└── TuPrograma.java       └── TuPrograma.class
```

El `.class` no es opcional: **yo ejecuto tu `.class`, no lo recompilo**. Compila con el JDK 21 y
pruébalo antes de subir:

```bash
javac Calculadora.java
java Calculadora
```

## La entrega, paso a paso

```bash
git checkout entregas_apellido_nombre
git pull origin main
mkdir -p entregas/apellido_nombre/tareas/t03
# ... copias tus tres .java y tus tres .class ...
git add entregas/apellido_nombre/tareas/t03
git status                    # aqui deben aparecer los 6 archivos
git commit -m "T03: contrasena, calculadora y ejercicio libre"
git push
```

Si los `.class` no aparecen en el `git status`, súbelos a la fuerza:

```bash
git add -f entregas/apellido_nombre/tareas/t03/*.class
```

**No abras pull request**: el push ES la entrega. Si se te complica, escríbeme antes del domingo.
