package actuadores;

import dispositivos.Actuador;

public class BandaTransportadora extends Actuador {
    private int velocidad;
    private int recorrido;

    public BandaTransportadora(String id, int velocidad) {
        super(id);
        this.velocidad = velocidad < 1 ? 1 : velocidad;
        this.recorrido = 0;
    }

    public int getRecorrido() {
        return recorrido;
    }

    public String avanzar(int metros) {
        if (!isEncendido()) {
            return getId() + " apagada, no avanza";
        }
        recorrido += metros;
        gastar(metros);
        return getId() + " avanza " + metros + " m, lleva " + recorrido + " m";
    }

    public String avanzar() {
        return avanzar(velocidad);
    }

    @Override
    public String reaccionar(boolean alerta) {
        if (alerta) {
            apagar();
            return getId() + " se detiene";
        } else {
            encender();
            return avanzar();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " banda, " + velocidad + " m por ciclo";
    }
}
