package dispositivos;

public class Bateria {
    private int carga;

    public Bateria(int carga) {
        if (carga < 0) {
            this.carga = 0;
        } else if (carga > 100) {
            this.carga = 100;
        } else {
            this.carga = carga;
        }
    }

    public int getCarga() {
        return this.carga;
    }

    public void descargar(int puntos) {
        this.carga -= puntos;
        if (this.carga < 0) {
            this.carga = 0;
        }
    }
}
