package estacion;

import dispositivos.Sensor;
import dispositivos.Actuador;

public class Estacion {
    private final String nombre;
    private final Sensor[] sensores;
    private final Actuador[] actuadores;
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
        if (numSensores < sensores.length) {
            sensores[numSensores++] = s;
            System.out.println("Instalado: " + s);
        } else {
            System.out.println("Sin lugar para " + s.getId());
        }
    }

    public void instalar(Actuador a) {
        if (numActuadores < actuadores.length) {
            actuadores[numActuadores++] = a;
            System.out.println("Instalado: " + a);
        } else {
            System.out.println("Sin lugar para " + a.getId());
        }
    }

    public Sensor retirar(String id) {
        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].getId().equalsIgnoreCase(id)) {
                Sensor retirado = sensores[i];
                for (int j = i; j < numSensores - 1; j++) {
                    sensores[j] = sensores[j + 1];
                }
                sensores[--numSensores] = null;
                System.out.println("Retirado: " + id);
                return retirado;
            }
        }
        return null;
    }

    public void ciclo() {
        ciclos++;
        System.out.println("== Ciclo " + ciclos + " en " + nombre);
        
        boolean hayAlertaGlobal = false;

        for (int i = 0; i < numSensores; i++) {
            System.out.println(sensores[i].leer());
            if (sensores[i].hayAlerta()) {
                hayAlertaGlobal = true;
            }
        }

        for (int i = 0; i < numActuadores; i++) {
            System.out.println(actuadores[i].reaccionar(hayAlertaGlobal));
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + numSensores + " sensores, " + numActuadores + " actuadores, " + ciclos + " ciclos";
    }
}