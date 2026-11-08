package mazmorra;

public abstract class Personaje {
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private Herramienta herramienta;       // agregacion: se forja afuera
    private Personaje companero;

    protected Personaje(String nombre, int vidaMaxima){
        this.vidaMaxima = vidaMaxima;
        this.nombre = nombre;
        this.vida = vidaMaxima;
        this.herramienta = null;
        this.companero = null;
    }

    protected abstract String getTipo();
    protected abstract int calcularDanio(int base);

    private int limitar(int valor){
        if (valor < 0){
            return 0;
        } else if (valor > vidaMaxima){
            return vidaMaxima;
        } else {
            return valor;
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getVida(){
        return this.vida;
    }

    public int getVidaMaxima(){
        return vidaMaxima;
    }

    public Herramienta getHerramienta(){
        return herramienta;
    }

    public Personaje getCompanero(){
        return companero;
    }

    // una sola herramienta: la nueva reemplaza a la anterior
    public void equipar(Herramienta h){
        this.herramienta = h;
    }

    public void setCompanero(Personaje companero){
        this.companero = companero;
    }

    public boolean estaVivo(){
        return vida > 0;
    }

    public void recibirDanio(int puntos){
        if(puntos > 0){
            this.vida = limitar(this.vida - puntos);
        }
    }

    public void curar(int puntos){
        if(estaVivo() && puntos > 0){
            this.vida = limitar(this.vida + puntos);
        }
    }

    public void atacar(Personaje objetivo){
        if (!estaVivo() || herramienta == null) {
            return;
        }
        if (objetivo == null || !objetivo.estaVivo()) {
            return;
        }
        int base = herramienta.golpear();   // P10: la herramienta decide
        if (base > 0) {
            objetivo.recibirDanio(calcularDanio(base));
        }
    }

    public void ayudarCompanero(){
        if(this.estaVivo() && this.companero != null && this.companero.estaVivo()){
            this.companero.curar(10);
        }
    }

    @Override
    public String toString(){
        return nombre + " (" + getTipo() + ") " + vida + "/" + vidaMaxima;
    }
}
