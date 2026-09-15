// CONTEXTO: App de hidratacion personal para registrar el agua consumida durante un entrenamiento.
// QUE SABE Y POR QUE: mlContenido (volumen actual de agua), capacidadTotal (volumen maximo), llena (saber si esta lista para usarse).
// QUE SABE HACER Y POR QUE: rellenar(double) es void porque incrementa el agua; estaLlena() regresa boolean para avisar al usuario.
// QUE IGNORE: el color de la botella y el material de la tapa.

public class Botella {

    // ===== ATRIBUTOS (etiqueta cada parte) =====
    double mlContenido = 0.0;     // tipo: double · nombre: mlContenido · valor inicial: 0.0
    int capacidadTotal = 1000;    // tipo: int · nombre: capacidadTotal · valor inicial: 1000
    boolean llena = false;        // tipo: boolean · nombre: llena · valor inicial: false

    // ===== CONSTRUCTOR (obligatorio en UNA de tus tres clases) =====
    // firma: Botella(int) · sin tipo de retorno
    public Botella(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal; // this.capacidadTotal = ATRIBUTO · capacidadTotal = PARAMETRO
    }

    // ===== METODOS (etiqueta cada parte y su firma) =====
    // firma: rellenar(double) · retorno: void · parametro: double ml
    public void rellenar(double ml) {
        mlContenido += ml; // operador abreviado +=
    }

    // firma: estaLlena() · retorno: boolean · sin parametros
    public boolean estaLlena() {
        return mlContenido >= capacidadTotal; // operador relacional >=
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: Botella");
        Botella b = new Botella(750); // usa el constructor con datos

        System.out.println("[estado inicial]");
        System.out.println("capacidadTotal = " + b.capacidadTotal);
        System.out.println("mlContenido = " + b.mlContenido);
        System.out.println("llena = " + b.llena);

        System.out.println("[invocando metodos]");
        b.rellenar(750.0);
        System.out.println("rellenar(750.0) -> void; mlContenido = " + b.mlContenido);
        System.out.println("estaLLena() -> boolean; " + b.estaLlena());

        System.out.println("[estado final]");
        System.out.println("mlContenido = " + b.mlContenido + " | estaLLena = " + b.estaLlena());
    }
}