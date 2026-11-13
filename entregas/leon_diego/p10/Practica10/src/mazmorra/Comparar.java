package mazmorra;

public class Comparar {
    public static void main(String[] args) {
        System.out.println("-- Sin polimorfismo --");
        sinPolimorfismo(arsenal());
        System.out.println("-- Con polimorfismo --");
        conPolimorfismo(arsenal());
    }

    static Herramienta[] arsenal() {
        return new Herramienta[] {
            new Espada(20), new Arco(15), new Baston(10)
        };
    }

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