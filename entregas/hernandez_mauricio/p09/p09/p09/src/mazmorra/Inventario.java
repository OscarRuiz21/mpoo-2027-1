package mazmorra;

public class Inventario {
    private final Herramienta[] herramientas;
    private int cuantas;

    public Inventario(){
        this.herramientas=new Herramienta[3];
        this.cuantas=0;
    }
    public boolean agregar( Herramienta h){
        if (h == null || this.cuantas >= this.herramientas.length){
            return false;
        }
        this.herramientas[this.cuantas] = h;
        this.cuantas++;
        return true;
    }

    public int getCuantas(){
        return this.cuantas;
    }

    public Herramienta getHerramienta(int i){
        if(i < 0 || i>=this.cuantas){
            return null;
        }
        return this.herramientas[i];
    }
    public int usarMejor(){
        int indiceMejor = -1;
        int maxDanio = -1;
        for(int i=0;i<this.cuantas;i++){
            Herramienta actual=this.herramientas[i];
            if(actual !=null && !actual.estaRota()){
                if(actual.getDanio()>maxDanio){
                    maxDanio=actual.getDanio();
                    indiceMejor=i;
                }
            }
        }
        if(indiceMejor == -1){
            return 0;
        }
        return this.herramientas[indiceMejor].usar();
    }



}
