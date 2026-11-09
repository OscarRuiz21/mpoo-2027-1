# MPOO 2027-1 · Grupo 6

**Modelos de Programación Orientada a Objetos · Clave 1332 · FI-UNAM**
Prof. Oscar Manuel Ruiz Hurtado · Semestre 2027-1

**¿Primera vez aquí? Empieza en [`EMPIEZA-AQUI.md`](EMPIEZA-AQUI.md).**

## Avisos

**Formulario del reglamento del laboratorio.** Respóndelo **del 3 al 13 de noviembre**, en el día y horario de clase: <https://forms.gle/D4JtCKJweRL5CdwZ6>

1. Ten presentes las disposiciones y protocolos que revisamos en la primera sesión de laboratorio.
2. Entra al formulario con la liga de arriba.
3. Captura tus datos generales: fecha, materia, grupo, profesor, nombre y número de cuenta.
4. Responde el cuestionario sobre el reglamento y confirma tu aceptación al final.

**Documentos de referencia obligatoria.** El cuestionario es sobre estos dos reglamentos:

- [Reglamento del Laboratorio (REDO-01)](http://lcp02.fi-b.unam.mx/)
- [Reglamento General de Uso de Laboratorios y Talleres](https://consejofi.fi-a.unam.mx/documentos_relacionados/Normatividad/Reglamento%20General%20de%20Uso%20de%20Laboratorios%20y%20Talleres.pdf)

## Los enlaces del curso

| Qué es | Dónde |
|---|---|
| **Clase de teoría · lunes 15:00–17:00** | [Entrar por Zoom](https://cuaed-unam-mx.zoom.us/j/88126568099) · ID `881 2656 8099` |
| **Página del curso** | <https://oscarruiz21.github.io/mpoo-2027-1/> |
| **Lab 0 · Entorno de trabajo y primer pull request** | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/Lab-00/Lab-00-Entorno-y-Git.html> |
| **Guía de Git y GitHub** · la rutina de entrega, paso a paso | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/referencia/Guia-Git-GitHub.html> |
| Cheatsheet de Git · la rutina en corto | [`GIT-CHEATSHEET.md`](GIT-CHEATSHEET.md) |
| **Manual de prácticas (MADO-21)** · las 12 prácticas oficiales | [`guias-laboratorios/MADO-21_MPOO.pdf`](https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/MADO-21_MPOO.pdf) |
| **Tarea 1 · Radiografías con contexto** (entrega lun 14-sep) | <https://oscarruiz21.github.io/mpoo-2027-1/tareas/t01/T01-Radiografias-con-contexto.html> |
| **Lab 4 · Arreglos con tus manos** (mié 23-sep, entrega vie 25) | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/Lab-04/P04-Arreglos-con-tus-manos.html> |
| ↳ el archivo del Lab 4 · `P4Arreglos.java` | [`guias-laboratorios/Lab-04/P4Arreglos.java`](guias-laboratorios/Lab-04/P4Arreglos.java) |
| **Lab 5 · Estructuras de selección** (mié 30-sep, en parejas, entrega vie 2-oct) | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/Lab-05/P05-Estructuras-de-seleccion.html> |
| ↳ los archivos del Lab 5 · `P05-archivos.zip` | [`guias-laboratorios/Lab-05/P05-archivos.zip`](guias-laboratorios/Lab-05/P05-archivos.zip) |
| **Lab 7 · Herencia, primera parte** (mié 14-oct, en parejas, entrega vie 16-oct) | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/Lab-07/P07-Herencia.html> |
| ↳ los archivos del Lab 7 · `P07-archivos.zip` | [`guias-laboratorios/Lab-07/P07-archivos.zip`](guias-laboratorios/Lab-07/P07-archivos.zip) |
| **Lab 8 · Herencia, segunda parte: la estación de clasificación** (mié 21-oct, en parejas, entrega vie 23-oct) | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/Lab-08/P08-Herencia.html> |
| ↳ los archivos del Lab 8 · `P08-archivos.zip` | [`guias-laboratorios/Lab-08/P08-archivos.zip`](guias-laboratorios/Lab-08/P08-archivos.zip) |
| **Lab 9 · Encapsulamiento, primera parte: La mazmorra** (mié 28-oct, en parejas, entrega vie 30-oct; la P10 la continúa) | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/Lab-09/P09-Encapsulamiento.html> |
| ↳ los archivos del Lab 9 · `P09-archivos.zip` | [`guias-laboratorios/Lab-09/P09-archivos.zip`](guias-laboratorios/Lab-09/P09-archivos.zip) |
| **Lab 10 · Polimorfismo, primera parte: La mazmorra, parte 2** (mié 4-nov, en parejas, entrega vie 6-nov; sobre el código de la P9, y el .zip trae una base para quien no la terminó) | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/Lab-10/P10-Polimorfismo.html> |
| ↳ los archivos del Lab 10 · `P10-archivos.zip` | [`guias-laboratorios/Lab-10/P10-archivos.zip`](guias-laboratorios/Lab-10/P10-archivos.zip) |
| **Tarea 2 · Año bisiesto y clasificador de calificaciones** (entrega dom 27-sep) | [`tareas/t02/README.md`](tareas/t02/README.md) |
| **Tarea 3 · Contraseña, calculadora y un programa tuyo** (entrega dom 4-oct) | [`tareas/t03/README.md`](tareas/t03/README.md) |
| **Lab 3 · Laboratorio de predicciones** (mié 9-sep) | <https://oscarruiz21.github.io/mpoo-2027-1/guias-laboratorios/Lab-03/P03-Laboratorio-de-predicciones.html> |
| ↳ el archivo del Lab 3 · `Laboratorio.java` | [`guias-laboratorios/Lab-03/Laboratorio.java`](guias-laboratorios/Lab-03/Laboratorio.java) |
| Todas las guías de laboratorio · una carpeta por lab | [`guias-laboratorios/`](guias-laboratorios/) |
| Instalación del entorno, versión texto | [`guias-laboratorios/referencia/README-Instalacion.md`](guias-laboratorios/referencia/README-Instalacion.md) |
| **Cómo va tu entrega** · cortes por número de cuenta | [`calificaciones/`](calificaciones/) |
| Cómo entregar · carpetas y ramas | [`entregas/README.md`](entregas/README.md) |
| **Proyecto final** · qué entregan y rúbrica (presentación mié 25-nov) | [`proyecto/README.md`](proyecto/README.md) |
| Decks de las clases de teoría | [`material/`](material/) |
| Código de ejemplo de cada tema | [`apoyo/`](apoyo/) |

## Ponderación

| Rubro | Puntos |
|---|---:|
| Exámenes parciales (2, presenciales) | 25 |
| Prácticas de laboratorio (12) | 25 |
| Defensa técnica | 10 |
| Proyecto final | 30 |
| Tareas y ejercicios | 10 |
| **Base** | **100** |
| Participación | **+5 extra** |
| **Máximo del curso** | **105** |

**El proyecto por dentro:** código 15 · informe 5 · presentación del equipo 5 · evidencia
de trabajo en equipo en GitHub 5.
