abstract class Empleado {
    private String nombre;
    private double sueldoBase;

    Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() { return nombre; }
    public double getSueldoBase() { return sueldoBase; }

    public abstract double calcularPago();

    @Override
    public String toString() {
        return nombre + " · base " + sueldoBase;
    }
}
