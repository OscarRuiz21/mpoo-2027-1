package ejemplo3;

public class PruebaCirculo {
    public static void main(String[] args) {
        
        // Como PI es estática (static), la llamamos usando directamente 
        // el nombre de la clase (Circulo), sin usar "new"
        System.out.println("El valor de la constante PI es: " + Circulo.PI);
        
    }
}