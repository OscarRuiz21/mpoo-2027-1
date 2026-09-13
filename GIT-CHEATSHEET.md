# La rutina de entrega

> Esta misma guía, en bonito y con glosario, vive en
> **<https://oscarruiz21.github.io/mpoo-2027-1/guias/Guia-Git-GitHub.html>**. Es la página
> que conviene dejar en marcadores.

De la práctica 1 a la 12, siempre igual. Guárdate esta página.

## 0 · Antes de empezar: trae lo nuevo

```bash
cd ~/mpoo/mpoo-2027-1
git checkout main
git pull
```

Baja las guías y el código de apoyo de la semana. Cinco segundos y te evita trabajar con
la guía vieja.

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
| `protected branch` al hacer `push` | Commiteaste en `main` sin querer. No pasa nada: `git checkout -b pNN-apellido` se lleva tus commits a la rama nueva, y desde ahí pusheas normal |
| Olvidaste el `-u origin …` en el primer push | Git te lo dice con el comando exacto en pantalla. Cópialo y córrelo |
| Te pide contraseña y la rechaza | La contraseña de GitHub no sirve para `push`. En Windows, Git abre el navegador para autorizar; en macOS y Linux usa tu token (Parte 4.4 del Lab 0) |

## Si te atoras y no sabes qué hiciste

**No borres la carpeta ni vuelvas a clonar.** Corre `git status`, tómale captura y
mándamela. Casi siempre son dos comandos para salir, y aprender a leer `git status` vale
más que cualquier atajo.
