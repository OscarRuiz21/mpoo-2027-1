package streaming;

public class Main {

    public static void main(String[] args) {

        Cancion cancion = new Cancion("Lluvia en CU", 4);
        Contenido comoContenido = cancion;
        Descargable comoDescargable = cancion;

        System.out.println(comoContenido.reproducir());
        System.out.println("Ocupa " + comoDescargable.megas() + " MB");

        Video tutorial = new Video("Tutorial de Git", 12);
        Pelicula peli = new Pelicula("El ultimo commit", 110);

        tutorial.calificar(5);
        tutorial.calificar(4);
        peli.calificar(5);

        System.out.println(tutorial.reproducir());
        System.out.println(peli.reproducir());
        System.out.println("Tutorial: " + tutorial.promedio() + " estrellas");
        System.out.println("Pelicula: " + peli.promedio() + " estrellas, ocupa "
                + peli.megas() + " MB");

        Podcast podcast = new Podcast("Cafe con Java", 40);
        App mapa = new App("Mapa de CU", 80);

        mapa.calificar(4);
        mapa.calificar(2);
        System.out.println(mapa.getNombre() + ": " + mapa.promedio() + " estrellas");

        System.out.println("-- Maraton --");
        Contenido[] maraton = { cancion, tutorial, peli, podcast };
        int minutos = 0;

        for (Contenido c : maraton) {
            System.out.println(c.reproducir());
            minutos += c.getMinutos();
        }
        System.out.println("Total: " + minutos + " minutos");

        System.out.println("-- Descargas --");
        Descargable[] descargas = { cancion, peli, podcast, mapa };
        double megas = 0;

        for (Descargable d : descargas) {
            megas += d.megas();
        }

        System.out.println("Total: " + megas + " MB");
        if (megas <= 2048) {
            System.out.println("Cabe en tus 2 GB de datos");
        } else {
            System.out.println("No cabe en tus 2 GB de datos: sobran "
                    + (megas - 2048) + " MB");
        }

        System.out.println("-- Calificaciones del podcast --");
        int[] estrellas = { 5, 6, 4, 0, 3 };

        for (int e : estrellas) {
            try {
                podcast.calificar(e);
            } catch (IllegalArgumentException ex) {
                System.out.println("Rechazada: " + ex.getMessage());
            }
        }
        System.out.println("Podcast: " + podcast.promedio() + " estrellas");

        System.out.println("-- Que se califica --");
        for (Contenido c : maraton) {
            if (c instanceof Calificable k) {
                System.out.println(c.getTitulo() + ": " + k.promedio() + " estrellas");
            } else {
                System.out.println(c.getTitulo() + ": no se califica");
            }
        }
    }
}
