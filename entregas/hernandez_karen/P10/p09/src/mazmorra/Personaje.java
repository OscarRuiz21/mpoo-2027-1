package mazmorra;
public abstract class Personaje{
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private final Inventario inventario;
    private Personaje companero;
    //Constructor protegido, este solo puede ser usado por las subclases
    protected Personaje(String nombre, int vidaMaxima){
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        //Composicion de la clase Inventario (su ciclo de vida depende del Personaje)
        this.inventario = new Inventario();
        this.companero = null;
    }
    //Metodos que deberan las subclases
    public abstract String getTipo();
    protected abstract int calcularDanio (int base);

    public String getNombre(){
        return this.nombre;
    }

    public int getVida(){
        return this.vida;
    }

    public int getVidaMaxima(){
        return this.vidaMaxima;
    }
    //getter que se encarga de llamar al Inventario
    public int getCuantasHerramientas(){
        return this.inventario.getCuantas();
    }

    public Herramienta getHerramienta(int i){
        return this.inventario.getHerramienta(i);
    }

    public Personaje  getCompanero(){
        return this.companero;
    }

    public boolean equipar(Herramienta h){
        return this.inventario.agregar(h);
    }

    public void setCompanero(Personaje companero){
        this.companero = companero;
    }

    public boolean estaVivo(){
        return this.vida > 0;
    }

    public void recibirDanio(int puntos){
        if(puntos > 0){
            this.vida = limitar(this.vida - puntos);
        }
    }

    public void curar (int puntos){
        if(estaVivo() && puntos > 0){ //El personaje forzosamente debe estar vivo
            this.vida = limitar(this.vida + puntos);
        }
    }

    public void atacar(Personaje objetivo){
        if(!estaVivo() || objetivo == null){
            return;
        }
        int danioBase = this.inventario.usarMejor();
        if(danioBase > 0){
            int danioFinal = calcularDanio(danioBase);
            objetivo.recibirDanio(danioFinal);
        }
    }

    public void ayudarCompanero(){
        if(this.companero != null && this.companero.estaVivo()){
            this.companero.curar(10);
        }
    }
    @Override
    public String toString(){
        return this.nombre + " (" + getTipo() + ") " + this.vida + "/" + this.vidaMaxima;
    }

    private int limitar(int valor){
        return Math.max(0, Math.min(this.vidaMaxima, valor));
    }
}

