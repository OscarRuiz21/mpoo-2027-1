package actuadores;

import dispositivos.Actuador;
import dispositivos.Luz;

public class Semaforo extends Actuador {
    private final Luz[] luces;

    public Semaforo(String id) {
        super(id);
        this.luces = new Luz[] {
            new Luz("rojo"),
            new Luz("amarillo"),
            new Luz("verde")
        };
    }

    public void ponerEn(String color) {
        for (Luz luz : luces) {
            if (luz.getColor().equalsIgnoreCase(color)) {
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
            return getId() + " en rojo";
        } else {
            ponerEn("verde");
            return getId() + " en verde";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " semaforo en " + getColor();
    }
}