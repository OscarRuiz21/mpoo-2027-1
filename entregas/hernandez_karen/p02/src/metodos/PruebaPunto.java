public class PruebaPunto {
     public static void main(String[] args){
      
        Punto p=new Punto();
        p.x=5;
        p.y=8;
        p.imprimePunto();

        Punto x=new Punto();
        x.x=7;
        x.y=2;//en la guia esta x.x=2,pero seria modificar la misma coordenada x
        x.imprimePunto();
    }
}
