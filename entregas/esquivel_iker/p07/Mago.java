public class Mago  extends Personaje{
    // solo lo nuevo: nombre y edad vienen de Animal
    private int mana;

    public Mago(String nombre, int vida, int mana) {
        // SIEMPRE la primera línea: Animal guarda lo suyo
        super(nombre, vida) ;
        if(mana<0){
            this.mana=0;
        }else{
            this.mana=mana;
        }
    }

    public int getMana() {
        return mana;
    }

    @Override
    public int atacar() {
        //reutiliza el del padre y le agrega
        return (mana/2);
    }

    @Override 
    public String toString(){
        return super.toString() + "| mana 50 ";
    }
}
