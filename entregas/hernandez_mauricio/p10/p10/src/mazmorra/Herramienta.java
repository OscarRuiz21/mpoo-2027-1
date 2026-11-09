package mazmorra;

public abstract class Herramienta {

    private final String  nombre;
    private final int danio;
    private int durabilidad;

    protected Herramienta(String nombre,int danio){
        this.nombre=nombre;
        this.danio=entre(danio,1,50);
        this.durabilidad=100;
    }

    public abstract String grito();

    public abstract int golpear();

    public String getNombre(){
        return nombre;
    }

    public int getDanio(){

        return danio;
    }

    public int getDurabilidad(){
        return durabilidad;
    }
    public boolean estaRota(){
        return durabilidad<=0;
    }

    public int usar(){
        if(estaRota()){
            return 0;
        }else{
            durabilidad=durabilidad-1;
            return danio;
        }
    }
    public void reparar(){
        durabilidad=100;
    }

    private int entre(int valor, int min, int max){
        return Math.max(min, Math.min(max, valor));
    }
}



