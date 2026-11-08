package mazmorra;
public class Caballero extends Personaje{
    //Constructor del personaje de caballero y haciendo uso de la composición
    public Caballero(String nombre){
        super(nombre, 120);
    }
    @Override
    public String getTipo(){
        return "Caballero";
    }
    @Override
    protected int calcularDanio(int base){
        return base + 5;
    }
}
