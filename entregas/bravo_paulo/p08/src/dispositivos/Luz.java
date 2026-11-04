package dispositivos;

// final: nadie hereda de Luz
public final class Luz {
    private final String color;
    private boolean encendida;

    public Luz(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }
}
