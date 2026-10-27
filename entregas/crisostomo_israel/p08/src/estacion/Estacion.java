// Archivo: src/estacion/Estacion.java
package estacion;
import dispositivos.Sensor;
import dispositivos.Actuador;

public class Estacion {
    private final String nombre;
    private Sensor[] sensores;
    private Actuador[] actuadores;
    private int numSensores;
    private int numActuadores;
    private int ciclos;

    public Estacion(String nombre) {
        this.nombre = nombre;
        this.sensores = new Sensor[5];
        this.actuadores = new Actuador[5];
        this.numSensores = 0;
        this.numActuadores = 0;
        this.ciclos = 0;
    }

    public void instalar(Sensor s) {
        if (numSensores < 5) {
            sensores[numSensores] = s;
            numSensores++;
            System.out.println("Instalado: " + s.toString());
        } else {
            System.out.println("Sin lugar para " + s.getId());
        }
    }

    public void instalar(Actuador a) {
        if (numActuadores < 5) {
            actuadores[numActuadores] = a;
            numActuadores++;
            System.out.println("Instalado: " + a.toString());
        } else {
            System.out.println("Sin lugar para " + a.getId());
        }
    }

    public Sensor retirar(String id) {
        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].getId().equals(id)) {
                Sensor retirado = sensores[i];
                // Recorrer los siguientes un lugar a la izquierda
                for (int j = i; j < numSensores - 1; j++) {
                    sensores[j] = sensores[j + 1];
                }
                sensores[numSensores - 1] = null;
                numSensores--;
                System.out.println("Retirado: " + retirado.getId());
                return retirado;
            }
        }
        return null;
    }

    public void ciclo() {
        ciclos++;
        System.out.println("== Ciclo " + ciclos + " en " + nombre);
        
        boolean alertaGeneral = false;
        
        for (int i = 0; i < numSensores; i++) {
            System.out.println("  " + sensores[i].leer());
            if (sensores[i].hayAlerta()) {
                alertaGeneral = true;
            }
        }
        
        for (int i = 0; i < numActuadores; i++) {
            System.out.println("  " + actuadores[i].reaccionar(alertaGeneral));
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + numSensores + " sensores, " + numActuadores + " actuadores, " + ciclos + " ciclos";
    }
}