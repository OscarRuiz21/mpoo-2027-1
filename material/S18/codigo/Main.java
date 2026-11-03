public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", 20000, 5000);
        g.sueldoBase = 0;
        System.out.println(g.calcularPago());
    }
}
