package estacion;

import actuadores.Alarma;
import actuadores.BandaTransportadora;
import actuadores.Semaforo;
import dispositivos.Sensor;
import sensores.SensorPeso;
import sensores.SensorPresencia;
import sensores.SensorTemperatura;
    public class Main {
        public static void main(String[] args) {
// los dispositivos nacen aquí, fuera de la estación
            SensorPresencia ojo = new SensorPresencia("S1");
            SensorPeso bascula = new SensorPeso("S2", 80, 25);
            SensorTemperatura termo = new SensorTemperatura("S3", -1.5,
                    45);
            BandaTransportadora banda = new BandaTransportadora("A1", 2);
            Semaforo semaforo = new Semaforo("A2");
            Alarma alarma = new Alarma("A3", 15);
            Estacion anden = new Estacion("Anden 3");
            anden.instalar(ojo);
            anden.instalar(bascula);
            anden.instalar(termo);
            anden.instalar(banda);
            anden.instalar(semaforo);
            anden.instalar(alarma);
// un paquete normal
            ojo.recibir(120);
            bascula.recibir(18500);
            termo.recibir(41.5);
            anden.ciclo();
// un paquete con sobrepeso
            ojo.recibir(95);
            bascula.recibir(32000);
            termo.recibir(43.5);
            anden.ciclo();
// la báscula sale a mantenimiento y el motor se calienta
            Sensor fuera = anden.retirar("S2");
            ojo.recibir(150);
            termo.recibir(48);
            anden.ciclo();
// la báscula regresa: es el mismo objeto
            System.out.println("Regresa: " + fuera);
            anden.instalar(fuera);
            banda.encender();
            System.out.println(banda.avanzar(5));
            System.out.println(anden);
        }
}
