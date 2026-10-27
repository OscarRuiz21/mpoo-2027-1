//Semaforo.java
package actuadores;
import dispositivos.Actuador;
import dispositivos.Luz; 

public class Semaforo extends Actuador {
    private final Luz[] luces;
    private String colorActual;

    public Semaforo(String id) {
        super(id);
        this.luces = new Luz[3];
        this.luces[0] = new Luz("rojo");
        this.luces[1] = new Luz("amarillo");
        this.luces[2] = new Luz("verde");
        this.colorActual = "apagado";
    }

    public void ponerEn(String color) {
        for (int i = 0; i < luces.length; i++) {
            // Se asume que Luz tiene un método toString o getColor, o que evaluamos el nombre interno
            // Como Luz ya viene en el .zip, se compara por la propiedad color asumiendo que tiene un getColor()
            // Si el IDE marca error por getColor(), cámbialo al atributo/método correspondiente de tu clase Luz.
            if (luces[i].getColor().equals(color)) {
                luces[i].encender();
                colorActual = color;
            } else {
                luces[i].apagar();
            }
        }
    }

    public String getColor() {
        return colorActual;
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