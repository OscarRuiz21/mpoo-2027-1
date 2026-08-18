# La rutina de entrega

De la práctica 1 a la 12, siempre igual. Guárdate esta página.

## 0 · Antes de empezar: trae lo nuevo

En GitHub, en tu fork, dale a **Sync fork → Update branch** si aparece. Luego:

```bash
cd ~/mpoo/mpoo-2027-1
git pull
```

Baja las guías y el código de apoyo de la semana. Cinco segundos y te evita trabajar con
la guía vieja.

## 1 · Trabaja

Tu código va en `entregas/tuapellido/pNN/`. Nunca toques la carpeta de otro, ni `guias/`,
ni `apoyo/`.

## 2 · ¿Qué cambió?

```bash
git status
```

Míralo siempre antes de guardar. Si aparece un archivo que no esperabas, ahí lo cachas.

## 3 · Prepara lo que quieres guardar

```bash
git add entregas/tuapellido/pNN
```

Nombra tu carpeta. No uses `git add .`: eso agarra todo lo que haya, incluida basura del
IDE.

## 4 · Guarda con un mensaje que explique

```bash
git commit -m "P03: arreglos y arreglos multidimensionales"
```

Empieza con el número de práctica. Un mensaje como "cambios" no le sirve a nadie,
empezando por ti en noviembre.

## 5 · Súbelo

```bash
git push
```

Hasta aquí tu trabajo vivía solo en tu computadora. **Sin push no hay entrega.**

## 6 · Comprueba en GitHub

Entra a tu fork y confirma que tu archivo está ahí. **Lo que se califica es lo que se ve
en GitHub.** La hora que cuenta es la del push.

## Los cuatro errores de siempre

| Lo que pasa | Qué significa y qué haces |
|---|---|
| `nothing to commit` después del `add` | No guardaste el archivo en el editor, o lo pusiste en otra carpeta. Corre `git status` y revisa la ruta |
| Hiciste `commit` pero no aparece en GitHub | Falta el `push`. El commit guarda en tu computadora; el push lo sube. Es el error número uno |
| `rejected … fetch first` al hacer `push` | Hay algo en GitHub que no tienes abajo. Corre `git pull` y reintenta el `push` |
| Te pide contraseña y la rechaza | La contraseña de GitHub no sirve para `push`. En Windows, Git abre el navegador para autorizar; en macOS y Linux usa tu token (Parte 4.3 del Lab 0) |

## Si te atoras y no sabes qué hiciste

**No borres la carpeta ni vuelvas a clonar.** Corre `git status`, tómale captura y
mándamela. Casi siempre son dos comandos para salir, y aprender a leer `git status` vale
más que cualquier atajo.
