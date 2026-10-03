// CONTEXTO:  un programa sobre la funcion de una bici electrica)
// QUE SABE Y POR QUE: (bateria(para saber si queda),marca(para saber la marca) velocidad,kilometraje,luces(saber si estan o no encendidad))
// QUE SABE HACER Y POR QUE: acelerar(recibe incremento, no regresa nada porque no se requiere),frenar(no recibe parametro y no requiere regsar nada),recargar(no recibe nada, y regresa un booleano para mostrarlo)
// QUE IGNORE:  quizas la autonomia de la bateria, )
public class BiciElectrica {

    // ===== ATRIBUTOS  =====
    int bateria_max = 100; //tipo int. nombre bateria_max. valor 100
    String marca = "Patito"; //tipo string nombre marca. valor = "patito"
    int bateria = 100;   // tipo int. nombre bateria. valor 100
    double velocidad = 0.0; // tipo double. nombre velocidad. valor = 0.0
    double kilometraje = 0.0; // tipo double. nombre kilometraje. valor = 0.0
    boolean luces = false; // tipo boolean. nombre luces. valor 0.0
    char modo = 'E';
    // ===== CONSTRUCTOR  =====
    BiciElectrica(String marca, char modo ){
        this.marca = marca;
        this.modo= modo;
    }
    // ===== METODOS =====
    void acelerar(double incremento){
        if(bateria > 0){
            velocidad += incremento;
            kilometraje += (incremento*0.1);

        if (modo == 'T') bateria -=10;
        else if(modo == 'S') bateria -= 5;
        else bateria -= 2;

        if(bateria<0)bateria=0;
        } else {
            System.out.println("Sin Bateria");
            velocidad=0;
        }
    }

    //firma frenar. retorno void. sin parametros.
    void frenar(){
        velocidad = 0.0;
        if(bateria<bateria_max){
            bateria +=1;
        }
    }

    //cambioluces. retorno void. sin parametros
    void cambioluces(){
        luces = !luces;
    }

    //recargar. retorno void. sin parametros
    boolean recargar(){
        return bateria < 20;
    }

    public static void main(String[] args) {
        System.out.println("RADIOGRAFÍA: BiciElectrica");

        BiciElectrica miBici = new BiciElectrica("Evobike", 'T');

        System.out.println("\n[Estado Inicial]");
        System.out.println("Marca: " + miBici.marca);
        System.out.println("Batería: " + miBici.bateria + "%");
        System.out.println("Velocidad: " + miBici.velocidad + " km/h");
        System.out.println("Kilometraje: " + miBici.kilometraje + " km");
        System.out.println("Luces encendidas: " + miBici.luces);
        System.out.println("Modo Asistencia: " + miBici.modo);

        System.out.println("\n[Invocando métodos]");

        miBici.cambioluces();
        System.out.println("cambioLuces() -> luces: " + miBici.luces);

        miBici.acelerar(25.5);
        System.out.println("acelerar(25.5) -> velocidad: " + miBici.velocidad + " km/h | batería: " + miBici.bateria + "%");

        miBici.frenar();
        System.out.println("frenar() -> velocidad: " + miBici.velocidad + " km/h | batería regenerada: " + miBici.bateria + "%");

        System.out.println("necesitaCarga() -> " + miBici.recargar());

        int kmEnteros = (int) miBici.kilometraje;
        System.out.println("Casting (int) de kilometraje: " + kmEnteros);

        System.out.println("\n[Estado Final]");
        System.out.println("Batería: " + miBici.bateria + "% | Kilometraje: " + miBici.kilometraje + " km | Luces: " + miBici.luces);
    }
    }