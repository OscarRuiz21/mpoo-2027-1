public class Punto {
    //Atributos
    int x, y;

    //Constructor vacìo
    public Punto() {
    }

    //Constructor Completo/lleno
    public Punto(int x, int y) {
        //Este x (pertenece a la clase) = x (paràmetro de entrada del constructor)
        this.x = x;
        this.y = y;
    }

    //Mètodo == Funciòn en C
    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}


// PRIIMER EJEMPLO //
/*public class Punto {
    int x, y;
    public void imprimePunto() {
        System.out.println("Punto [x=" + x + ", y=" + y + "]");
    }
}*/


//