import java.util.ArrayList;

// PROGRAMA: Guarda el historial de páginas visitadas en una pestaña de navegador web.
// COLECCIÓN: ArrayList, porque importa el orden de visita y el usuario puede repetir páginas.
public class HistorialNavegador {
    public static void main(String[] args) {
        ArrayList<String> historial = new ArrayList<>();

        // 1. Agregar elementos (add)
        historial.add("google.com");
        historial.add("ingenieria.unam.mx");
        historial.add("github.com");
        historial.add("google.com"); // Página repetida intencionalmente

        // 2. Tamaño de la colección (size)
        System.out.println("Páginas en el historial: " + historial.size());

        // 3. Consultar un elemento por índice (get)
        System.out.println("Primera página visitada: " + historial.get(0));

        // 4. Quitar un elemento (remove)
        System.out.println("Borrando 'github.com' del historial...");
        historial.remove("github.com");

        // 5. Recorrer con for clásico
        System.out.println("\n--- HISTORIAL DE NAVEGACIÓN ---");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
    }
}