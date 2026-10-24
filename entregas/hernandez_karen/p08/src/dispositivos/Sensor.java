package dispositivos;

public abstract class Sensor extends Dispositivo{
    private final String unidad;
    private double senal;


    public Sensor(String id,String unidad,int carga){
        super(id,carga);
        this.unidad=unidad;
    }
    public Sensor(String id, String unidad){
        this(id,unidad,100);
    }


    public String getUnidad(){
        return unidad;
    }
    public void recibir(double senal){
        this.senal=senal;
    }
    protected double getSenal(){
        return senal;
    }
    public abstract double medir();

    public abstract boolean hayAlerta();

    public final String leer(){
        gastar(1);
        String leer=getId()+" mide "+medir()+" "+unidad;
        if(hayAlerta()){
            leer=leer+" ALERTA";
        }
        return leer;
    }
    @Override
    public String toString(){
        return "Sensor "+super.toString();
    }


}
