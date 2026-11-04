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
        if (numSensores < 5) {
            sensores[numSensores] = s;
            numSensores++;
            System.out.println("Instalado: " + s);
        } else {
            System.out.println("Sin lugar para " + s.getId());
        }
    }

    public void instalar(Actuador a) {
        if (numActuadores < 5) {
            actuadores[numActuadores] = a;
            numActuadores++;
            System.out.println("Instalado: " + a);
        } else {
            System.out.println("Sin lugar para " + a.getId());
        }
    }

    public Sensor retirar(String id) {
        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].getId().equals(id)) {
                Sensor retirado = sensores[i];
                System.out.println("Retirado: " + retirado.getId());
                for (int j = i; j < numSensores - 1; j++) {
                    sensores[j] = sensores[j + 1];
                }
                sensores[numSensores - 1] = null;
                numSensores--;
                return retirado;
            }
        }
        return null;
    }

    public void ciclo() {
        ciclos++;
        System.out.println("== Ciclo " + ciclos + " en " + nombre);
        
        boolean hayAlerta = false;
        
        for (int i = 0; i < numSensores; i++) {
            System.out.println(sensores[i].leer());
            if (sensores[i].hayAlerta()) {
                hayAlerta = true;
            }
        }
        
        for (int i = 0; i < numActuadores; i++) {
            System.out.println(actuadores[i].reaccionar(hayAlerta));
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + numSensores + " sensores, " + numActuadores + " actuadores, " + ciclos + " ciclos";
    }
}
