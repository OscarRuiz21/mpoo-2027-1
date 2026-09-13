public class Lampara {

    private boolean encendida;
    private int nivelBrillo;
    public void encender() {
        encendida = true;
    }
    public void apagar() {
        encendida = false;
    }
    public void cambiarBrillo(int nuevoNivel) {
        if (encendida && nuevoNivel >= 1 && nuevoNivel <= 3) {
            nivelBrillo = nuevoNivel;
        }
    }
    public boolean estaEncendida() {
        return encendida;
    }
    public int getNivelBrillo() {
        return nivelBrillo;
    }
    public static void main(String[] args) {
        Lampara lampara = new Lampara();
        System.out.println("Inicio: encendida = " + lampara.estaEncendida()
                + ", brillo = " + lampara.getNivelBrillo());
        lampara.encender();
        System.out.println("Tras encender: encendida = " + lampara.estaEncendida());
        lampara.cambiarBrillo(2);
        System.out.println("Tras cambiarBrillo(2): brillo = " + lampara.getNivelBrillo());
        lampara.apagar();
        System.out.println("Tras apagar: encendida = " + lampara.estaEncendida());
        System.out.println("Final: encendida = " + lampara.estaEncendida()
                + ", brillo = " + lampara.getNivelBrillo());
    }
}