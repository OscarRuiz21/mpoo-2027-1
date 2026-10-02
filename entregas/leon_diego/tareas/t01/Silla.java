public class Silla {
    private boolean ocupada;
    private int pesoMaximoKg;
    public void ocupar() {
        ocupada = true;
    }
    public void desocupar() {
        ocupada = false;
    }
    public boolean estaDisponible() {
        return !ocupada;
    }
    public int getPesoMaximoKg() {
        return pesoMaximoKg;
    }

    public static void main(String[] args) {
        Silla silla = new Silla();
        silla.pesoMaximoKg = 120;
        System.out.println("Inicio: disponible? " + silla.estaDisponible());
        silla.ocupar();
        System.out.println("Tras ocupar: disponible? " + silla.estaDisponible());
        silla.desocupar();
        System.out.println("Tras desocupar: disponible? " + silla.estaDisponible());
        int limite = silla.getPesoMaximoKg();
        System.out.println("Peso maximo: " + limite + " kg");
        System.out.println("Final: disponible? " + silla.estaDisponible());
    }
}