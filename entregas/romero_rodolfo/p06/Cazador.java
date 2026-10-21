public class Cazador extends Elfo {
    private int flechas;

    public Cazador(String nombre, int vida, int agilidad, int flechas) {
        super(nombre, vida, agilidad);
        if (flechas < 0) {
            this.flechas = 0;
        } else {
            this.flechas = flechas;
        }
    }

    public int getFlechas() {
        return flechas;
    }

    @Override
    public int atacar() {
        return super.atacar() + (flechas * 2);
    }

    @Override
    public String toString() {
        return super.toString() + " | flechas " + flechas;
    }
}

