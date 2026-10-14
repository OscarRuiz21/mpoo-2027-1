class Gerente extends Empleado {
    private double bono;

    Gerente(String nombre, double sueldoBase, double bono) {
        super(nombre, sueldoBase);
        this.bono = bono;
    }

    @Override
    public double calcularPago() {
        return getSueldoBase() + bono;
    }

    @Override
    public String toString() {
        return super.toString() + " · bono " + bono;
    }
}
