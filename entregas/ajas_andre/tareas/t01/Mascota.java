// CONTEXTO: App de una clinica veterinaria para llevar el registro de consultas y calculo de dosis medicas de un felino.
// QUE SABE Y POR QUE: nombre (para identificar al paciente), pesoKg (para calcular dosis medicas), mesesEdad (para saber su etapa de desarrollo).
// QUE SABE HACER Y POR QUE: cumplirMes() es void porque solo actualiza su edad cronologica; calcularDosis() retorna double por la precision requerida en medicamentos.
// QUE IGNORE: la raza y el color del pelaje, porque el programa se enfoca estrictamente en datos metricos de salud.

public class Mascota {

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    String nombre = "Sin nombre"; // tipo: String · nombre: nombre · valor inicial: "Sin nombre"
    double pesoKg = 1.0;          // tipo: double · nombre: pesoKg · valor inicial: 1.0
    int mesesEdad = 1;            // tipo: int · nombre: mesesEdad · valor inicial: 1

    // ===== CONSTRUCTOR (obligatorio en UNA de tus tres clases) =====
    // firma: Mascota(String, double) · sin tipo de retorno
    public Mascota(String nombre, double pesoKg) {
        this.nombre = nombre; // this.nombre = ATRIBUTO · nombre = PARAMETRO
        this.pesoKg = pesoKg; // this.pesoKg = ATRIBUTO · pesoKg = PARAMETRO
    }

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // firma: cumplirMes() · retorno: void · sin parametros
    public void cumplirMes() {
        mesesEdad += 1; // operador abreviado +=
    }

    // firma: calcularDosis() · retorno: double · sin parametros
    public double calcularDosis() {
        return pesoKg / 2.0; // operador aritmetico / (double entre double evita truncado)
    }
    
    // firma: esEdadPar() · retorno: boolean · sin parametros
    public boolean esEdadPar() {
        return mesesEdad % 2 == 0; // operador modulo % y de igualdad ==
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Mascota");
        Mascota m = new Mascota("Oliver", 4.5); // usa el constructor con datos

        System.out.println("[estado inicial]");
        System.out.println("nombre = " + m.nombre);
        System.out.println("pesoKg = " + m.pesoKg);
        System.out.println("mesesEdad = " + m.mesesEdad);

        System.out.println("[invocando metodos]");
        m.cumplirMes();
        System.out.println("cumplirMes() -> void; mesesEdad = " + m.mesesEdad);
        System.out.println("calcularDosis() -> double; " + m.calcularDosis());
        System.out.println("esEdadPar() -> boolean; " + m.esEdadPar());

        System.out.println("[estado final]");
        System.out.println("mesesEdad = " + m.mesesEdad + " | Dosis recomendada = " + m.calcularDosis());
    }
}