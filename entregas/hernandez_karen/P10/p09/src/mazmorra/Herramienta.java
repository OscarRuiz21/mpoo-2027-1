package mazmorra;

public class Herramienta {

    private final String  nombre;
    private final int danio;
    private int durabilidad;

    public Herramienta(String nombre,int danio){
        this.nombre=nombre;
        if(danio<1){
            this.danio=1;
        } else if(danio>50){
            this.danio=50;
        }else{
            this.danio=danio;
        }
        this.durabilidad=100;
    }
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



