# La rutina de entrega

**Una sola rama tuya para todo el semestre.** De la Tarea 1 a la práctica 12, siempre igual.

## Primera vez · conecta tu clon con TU rama del semestre

**Ya está todo puesto de tu lado.** Tu rama `entregas_apellido_nombre` existe en GitHub,
tiene **todo tu trabajo ya integrado** y está al día con el material del curso. Las ramas
viejas (`p01-…`, `p02-…`) ya no existen: las recogimos y las cerramos. Un solo comando:

```bash
git fetch origin                          # entérate de las ramas del repositorio
git checkout entregas_apellido_nombre     # tu copia local, ya conectada con la remota
```

Si tenías una rama local vieja y te estorba, bórrala sin miedo — su contenido ya está en
tu rama nueva:

```bash
git branch -D p02-apellido                # -D borra esa rama SOLO de tu computadora
```

**Tu carpeta cambió de nombre.** Ahora todas se llaman igual: `entregas/apellido_nombre/`,
en minúsculas y con guion bajo, y las prácticas van con dos dígitos (`p01`, no `p1`). Si
tu carpeta se llamaba de otra forma, ya la renombramos: no la vuelvas a crear, solo trabaja
en la que baja.

Esto se hace **una sola vez**; después, tu semana es la rutina de abajo.

## Opcional · ver solo TU carpeta, sin las de tus compañeros

Como todos trabajamos en el mismo repositorio, al bajarlo aparecen las carpetas de los 29.
Si te estorban para encontrar la tuya, puedes pedirle a Git que en tu computadora solo
aparezcan el material del curso y tu carpeta:

```bash
git sparse-checkout init --cone
git sparse-checkout set guias-laboratorios material apoyo tareas calificaciones entregas/apellido_nombre
```

A partir de ahí, `entregas/` solo te muestra la tuya. **No borra nada de nadie**: las demás
siguen en GitHub, simplemente no se copian a tu disco. Todo lo demás funciona igual — `add`,
`commit`, `push` y `git pull origin main` se comportan exactamente como siempre.

Para volver a verlo todo:

```bash
git sparse-checkout disable
```

Necesita Git 2.25 o más nuevo (`git --version` te lo dice). Es **opcional**: si te confunde,
no lo uses — no cambia en nada tu calificación ni tu forma de entregar.

## Mantén tu local al día

Son **dos pulls distintos, para dos cosas distintas**:

```bash
git pull                    # trae TU rama tal como está en GitHub (si trabajas en dos máquinas, o si te subimos algo)
git pull origin main        # trae el material nuevo del curso (guías, tareas, apoyo) a tu rama
```

## 0 · Párate en tu rama

```bash
cd ~/mpoo/mpoo-2027-1
git fetch origin                        # entérate de lo nuevo (tu rama ya existe: te la creamos)
git checkout entregas_apellido_nombre   # tu rama del semestre
git pull origin main                    # trae guías y material nuevos DIRECTO a tu rama, en un paso
```

**Nunca trabajas en `main`**: está protegida y no te va a dejar subir. No te asustes si el
pull lista ramas de tus compañeros: es solo el índice, no toca tu trabajo.

## 1 · Trabaja

Tu código va en `entregas/apellido_nombre/pNN/` (o `tareas/tNN/` para las tareas). Nunca toques la
carpeta de otro, ni `guias-laboratorios/`, ni `apoyo/`.

## 2 · ¿Qué cambió?

```bash
git status
```

Míralo siempre antes de guardar. Si aparece un archivo que no esperabas, ahí lo cachas.

## 3 · Prepara lo que quieres guardar

```bash
git add entregas/apellido_nombre/tareas/t01
```

Nombra tu carpeta. No uses `git add .`: eso agarra todo lo que haya, incluida basura del
IDE. Cuando la entrega pida el `.class`, va junto con su `.java`.

## 4 · Guarda con un mensaje que explique

```bash
git commit -m "T01: radiografias con contexto"
```

Empieza con el número de práctica o tarea. Un mensaje como "cambios" no le sirve a nadie,
empezando por ti en noviembre.

## 5 · Sube — y eso ES la entrega

```bash
git push -u origin entregas_apellido_nombre
```

El `-u origin …` solo la primera vez; después basta `git push`. **Sin push no hay nada, y
la hora del último push es la que cuenta.** **NO abras pull request**: el PR es UNO solo,
al final del semestre, con todo tu trabajo.

## Los errores de siempre

| Lo que pasa | Qué significa y qué haces |
|---|---|
| `nothing to commit` después del `add` | No guardaste el archivo en el editor, o lo pusiste en otra carpeta. Corre `git status` y revisa la ruta |
| Hiciste `commit` pero no aparece en GitHub | Falta el `push`. El commit guarda en tu computadora; el push lo sube. Es el error número uno |
| `protected branch` al hacer `push` | Commiteaste en `main` sin querer. No pasa nada: `git checkout entregas_apellido_nombre` (o créala con `-b`) se lleva tus commits a tu rama, y desde ahí pusheas normal |
| Tu rama vieja (`pNN-…`) ya no aparece en GitHub | La cerramos a propósito: **tu trabajo ya está en tu rama `entregas_…` y en `main`**, no se perdió nada. `git fetch origin` y `git checkout entregas_apellido_nombre` |
| No encuentras tu carpeta, o tiene otro nombre | La renombramos a `entregas/apellido_nombre/` (minúsculas, guion bajo). Haz `git pull origin main` y trabaja en la que baje; no crees una nueva |
| Te pide contraseña y la rechaza | La contraseña de GitHub no sirve para `push`. En Windows, Git abre el navegador para autorizar; en macOS y Linux usa tu token (Parte 4.4 del Lab 0) |

## Si te atoras y no sabes qué hiciste

**No borres la carpeta ni vuelvas a clonar.** Corre `git status`, tómale captura y
mándamela. Casi siempre son dos comandos para salir, y aprender a leer `git status` vale
más que cualquier atajo.
