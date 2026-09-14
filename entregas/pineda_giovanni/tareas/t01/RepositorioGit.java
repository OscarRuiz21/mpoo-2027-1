// CONTEXTO: Una plataforma web de control de versiones de código.
// QUE SABE Y POR QUE: nombreProyecto (para la URL del repositorio), cantidadCommits (para medir la actividad del estudiante).
// QUE SABE HACER Y POR QUE: agregarCommits (void, recibe la cantidad de nuevos commits a sumar), esProyectoActivo (retorna boolean si supera cierta cantidad de commits).
// QUE IGNORE: El código fuente real y los lenguajes de programación, para mantener el modelo a nivel de metadatos del proyecto.
public class RepositorioGit { 

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    // tipo: String · nombre: nombreProyecto · valor inicial: "Nuevo Proyecto"
    String nombreProyecto = "Nuevo Proyecto"; 
    // tipo: int · nombre: cantidadCommits · valor inicial: 0
    int cantidadCommits = 0;      

    // (Sin constructor explícito, se usará el vacío por defecto)

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // firma: agregarCommits(int) · retorno: void · parametro: int nuevosCommits
    public void agregarCommits(int nuevosCommits) {
        cantidadCommits = cantidadCommits + nuevosCommits;
    }

    // firma: esProyectoActivo() · retorno: boolean · parametro: ninguno
    public boolean esProyectoActivo() {
        return cantidadCommits > 10;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: RepositorioGit");
        
        // 1: crea tu objeto y asigna lo que falte
        RepositorioGit miRepo = new RepositorioGit();
        miRepo.nombreProyecto = "PracticasPOO";
        miRepo.cantidadCommits = 5;

        System.out.println("[estado inicial]"); 
        // 2: imprime cada atributo
        System.out.println("Proyecto: " + miRepo.nombreProyecto);
        System.out.println("Commits totales: " + miRepo.cantidadCommits);

        System.out.println("[invocando metodos]"); 
        // 3: firma + invocacion + resultado/efecto
        // firma: agregarCommits(int) -> hacemos push de 8 commits nuevos
        miRepo.agregarCommits(8);
        System.out.println("Se agregaron nuevos commits al repositorio.");
        
        // firma: esProyectoActivo() -> verificamos el estado
        boolean activo = miRepo.esProyectoActivo();
        System.out.println("¿El proyecto es considerado activo? " + activo);

        System.out.println("[estado final]"); 
        // 4: imprime atributos otra vez
        System.out.println("Proyecto: " + miRepo.nombreProyecto);
        System.out.println("Commits totales: " + miRepo.cantidadCommits);
    }
}