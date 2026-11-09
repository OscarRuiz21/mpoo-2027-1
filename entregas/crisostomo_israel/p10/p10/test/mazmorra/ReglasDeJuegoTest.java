package mazmorra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReglasDeJuegoTest {

    @Test
    void noSeAplicaDanioNiCuracionNegativa() {
        Personaje heroe = new Caballero("Heroe");
        heroe.recibirDanio(-500);
        heroe.curar(-10);
        assertEquals(120, heroe.getVida());
    }

    @Test
    void noSePuedeRevivirNiCurarsePorEncimaDelMaximo() {
        Personaje heroe = new Caballero("Heroe");
        heroe.recibirDanio(500);
        heroe.curar(50);
        assertEquals(0, heroe.getVida());

        heroe.recibirDanio(-5);
        heroe.curar(9999);
        assertEquals(0, heroe.getVida());
    }

    @Test
    void laHerramientaSeLimitaAlMaximoPermitido() {
        Herramienta espada = new Espada(5000);
        assertEquals(50, espada.getDanio());
    }

    @Test
    void atacarSinHerramientasNoHaceNada() {
        Personaje atacante = new Arquero("Desarmado");
        Personaje enemigo = new Mago("Enemigo");

        atacante.atacar(enemigo);
        assertEquals(80, enemigo.getVida());
    }
}
