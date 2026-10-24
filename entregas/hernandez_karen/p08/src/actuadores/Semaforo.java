package actuadores;

import dispositivos.Actuador;
import dispositivos.Luz;

public class Semaforo extends Actuador {
    private final Luz[] luces;

    public Semaforo(String id) {
        super(id);
        this.luces = new Luz[3];
        this.luces[0] = new Luz("rojo");
        this.luces[1] = new Luz("amarillo");
        this.luces[2] = new Luz("verde");
    }


    public void ponerEn(String color) {
        for (int i = 0; i < luces.length; i++) {
            if (luces[i].getColor().equals(color)) {
                luces[i].encender();
            } else {
                luces[i].apagar();
            }
        }
    }

    public String getColor() {
        for (int i = 0; i < luces.length; i++) {
            if (luces[i].isEncendida()) {
                return luces[i].getColor();
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