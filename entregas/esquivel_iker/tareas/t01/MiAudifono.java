// CONTEXTO: (¿en que programa vive este objeto? una linea)
// Es para representar los audifonos que utilizo para escuchar musica, videos u otra cosa.
// QUE SABE Y POR QUE: (cada atributo, con su razon)
// marca: identifica la marca de los audifonos.
// bateria: indica el porcentaje de bateria disponible.
// volumen: representa el nivel de volumen.
// conectados: indica si los audifonos estan conectados.
// duracion: representa la duracion de reproduccion en segundos.
// QUE SABE HACER Y POR QUE: (cada metodo: por que void o por que retorna,y por que esos parametros):
// conectar(): sabe conectarse porque es una accion propia de los audifonos; es void porque solo cambia su estado y no necesita parametros.
// desconectar(): sabe desconectarse porque es una accion propia de los audifonos; es void porque solo cambia su estado y no necesita parametros.
// subirVolumen(double cantidad): sabe aumentar su volumen; recibe cantidad porque indica cuanto aumentarlo y es void porque solo modifica el volumen.
// bajarVolumen(double cantidad): sabe disminuir su volumen; recibe cantidad porque indica cuanto disminuirlo y es void porque solo modifica el volumen.
// estaConectado(): sabe indicar si esta conectado; retorna boolean porque el resultado puede ser true o false y no necesita parametros porque consulta su propio estado.
// calcularReproduccion(int canciones): sabe calcular el tiempo de reproduccion; recibe canciones porque indica cuantas se reproduciran y retorna int porque el resultado es un numero entero.
// porcentajeBateriaRestante(int consumo): sabe calcular la bateria restante; recibe consumo porque indica cuanto se gasto y retorna int porque el resultado es un porcentaje entero.
// QUE IGNORE: (1 o 2 cosas del objeto real que no modelaste, y por que):
// 1- No modele como funcionan los componentes internos para no hacer un código enorme.
// 2- No modele el estado fisico de los audifonos porque no lo considere relevante

public class MiAudifono {

    // ===== ATRIBUTOS (etiqueta cada parte) =====

    String marca;            // tipo: String - nombre: marca
    int bateria;             // tipo: int - nombre: bateria
    double volumen;          // tipo: double - nombre: volumen
    boolean conectados;      // tipo: boolean - nombre: conectados
    int duracion;            // tipo: int - nombre: duracion


    // ===== METODOS (etiqueta cada parte y su firma) =====

    // Firma: conectar() · retorno: void · parametros: ninguno
    // Sabe conectarse porque es una accion propia de los audifonos; es void porque solo cambia su estado.

    public void conectar() {
        conectados = true;
        System.out.println("Los audifonos se conectaron.");
    }


    // Firma: desconectar() · retorno: void · parametros: ninguno
    // Sabe desconectarse porque es una accion propia de los audifonos; es void porque solo cambia su estado.

    public void desconectar() {
        conectados = false;
        System.out.println("Los audifonos se desconectaron.");
    }


    // Firma: subirVolumen(double cantidad) · retorno: void · parametro: cantidad
    // Recibe la cantidad porque indica cuanto aumentar el volumen y es void porque solo modifica el volumen.

    public void subirVolumen(double cantidad) {
        volumen = volumen + cantidad; //Operador +   
        if (volumen > 100) {          //Operaador >
            volumen = 100;
        }

        System.out.println("Volumen: " + volumen);
    }


    // Firma: bajarVolumen(double cantidad) · retorno: void · parametro: cantidad
    // Recibe la cantidad porque indica cuanto disminuir el volumen y es void porque solo modifica el volumen.

    public void bajarVolumen(double cantidad) {
        volumen = volumen - cantidad;    //Operador -
        if (volumen < 0) {               //Operador <
            volumen = 0;
        }

        System.out.println("Volumen: " + volumen);
    }


    // Firma: estaConectado() · retorno: boolean · parametros: ninguno
    // Sabe indicar si esta conectado; no necesita parametros y retorna boolean porque el resultado es true o false.
    public boolean estaConectado() {
        return conectados;
    }


    // Firma: calcularReproduccion(int canciones) · retorno: int · parametro: canciones
    // Recibe el numero de canciones para calcular el tiempo total y retorna int porque el resultado es un numero entero.
    public int calcularReproduccion(int canciones) {
        return duracion * canciones;       
    }


    // Firma: porcentajeBateriaRestante(int consumo) · retorno: int · parametro: consumo
    // Recibe el consumo porque indica cuanto se gasto de bateria y retorna int porque representa un porcentaje entero.
    public int porcentajeBateriaRestante(int consumo) {
        return bateria - consumo;            
    }


    // ===== MAIN =====

    public static void main(String[] args) {

        System.out.println("RADIOGRAFIA: Audifonos");

        //creando el objeto
        MiAudifono misAudifonos = new MiAudifono();

        //Valores iniciales
        misAudifonos.marca = "Billboard";
        misAudifonos.bateria = 90;
        misAudifonos.volumen = 50.0;
        misAudifonos.conectados = false;
        misAudifonos.duracion = 240;


        //imprimiendo cada atributo
        System.out.println("[estado inicial]");
        System.out.println("Marca: " + misAudifonos.marca);
        System.out.println("Bateria: " + misAudifonos.bateria + "%");
        System.out.println("Volumen: " + misAudifonos.volumen);
        System.out.println("Conectados: " + misAudifonos.conectados);
        System.out.println("Duracion por cancion: " + misAudifonos.duracion + " segundos");


        //invocando metodos
        System.out.println("[invocando metodos]");
        misAudifonos.conectar();
        misAudifonos.subirVolumen(15.0);
        System.out.println("¿Estan conectados? " + misAudifonos.estaConectado());
        System.out.println("Tiempo de 3 canciones: " + misAudifonos.calcularReproduccion(3) + " segundos");
        System.out.println("Bateria restante: " + misAudifonos.porcentajeBateriaRestante(10) + "%");
        misAudifonos.bajarVolumen(5.0);


        // imprimiemdo atributos otra vez
        System.out.println("[estado final]");
        System.out.println("Marca: " + misAudifonos.marca);
        System.out.println("Bateria: " + misAudifonos.bateria + "%");
        System.out.println("Volumen: " + misAudifonos.volumen);
        System.out.println("Conectados: " + misAudifonos.conectados);
        System.out.println("Duracion por cancion: " + misAudifonos.duracion + " segundos");
    }
}
