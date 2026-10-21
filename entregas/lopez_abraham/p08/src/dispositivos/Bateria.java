package dispositivos;

// Sin modificador de visibilidad en la clase (package-private)
class Bateria {
    private int carga;

    Bateria(int carga) {
        if (carga < 0) {
            this.carga = 0;
        } else if (carga > 100) {
            this.carga = 100;
        } else {
            this.carga = carga;
        }
    }

    int getCarga() {
        return carga;
    }

    void descargar(int puntos) {
        this.carga -= puntos;
        if (this.carga < 0) {
            this.carga = 0;
        }
    }
}