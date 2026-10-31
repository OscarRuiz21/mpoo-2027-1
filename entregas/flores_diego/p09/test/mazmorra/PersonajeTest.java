package mazmorra;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    @Test

    void laVidaNuncaPasaDeLaMaxima() {
        Personaje p = new Caballero("Conan");
        p.curar(50);

        assertEquals(120, p.getVida());
    }
        @Test
        void recibirDanioRestaLosPuntos() {
            Personaje p = new Mago("Merlin");
            p.recibirDanio(30);
            assertEquals(70, p.getVida());
        }


    @Test
    public void caballeroConEspadaQuitaVeinticincoAArquero() {
        Personaje caballero = new Caballero("Arturo");
        Personaje arquero = new Arquero("Robin");

        Herramienta espada = new Herramienta("Espada", 20);

        caballero.equipar(espada);
        caballero.atacar(arquero);

        assertTrue(arquero.getVida() < arquero.getVidaMaxima(), "La vida del arquero debe disminuir tras recibir el ataque del caballero");
    }

    @Test
    public void cadaPersonajeTieneSuPropioInventarioIndependiente() {
        Personaje personajeA = new Caballero("Galahad");
        Personaje personajeB = new Mago("Merlin");

        Herramienta herramienta1 = new Herramienta("Espada", 10);
        Herramienta herramienta2 = new Herramienta("Baston", 5);

        personajeA.equipar(herramienta1);
        personajeA.equipar(herramienta2);

        assertEquals(2, personajeA.getCuantasHerramientas(), "El personaje A debe tener exactamente 2 herramientas en su inventario");
        assertEquals(0, personajeB.getCuantasHerramientas(), "El personaje B debe mantener su inventario vacío con 0 herramientas");
    }

    @Test
    public void hachaCompartidaMantieneLaMismaInstanciaEnAmbosPersonajes() {
        Personaje personajeA = new Caballero("Boromir");
        Personaje personajeB = new Caballero("Gimli");

        Herramienta herramientaCompartida = new Herramienta("Hacha", 25);

        personajeA.equipar(herramientaCompartida);
        personajeB.equipar(herramientaCompartida);

        assertSame(personajeA.getHerramienta(0), personajeB.getHerramienta(0), "Ambos personajes deben compartir la misma instancia exacta del hacha");

        assertEquals(25, personajeB.getHerramienta(0).getDanio(), "El daño de la herramienta visto desde personajeB debe ser 25");
    }

    @Test
    public void magoCuraACompaneroHeridoAlAyudarlo() {
        Personaje mago = new Mago("Gandalf");
        Personaje companero = new Caballero("Aragorn");

        mago.setCompanero(companero);

        companero.recibirDanio(30);
        int vidaHerido = companero.getVida();

        mago.ayudarCompanero();

        assertTrue(companero.getVida() > vidaHerido, "La vida del compañero debe aumentar tras recibir la ayuda del mago");
    }
}
