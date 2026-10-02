public class BotellaAgua {

    private int capacidadMl;

    private int cantidadActualMl;

    public BotellaAgua(int capacidadMl) {
        this.capacidadMl = capacidadMl;
        this.cantidadActualMl = 0;
    }

    public void llenar(int ml) {
        int espacioLibre = capacidadMl - cantidadActualMl;
        if (ml <= espacioLibre) {
            cantidadActualMl = cantidadActualMl + ml;
        } else {
            cantidadActualMl = capacidadMl;
        }
    }

    public void beber(int ml) {
        if (ml <= cantidadActualMl) {
            cantidadActualMl = cantidadActualMl - ml;
        } else {
            cantidadActualMl = 0;
        }
    }

    public boolean estaVacia() {
        return cantidadActualMl == 0;
    }
    public int getCantidadActualMl() {
        return cantidadActualMl;
    }

    public static void main(String[] args) {
        BotellaAgua botella = new BotellaAgua(1000);
        System.out.println("Inicio: agua = " + botella.getCantidadActualMl() + " ml");
        botella.llenar(600);
        System.out.println("Tras llenar 600: agua = " + botella.getCantidadActualMl() + " ml");

        botella.beber(200);
        System.out.println("Tras beber 200: agua = " + botella.getCantidadActualMl() + " ml");

        boolean vacia = botella.estaVacia();
        System.out.println("Esta vacia? " + vacia);

        // estado final
        System.out.println("Final: agua = " + botella.getCantidadActualMl() + " ml");
    }
}