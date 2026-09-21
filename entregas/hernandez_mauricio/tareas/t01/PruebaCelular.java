/*Para el objeto del celular opte por dividir el objeto en dos clases, una donde establezco los metodos y el constructor y otra donde se realiza el proceso de main
que manda a llamar los datos que se establecieron en la clase Celular para poder compilarlos y así dar las impresiones que se solicitan. Para esto se manda a llamar al constructor 
Celular y se le dan los valores de una contraseña "MPOO" y un cierto porcentaje de bateria menor al 20% para que nos de el mensaje de cargar el celular.*/
public class PruebaCelular{
public static void main (String[] args){
    Celular miCelular = new Celular("MPOO", 17);

    System.out.println("-- INTRODUCE TU CONTRASEÑA --");
    boolean acceso = miCelular.introduceConstraseña();
    System.out.println();

    System.out.println("-- NIVEL DE BATERIA");
    miCelular.consultarBateria();
}
}