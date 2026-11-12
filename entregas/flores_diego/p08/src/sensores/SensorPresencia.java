package sensores;
import dispositivos.Sensor;

public class SensorPresencia extends Sensor {

    public SensorPresencia(String id) {
        super(id, "cm");
    }


    @Override
    public double medir() {
        double senalEnMilimetros = this.getSenal();
        return senalEnMilimetros / 10.0;
    }

    public boolean hayAlerta() {
        return this.medir() < 2;
    }

    @Override
    public String toString() {
        return super.toString() + " presencia";
    }
}

