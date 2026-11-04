package mazmorra;

public abstract class Personaje {
    private String nombre;
    private int vida;
    private int vidaMaxima;
    private Inventario inventario;
    private Personaje companero;
    private Herramienta herramientaEquipada;

    public Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.inventario = new Inventario();
        this.companero = null;
        this.herramientaEquipada = null;
    }

    public int getVida() {
        return vida;
    }

    public void setCompanero(Personaje companero) {
        this.companero = companero;
    }

    public boolean equipar(Herramienta h) {
        if (inventario.agregarHerramienta(h)) {
            this.herramientaEquipada = h;
            return true;
        }
        return false;
    }

    public int getCuantasHerramientas() {
        return inventario.getCuantas();
    }

    public Herramienta getHerramienta(int indice) {
        return inventario.getHerramienta(indice);
    }

    public void recibirDanio(int cantidad) {
        // Bloquea daño negativo (curarse con golpes) y evita aplicar daño si ya está muerto (vida == 0)
        if (cantidad > 0 && vida > 0) {
            vida -= cantidad;
            if (vida < 0) {
                vida = 0;
            }
        }
    }

    public void curar(int cantidad) {
        // Evita curar si está muerto y no permite superar la vida máxima
        if (vida > 0 && cantidad > 0) {
            vida += cantidad;
            if (vida > vidaMaxima) {
                vida = vidaMaxima;
            }
        }
    }

    public void atacar(Personaje enemigo) {
        int poderAtaque = 10; // Daño base si no tiene ninguna herramienta equipada
        
        if (herramientaEquipada != null) {
            poderAtaque = herramientaEquipada.getDanio();
            herramientaEquipada.usar();
        }

        enemigo.recibirDanio(poderAtaque);
    }

    public void ayudarCompanero() {
        if (companero != null && companero.getVida() > 0) {
            companero.curar(20);
        }
    }

    @Override
    public String toString() {
        return nombre + " [Vida: " + vida + "/" + vidaMaxima + "]";
    }
}