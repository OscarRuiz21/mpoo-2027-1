package sensores;
import dispositivos.Sensor;

public class SensorPresencia extends Sensor {
    public SensorPresencia(String id) {
        super(id, "cm");
    }

    @Override
    public double medir() {
        return getSenal() / 10.0;
    }

    @Override
    public boolean hayAlerta() {
        return medir() < 2;
    }

    @Override
    public String toString() {
        return super.toString() + " presencia";
    }
}