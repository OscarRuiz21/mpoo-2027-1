class Gerente extends Empleado {
    private double bono;

    Gerente(String nombre, double sueldoBase, double bono) {
        super(nombre, sueldoBase);
        this.bono = bono;
    }

    double calcularPago() {
        return sueldoBase + bono;
    }
}
