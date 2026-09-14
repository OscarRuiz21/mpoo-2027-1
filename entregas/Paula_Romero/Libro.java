/*
 * CONTEXTO: Vive en una app sencilla para registrar lecturas personales.
 * QUÉ SABE Y POR QUÉ: Guarda el titulo, autora, totalPaginas y paginaActual para saber el avance del libro.
 * QUÉ SABE HACER Y POR QUÉ: Permite avanzar paginas con un void que recibe un entero y calcula paginas faltantes retornando un numero.
 * QUÉ IGNORÉ: Ignore la editorial y el ano de publicacion porque no me interesan para contar mis paginas.
 */

public class Libro {

    // --- ATRIBUTOS ---
    // tipo: String, nombre: titulo, valor inicial: Cadaver exquisito
    String titulo = "Cadaver exquisito";
    // tipo: String, nombre: autora, valor inicial: Agustina Bazterrica
    String autora = "Agustina Bazterrica";
    // tipo: int, nombre: totalPaginas, valor inicial: 208
    int totalPaginas = 208;
    // tipo: int, nombre: paginaActual, valor inicial: 0
    int paginaActual = 0;

    // --- CONSTRUCTOR ---
    // Elige esta clase porque un libro no deberia nacer sin saber sus paginas
    public Libro(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    // --- MÉTODOS ---
    // firma: avanzarPaginas(int paginasLeidas)
    public void avanzarPaginas(int paginasLeidas) {
        paginaActual = paginaActual + paginasLeidas;
    }

    // firma: calcularPaginasRestantes()
    public int calcularPaginasRestantes() {
        int restantes = totalPaginas - paginaActual;
        return restantes;
    }

    // --- MÉTODO PRINCIPAL ---
    public static void main(String[] args) {
        Libro miLibro = new Libro(208);
        miLibro.avanzarPaginas(45);

        System.out.println("--- TARJETA DE LIBRO ---");
        System.out.println("Titulo: " + miLibro.titulo);
        System.out.println("Autora: " + miLibro.autora);
        System.out.println("Pagina actual: " + miLibro.paginaActual);
        System.out.println("Paginas restantes: " + miLibro.calcularPaginasRestantes());
    }
}