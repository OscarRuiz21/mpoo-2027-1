import java.util.HashMap;

// PROGRAMA: Controla el menú y los precios de una cadena de comida rápida.
// COLECCIÓN: HashMap, porque asocia una clave única (nombre de la pizza) con su precio (valor).
public class MenuComidaRapida {
    public static void main(String[] args) {
        HashMap<String, Double> menu = new HashMap<>();

        // 1. Agregar pares (put)
        menu.put("Pizza de Pepperoni", 129.00);
        menu.put("Pizza Hawaiana", 149.00);
        menu.put("Pizza Cuatro Quesos", 169.00);
        menu.put("Pizza Texas BBQ", 189.00);

        // 2. Tamaño (size)
        System.out.println("Opciones en el menú: " + menu.size());

        // 3. Consultar / Buscar (containsKey y get)
        if (menu.containsKey("Pizza Texas BBQ")) {
            System.out.println("La Texas BBQ cuesta: $" + menu.get("Pizza Texas BBQ"));
        }

        // 4. Quitar un elemento (remove)
        System.out.println("Descontinuando la Pizza Hawaiana...");
        menu.remove("Pizza Hawaiana");

        // 5. Recorrer el mapa con for-each
        System.out.println("\n--- MENÚ ACTUALIZADO ---");
        for (String producto : menu.keySet()) {
            System.out.println(producto + " -> $" + menu.get(producto));
        }
    }
}