package mazmorra;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class PersonajeTest {

    @Test
    void laVidaNuncaPasadeLaMaxima() {
        Personaje p = new Caballero("Conan");
        p.curar(50);
        assertEquals(120, p.getVida());
    }

    @Test
    void recibirDanioRestaLosPuntos() {
        Personaje p = new Mago("Merlin");
        p.recibirDanio(30);
        assertEquals(50, p.getVida()); // 80 - 30 = 50
    }

    // --- PRUEBAS PROPIAS (Paso 5) ---

    @Test
    void trampaEspadaDe5000Limitada() {
        Herramienta dios = new Herramienta("Espada de dios", 5000);
        assertEquals(50, dios.getDanio()); // Se limita al máximo permitido de 50
    }

    @Test
    void pruebaHerenciaYDanioCaballero() {
        Personaje caballero = new Caballero("Conan"); // Vida 120
        Personaje arquero = new Arquero("Legolas");    // Vida 100
        Herramienta espada = new Herramienta("Espada", 20); // Daño base 20 + 5 (bonus de Caballero) = 25
        
        caballero.equipar(espada);
        caballero.atacar(arquero);
        
        assertEquals(75, arquero.getVida()); // 100 - 25 = 75
    }

    @Test
    void pruebaComposicionInventarioIndependiente() {
        Personaje p1 = new Caballero("Conan");
        Personaje p2 = new Mago("Merlin");
        
        p1.equipar(new Herramienta("Espada", 20));
        
        assertEquals(1, p1.getCuantasHerramientas());
        assertEquals(0, p2.getCuantasHerramientas()); // Cada personaje tiene su propio inventario creado por composición
    }

    @Test
    void pruebaAsociacionAyudarCompanero() {
        Personaje heroe = new Caballero("Conan");
        Personaje aliado = new Mago("Merlin");
        
        aliado.recibirDanio(40); // Merlin baja de 80 a 40 de vida
        heroe.setCompanero(aliado);
        heroe.ayudarCompanero(); // Conan ayuda a su compañero curándole 10
        
        assertEquals(50, aliado.getVida()); // 40 + 10 = 50
    }

    @Test
    void pruebaAgregacionMismaHerramienta() {
        Herramienta hacha = new Herramienta("Hacha", 15);
        Personaje p1 = new Caballero("Conan");
        Personaje p2 = new Caballero("Bárbaro");
        
        p1.equipar(hacha);
        p2.equipar(hacha); // La misma herramienta se comparte por agregación
        
        assertSame(p1.getHerramienta(0), p2.getHerramienta(0));
    }
}