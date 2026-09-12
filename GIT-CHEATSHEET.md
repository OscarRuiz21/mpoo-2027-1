# La rutina de entrega

**Una sola rama tuya para todo el semestre.** De la Tarea 1 a la práctica 12, siempre igual.

## Primera vez · conecta tu clon con TU rama del semestre

Tu rama `entregas_apellido_nombre` **ya existe en GitHub** (te la creamos, y si tenías
trabajo pendiente, ya viaja en ella). Elige UN camino según tu caso:

**A · Lo más común — solo tráela:**

```bash
git fetch origin                          # entérate de las ramas nuevas del repositorio
git checkout entregas_apellido_nombre     # crea tu copia local, ya conectada con la remota
```

**B · Ya tenías una rama local con otro nombre (p02-apellido, etc.) y quieres conservarla renombrándola:**

```bash
git branch -m p02-apellido entregas_apellido_nombre   # renómbrala (-m = move/rename)
git fetch origin                                      # entérate de la rama remota
git branch -u origin/entregas_apellido_nombre         # conéctala con la remota (-u = upstream)
git pull                                              # mezcla lo que ya haya en la remota con lo tuyo
git push                                              # y sube el resultado
```

**C · Prefieres empezar de cero:** haz el camino A, copia tus archivos a tu carpeta de
`entregas/apellido_nombre/`, y sigue la rutina normal de abajo.

Cualquiera de los tres se hace **una sola vez**; después, tu semana es la rutina de abajo.

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
| Trabajaste en una rama vieja (`pNN-…`) | Tu rama `entregas_…` ya existe con tu trabajo: `git fetch origin` y `git checkout entregas_apellido_nombre`; desde hoy todo va ahí |
| Te pide contraseña y la rechaza | La contraseña de GitHub no sirve para `push`. En Windows, Git abre el navegador para autorizar; en macOS y Linux usa tu token (Parte 4.4 del Lab 0) |

## Si te atoras y no sabes qué hiciste

**No borres la carpeta ni vuelvas a clonar.** Corre `git status`, tómale captura y
mándamela. Casi siempre son dos comandos para salir, y aprender a leer `git status` vale
más que cualquier atajo.
