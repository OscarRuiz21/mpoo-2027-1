public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida); // Llama al constructor de Personaje[cite: 29]
        // Valida que el mana no sea menor que 0[cite: 29]
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
        return mana / 2; // La mitad del mana. NO usa super.atacar()[cite: 29]
    }

    @Override
    public String toString() {
        return super.toString() + " | mana " + mana; // Reutiliza el toString del padre[cite: 29]
    }
}