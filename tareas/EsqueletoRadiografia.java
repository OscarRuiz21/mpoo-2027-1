/*
 * CONTEXTO: (¿en qué programa vive este objeto y para qué lo necesito?)
 * QUÉ SABE Y POR QUÉ: (cada atributo con su razón de existir en este contexto)
 * QUÉ SABE HACER Y POR QUÉ: (cada método: por qué void o retorna, por qué esos parámetros)
 * QUÉ IGNORÉ: (1-2 cosas del objeto real que NO modelé, y por qué no importan aquí)
 */
public class MiObjeto {   // TODO: renombra la clase Y el archivo a tu objeto (PascalCase)

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    // TODO   ejemplo:
    // double saldo = 0;   // tipo: double · nombre: saldo · valor inicial: 0

    // ===== MÉTODOS (etiqueta cada parte y señala su firma) =====
    // TODO   ejemplo:
    // // firma: retirar(double) · tipo de retorno: void · parámetro: double monto
    // void retirar(double monto) { ... }

    // ===== LA RADIOGRAFÍA EN EJECUCIÓN (respeta la estructura de impresión) =====
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("RADIOGRAFIA: MiObjeto");          // TODO: el nombre de tu clase
        System.out.println("Modelado por: Apellido Nombre");  // TODO: tu nombre
        System.out.println("================================");

        // TODO 1: crea tu objeto y asigna valores a sus atributos

        System.out.println("[estado inicial]");
        // TODO 2: imprime cada atributo con etiqueta:
        //         System.out.println("  saldo = " + obj.saldo);

        System.out.println("[invocando metodos]");
        // TODO 3: por cada método: imprime su firma, invócalo, e imprime
        //         lo que regresó (si retorna) o cómo cambió el estado (si es void)
        //         System.out.println("  firma: retirar(double)");
        //         obj.retirar(200);
        //         System.out.println("  efecto: saldo ahora = " + obj.saldo);

        System.out.println("[estado final]");
        // TODO 4: imprime cada atributo otra vez — que se VEA qué cambió
    }
}
