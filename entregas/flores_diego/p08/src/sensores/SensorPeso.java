package sensores;
import dispositivos.Sensor;

public class SensorPeso extends Sensor {

    private double limite;

    public SensorPeso(String id, int carga, double limite) {
        super(id, "kg", carga);
        if (limite <= 0) {
            this.limite = 1;
        } else {
            this.limite = limite;
        }
    }

    public SensorPeso(String id, double limite) {
        this(id, 100, limite);
    }

    @Override
    public double medir() {
        return this.getSenal() / 1000.0;
    }

    public boolean hayAlerta() {
        return this.medir() > this.limite;
    }

    @Override
    public String toString() {
        return "Sensor " + getId() + " (" + getCarga() + "%) " +  " peso, limite " + this.limite;
    }
}

