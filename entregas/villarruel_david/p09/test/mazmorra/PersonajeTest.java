
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
        assertEquals(50, p.getVida());
    }

    @Test
    void losPersonajesEmpiezanConVidaCorrecta() {
        Personaje caballero = new Caballero("Conan");
        Personaje mago = new Mago("Merlin");
        Personaje arquero = new Arquero("Legolas");

        assertEquals(120, caballero.getVida());
        assertEquals(80, mago.getVida());
        assertEquals(100, arquero.getVida());
    }

    @Test
    void elCaballeroAumentaElDanio() {
        Personaje caballero = new Caballero("Conan");
        Personaje arquero = new Arquero("Legolas");

        caballero.equipar(new Herramienta("Espada", 20));
        caballero.atacar(arquero);

        assertEquals(75, arquero.getVida());
    }

    @Test
    void elMagoDuplicaElDanio() {
        Personaje mago = new Mago("Merlin");
        Personaje arquero = new Arquero("Legolas");

        mago.equipar(new Herramienta("Baston", 10));
        mago.atacar(arquero);

        assertEquals(80, arquero.getVida());
    }

    @Test
    void ayudarCompaneroRecuperaDiezPuntos() {
        Personaje mago = new Mago("Merlin");
        Personaje caballero = new Caballero("Conan");

        mago.setCompanero(caballero);
        caballero.recibirDanio(20);
        mago.ayudarCompanero();

        assertEquals(110, caballero.getVida());
    }

    @Test
    void unPersonajeMuertoNoSePuedeCurar() {
        Personaje caballero = new Caballero("Conan");

        caballero.recibirDanio(200);
        caballero.curar(50);

        assertEquals(0, caballero.getVida());
    }

    @Test
    void noSePuedeEquiparUnaCuartaHerramienta() {
        Personaje caballero = new Caballero("Conan");

        caballero.equipar(new Herramienta("Espada", 20));
        caballero.equipar(new Herramienta("Hacha", 15));
        caballero.equipar(new Herramienta("Daga", 10));

        assertFalse(caballero.equipar(new Herramienta("Lanza", 12)));
    }
}
