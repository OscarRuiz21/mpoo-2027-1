# Proyecto final · MPOO 2027-1

Una aplicación de consola en Java, hecha en equipo, que resuelva un problema real **modelándolo con
objetos**. Es donde juntan todo lo del curso: clases y encapsulamiento, herencia, polimorfismo,
interfaces, excepciones y paquetes.

No basta con que funcione: tiene que estar bien diseñado. Mejor un sistema chico y completo que uno
enorme a medias.

**Cómo se califica:** ver la [rúbrica del proyecto final](RUBRICA.md) (código 15, reporte en PDF 5,
presentación 5 y trabajo en equipo 5; 30 puntos del curso). La presentación es el **miércoles 25 de
noviembre** en la clase.

## Equipos y tema

- Equipos de **3 o 4**, los que ya registraron en la [Discussion #115](https://github.com/OscarRuiz21/mpoo-2027-1/discussions/115).
  Si todavía no tienes equipo, avísame ahí.
- El tema lo eligen ustedes. Si no se les ocurre, algunas ideas:

| Tema | Qué se modela |
|---|---|
| Biblioteca | Libros, usuarios, préstamos y multas |
| Banco | Clientes, cuentas de ahorro y de cheques, movimientos |
| Gestión escolar | Alumnos, profesores, cursos y calificaciones |
| Tienda | Productos, categorías, ventas e inventario |
| Juego por turnos | Personajes y enemigos con habilidades, como La mazmorra |
| Reservas | Hotel, cine o restaurante: clientes, lugares y reservaciones |

## Qué entregan

Solo dos cosas, en el comentario de su equipo en la Discussion #115:

1. **La liga al repo** de GitHub con el código. Que sea público para que yo lo pueda abrir.
2. **El reporte final en PDF**, adjunto en el mismo comentario.

**Opcional:** las diapositivas que usen de apoyo en la presentación, en PDF y en el mismo
comentario. No son obligatorias ni dan puntos por sí mismas.

## Qué debe tener el programa

Estos son obligatorios. Los cinco primeros son el mínimo para aprobar.

1. **Encapsulamiento.** Al menos 4 clases con atributos `private` y métodos que validan lo que
   reciben (un constructor o un setter que rechaza un precio negativo, por ejemplo).
2. **Herencia.** Una clase abstracta con al menos 2 clases hijas que sobrescriben sus métodos.
3. **Polimorfismo.** Un arreglo o lista del tipo de la madre que se recorre con un solo `for`,
   sin `if` que pregunte de qué tipo es cada objeto.
4. **Interfaz.** Al menos una interfaz propia, implementada por al menos 2 clases.
5. **Excepciones.** El programa no truena si el usuario escribe algo inválido en el menú
   (`try-catch`), y la validación del punto 1 lanza `IllegalArgumentException` con un mensaje claro.
6. **Menú de consola** con `Scanner` que valida lo que escribe el usuario.
7. **Paquetes.** El código organizado en paquetes con `package` e `import`.

**Puntos extra (hasta 1 punto):** una excepción propia del dominio (`SaldoInsuficienteException`,
por ejemplo), guardar y leer datos de un archivo, un patrón de diseño bien justificado o una
interfaz gráfica.

## El reporte

Un reporte en **PDF**, bien presentado. Lo mínimo que debe traer:

1. **Portada:** nombre del equipo, integrantes y liga al repo.
2. **El problema:** qué resuelve el sistema y para quién.
3. **Diagrama de clases** en UML, que coincida con el código.
4. **Dónde está cada concepto:** una tabla que diga en qué clase o archivo usaron encapsulamiento,
   herencia, polimorfismo, la interfaz y las excepciones.
5. **Cómo compilarlo y correrlo:** los pasos, y una captura del programa funcionando.
6. **Qué falta y qué harían distinto.**
7. **Quién hizo qué:** lo que aportó cada integrante.

## La presentación

El miércoles 25 de noviembre, en la clase. Cada equipo tiene **8 a 10 minutos**: qué problema
resuelve, una demo en vivo y un recorrido corto por su diagrama de clases. Todos los integrantes
presentan una parte. Si les ayuda, pueden apoyarse en unas cuantas diapositivas; si no, basta con
la demo y el diagrama.

Después le pregunto a **cualquiera** del equipo cómo funciona alguna parte del código y por qué lo
hicieron así. Esa respuesta es individual y cuenta en la defensa técnica de cada quien, no en la
calificación del equipo. Pueden usar IA como apoyo, pero cada integrante tiene que poder explicar
todo el código.

## Fechas

- **Lunes 23 de noviembre:** asesoría en clase. Traigan lo que lleven y sus dudas.
- **Miércoles 25 de noviembre, antes de las 15:00:** la liga al repo y el reporte en PDF (y, si
  las hacen, sus diapositivas) en la Discussion #115. Ese mismo día, presentaciones.
