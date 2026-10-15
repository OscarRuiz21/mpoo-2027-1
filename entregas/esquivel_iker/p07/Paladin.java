public class Paladin extends Caballero {
    //Lo nuevo, lo demás viene de Perro
    private int fe;

    public Paladin(String nombre, int vida, int fuerza, int fe){
        super(nombre, vida, fuerza);
        this.fe = fe;
    }

    public int getFe(){
        return fe;
    }

    @Override
    public int atacar() {
        return super.atacar() + (fe/2);
    }

    @Override 
    public String toString(){
        return super.toString() + "| fe  40";
    }
}
