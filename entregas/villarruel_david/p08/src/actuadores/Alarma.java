package actuadores;

import dispositivos.Actuador;

public class Alarma extends Actuador {
    private final int volumen;

    public Alarma(String id, int volumen) {
        super(id);
        this.volumen = Math.max(0, Math.min(10, volumen));
    }

    public int getVolumen() {
        return volumen;
    }

    @Override
    public String reaccionar(boolean alerta) {
        if (alerta) {
            encender();
            return getId() + " suena a volumen " + volumen;
        }

        apagar();
        return getId() + " en silencio";
    }

    @Override
    public String toString() {
        return super.toString() + " alarma, volumen " + volumen;
    }
}