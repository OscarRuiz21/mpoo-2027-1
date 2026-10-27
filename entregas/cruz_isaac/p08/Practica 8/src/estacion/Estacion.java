package estacion;
import dispositivos.Sensor;
import dispositivos.Actuador;

public class Estacion {
    private final String nombre;
    private Sensor[] sensores;
    private Actuador[] actuadores;
    private int numSensores = 0;
    private int numActuadores = 0;
    private int ciclos = 0;

    public Estacion(String nombre) {
        this.nombre = nombre;
        this.sensores = new Sensor[5];
        this.actuadores = new Actuador[5];
    }

    public void instalar(Sensor s) {
        if (this.numSensores < 5) {
            this.sensores[this.numSensores] = s;
            this.numSensores++;
            System.out.println("Instalado: " + s);
        } else {
            System.out.println("Sin lugar para " + s.getId());
        }
    }

    public void instalar(Actuador a) {
        if (this.numActuadores < 5) {
            this.actuadores[this.numActuadores] = a;
            this.numActuadores++;
            System.out.println("Instalado: " + a);
        } else {
            System.out.println("Sin lugar para " + a.getId());
        }
    }

    public Sensor retirar(String id) {
        for (int i = 0; i < this.numSensores; i++) {
            if (this.sensores[i].getId().equals(id)) {
                Sensor retirado = this.sensores[i];
                for (int j = i; j < this.numSensores - 1; j++) {
                    this.sensores[j] = this.sensores[j + 1];
                }
                this.sensores[this.numSensores - 1] = null;
                this.numSensores--;
                System.out.println("Retirado: " + id);
                return retirado;
            }
        }
        return null;
    }

    public void ciclo() {
        this.ciclos++;
        System.out.println("== Ciclo " + this.ciclos + " en " + this.nombre);
        boolean hayAlerta = false;

        for (int i = 0; i < this.numSensores; i++) {
            System.out.println(this.sensores[i].leer());
            if (this.sensores[i].hayAlerta()) {
                hayAlerta = true;
            }
        }

        for (int i = 0; i < this.numActuadores; i++) {
            System.out.println(this.actuadores[i].reaccionar(hayAlerta));
        }
    }

    @Override
    public String toString() {
        return this.nombre + ": " + this.numSensores + " sensores, " + this.numActuadores + " actuadores, " + this.ciclos + " ciclos";
    }
}