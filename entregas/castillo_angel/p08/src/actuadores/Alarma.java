package actuadores;
import dispositivos.Actuador;

public class Alarma extends Actuador{
    private int volumen;

    public Alarma(String id, int volumen){
        super(id);
        setVolumen(volumen);
    }

    void setVolumen(int volumen){
        if (volumen < 0){
            this.volumen = 0;
        } else if (volumen > 10){
            this.volumen = 10;
        } else {
            this.volumen = volumen;
        }
    }

    public int getVolumen(){
        return volumen;
    }

    @Override 
    public String reaccionar(boolean alerta){
        if (alerta){
            encender();
            return getId() + " suena a volumen " + volumen;
        } else {
            apagar();
            return getId() + " en silencio";
        }
    }
    
}
