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
        sensores = new Sensor[5];
        actuadores = new Actuador[5];
        numSensores = 0;
        numActuadores = 0;
        ciclos = 0;
    }

    public void instalar(Sensor sensor) {
        if (numSensores < sensores.length) {
            sensores[numSensores] = sensor;
            numSensores++;
            System.out.println("Instalado: " + sensor);
        } else {
            System.out.println("Sin lugar para " + sensor.getId());
        }
    }

    public void instalar(Actuador actuador) {
        if (numActuadores < actuadores.length) {
            actuadores[numActuadores] = actuador;
            numActuadores++;
            System.out.println("Instalado: " + actuador);
        } else {
            System.out.println("Sin lugar para " + actuador.getId());
        }
    }

    public Sensor retirar(String id) {
        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].getId().equals(id)) {
                Sensor retirado = sensores[i];

                for (int j = i; j < numSensores - 1; j++) {
                    sensores[j] = sensores[j + 1];
                }

                sensores[numSensores - 1] = null;
                numSensores--;

                System.out.println("Retirado: " + id);
                return retirado;
            }
        }

        return null;
    }

    public void ciclo() {
        ciclos++;
        System.out.println("== Ciclo " + ciclos + " en " + nombre);

        boolean alerta = false;

        for (int i = 0; i < numSensores; i++) {
            Sensor sensor = sensores[i];
            System.out.println("  " + sensor.leer());

            if (sensor.hayAlerta()) {
                alerta = true;
            }
        }

        for (int i = 0; i < numActuadores; i++) {
            System.out.println("  " + actuadores[i].reaccionar(alerta));
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + numSensores + " sensores, "
                + numActuadores + " actuadores, "
                + ciclos + " ciclos";
    }
}