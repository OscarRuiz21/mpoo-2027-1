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

    // 1. Prueba de Herencia
    @Test
    void arqueroIniciaConVidaCorrecta() {
        Personaje p = new Arquero("Robin");
        assertEquals(100, p.getVida());
    }

    // 2. Prueba de Composición
    @Test
    void personajeIniciaConInventarioVacio() {
        Personaje p = new Mago("Merlin");
        assertEquals(0, p.getCuantasHerramientas());
    }

    // 3. Prueba de Agregación
    @Test
    void compartenLaMismaHerramienta() {
        Personaje p1 = new Caballero("Conan");
        Personaje p2 = new Mago("Merlin");
        Herramienta h = new Herramienta("Hacha", 30);

        p1.equipar(h);
        p2.equipar(h);

        assertSame(p1.getHerramienta(0), p2.getHerramienta(0));
    }

    // 4. Prueba de Trampa (Cuarta herramienta)
    @Test
    void equiparCuartaHerramientaDaFalse() {
        Personaje p = new Caballero("Arthur");
        Herramienta h1 = new Herramienta("Espada", 10);

        p.equipar(h1);
        p.equipar(h1);
        p.equipar(h1);

        assertFalse(p.equipar(h1));
    }
}