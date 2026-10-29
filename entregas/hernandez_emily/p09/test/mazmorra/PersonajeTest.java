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
    void cadaTipoIniciaConSuVidaMaxima() {
        assertEquals(120, new Caballero("Conan").getVida());
        assertEquals(80, new Mago("Merlin").getVida());
        assertEquals(100, new Arquero("Legolas").getVida());
    }

    @Test
    void caballeroAumentaElDanioEnCinco() {
        Personaje caballero = new Caballero("Conan");
        Personaje objetivo = new Arquero("Legolas");
        caballero.equipar(new Herramienta("Espada", 20));
        caballero.atacar(objetivo);
        assertEquals(75, objetivo.getVida());
    }

    @Test
    void magoDuplicaElDanioDeSuHerramienta() {
        Personaje mago = new Mago("Merlin");
        Personaje objetivo = new Caballero("Conan");
        mago.equipar(new Herramienta("Baston", 10));
        mago.atacar(objetivo);
        assertEquals(100, objetivo.getVida());
    }

    @Test
    void ayudarCompaneroCuraDiezPuntos() {
        Personaje mago = new Mago("Merlin");
        Personaje companero = new Caballero("Conan");
        companero.recibirDanio(30);
        mago.setCompanero(companero);
        mago.ayudarCompanero();
        assertEquals(100, companero.getVida());
    }

    @Test
    void personajeMuertoNoPuedeCurarse() {
        Personaje p = new Caballero("Conan");
        p.recibirDanio(120);
        p.curar(10);
        assertEquals(0, p.getVida());
        assertFalse(p.estaVivo());
    }

    @Test
    void inventarioRechazaUnaCuartaHerramienta() {
        Personaje p = new Caballero("Conan");
        assertTrue(p.equipar(new Herramienta("Espada", 20)));
        assertTrue(p.equipar(new Herramienta("Hacha", 10)));
        assertTrue(p.equipar(new Herramienta("Daga", 8)));
        assertFalse(p.equipar(new Herramienta("Lanza", 12)));
        assertEquals(3, p.getCuantasHerramientas());
    }

    @Test
    void herramientaFueraDelRangoEsNull() {
        Personaje p = new Caballero("Conan");
        assertNull(p.getHerramienta(99));
        assertNull(p.getHerramienta(-1));
    }

    @Test
    void elDanioDeUnaHerramientaSeLimitaACincuenta() {
        Herramienta h = new Herramienta("Espada", 5000);
        assertEquals(50, h.getDanio());
    }

    @Test
    void dosPersonajesPuedenCompartirLaMismaHerramienta() {
        Herramienta hacha = new Herramienta("Hacha", 10);
        Personaje p1 = new Caballero("Uno");
        Personaje p2 = new Arquero("Dos");
        assertTrue(p1.equipar(hacha));
        assertTrue(p2.equipar(hacha));
        assertSame(p1.getHerramienta(0), p2.getHerramienta(0));
        p1.atacar(new Mago("Enemigo"));
        assertEquals(99, hacha.getDurabilidad());
    }
}
