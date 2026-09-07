# Tarea 1 · Radiografías con contexto

**Entrega: lunes 14 de septiembre** · con **push a tu rama** `entregas_apellido_nombre`,
en la carpeta `entregas/apellido_nombre/tareas/t01/` · **sin pull request**.

Elige **3 objetos de tu vida** — prohibidos los de las prácticas y la clase (Punto,
Círculo, Coche, CuentaBancaria, Canción, Alumno). Por cada uno, **parte del esqueleto**
[`EsqueletoRadiografia.java`](EsqueletoRadiografia.java) y entrega:

## 1 · El comentario de modelado (arriba de la clase)

Las 4 líneas que vimos en clase:

- **CONTEXTO**: ¿en qué programa vive este objeto y para qué lo necesito?
- **QUÉ SABE Y POR QUÉ**: cada atributo con su razón de existir *en ese contexto*.
- **QUÉ SABE HACER Y POR QUÉ**: cada método — por qué es `void` o retorna, y por qué
  recibe esos parámetros (¿el dato vive en el objeto o viene de afuera?).
- **QUÉ IGNORÉ**: 1-2 cosas del objeto real que decidiste NO modelar, y por qué no
  importan en tu contexto.

## 2 · La clase

- **2 o más atributos** y **2 o más métodos** — mínimo uno `void` con parámetro y uno que
  retorne un valor.
- **Cada parte etiquetada** con su comentario: `// tipo:`, `// nombre:`,
  `// tipo de retorno:`, `// parámetro: tipo + nombre`…
- **La firma de cada método** señalada: `// firma: retirar(double)` — recuerda: la firma
  es nombre + tipos de parámetros; el tipo de retorno NO es parte de ella.

## 3 · El `main` del esqueleto, completado

Estado inicial → invocaciones (imprimiendo firma y resultado/efecto) → estado final.

## 4 · Los archivos: `.java` Y `.class`

Compila con el JDK 21 del curso (`javac TuClase.java`) y **sube ambos archivos**. Yo
ejecuto tu `.class` (`java TuClase`): **si no corre en mi entorno, la tarea está a la
mitad**.

```
entregas/apellido_nombre/tareas/t01/
├── Guitarra.java      ├── Guitarra.class
├── Mochila.java       ├── Mochila.class
└── ...                └── ...
```

**Se califica: la justificación + el código + que corra.** Una clase que compila pero no
dice *por qué* está a la mitad — y una justificación sin código también.
