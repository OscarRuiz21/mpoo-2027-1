package mazmorra;

public class Herramienta{
    private final String nombre;
    private final int danio;
    private int durabilidad;

    public Herramienta(String nombre, int danio){
        this.nombre = nombre;
        this.danio = entre(danio, 1, 50);
        this.durabilidad = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanio() {
        return danio;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public boolean estaRota(){
        return this.durabilidad <= 0;
    }

    public int usar(){
        if(estaRota()){
            return 0;
        }
        else{
            this.durabilidad --;
            return this.danio;
        }
    }

    public void reparar(){
        this.durabilidad = 100;
    }

    private int entre(int valor, int min, int max){
        if(valor < min){
            return min;
        }
        if (valor > max){
            return max;
        }
        return valor;
    }
}