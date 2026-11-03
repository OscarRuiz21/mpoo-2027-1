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
    void cuartaHerramientaDevuelveFalse() {
        Personaje p = new Arquero("Legolas");
        p.equipar(new Herramienta("Arco 1", 10));
        p.equipar(new Herramienta("Arco 2", 10));
        p.equipar(new Herramienta("Arco 3", 10));
        assertFalse(p.equipar(new Herramienta("Arco 4", 10)));
    }

    @Test
    void magoDuplicaDanioBaston() {
        Personaje mago = new Mago("Merlin");
        Personaje objetivo = new Caballero("Objetivo");
        mago.equipar(new Herramienta("Baston", 10));
        mago.atacar(objetivo);
        assertEquals(100, objetivo.getVida());
    }

    @Test
    void cadaPersonajeTieneSuPropioInventario() {
        Personaje p1 = new Caballero("Conan");
        Personaje p2 = new Caballero("Arturo");
        p1.equipar(new Herramienta("Espada", 15));
        assertEquals(1, p1.getCuantasHerramientas());
        assertEquals(0, p2.getCuantasHerramientas());
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