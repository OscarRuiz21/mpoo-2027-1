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

    public void instalar(Sensor s) {
        if (numSensores >= sensores.length) {
            System.out.println("Sin lugar para " + s.getId());
            return;
        }
        sensores[numSensores++] = s;
        System.out.println("Instalado: " + s);
    }

    public void instalar(Actuador a) {
        if (numActuadores >= actuadores.length) {
            System.out.println("Sin lugar para " + a.getId());
            return;
        }
        actuadores[numActuadores++] = a;
        System.out.println("Instalado: " + a);
    }

    public Sensor retirar(String id) {
        for (int i = 0; i < numSensores; i++) {
            if (sensores[i].getId().equals(id)) {
                Sensor retirado = sensores[i];
                for (int j = i; j < numSensores - 1; j++) sensores[j] = sensores[j + 1];
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
        boolean alerta = false;
        for (int i = 0; i < numSensores; i++) {
            Sensor s = sensores[i];
            System.out.println("  " + s.leer());
            if (s.hayAlerta()) alerta = true;
        }
        for (int i = 0; i < numActuadores; i++) {
            System.out.println("  " + actuadores[i].reaccionar(alerta));
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + numSensores + " sensores, " + numActuadores + " actuadores, " + ciclos + " ciclos";
    }
}
