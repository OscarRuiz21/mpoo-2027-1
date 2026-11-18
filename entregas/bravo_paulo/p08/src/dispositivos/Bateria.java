package dispositivos;

class Bateria {
    private int carga;

    Bateria(int carga) {
        if (carga < 0) this.carga = 0;
        else if (carga > 100) this.carga = 100;
        else this.carga = carga;
    }

    int getCarga() {
        return carga;
    }

    void descargar(int puntos) {
        carga -= puntos;
        if (carga < 0) carga = 0;
    }
}
