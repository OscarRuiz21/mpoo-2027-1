/*
// FASE 1: Implementación básica
public class PruebaPunto {
    public static void main(String[] args) {
        Punto p = new Punto();
        p.x = 5;
        p.y = 8;
        p.imprimePunto();
        
        Punto x = new Punto();
        x.x = 7;
        x.y = 2; 
        x.imprimePunto();
    }
}
*/

/*
// FASE 2: Genera error intencional al faltar 
public class PruebaPunto {
    public static void main(String[] args) {
        Punto p = new Punto(); // Esto marca error
        p.x = 5;
        p.y = 8;
        p.imprimePunto();
        
        Punto x = new Punto(); // Esto marca error
        x.x = 7;
        x.y = 2;
        x.imprimePunto();
    }
}
*/

/*
// FASE 3: Solución 1 (Instanciación con parámetros)
public class PruebaPunto {
    public static void main(String[] args) {
        Punto p = new Punto(5, 8);
        p.imprimePunto();
        
        Punto x = new Punto(7, 2);
        x.imprimePunto();
    }
}
*/

// FASE 4: Solución 2 probando sobrecarga (ACTIVA)
public class PruebaPunto {
    public static void main(String[] args) {
        // Usando el constructor con parámetros
        Punto p = new Punto(5, 8);
        p.imprimePunto();
        
        // Usando el constructor vacío
        Punto x = new Punto();
        x.x = 7;
        x.y = 2;
        x.imprimePunto();
    }
}