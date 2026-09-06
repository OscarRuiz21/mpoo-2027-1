// Versión 1 - Clase Punto

/*
class Punto {
    int x,y;

    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}
*/


// Versión 1 - PruebaPunto

/*
public class PruebaPunto {

    public static void main(String[] args) {
        Punto p = new Punto();
        p.x=5;
        p.y=8;
        p.imprimePunto();

        Punto x = new Punto();
        x.x=7;
        x.y=2;
        x.imprimePunto();
    }
}
*/


// Versión 2 - Método static

/*
public class Circulo {
    static float PI = 3.14159f;
    private float radio;
    ...
}
*/


// Versión 2 - Uso de variable static

/*
System.out.println(Circulo.PI);
*/


// Versión 3 - Constructor con parámetros

/*
class Punto {
    int x,y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}
*/


// Versión 3 - PruebaPunto

/*
public class PruebaPunto {

    public static void main(String[] args) {
        Punto p = new Punto();
        p.x=5;
        p.y=8;
        p.imprimePunto();

        Punto x = new Punto();
        x.x=7;
        x.y=2;
        x.imprimePunto();
    }
}
*/


// Versión 4 - Creación de instancias con parámetros

/*
public class PruebaPunto {

    public static void main(String[] args) {
        Punto p = new Punto(5, 8);
        p.imprimePunto();

        Punto x = new Punto(7, 2);
        x.imprimePunto();
    }
}
*/


// Versión 5 - Constructor por defecto y constructor con parámetros

/*
class Punto {
    int x,y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}
*/


// Versión 5 - PruebaPunto

/*
public class PruebaPunto {

    public static void main(String[] args) {
        Punto p = new Punto(5, 8);
        p.imprimePunto();

        Punto x = new Punto();
        x.x=7;
        x.y=2;
        x.imprimePunto();
    }
}
*/


// Versión 6 - Constructor por defecto y constructor con parámetros

class Punto {
    int x,y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}


// Versión 6 - PruebaPunto

public class PruebaPunto {

    public static void main(String[] args) {
        Punto p = new Punto(5, 8);
        p.imprimePunto();

        Punto x = new Punto();
        x.x=7;
        x.y=2;
        x.imprimePunto();
    }
}
