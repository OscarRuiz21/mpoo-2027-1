package dispositivos;

class Bateria{
    private int carga;

    Bateria(int carga){
        setCarga(carga);
    }

    int getCarga(){
        return carga;
    }

    void setCarga(int carga){
        if(carga > 100){
            this.carga = 100;
        } else if(carga < 0){
            this.carga = 0;
        } else {
            this.carga = carga;
        }
    }

    void descargar(int puntos){
        if(puntos > 0){
            setCarga(this.carga - puntos);
        }
    }
}