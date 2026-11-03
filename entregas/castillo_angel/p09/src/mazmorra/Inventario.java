package mazmorra;

public class Inventario {
    
    private final Herramienta[] herramientas;
    private int cuantas;

    public Inventario(){
        this.herramientas = new Herramienta[3];
        this.cuantas = 0;
    }

    public boolean agregar(Herramienta h){
        if (h != null && cuantas < herramientas.length){
            herramientas[cuantas] = h;
            cuantas ++;
            return true;
        }
        return false;
    }

    public int getCuantas(){
        return cuantas;
    }

    public Herramienta getHerramienta(int i){
        if(i >= 0 && i < herramientas.length){
            return herramientas[i];
        }
        return null; 
    }

    public int usarMejor(){
         Herramienta mejor = null;
         for(int i = 0; i < cuantas; i++){
            Herramienta h = herramientas[i];
            if(h != null && !h.estaRota()){
                if(mejor == null || h.getDanio() > mejor.getDanio()){
                    mejor = h;
                }
            }
         }
         if(mejor != null){
            return mejor.usar();
         }
         return 0;
    }
}
