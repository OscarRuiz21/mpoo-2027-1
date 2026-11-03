package mazmorra;

public class Herramienta {
    private final String nombre;
    private final int danio;
    private int durabilidad;

    public Herramienta(String nombre, int danio){
        this.nombre = nombre;
        this.danio = entre(danio);
        this.durabilidad = 100;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getDanio(){
        return this.danio;
    }

    public int getDurabilidad(){
        return durabilidad;
    }

    public boolean estaRota(){
            return this.durabilidad <= 0;    
    }

    public int usar(){
        if (estaRota() == true){
            return 0;
        } else {
            this.durabilidad -= 1;
            return this.danio;
        } 
    }

    public void reparar(){
        this.durabilidad = 100;
    }

    private int entre(int danio){
        if (danio < 0){
            return 1;
        } else if (danio > 50){
            return 50;
        } else {
            return danio;
        }
    }    
}
