package ejemplo3;

public class Automovil {
    String modelo;
    int kilometraje;

   /*modelo guarda el nombre del automóvil y kilometraje guarda los kilómetros recorridos. */ 
    public Automovil(String modelo, int kilometraje) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        /*Atributo del objeto = dato que llegó al constructor */
    }

    // Método que utiliza el atributo del objeto
    public void registrarServicio(int kilometrosRecorridos) {
        kilometraje = kilometraje + kilometrosRecorridos;
        System.out.println("El " + modelo + " tiene ahora " + kilometraje + " kilómetros en el odómetro.");
    }
}