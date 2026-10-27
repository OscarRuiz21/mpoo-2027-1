package dispositivos;

public abstract class Actuador extends Dispositivo {
    private boolean encendido = false;

    public Actuador(String id, int carga) {
        super(id, carga);
    }

    public Actuador(String id) {
        this(id, 100);
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public abstract String reaccionar(boolean alerta);

    @Override
    public String toString() {
        return "Actuador " + super.toString();
    }
}