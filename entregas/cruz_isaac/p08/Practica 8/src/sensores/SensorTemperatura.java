package sensores;

import dispositivos.Sensor;

public class SensorTemperatura extends Sensor {
    private double calibracion;
    private double maxima;

    public SensorTemperatura(String id, double calibracion, double maxima) {
        super(id, "grados");
        this.calibracion = calibracion;
        this.maxima = maxima;
    }

    @Override
    public double medir() {
        return getSenal() + this.calibracion;
    }

    @Override
    public boolean hayAlerta() {
        return medir() > this.maxima;
    }

    @Override
    public String toString() {
        return super.toString() + " temperatura, max " + this.maxima;
    }
}