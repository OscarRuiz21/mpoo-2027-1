package dispositivos;

public class Bateria {
    private int carga;

    public Bateria(int carga){
        if(carga<0){
            this.carga=0;
        } else if (carga>100) {
            this.carga=100;
        }else {
            this.carga=carga;
        }
    }

    public int getCarga(){
        return carga;
    }

    public void descargar(int puntos){
        carga=carga-puntos;
        if(carga<0){
            carga=0;
        }
    }
}
