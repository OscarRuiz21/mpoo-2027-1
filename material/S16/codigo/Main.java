public class Main {
    public static void main(String[] args) {
        Empleado[] nomina = {
            new Gerente("Ana", 30000, 8000),
            new Vendedor("Hugo", 12000, 100000)
        };
        for (Empleado e : nomina) {
            System.out.println(e + " → paga " + e.calcularPago());
        }
    }
}
