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
    void equiparReemplazaLaHerramientaAnterior() {
        Personaje p = new Arquero("Legolas");
        Herramienta primera = new Arco(10);
        Herramienta segunda = new Arco(15);
        p.equipar(primera);
        p.equipar(segunda);
        assertSame(segunda, p.getHerramienta());
    }

    @Test
    void magoDuplicaDanioBaston() {
        Personaje mago = new Mago("Merlin");
        Personaje objetivo = new Caballero("Objetivo");
        mago.equipar(new Baston(10));
        mago.atacar(objetivo);
        assertEquals(100, objetivo.getVida());
    }

    @Test
    void cadaPersonajeTieneSuPropiaHerramienta() {
        Personaje p1 = new Caballero("Conan");
        Personaje p2 = new Caballero("Arturo");
        Herramienta espada = new Espada(15);
        p1.equipar(espada);
        assertSame(espada, p1.getHerramienta());
        assertNull(p2.getHerramienta());
    }

    @Test
    void ayudarCompaneroCuraDiezPuntos() {
        Personaje mago = new Mago("Merlin");
        Personaje caballero = new Caballero("Conan");
        caballero.recibirDanio(30); 
        mago.setCompanero(caballero);
        mago.ayudarCompanero();
        assertEquals(100, caballero.getVida());
    }
}