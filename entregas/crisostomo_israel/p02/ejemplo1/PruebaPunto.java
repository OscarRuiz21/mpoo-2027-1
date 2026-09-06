package ejemplo1;
public class PruebaPunto {
    public static void main(String[] args) {
        Punto p = new Punto();
        p.x = 5;
        p.y = 8;
        p.imprimePunto();

        Punto x = new Punto();
        x.x = 7;
        x.y = 2; // Nota: en la imagen de tu guía dice x.x = 2 por error tipográfico, cámbialo a x.y para asignar la coordenada vertical
        x.imprimePunto();
    }
}
