public class Punto1 {

    int x,y;

    public Punto1(int x, int y) {

        this.x = x;

        this.y = y;

    }
    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}

     class PruebaPunto1 {

    public static void main(String[] args) {
      Punto1 p = new Punto1 (5, 8);
      p.imprimePunto();

      Punto1 x = new Punto1(7, 2);
      x.imprimePunto();
    }
}
