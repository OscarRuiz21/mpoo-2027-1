public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida);
        this.mana = mana < 0 ? 0 : mana;
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