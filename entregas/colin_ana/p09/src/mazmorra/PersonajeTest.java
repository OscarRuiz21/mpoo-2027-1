package mazmorra;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    // Prueba base de la guía
    @Test
    void laVidaNuncaPasaDeLaMaxima() {
        Personaje p = new Caballero("Conan");
        p.curar(50);
        assertEquals(120, p.getVida());
    }

    // 1. Herencia: cálculo de daño por clase
    @Test
    void magoDuplicaElDanioBase() {
        Personaje merlin = new Mago("Merlin");
        Personaje objetivo = new Arquero("Diana");
        Herramienta baston = new Herramienta("Baston", 10);
        
        merlin.equipar(baston);
        merlin.atacar(objetivo);
        
        // 10 base * 2 = 20 de daño -> 100 - 20 = 80
        assertEquals(80, objetivo.getVida());
    }

    // 2. Composición: inventarios independientes
    @Test
    void cadaPersonajeTieneSuPropioInventario() {
        Personaje p1 = new Caballero("Arturo");
        Personaje p2 = new Arquero("Robin");
        
        p1.equipar(new Herramienta("Daga", 10));
        
        assertEquals(1, p1.getCuantasHerramientas());
        assertEquals(0, p2.getCuantasHerramientas());
    }

    // 3. Agregación: herramienta compartida se desgasta en ambos
    @Test
    void herramientaCompartidaMantieneMismaDurabilidad() {
        Personaje p1 = new Caballero("Lancelot");
        Personaje p2 = new Arquero("Ollie");
        Herramienta hacha = new Herramienta("Hacha", 15);
        
        p1.equipar(hacha);
        p2.equipar(hacha);
        
        assertSame(p1.getHerramienta(0), p2.getHerramienta(0));
        
        p1.atacar(new Mago("Enemigo"));
        assertEquals(99, p2.getHerramienta(0).getDurabilidad());
    }

    // 4. Asociación: curar a un compañero herido
    @Test
    void ayudarCompaneroCuraDiezPuntos() {
        Personaje caballero = new Caballero("Conan");
        Personaje mago = new Mago("Merlin");
        
        mago.setCompanero(caballero);
        caballero.recibirDanio(30); // 120 - 30 = 90
        mago.ayudarCompanero();     // 90 + 10 = 100
        
        assertEquals(100, caballero.getVida());
    }
}