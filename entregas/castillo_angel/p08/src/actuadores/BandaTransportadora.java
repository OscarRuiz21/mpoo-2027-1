package actuadores;
import dispositivos.Actuador;
public class BandaTransportadora extends Actuador{
    private int velocidad;
    private int recorrido;

    public BandaTransportadora(String id, int velocidad){
        super(id);
        setVelocidad(velocidad);
        this.recorrido = 0;
    }

    void setVelocidad(int velocidad){
        if (velocidad < 1){
            this.velocidad = 1;
        } else {
            this.velocidad = velocidad;
        }
    }

    public int getRecorrido(){
        return recorrido;
    }

    public String avanzar(int metros){
        if(isEncendido() == false){
            return getId() + " apagada, no avanza";
        } else {
            recorrido += metros;
            gastar(metros);
            return getId() + " avanza " + metros + "m, lleva " + recorrido + " m";
        }
    }

    public String avanzar(){
        return avanzar(velocidad);
    }

    @Override 
    public String reaccionar(boolean alerta){
        if (alerta){
            encender();
            return avanzar();
        } else {
            apagar();
            return getId() + " se detiene";
        }
    }

    @Override 
    public String toString(){
        return super.toString() + " banda, 2 m por ciclo";
    }
}
