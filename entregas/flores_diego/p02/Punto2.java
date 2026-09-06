public class Punto2{

     int x,y;

    public Punto2(){

}
    public Punto2(int x, int y){
        this.x = x;
        this.y = y;
}



    public void imprimePunto() {
    System.out.println("Punto [x=" + x + ", y=" + y + "]");

    }
}
    class PruebaPunto2 {

    public static void main(String[] args) {
        Punto2 p = new Punto2(5, 8);
        p.imprimePunto();

        Punto2 x = new Punto2();
        x.x=7;
        x.y=2;
        x.imprimePunto();

    }
}