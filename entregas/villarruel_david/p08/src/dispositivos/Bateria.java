package dispositivos;

class Bateria {
    private int carga;

    Bateria(int carga) {
        this.carga = Math.max(0, Math.min(100, carga));
    }

    int getCarga() {
        return carga;
    }

    void descargar(int puntos) {
        carga = Math.max(0, carga - puntos);
    }
}