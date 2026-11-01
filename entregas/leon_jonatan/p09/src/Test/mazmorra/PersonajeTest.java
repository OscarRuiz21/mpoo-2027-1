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
    void unaEspadaDe5000TieneDanio50() {
        Herramienta dios = new Herramienta("Espada de dios", 5000);
        assertEquals(50, dios.getDanio());
    }

    @Test
    void cadaPersonajeTieneSuPropioInventario() {
        Personaje p1 = new Caballero("Conan");
        Personaje p2 = new Mago("Merlin");
        
        p1.equipar(new Herramienta("Espada", 20));
        p1.equipar(new Herramienta("Hacha", 30));
        
        assertEquals(2, p1.getCuantasHerramientas());
        assertEquals(0, p2.getCuantasHerramientas());
    }

    @Test
    void dosPersonajesCompartenLaMismaHacha() {
        Herramienta hacha = new Herramienta("Hacha", 20);
        Personaje p1 = new Caballero("Conan");
        Personaje p2 = new Arquero("Legolas");
        p1.equipar(hacha);
        p2.equipar(hacha);
        assertSame(p1.getHerramienta(0), p2.getHerramienta(0));
        p1.atacar(new Mago("Enemigo"));
        assertEquals(99, hacha.getDurabilidad());
    }

    @Test
    void unMagoAyudaASuCompaneroHerido() {
        Personaje mago = new Mago("Merlin");
        Personaje caballero = new Caballero("Conan");
        mago.setCompanero(caballero);
        
        caballero.recibirDanio(50);
        mago.ayudarCompanero();
        
        assertEquals(80, caballero.getVida());
    }

    @Test
    void unMuertoNoSeCura() {
        Personaje heroe = new Caballero("Heroe");
        heroe.recibirDanio(500);
        heroe.curar(50);
        assertEquals(0, heroe.getVida());
    }
}