class Vendedor extends Empleado {
    private double ventas;

    Vendedor(String nombre, double sueldoBase, double ventas) {
        super(nombre, sueldoBase);
        this.ventas = ventas;
    }

    @Override
    public double calcularPago() {
        return getSueldoBase() + ventas * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + " · ventas " + ventas;
    }
}
