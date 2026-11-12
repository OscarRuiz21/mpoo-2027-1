package estacion;

import dispositivos.Actuador;
import dispositivos.Sensor;

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
        if (numSensores < sensores.length) {
            sensores[numSensores] = s;
            numSensores++;
            System.out.println("Instalado: " + s.toString());
        } else {
            System.out.println("Sin lugar para " + s.getId());
        }
    }

    public void instalar(Actuador a) {
        if (numActuadores < actuadores.length) {
            actuadores[numActuadores] = a;
            numActuadores++;
            System.out.println("Instalado: " + a.toString());
        } else {
            System.out.println("Sin lugar para " + a.getId());
        }
    }

    public Sensor retirar(String id) {
        int indiceEncontrado = -1;

        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].getId().equals(id)) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado == -1) {
            return null;
        }

        Sensor retirado = sensores[indiceEncontrado];

        for (int i = indiceEncontrado; i < numSensores - 1; i++) {
            sensores[i] = sensores[i + 1];
        }

        sensores[numSensores - 1] = null;
        numSensores--;

        System.out.println("Retirado: " + id);
        return retirado;
    }

    public void ciclo() {
        ciclos++;
        System.out.println("== Ciclo " + ciclos + " en " + nombre);

        boolean alertaDetectada = false;

        for (int i = 0; i < numSensores; i++) {
            sensores[i].leer();
            String textoSensor = sensores[i].getId() + " mide " + sensores[i].medir() + " " + "" +  sensores[i].getUnidad();
            if (sensores[i].hayAlerta()) {
                alertaDetectada = true;
                textoSensor += " ALERTA";
            }
            System.out.println(textoSensor);
        }

        for (int i = 0; i < numActuadores; i++) {
            String reaccion = actuadores[i].reaccionar(alertaDetectada);
            System.out.println(reaccion);
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + numSensores + " sensores, " + numActuadores + " actuadores, " + ciclos + " ciclos";
    }
}

