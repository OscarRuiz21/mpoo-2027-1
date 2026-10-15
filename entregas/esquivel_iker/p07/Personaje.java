public class Personaje {
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida){
        this.nombre=nombre;
        if(vida < 0){
            this.vida=0;
        }else if (vida > 100){
            this.vida=100;
        }else{
            this.vida=vida;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getVida(){
        return vida;
    }

    public int atacar(){
        return 10;
    }
    //Personaje a secas

    @Override 
    public String toString(){
        return nombre + ", vida " + vida;
    }
    
}
