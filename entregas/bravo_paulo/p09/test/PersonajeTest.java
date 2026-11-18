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
    void golpeCritico() {
        Personaje p = new Caballero("Louis");
        p.recibirDanio(200);
        assertEquals(0, p.getVida());
    }

    @Test
    void caballeroAtacaMago() { // Herencia y cálculo de daño
        Personaje p1 = new Mago("Merlin");
        Personaje p2 = new Caballero("Conan");
        Herramienta espada = new Herramienta("Espada", 20);
        p1.equipar(espada);
        p1.atacar(p2);
        assertEquals(80, p2.getVida());
    }

    @Test
    void mismaHerramienta() { // Agregación
        Personaje p1 = new Mago("Merlin");
        Personaje p2 = new Caballero("Conan");
        Herramienta hacha = new Herramienta("Hacha", 10);
        p1.equipar(hacha);
        p2.equipar(hacha);
        p1.atacar(p2);
        assertSame(p1.getHerramienta(0), p2.getHerramienta(0));
    }

    @Test
    void magoAyudaCaballero() { // Asociación
        Personaje p1 = new Mago("Merlin");
        Personaje p2 = new Caballero("Conan");
        p2.recibirDanio(20); // Baja de 120 a 100
        p1.setCompanero(p2);
        p1.ayudarCompanero(); // Cura 10 -> Sube a 110
        assertEquals(110, p2.getVida());
    }
}