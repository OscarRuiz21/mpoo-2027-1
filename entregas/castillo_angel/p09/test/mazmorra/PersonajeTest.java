package mazmorra;

import org.junit.jupiter.api.Test;

import mazmorra.Caballero;
import mazmorra.Mago;
import mazmorra.Personaje;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {
    @Test
    void laVidaNuncaPasaDeLaMaxima() {
        Personaje p = new Caballero("Conan");
        p.curar(50);
        assertEquals(120, p.getVida());
    }
    @Test
    void caballeroEmpiezaConVidaMaxima() {
        Personaje c = new Caballero("Conan");
        assertEquals(120, c.getVidaMaxima());
    }

    @Test
    void magoEmpiezaConVidaMaxima() {
        Personaje m = new Mago("Merlin");
        assertEquals(80, m.getVidaMaxima());
    }

    @Test
    void inventarioComienzaVacio() {
        Personaje c = new Caballero("Conan");
        assertEquals(0, c.getCuantasHerramientas());
    }

    @Test
    void asociarCompaneroCorrectamente() {
        Personaje c = new Caballero("Conan");
        Personaje m = new Mago("Merlin");
        c.setCompanero(m);
        assertEquals(m, c.getCompanero());
    }
}