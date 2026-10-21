// CONTEXTO: (¿en que programa vive este objeto? una linea)
// QUE SABE Y POR QUE: (cada atributo, con su razon)
// QUE SABE HACER Y POR QUE: (cada metodo: por que void o por que retorna,
//                            y por que esos parametros)
// QUE IGNORE: (1 o 2 cosas del objeto real que no modelaste, y por que)
public class MiObjeto {   // TODO: renombra la clase Y el archivo (PascalCase)

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    // ej:  double saldo = 0;   // tipo: double · nombre: saldo · valor inicial: 0

    // ===== CONSTRUCTOR (obligatorio en UNA de tus tres clases) =====
    // Mismo nombre que la clase, SIN tipo de retorno (ni void).
    // Pon aqui los datos sin los que el objeto no tiene sentido; el resto dejalos con su valor inicial.
    // ej:  // firma: MiObjeto(double) · sin tipo de retorno
    //      MiObjeto(double saldo) {
    //          this.saldo = saldo;   // this.saldo = ATRIBUTO · saldo a secas = PARAMETRO
    //      }
    // OJO: si escribes este, new MiObjeto() deja de existir. O lo llamas con sus datos,
    //      o escribes tambien el constructor vacio: MiObjeto() { }

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // ej:  // firma: retirar(double) · retorno: void · parametro: double monto

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: MiObjeto");
        // 1: crea tu objeto (con new MiObjeto(...) si le pusiste constructor) y asigna lo que falte
        System.out.println("[estado inicial]");    // 2: imprime cada atributo
        System.out.println("[invocando metodos]"); // 3: firma + invocacion + resultado
        System.out.println("[estado final]");      // 4: imprime atributos otra vez
    }
}
