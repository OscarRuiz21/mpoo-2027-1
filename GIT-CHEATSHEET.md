# La rutina de entrega

> Esta misma guía, en bonito y con glosario, vive en
> **<https://oscarruiz21.github.io/mpoo-2027-1/guias/Guia-Git-GitHub.html>**. Es la página
> que conviene dejar en marcadores.

De la práctica 1 a la 12, siempre igual. Guárdate esta página.

<<<<<<< HEAD
## 0 · Antes de empezar: trae lo nuevo
=======
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

En `entregas/` están las carpetas de las prácticas 0 a 2 de todo el grupo, ya revisadas.
No van a crecer —de aquí en adelante cada quien trabaja en su rama— pero si te estorban
para encontrar la tuya, puedes pedirle a Git que en tu computadora solo aparezcan el
material del curso y tu carpeta:

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

`git pull origin main` te trae **solo material del curso**: guías, tareas, decks, apoyo.
Las entregas de tus compañeros ya no pasan por `main` durante el semestre —cada quien
trabaja en su rama— así que este pull no te va a llenar la pantalla con archivos ajenos.

## 0 · Párate en tu rama
>>>>>>> dee213ebe7d4852d1350ae9b9d8c57a472b68da8

```bash
cd ~/mpoo/mpoo-2027-1
git checkout main
git pull
```

<<<<<<< HEAD
Baja las guías y el código de apoyo de la semana. Cinco segundos y te evita trabajar con
la guía vieja.
=======
**Nunca trabajas en `main`**: está protegida y no te va a dejar subir. El `git fetch` sí
lista los nombres de las ramas de todo el grupo: es solo el índice del repositorio, no baja
su trabajo ni toca el tuyo.
>>>>>>> dee213ebe7d4852d1350ae9b9d8c57a472b68da8

## 1 · Crea tu rama

```bash
git checkout -b pNN-apellido      # ejemplo: p03-ramirez
```

**Nunca trabajas en `main`**: está protegida y no te va a dejar subir. Cada práctica vive
en su propia rama.

## 2 · Trabaja

Tu código va en `entregas/apellido_nombre/pNN/`. Nunca toques la carpeta de otro, ni
`guias/`, ni `apoyo/`.

## 3 · ¿Qué cambió?

```bash
git status
```

Míralo siempre antes de guardar. Si aparece un archivo que no esperabas, ahí lo cachas.

## 4 · Prepara lo que quieres guardar

```bash
git add entregas/apellido_nombre/pNN
```

Nombra tu carpeta. No uses `git add .`: eso agarra todo lo que haya, incluida basura del
IDE.

## 5 · Guarda con un mensaje que explique

```bash
git commit -m "P03: arreglos y arreglos multidimensionales"
```

Empieza con el número de práctica. Un mensaje como "cambios" no le sirve a nadie,
empezando por ti en noviembre.

## 6 · Sube tu rama

```bash
git push -u origin pNN-apellido
```

El `-u origin …` solo la primera vez que subes esa rama; después basta `git push`.
**Sin push no hay nada.**

## 7 · Abre tu pull request

En `github.com/OscarRuiz21/mpoo-2027-1` aparece el aviso amarillo con tu rama:
**Compare & pull request** → título `PNN · Apellido` → **Create pull request**.

**Tu entrega es el PR.** Yo lo reviso y lo integro a `main`. La hora que cuenta es la de
tu último push a la rama.

## Los errores de siempre

| Lo que pasa | Qué significa y qué haces |
|---|---|
| `nothing to commit` después del `add` | No guardaste el archivo en el editor, o lo pusiste en otra carpeta. Corre `git status` y revisa la ruta |
| Hiciste `commit` pero no aparece en GitHub | Falta el `push`. El commit guarda en tu computadora; el push lo sube. Es el error número uno |
<<<<<<< HEAD
| `protected branch` al hacer `push` | Commiteaste en `main` sin querer. No pasa nada: `git checkout -b pNN-apellido` se lleva tus commits a la rama nueva, y desde ahí pusheas normal |
| Olvidaste el `-u origin …` en el primer push | Git te lo dice con el comando exacto en pantalla. Cópialo y córrelo |
=======
| `protected branch` al hacer `push` | Commiteaste en `main` sin querer. No pasa nada: `git checkout entregas_apellido_nombre` (o créala con `-b`) se lleva tus commits a tu rama, y desde ahí pusheas normal |
| Tu rama vieja (`pNN-…`) ya no aparece en GitHub | La cerramos a propósito: **tu trabajo ya está en tu rama `entregas_…` y en `main`**, no se perdió nada. `git fetch origin` y `git checkout entregas_apellido_nombre` |
| No encuentras tu carpeta, o tiene otro nombre | La renombramos a `entregas/apellido_nombre/` (minúsculas, guion bajo). Haz `git pull origin main` y trabaja en la que baje; no crees una nueva |
>>>>>>> dee213ebe7d4852d1350ae9b9d8c57a472b68da8
| Te pide contraseña y la rechaza | La contraseña de GitHub no sirve para `push`. En Windows, Git abre el navegador para autorizar; en macOS y Linux usa tu token (Parte 4.4 del Lab 0) |

## Si te atoras y no sabes qué hiciste

**No borres la carpeta ni vuelvas a clonar.** Corre `git status`, tómale captura y
mándamela. Casi siempre son dos comandos para salir, y aprender a leer `git status` vale
más que cualquier atajo.
