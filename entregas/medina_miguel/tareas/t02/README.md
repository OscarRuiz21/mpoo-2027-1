# Tarea 2 · Las dos que quedaron de la S10

**Entrega: domingo 27 de septiembre, 23:59** · con **push a tu rama** `entregas_apellido_nombre`,
en la carpeta `entregas/apellido_nombre/tareas/t02/` · **sin pull request**.

Son los dos ejercicios "Tu turno" de la clase del lunes 21. Los archivos base ya estan en
[`apoyo/ejemplosClase/S10/`](../../apoyo/ejemplosClase/S10): bajalos y completalos. El miercoles
los practicamos en el laboratorio, asi que puedes llegar con dudas.

## 1. ¿El año es bisiesto? · `TuTurnoBisiesto.java`

Completa el metodo `esBisiesto(int anio)` para que devuelva `true` o `false`.

> Un año es bisiesto si es divisible entre 4, **excepto** los divisibles entre 100,
> **salvo** que tambien lo sean entre 400.

El `main` ya trae los cuatro casos con el resultado que debe dar: 2024 es bisiesto, 1900 no,
2000 si, 2026 no. Si los cuatro salen bien, quedo.

## 2. Clasificador de calificaciones · `TuTurnoCalificaciones.java`

Lee una calificacion de 0 a 100 con `Scanner` y muestra su letra, **de las dos formas**:
`letraConIf` con la escalera `if-else-if`, y `letraConSwitch` con `switch` (clasico o moderno,
tu eliges).

| Calificacion | Letra |
|---|---|
| 90 a 100 | A |
| 80 a 89 | B |
| 70 a 79 | C |
| 60 a 69 | D |
| menos de 60 | F |

Pista para el `switch`: divide entre 10 y evalua el resultado.

## Que subes

```
entregas/apellido_nombre/tareas/t02/
├── TuTurnoBisiesto.java        ├── TuTurnoBisiesto.class
└── TuTurnoCalificaciones.java  └── TuTurnoCalificaciones.class
```

El `.class` no es opcional: **yo ejecuto tu `.class`, no lo recompilo**. Compila con el JDK 21 y
pruebalo antes de subir:

```bash
javac TuTurnoBisiesto.java
java TuTurnoBisiesto
```

## Si tus .class no se suben

Le paso esto a todo el grupo porque en la T01 le paso a varios: **tu rama trae una version vieja
del archivo que le dice a Git que ignore los `.class`**. La correccion ya esta en `main`, asi que
lo primero de la rutina la arregla:

```bash
git checkout entregas_apellido_nombre
git pull origin main          # esto trae la correccion
mkdir -p entregas/apellido_nombre/tareas/t02
# ... copias tus dos .java y tus dos .class ...
git add entregas/apellido_nombre/tareas/t02
git status                    # aqui deben aparecer los 4 archivos
git commit -m "T02: bisiesto y calificaciones"
git push
```

Si aun asi no aparecen los `.class` en el `git status`, subelos a la fuerza:

```bash
git add -f entregas/apellido_nombre/tareas/t02/*.class
```

**No abras pull request**: el push ES la entrega. Si se te complica, escribeme antes del domingo.
