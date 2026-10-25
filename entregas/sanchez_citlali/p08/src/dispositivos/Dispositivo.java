package dispositivos;

public abstract class Dispositivo {
    private final String id;
    private final Bateria bateria;

    public Dispositivo(String id, int carga) {
        this.id = id;
        this.bateria = new Bateria(carga);
    }

    public Dispositivo(String id) {
        this(id, 100);
    }

    public String getId() {
        return id;
    }

    public int getCarga() {
        return bateria.getCarga();
    }

    protected void gastar(int puntos) {
        bateria.descargar(puntos);
    }

    @Override
    public String toString() {
        return id + " (" + getCarga() + "%)";
    }
}
