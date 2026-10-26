package dispositivos;

public abstract class Sensor extends Dispositivo {
    private String unidad;
    private Double senal;

    public Sensor(String id, String unidad, int carga){
        super(id,carga);
        this.unidad = unidad;
    }
    
    public Sensor(String id, String unidad){
        this(id, unidad, 100);
    }

    public String getUnidad(){
        return unidad;
    }

    public void recibir(Double senal){
        this.senal = senal;
    }

    protected double getSenal(){
        return senal;
    }

    public abstract double medir();
    public abstract boolean hayAlerta();

    public final String leer(){
        gastar(1);
        return getId() + "mide " + medir() + " " + getUnidad() + (hayAlerta()? "ALERTA" : "");
    }

    @Override
    public String toString(){
        return ("Sensor " + (super.toString()));
    }
}
