package trampas;

import mazmorra.*;

// Trampas que compilan: tu código tiene que ignorarlas.
public class Tramposo {
    public static void main(String[] args) {
        Personaje heroe = new Caballero("Heroe");

        heroe.recibirDanio(-500);
        revisar("1) golpe negativo para curarse", heroe.getVida() == 120);

        heroe.curar(9999);
        revisar("2) curarse arriba del tope de vida", heroe.getVida() == 120);

        Herramienta dios = new Herramienta("Espada de dios", 5000);
        revisar("3) forjar una espada de 5000 de poder", dios.getDanio() == 50);

        heroe.equipar(new Herramienta("Hacha", 10));
        heroe.equipar(new Herramienta("Escudo", 5));
        heroe.equipar(new Herramienta("Daga", 8));
        boolean cuarta = heroe.equipar(new Herramienta("Lanza", 12));
        revisar("4) cargar una cuarta herramienta", !cuarta && heroe.getCuantasHerramientas() == 3);

        revisar("5) pedir la herramienta 99", heroe.getHerramienta(99) == null);

        Personaje enemigo = new Mago("Enemigo");
        Personaje desarmado = new Arquero("Desarmado");
        desarmado.atacar(enemigo);
        revisar("6) atacar sin ninguna herramienta", enemigo.getVida() == 80);

        heroe.recibirDanio(500);
        heroe.curar(50);
        revisar("7) revivir a un personaje muerto", heroe.getVida() == 0);
    }

    private static void revisar(String trampa, boolean bloqueada) {
        System.out.println((bloqueada ? "BLOQUEADA  " : "FUNCIONA   ") + trampa);
    }
}
