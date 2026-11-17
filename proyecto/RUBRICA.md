# Rúbrica del proyecto final · MPOO 2027-1

El proyecto vale **30 puntos** del curso.

| Rubro | Puntos | Quién |
|---|---|---|
| Código | 15 | Equipo |
| Reporte final (PDF) | 5 | Equipo |
| Presentación | 5 | Equipo |
| Trabajo en equipo | 5 | Equipo, revisado por integrante |

**Para aprobar**, el programa tiene que compilar, correr y cumplir los cinco primeros requisitos
del [README](README.md). Si no compila o le falta alguno de esos cinco, no aprueba, sin importar
el resto.

Cada criterio se califica como **completo** (todos los puntos), **a medias** (más o menos la mitad)
o **ausente** (cero o casi cero).

## 1. Código · 15 puntos

| Criterio | Pts | Completo | A medias | Ausente |
|---|---|---|---|---|
| Encapsulamiento | 3 | Atributos `private` y métodos que validan donde hace falta | `private` pero sin validar, o algunos atributos públicos | Atributos públicos |
| Herencia | 3 | Clase abstracta con 2 o más hijas que tienen sentido en el problema | Herencia forzada o que no aporta nada | Sin herencia |
| Polimorfismo | 3 | Un arreglo o lista del tipo de la madre recorrido sin preguntar el tipo | Polimorfismo mínimo, o con `if` por tipo | Sin polimorfismo |
| Interfaz | 2 | Interfaz propia implementada por 2 o más clases y usada por su tipo | Interfaz que nadie usa por su tipo | Sin interfaz |
| Excepciones | 2 | El menú no truena con entradas inválidas y la validación lanza `IllegalArgumentException` | Solo una de las dos, o `catch` vacíos | El programa truena con una entrada inválida |
| Orden | 2 | Paquetes, nombres claros y menú con `Scanner` que valida | Parcial | Todo en un archivo o sin menú |

## 2. Reporte final · 5 puntos

| Criterio | Pts | Completo | A medias | Ausente |
|---|---|---|---|---|
| Claridad y estructura | 1 | Trae los siete puntos del README, se lee fácil | Le faltan puntos o está desordenado | Sin reporte |
| Diagrama de clases | 1.5 | Correcto y coincide con el código | Errores menores o no coincide en partes | Sin diagrama |
| Dónde está cada concepto | 1.5 | Tabla con cada concepto y su clase o archivo | Menciona los conceptos sin decir dónde | No lo explica |
| Cómo correrlo | 0.5 | Los pasos funcionan tal cual | Incompletos | Ausentes |
| Quién hizo qué | 0.5 | Claro por integrante | Vago | Ausente |

## 3. Presentación · 5 puntos

| Criterio | Pts | Completo | A medias | Ausente |
|---|---|---|---|---|
| Claridad | 1.5 | Se entiende qué resuelve y cómo está hecho | Desordenada | Confusa |
| Demo en vivo | 1.5 | El sistema funciona frente al grupo | Demo parcial o con fallas | Sin demo |
| Todos presentan | 1 | Cada integrante presenta una parte | Uno o dos hablan casi todo | Uno solo |
| Tiempo | 1 | Entre 8 y 10 minutos | Se pasa o se queda muy corto | Ignora el tiempo |

## 4. Trabajo en equipo · 5 puntos

Se revisa en el historial de commits del repo.

| Criterio | Pts | Completo | A medias | Ausente |
|---|---|---|---|---|
| Commits de cada integrante | 2.5 | Todos tienen commits con trabajo real | Reparto muy desigual | Uno o dos hicieron casi todo |
| Trabajo a lo largo del tiempo | 2.5 | Commits repartidos en las dos semanas | Casi todo en los últimos dos días | Un solo commit con todo |

Si un integrante no tiene commits, su calificación del proyecto se revisa aparte.

## Defensa individual

Va aparte, en el rubro de **defensa técnica** del curso (5 de sus 10 puntos), no en estos 30. Después
de la presentación pregunto a cualquier integrante cómo funciona una parte del código y por qué lo
hicieron así. Se califica a cada quien por lo que conteste.

## Puntos extra

Hasta **1 punto** sobre los 30: excepción propia del dominio, archivos, un patrón de diseño
justificado o interfaz gráfica.
