package estacion;

import sensores.SensorTemperatura;

public class PruebaTemperatura {
    public static void main(String[] args) {
        SensorTemperatura termo = new SensorTemperatura("S3", -1.5, 45);
        System.out.println(termo);
        termo.recibir(41.5);
        System.out.println(termo.leer());
        termo.recibir(50);
        System.out.println(termo.leer());
        System.out.println(termo);
    }
}
