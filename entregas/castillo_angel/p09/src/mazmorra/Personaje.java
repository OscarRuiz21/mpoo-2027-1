package mazmorra;

public abstract class Personaje {
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private final Inventario inventario;
    private Personaje companero;

    protected Personaje(String nombre, int vidaMaxima){
        this.vidaMaxima = vidaMaxima;
        this.inventario = new Inventario();
        this.nombre = nombre;
        this.vida = vidaMaxima;
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

    public int getCuantasHerramientas(){
        return inventario.getCuantas();
    }

    public Herramienta getHerramienta(int i){
        return inventario.getHerramienta(i);
    }

    public Personaje getCompanero(){
        return companero;
    }

    public boolean equipar(Herramienta h){
        return inventario.agregar(h);
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
        if(this.estaVivo() && objetivo != null && objetivo.estaVivo()){
            int base = this.inventario.usarMejor();
            if(base > 0){
                int danioFinal = this.calcularDanio(base);
                objetivo.recibirDanio(danioFinal);
            }
        }
    }

    public void ayudarCompanero(){
        if(this.estaVivo() && this.companero !=null && this.companero.estaVivo() ){
            this.companero.curar(10);
        }
    }

    @Override 
    public String toString(){
        return nombre + " (" + getTipo() + ") " + vida + "/" + vidaMaxima;
    }
}
