package dispositivos;

public abstract class Actuador extends Dispositivo {
    private boolean encendido;

    public Actuador(String id, int carga){
        super(id,carga);
    }
    public Actuador(String id){
        this(id,100);
    }
    public boolean isEncendido(){
        return encendido;
    }
    public void encender(){
        encendido=true;
    }
    public void apagar(){
        encendido=false;
    }
    public abstract String reaccionar(boolean alerta);
    @Override
    public String toString(){
        return "Actuador"+ super.toString();
    }
}
