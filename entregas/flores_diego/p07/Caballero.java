public class Caballero extends Personaje {

    private int fuerza;

    public Caballero(String nombre, int vida, int fuerza) {
        super(nombre, vida);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public int atacar() {
        return super.atacar() + fuerza;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + "fuerza " + fuerza;
    }
}