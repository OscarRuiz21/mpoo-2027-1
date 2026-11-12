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
        return this.getSenal() + this.calibracion;
    }

    public boolean hayAlerta() {
        return this.medir() > this.maxima;
    }

    @Override
    public String toString() {
        return "Sensor " + this.getId() + " (" + this.getCarga() + "%) temperatura, max " + this.maxima;
    }
}

