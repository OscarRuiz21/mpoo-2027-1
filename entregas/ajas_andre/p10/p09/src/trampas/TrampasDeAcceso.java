package trampas;

import mazmorra.*;


public class TrampasDeAcceso {
    public static void main(String[] args) {
        Personaje heroe = new Caballero("Heroe");
        heroe.vida = 9999;
        heroe.inventario = new Inventario();

        Herramienta espada = new Herramienta("Espada", 20);
        espada.durabilidad = 1000000;

        Inventario bolsa = new Inventario();
        bolsa.herramientas[0] = espada;
        bolsa.cuantas = 50;
    }
}
