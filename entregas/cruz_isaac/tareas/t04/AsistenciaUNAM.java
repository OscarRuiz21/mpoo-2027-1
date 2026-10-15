import java.util.HashSet;

// PROGRAMA: Lleva el control de asistencia para una entrega de laboratorio.
// COLECCIÓN: HashSet, porque es ideal para evitar que un alumno se registre dos veces si intenta hacer trampa.
public class AsistenciaUNAM {
    public static void main(String[] args) {
        HashSet<String> asistencia = new HashSet<>();

        // 1. Agregar elementos (add) - Vamos a agregar a alguien dos veces a propósito
        asistencia.add("Isaac");
        asistencia.add("Omar");
        asistencia.add("Erick");
        asistencia.add("Jorge");
        asistencia.add("Victor");
        asistencia.add("Omar"); // Intento duplicado, HashSet lo ignorará automáticamente

        // 2. Tamaño (size)
        System.out.println("Alumnos registrados unicamente: " + asistencia.size());

        // 3. Consultar / Buscar (contains)
        if (asistencia.contains("Isaac")) {
            System.out.println("Isaac ya entrego la practica.");
        }

        // 4. Quitar un elemento (remove)
        System.out.println("Victor cancelo su entrega. Borrandolo del sistema...");
        asistencia.remove("Victor");

        // 5. Recorrer con for-each (Nota: El orden de impresión será aleatorio, es normal en un Set)
        System.out.println("\n--- LISTA FINAL DE ENTREGAS ---");
        for (String alumno : asistencia) {
            System.out.println("- " + alumno);
        }
    }
}
