package mazmorra;

// El mismo recorrido dos veces: primero preguntando que es cada
// herramienta, luego sin preguntar.
public class Comparar {
    public static void main(String[] args) {
        System.out.println("-- Sin polimorfismo --");
        sinPolimorfismo(arsenal());
        System.out.println("-- Con polimorfismo --");
        conPolimorfismo(arsenal());
    }

    // un arreglo del tipo base con objetos de tres clases distintas
    static Herramienta[] arsenal() {
        return new Herramienta[] {
            new Espada(20), new Arco(15), new Baston(10)
        };
    }

    // el juego pregunta que herramienta es cada una y decide por ella
    static void sinPolimorfismo(Herramienta[] arsenal) {
        for (Herramienta h : arsenal) {
            String grito;
            int golpe;
            if (h instanceof Espada) {
                grito = "lanza un tajo";
                golpe = h.usar();
            } else if (h instanceof Arco) {
                grito = "dispara dos flechas";
                golpe = h.usar() + h.usar();
            } else if (h instanceof Baston) {
                grito = "lanza un hechizo";
                golpe = h.getDanio();
            } else {
                grito = "no se que es esto";
                golpe = 0;
            }
            imprimir(h, grito, golpe);
        }
    }

    // el juego solo da la orden; cada herramienta responde con lo suyo
    static void conPolimorfismo(Herramienta[] arsenal) {
        for (Herramienta h : arsenal) {
            imprimir(h, h.grito(), h.golpear());
        }
    }

    static void imprimir(Herramienta h, String grito, int golpe) {
        System.out.println(h.getNombre() + " " + grito + ": golpe de "
                + golpe + ", durabilidad " + h.getDurabilidad());
    }
}