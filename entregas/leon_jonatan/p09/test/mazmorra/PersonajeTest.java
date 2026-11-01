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
    void espadaDeDiosSeLimitaA50() {
        Herramienta espadaDios = new Herramienta("Excalibur", 5000);
        assertEquals(50, espadaDios.getDanio());
    }

    @Test
    void cuartaHerramientaDevuelveFalse() {
        Personaje p = new Caballero("Guts");
        p.equipar(new Herramienta("Hacha", 10));
        p.equipar(new Herramienta("Escudo", 5));
        p.equipar(new Herramienta("Daga", 8));
        boolean resultado = p.equipar(new Herramienta("Lanza", 12));
        assertFalse(resultado);
        assertEquals(3, p.getCuantasHerramientas());
    }

    @Test
    void getHerramientaFueraDeRangoDaNull() {
        Personaje p = new Arquero("Robin");
        assertNull(p.getHerramienta(99));
        assertNull(p.getHerramienta(-1));
    }

    @Test
    void herenciaVidaInicialCorrecta() {
        Personaje c = new Caballero("Arturo");
        Personaje m = new Mago("Gandalf");
        Personaje a = new Arquero("Legolas");

        assertEquals(120, c.getVidaMaxima());
        assertEquals(80, m.getVidaMaxima());
        assertEquals(100, a.getVidaMaxima());
    }

    @Test
    void asociacionAyudarCompaneroCura() {
        Personaje mago = new Mago("Merlin");
        Personaje caballero = new Caballero("Conan");

        mago.setCompanero(caballero);
        caballero.recibirDanio(40);
        mago.ayudarCompanero();

        assertEquals(90, caballero.getVida());
    }
}