public class Elfo extends Personaje {
    private int agilidad;

    public Elfo(String nombre, int vida, int agilidad) {
        super(nombre, vida);
        if (agilidad < 0) {
            this.agilidad = 0;
        } else {
            this.agilidad = agilidad;
        }
    }

    public int getAgilidad() {
        return agilidad;
    }

    @Override
    public int atacar() {
        return super.atacar() + agilidad;
    }

    @Override
    public String toString() {
        return super.toString() + " | agilidad " + agilidad;
    }
}