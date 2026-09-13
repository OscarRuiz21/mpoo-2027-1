// CONTEXTO: (¿en que programa vive este objeto? una linea)
// Representa el cuaderno que utilizo para tomar apuntes y realizar ejercicios de mis materias.
// QUE SABE Y POR QUE: (cada atributo, con su razon)
// materia: identifica la materia a la que pertenece el cuaderno.
// numeroPaginas: indica cuantas paginas tiene el cuaderno.
// paginaActual: indica en que pagina estoy trabajando.
// tamano: representa el tamaño del cuaderno mediante una letra.
// abierto: indica si el cuaderno esta abierto o cerrado.
// QUE SABE HACER Y POR QUE: (cada metodo: por que void o por que retorna,y por que esos parametros):
// abrir(): sabe abrirse porque es una accion propia del cuaderno; es void porque solo cambia su estado y no necesita parametros.
// cerrar(): sabe cerrarse porque es una accion propia del cuaderno; es void porque solo cambia su estado y no necesita parametros.
// pasarPagina(): sabe pasar de pagina porque es una accion propia del cuaderno; es void porque solo modifica la pagina actual y no necesita parametros.
// regresarPagina(): sabe regresar de pagina porque permite volver a una pagina anterior; es void porque solo modifica la pagina actual y no necesita parametros.
// paginasRestantes(): sabe calcular las paginas que faltan; retorna int porque el resultado es un numero entero y no necesita parametros porque usa sus propios atributos.
// puedeEscribir(): sabe indicar si se puede escribir en el cuaderno; retorna boolean porque el resultado puede ser true o false y no necesita parametros porque consulta sus propios atributos.
// QUE IGNORE: (1 o 2 cosas del objeto real que no modelaste, y por que):
// 1- Que hay escrito en las hojas, no puedo hacer que muestre toda la información del cuaderno
// 2- Que tan desgastado esta, es una cualidad física que bien pude haberla incluido pero no es de mucha relevancia

public class MiCuaderno {

    // ===== ATRIBUTOS (etiqueta cada parte) =====

    String materia;          // tipo: String - nombre: materia
    int numeroPaginas;       // tipo: int - nombre: numeroPaginas
    int paginaActual;        // tipo: int - nombre: paginaActual - valor inicial: 1
    char tamano;             // tipo: char - nombre: tamano
    boolean abierto;         // tipo: boolean - nombre: abierto


    // ===== METODOS (etiqueta cada parte y su firma) =====

    // Firma: abrir() · retorno: void · parametros: ninguno
    // Sabe abrirse porque es una accion propia de un cuaderno; es void porque solo cambia su estado.
    public void abrir() {
        abierto = true;
        System.out.println("El cuaderno esta abierto.");
    }


    // Firma: cerrar() · retorno: void · parametros: ninguno
    // Sabe cerrarse porque es una accion propia de un cuaderno; es void porque solo cambia su estado.
    public void cerrar() {
        abierto = false;
        System.out.println("El cuaderno esta cerrado.");
    }


    // Firma: pasarPagina() · retorno: void · parametros: ninguno
    // Sabe pasar de pagina porque es una accion propia del cuaderno; es void porque solo modifica la pagina actual.
    public void pasarPagina() {

        if (paginaActual < numeroPaginas) {
            paginaActual++;
        }

        System.out.println("Pagina actual: " + paginaActual);
    }


    // Firma: regresarPagina() · retorno: void · parametros: ninguno
    // Sabe regresar de pagina porque permite volver a una pagina anterior; es void porque solo modifica la pagina actual.
    public void regresarPagina() {

        if (paginaActual > 1) {
            paginaActual--;
        }

        System.out.println("Pagina actual: " + paginaActual);
    }


    // Firma: paginasRestantes() · retorno: int · parametros: ninguno
    // Sabe calcular las paginas restantes; no necesita parametros y retorna int porque el resultado es un numero entero.
    public int paginasRestantes() {

        return numeroPaginas - paginaActual;
    }


    // Firma: puedeEscribir() · retorno: boolean · parametros: ninguno
    // Sabe indicar si se puede escribir; no necesita parametros y retorna boolean porque el resultado es true o false.
    public boolean puedeEscribir() {

        return abierto && paginaActual <= numeroPaginas;
    }


    // ===== MAIN =====

    public static void main(String[] args) {

        System.out.println("RADIOGRAFIA: Cuaderno");

        // creando el objeto
        MiCuaderno miCuaderno = new MiCuaderno();

        // Valores iniciales
        miCuaderno.materia = "MPOO";
        miCuaderno.numeroPaginas = 100;
        miCuaderno.paginaActual = 1;
        miCuaderno.tamano = 'M';
        miCuaderno.abierto = false;


        // imprimiendo cada atributo
        System.out.println("[estado inicial]");
        System.out.println("Materia: " + miCuaderno.materia);
        System.out.println("Numero de paginas: " + miCuaderno.numeroPaginas);
        System.out.println("Pagina actual: " + miCuaderno.paginaActual);
        System.out.println("Tamano: " + miCuaderno.tamano);
        System.out.println("Abierto: " + miCuaderno.abierto);


        // invocando metodos
        System.out.println("[invocando metodos]");
        miCuaderno.abrir();
        miCuaderno.pasarPagina();
        miCuaderno.pasarPagina();
        System.out.println("¿Se puede escribir? " + miCuaderno.puedeEscribir());
        System.out.println("Paginas restantes: " + miCuaderno.paginasRestantes());
        miCuaderno.regresarPagina();


        // imprimiendo atributos otra vez
        System.out.println("[estado final]");
        System.out.println("Materia: " + miCuaderno.materia);
        System.out.println("Numero de paginas: " + miCuaderno.numeroPaginas);
        System.out.println("Pagina actual: " + miCuaderno.paginaActual);
        System.out.println("Tamano: " + miCuaderno.tamano);
        System.out.println("Abierto: " + miCuaderno.abierto);
    }
}
