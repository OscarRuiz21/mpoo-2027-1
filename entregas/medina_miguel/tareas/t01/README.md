# Tarea 1 · Radiografías con contexto

**Entrega: lunes 14 de septiembre, antes de la clase** · con **push a tu rama**
`entregas_apellido_nombre`, en la carpeta `entregas/apellido_nombre/tareas/t01/` ·
**sin pull request**.

> 📖 **La guía completa, con el ejemplo resuelto de principio a fin, está en
> [T01-Radiografias-con-contexto.html](https://oscarruiz21.github.io/mpoo-2027-1/tareas/t01/T01-Radiografias-con-contexto.html)**
> (también en [PDF](https://oscarruiz21.github.io/mpoo-2027-1/tareas/t01/T01-Radiografias-con-contexto.pdf)).
> Este archivo es el resumen.

Elige **3 objetos de tu vida** — prohibidos los de las prácticas y la clase. Por cada
uno, **parte de la plantilla** [`plantillas/MiObjeto.java`](plantillas/MiObjeto.java):

1. **El comentario de modelado** (4 líneas): CONTEXTO · QUÉ SABE Y POR QUÉ · QUÉ SABE
   HACER Y POR QUÉ · QUÉ IGNORÉ.
2. **La clase**: 2+ atributos y 2+ métodos (mínimo uno `void` con parámetro y uno que
   retorne), cada parte etiquetada y **la firma de cada método en comentario**
   (`// firma: retirar(double)`).
3. **Un constructor en al menos UNA de tus tres clases** (mismo nombre que la clase, sin
   tipo de retorno, con `this.`).
4. **El `main` de la plantilla completado**: estado inicial → invocaciones (firma +
   resultado/efecto) → estado final.
5. **El QUIZ de vocabulario** (ver abajo).

## Los archivos: son 7, más nada

```
entregas/apellido_nombre/tareas/t01/
├── Objeto1.java   ├── Objeto1.class
├── Objeto2.java   ├── Objeto2.class
├── Objeto3.java   ├── Objeto3.class
└── QUIZ.md
```

Compila con el JDK 21 del curso (`javac TuClase.java`) y **sube el `.java` Y el
`.class`**. Yo ejecuto tu `.class`, no lo recompilo: **si no corre en mi máquina, la
tarea está a la mitad**. Antes de subir: borra el `.class`, recompila y córrelo una
última vez.

## El quiz de vocabulario (20 %)

Un archivo `QUIZ.md` en la misma carpeta, partiendo de la plantilla
[`plantillas/QUIZ.md`](plantillas/QUIZ.md): **diez preguntas cortas sobre lo visto el
lunes** (atributo vs variable, constructor, `this`, firma, parámetro vs argumento,
`void`, primitivos vs referencias y `null`, división entera, casting, `new`/clase/
instancia). Las cuatro reglas:

1. **Con tus palabras** — la definición copiada de la slide o de internet vale cero.
2. **Máximo 3 renglones** por respuesta.
3. Donde diga "de tu tarea", **pega la línea real de tu código**.
4. Una respuesta razonada pero equivocada da más puntos que una copiada perfecta.

## Cómo se califica

| Rubro | % |
|---|---|
| Justificación del modelo (el comentario de 4 líneas) | 30 |
| Código completo y etiquetado | 30 |
| Que corra (`java TuClase` en mi máquina) | 20 |
| Quiz de vocabulario | 20 |
