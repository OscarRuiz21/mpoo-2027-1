//Perro guia es un tipo de perro
public class PerroGuia extends Perro{
    //Lo nuevo, lo demás viene de Perro
    private String asistido;

    public PerroGuia(String nombre, int edad, String raza, String asistido){
        super(nombre, edad, raza);
        this.asistido = asistido;
    }

    public String getAsistido(){
        return asistido;
    }

    @Override
    public String toString() {
        //reutiliza el del padre y le agrega
        return super. toString() + " | asiste a Marta " + asistido;
    }
}
