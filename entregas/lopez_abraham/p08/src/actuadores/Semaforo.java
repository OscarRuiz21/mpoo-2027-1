package actuadores;

import dispositivos.Actuador;
import dispositivos.Luz;

public class Semaforo extends Actuador {
    private final Luz[] luces;

    public Semaforo(String id) {
        super(id);
        luces = new Luz[3];
        luces[0] = new Luz("rojo");
        luces[1] = new Luz("amarillo");
        luces[2] = new Luz("verde");
    }

    public void ponerEn(String color) {
        for (Luz luz : luces) {
            if (luz.getColor().equals(color)) {
                luz.encender();
            } else {
                luz.apagar();
            }
        }
    }

    public String getColor() {
        for (Luz luz : luces) {
            if (luz.isEncendida()) {
                return luz.getColor();
            }
        }
        return "apagado";
    }

    @Override
    public String reaccionar(boolean alerta) {
        encender();
        if (alerta) {
            ponerEn("rojo");
        } else {
            ponerEn("verde");
        }
        return getId() + " en " + getColor();
    }

    @Override
    public String toString() {
        return super.toString() + " semaforo en " + getColor();
    }
}