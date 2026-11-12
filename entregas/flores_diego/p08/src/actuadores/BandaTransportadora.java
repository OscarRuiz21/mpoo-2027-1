package actuadores;
import dispositivos.Actuador;

public class BandaTransportadora extends Actuador {
    private int velocidad;
    private int recorrido;

    public BandaTransportadora(String id, int velocidad) {
        super(id);
        if (velocidad < 1) {
            this.velocidad = 1;
        } else {
            this.velocidad = velocidad;
        }
    }

    public int getRecorrido() {
        return recorrido;
    }

    public String avanzar(int metros) {
        if (!isEncendido()) {
            return "A1 apagada, no avanza";
        } else {
            recorrido += metros;
            gastar(metros);
            return "A1 avanza " + metros + " m, lleva " + recorrido + " m";
        }
    }

    public String avanzar() {
        return avanzar(this.velocidad);
    }

    public String reaccionar(boolean alerta) {
        if (alerta) {
            apagar();
            return "A1 se detiene";
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

