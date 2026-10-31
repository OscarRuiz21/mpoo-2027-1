package mazmorra;

public abstract class Personaje {

    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private final Inventario inventario;
    private Personaje companero;

    public Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.inventario = new Inventario();
        this.companero = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getVidaMaxima() {
        return this.vidaMaxima;
    }

    public int getVida() {
        return this.vida;
    }

    public int getCuantasHerramientas() {
        return this.inventario.getCuantas();
    }

    public Herramienta getHerramienta(int i) {
        return this.inventario.getHerramienta(i);
    }

    public Personaje getCompanero() {
        return this.companero;
    }

    public void setCompanero(Personaje companero) {
        this.companero = companero;
    }


    public boolean equipar(Herramienta h) {
        return this.inventario.agregar(h);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void recibirDanio(int puntos) {
        if (puntos > 0 && estaVivo()) {
            this.vida = limitar(this.vida - puntos, 0, this.vidaMaxima);
        }
    }

    public void curar(int puntos) {
        if (puntos > 0 && estaVivo()) {
            this.vida = limitar(this.vida + puntos, 0, this.vidaMaxima);
        }
    }

    public void atacar(Personaje objetivo) {
        if (this.estaVivo() && objetivo != null) {
            int eso = this.inventario.usarMejor();
            if (eso > 0) {
                int danioFinal = this.calcularDanio(eso);
                objetivo.recibirDanio(danioFinal);
            }
        }
    }

    public void ayudarCompanero() {
        if (this.estaVivo() && this.companero != null) {
            this.companero.curar(10);
        }
    }

    @Override
    public String toString() {
        return this.nombre + " (" + this.getTipo() + ") " + this.vida + "/" + this.vidaMaxima;
    }

    public abstract int calcularDanio(int base);
    public abstract String getTipo();

    private int limitar(int valor, int min, int max) {
        if (valor < min) return min;
        if (valor > max) return max;
        return valor;
    }

}

