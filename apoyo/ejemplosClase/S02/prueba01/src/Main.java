public class Main {
    public static void main(String[] args){
       Circulo circulo1 = new Circulo();

       Circulo circulo2 = new Circulo();
       circulo2.radio = 10;

       Circulo circulo3 = new Circulo();
       circulo3.radio = 15;

       circulo1.area();
       circulo2.area();


        System.out.println("El area del circulo 1 es: " + circulo1.area());
        System.out.println("El area del circulo 2 es: " + circulo2.area());
        System.out.println("El area del circulo 3 es: " + circulo3.area());
    }
}
