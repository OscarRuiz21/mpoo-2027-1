public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida);
        if (mana < 0) {
            this.mana = 0;
        } else {
            this.mana = mana;
        }
    }

    public int getMana() {
        return mana;
    }

    @Override
    public int atacar() {
        return mana / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " | mana " + mana;
    }
}