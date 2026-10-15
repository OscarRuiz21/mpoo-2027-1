// CONTEXTO: App de control bluetooth para monitorear el estado y la bateria de los audifonos.
// QUE SABE Y POR QUE: modelo (para identificar el dispositivo), bateria (porcentaje actual para saber cuanto durara), conectado (para saber si puede emitir sonido).
// QUE SABE HACER Y POR QUE: usar(int) es void porque solo reduce la bateria internamente; necesitaCargar() retorna boolean para alertar al usuario.
// QUE IGNORE: la ecualizacion de audio y el nivel de volumen, porque este programa solo monitorea la conexion y la energia.

public class Audifonos {

    //  ATRIBUTOS (etiqueta cada parte) 
    String modelo = "Generico"; // tipo: String · nombre: modelo · valor inicial: "Generico"
    int bateria = 100;          // tipo: int · nombre: bateria · valor inicial: 100
    boolean conectado = false;  // tipo: boolean · nombre: conectado · valor inicial: false

    //  CONSTRUCTOR (obligatorio en UNA de tus tres clases) 
    // firma: Audifonos(String) · sin tipo de retorno
    public Audifonos(String modelo) {
        this.modelo = modelo; // this.modelo = ATRIBUTO · modelo = PARAMETRO
    }

    //  METODOS (etiqueta cada parte y su firma) 
    // firma: usar(int) · retorno: void · parametro: int horas
    public void usar(int horas) {
        int desgaste = horas * 15; // operador aritmetico 
        bateria -= desgaste;       // operador abreviado 
    }

    // firma: necesitaCargar() · retorno: boolean · sin parametros
    public boolean necesitaCargar() {
        return bateria < 20 || !conectado; // operadores logicos y relacionales
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Audifonos");
        Audifonos a = new Audifonos("AirPods Pro"); // usa el constructor con datos

        System.out.println("estado inicial");
        System.out.println("modelo = " + a.modelo);
        System.out.println("bateria = " + a.bateria);
        System.out.println("conectado = " + a.conectado);

        System.out.println("invocando metodos");
        a.conectado = true; // asignacion directa para la prueba
        a.usar(3);
        System.out.println("usar(3) -> void; bateria = " + a.bateria);
        System.out.println("necesitaCargar() -> boolean; " + a.necesitaCargar());

        System.out.println("estado final");
        System.out.println("bateria = " + a.bateria + " | necesitaCargar = " + a.necesitaCargar());
    }
}