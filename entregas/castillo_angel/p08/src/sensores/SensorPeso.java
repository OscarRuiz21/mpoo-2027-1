package sensores;
import dispositivos.Sensor;

public class SensorPeso extends Sensor{
    private double limite;

    public SensorPeso(String id, int carga, double limite){
        super(id, "kg", carga);
        setLimite(limite);
    }

    public SensorPeso(String id, double limite){
        this(id,100, limite);
    }

    void setLimite(double limite){
        this.limite = (limite <= 0)? 1.0 : limite;
    }

    @Override 
    public double medir(){
        return getSenal()/1000;
    }

    @Override 
    public boolean hayAlerta(){
        return medir() > limite;
    }

    @Override 
    public String toString(){
        return super.toString() + " peso, limite " + limite;
    }





    
}
