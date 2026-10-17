public class Caballero extends Personaje {
    private int fuerza;

    public Caballero(String nombre, int vida, int fuerza) {
        super(nombre, vida); // Llama al constructor de Personaje[cite: 28]
        this.fuerza = fuerza;
    
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public int atacar() {
        return super.atacar() + fuerza; // Lo del padre más la fuerza[cite: 28]
    }

    @Override
    public String toString() {
        return super.toString() + " | fuerza " + fuerza; // Reutiliza el toString del padre[cite: 28]
    }
}