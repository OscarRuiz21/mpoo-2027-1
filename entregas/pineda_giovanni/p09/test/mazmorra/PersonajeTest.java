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
// 1. Prueba de Herencia: el Mago duplica el daño base
    @Test
    void magoDuplicaElDanioDeSuHerramienta() {
        Personaje mago = new Mago("Merlin");
        Personaje caballero = new Caballero("Conan"); // Tiene 120 de vida
        Herramienta baston = new Herramienta("Baston", 10);
        
        mago.equipar(baston);
        mago.atacar(caballero);
        
        // El bastón tiene 10 de daño. El mago lo duplica a 20. 
        // 120 - 20 = 100 de vida restante para el caballero.
        assertEquals(100, caballero.getVida());
    }

    // 2. Prueba de Composición: cada quien tiene su inventario
    @Test
    void cadaPersonajeTieneSuPropioInventario() {
        Personaje arquero = new Arquero("Legolas");
        Personaje caballero = new Caballero("Conan");
        
        arquero.equipar(new Herramienta("Arco", 15));
        arquero.equipar(new Herramienta("Daga", 5));
        
        assertEquals(2, arquero.getCuantasHerramientas());
        assertEquals(0, caballero.getCuantasHerramientas());
    }

    // 3. Prueba de Asociación: curar al compañero
    @Test
    void ayudarCompaneroLeSumaDiezDeVida() {
        Personaje mago = new Mago("Merlin");
        Personaje caballero = new Caballero("Conan");
        
        caballero.recibirDanio(30); // Baja de 120 a 90
        mago.setCompanero(caballero);
        mago.ayudarCompanero(); // Le suma 10
        
        assertEquals(100, caballero.getVida());
    }

    // 4. Prueba de Trampa: la cuarta herramienta devuelve false
    @Test
    void noSePuedenEquiparMasDeTresHerramientas() {
        Personaje caballero = new Caballero("Conan");
        
        assertTrue(caballero.equipar(new Herramienta("H1", 10)));
        assertTrue(caballero.equipar(new Herramienta("H2", 10)));
        assertTrue(caballero.equipar(new Herramienta("H3", 10)));
        
        // La cuarta debe devolver false
        assertFalse(caballero.equipar(new Herramienta("H4", 10)));
    }
}