public class Caballero extends Personaje {
    // solo lo nuevo: nombre y edad vienen de Animal
    private int fuerza;

    public Caballero(String nombre, int vida, int fuerza) {
        // SIEMPRE la primera línea: Animal guarda lo suyo
        super(nombre, vida) ;
        this.fuerza = fuerza;
    }


    public int getFuerza() {
        return fuerza;
    }

    @Override
    public int atacar() {
        //reutiliza el del padre y le agrega
        return super.atacar() + fuerza;
    }

    @Override 
    public String toString(){
        return super.toString() + "| fuerza 15 ";
    }
}
