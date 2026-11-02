public class Gato extends Animal{
    private boolean interior;

    Gato(String nombre, int edad, boolean interior){
        super(nombre, edad);
        this.interior = interior;
    }

    public boolean getisInterior(){
        return interior;
    }

    @Override
    public String sonido(){
        return "Miau";
    }

    @Override
    public String toString(){
        return super.toString() + (interior ? " | de Interior" : " | de exterior");
    }
}