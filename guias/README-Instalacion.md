# Antes del miércoles 19 de agosto

**MPOO 2027-1 · Grupo 6**

Instala esto **en tu computadora, antes de la clase**. El miércoles solo verificamos que
funcione. Si haces esto, la verificación te toma cinco minutos; si no lo haces, te toma la
sesión completa y no alcanzas a hacer la práctica.

> **La guía completa, con los comandos de tu sistema operativo, está en
> [`Lab-00-Entorno-y-Git.html`](Lab-00-Entorno-y-Git.html).** Ábrela, elige arriba tu sistema
> (Windows, macOS o Linux) y sigue la **Parte 0**.

---

## Los cuatro pendientes

- [ ] **JDK 21** (Eclipse Temurin)
- [ ] **Git**
- [ ] **IntelliJ IDEA** (hoy es un solo instalador con la capa gratuita activada; la "Community Edition" de los tutoriales viejos ya no existe como descarga aparte)
- [ ] **Cuenta de GitHub** creada

## Cómo saber si quedó bien

Abre tu terminal y corre los tres comandos:

```bash
java -version
javac -version
git --version
```

Deberías ver algo así:

```
openjdk version "21.0.4" 2024-07-16 LTS
javac 21.0.4
git version 2.45.2
```

Los números pueden variar. Lo que importa es que **las dos primeras digan 21** y que ninguna
diga `command not found`.

## Notas por sistema

**Windows.** Instala también **Git Bash** (viene con Git for Windows). Es la terminal que
vamos a usar en clase, y con ella **los comandos son idénticos a los de Mac y Linux**, así que
todos escribimos lo mismo. Si después de instalar la terminal no reconoce los comandos,
ciérrala y abre una nueva: Windows solo actualiza el PATH en terminales nuevas.

**macOS.** Si sale *"no se puede abrir porque el desarrollador no está verificado"*, ve a
**Ajustes del Sistema → Privacidad y seguridad** y dale **"Abrir de todos modos"**. Si tu Mac
es M1/M2/M3/M4 baja la versión **aarch64**; si es Intel, la **x64**.

**Linux.** En Ubuntu (22.04 o más nuevo) o Debian 13: `sudo apt install openjdk-21-jdk git`.
En Debian 12 y en Fedora ese paquete de Java ya no está en los repos; la guía completa
trae la alternativa (repo de Adoptium).

## Sobre tu cuenta de GitHub

Dos cosas que te van a importar en dos años:

- Usa un **nombre de usuario que puedas enseñar en una entrevista de trabajo**. Este
  repositorio va a ser lo primero que tengas en tu portafolio.
- Usa un **correo al que tengas acceso siempre**, no el institucional que pierdes al egresar.

---

## Si algo no instala

**Avísame el martes, no el miércoles a las 15:05.** Casi todos los problemas se resuelven en
cinco minutos por mensaje, y ninguno se resuelve bien con 26 personas esperando.

El error más común es `command not found` con el programa sí instalado. Eso es el **PATH**,
y la guía completa trae la sección **"El PATH, explicado desde cero"** con el arreglo paso a
paso para tu sistema.

Si de plano tu máquina no da, dímelo también: hay alternativas en navegador y no te vas a
quedar sin hacer la práctica.
