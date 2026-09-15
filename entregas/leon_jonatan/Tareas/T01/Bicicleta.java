// CONTEXTO: Simulador de ruta en bicicleta para entrenar en la ciudad.
// QUE SABE Y POR QUE: cambio (int para relacion de marcha), velocidad (double para rendimiento), luz (boolean para seguridad).
// QUE SABE HACER Y POR QUE: subirCambio (void, incrementa la marcha), vaSegura (retorna boolean si cumple condiciones nocturnas).
// QUE IGNORE: modelo de llantas y rodada, no afectan la logica basica del cambio.
public class Bicicleta {
    // ATRIBUTOS
    int cambio = 1;
    double velocidad = 15.5;
    boolean luz = true;

    // CONSTRUCTOR 
    public Bicicleta() {
        this.cambio = 1;
        this.velocidad = 0.0;
        this.luz = false;
    }

    // METODO 1 
    void subirCambio() {
        cambio++;
    }

    // METODO 2 
    boolean vaSegura(double limiteVelocidad) {
        return velocidad <= limiteVelocidad && luz; 
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Bicicleta");
        System.out.println("[Estado inicial]");
        Bicicleta b = new Bicicleta();
        b.velocidad = 20.0;
        b.luz = true;
        System.out.println("Cambio: " + b.cambio + " | Velocidad: " + b.velocidad + " km/h");

        System.out.println("[Invocando metodos]");
        b.subirCambio();
        System.out.println("Es segura a 25 km/h: " + b.vaSegura(25.0));

        System.out.println("[Estado final]");
        System.out.println("Cambio actual: " + b.cambio);
    }
}