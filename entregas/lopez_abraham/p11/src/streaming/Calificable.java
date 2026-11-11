package streaming;

// Calificable: lo que la gente puede calificar con estrellas.
public interface Calificable {

    // Recibe de 1 a 5 estrellas; cualquier otro número se rechaza
    void calificar(int estrellas);

    // El promedio de las estrellas recibidas (0 si nadie ha calificado)
    double promedio();
}