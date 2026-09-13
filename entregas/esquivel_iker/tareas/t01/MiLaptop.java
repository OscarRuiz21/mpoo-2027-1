// CONTEXTO: Mi laptop es lo que utilizo todo el dia, para entretenerme o hacer tareas y programas
// QUE SABE Y POR QUE: 
// Marca (string): Sabe que marca es porque identidifica al modelo de laptop.
// Batería (double): Sabe cuanta batería tiene y cuando esta baja avisa.
// Encendido (boolean): Sabe si esta prendida  para realizar actividades.
// UsoHoras (int): Sabe cuantas horas tiene de uso.
// QUE SABE HACER Y POR QUE: (cada metodo: por que void o por que retorna,y por que esos parametros):
// encender(): no recibe parametros y es void porque solo cambia el estado de la laptop a encendida.
// apagar(): no recibe parametros y es void porque solo cambia el estado de la laptop a apagada.
// usar(double minutos): recibe los minutos de uso para calcular el consumo de bateria y es void porque modifica los atributos del objeto sin retornar un valor.
// estaEncendida(): no recibe parametros porque consulta el estado del objeto y retorna boolean porque puede indicar true o false.
// mostrarBateria(): no recibe parametros porque utiliza el atributo bateria y es void porque solamente muestra su valor.
// QUE IGNORE: (1 o 2 cosas del objeto real que no modelaste, y por que):
// 1- No modele sus componentes internos porque sería demasiado trabajo
// 2- No modele  todo lo que ocurre dentro del sistema operativo, nuevamente porque sería muuuucho trabajo.

public class MiLaptop {

    // ===== ATRIBUTOS (etiqueta cada parte) =====

    String marca;            // tipo: String - nombre: marca
    String modelo;           // tipo: String - nombre: modelo
    double bateria;          // tipo: double - nombre: bateria - valor inicial: 0
    boolean encendida;       // tipo: boolean - nombre: encendida
    int horasUso;            // tipo: int - nombre: horasUso - valor inicial: 0


    // ===== CONSTRUCTOR (obligatorio en UNA de tus tres clases) =====

    // Firma: Laptop(String marca, String modelo, double bateria)
    // Recibe la informacion inicial de la laptop.
    // Usa this para distinguir los atributos de los parametros.

    public MiLaptop(String marca, String modelo, double bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.encendida = false;
        this.horasUso = 0;
    }

    // ===== METODOS (etiqueta cada parte y su firma) =====

    // Firma: encender() - retorno: void - parametros: ninguno
    // Enciende la laptop porque es una accion propia del objeto.
    // No retorna nada porque solamente modifica su estado.
    public void encender() {
        encendida = true;
        System.out.println("La laptop se encendio.");
    }


    // Firma: apagar() - retorno: void - parametros: ninguno
    // Apaga la laptop porque es una accion propia del objeto.
    // No retorna nada porque solamente modifica su estado.
    public void apagar() {
        encendida = false;
        System.out.println("La laptop se apago.");
    }


    // Firma: usar(double minutos) - retorno: void - parametro: minutos
    // Representa el uso de la laptop durante cierta cantidad de minutos.
    // Recibe minutos porque necesita saber cuanto tiempo fue utilizada.
    // No retorna nada porque modifica el estado de la laptop.
    public void usar(double minutos) {
        double consumo = minutos * 0.5;  //Operador *
        bateria = bateria - consumo;     //Operador -
        horasUso += (int)(minutos / 60);  //Operadores += / y casting
        if (bateria < 0) {                //Operador <
            bateria = 0;
        }
    }

    // Firma: estaEncendida() - retorno: boolean - parametros: ninguno
    // Consulta si la laptop esta encendida.
    // No necesita parametros porque consulta su propio atributo.
    // Retorna boolean porque el resultado solo puede ser true o false.
    public boolean estaEncendida() {
        return encendida;
    }


    // Firma: mostrarBateria() - retorno: void - parametros: ninguno
    // Muestra el porcentaje actual de bateria.
    // No recibe parametros porque la bateria ya esta almacenada en el objeto.
    // Es void porque solamente muestra informacion.
    public void mostrarBateria() {
        System.out.println("Bateria: " + bateria + "%");
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        System.out.println("RADIOGRAFIA: Laptop");

        //usando el constructor
        MiLaptop miLaptop = new MiLaptop("ASUS", "F16", 80.0);

        //imprimiendo cada atributo
        System.out.println("[estado inicial]");
        System.out.println("Marca: " + miLaptop.marca);
        System.out.println("Modelo: " + miLaptop.modelo);
        System.out.println("Bateria: " + miLaptop.bateria + "%");
        System.out.println("Encendida: " + miLaptop.encendida);
        System.out.println("Horas de uso: " + miLaptop.horasUso);

        // invocando metodos
        System.out.println("[invocando metodos]");
        miLaptop.encender();
        miLaptop.usar(120);
        miLaptop.mostrarBateria();
        System.out.println("¿Esta encendida? " + miLaptop.estaEncendida());

        // imprimiendo atributos otra vez
        System.out.println("[estado final]");
        System.out.println("Marca: " + miLaptop.marca);
        System.out.println("Modelo: " + miLaptop.modelo);
        System.out.println("Bateria: " + miLaptop.bateria + "%");
        System.out.println("Encendida: " + miLaptop.encendida);
        System.out.println("Horas de uso: " + miLaptop.horasUso);
    }
}