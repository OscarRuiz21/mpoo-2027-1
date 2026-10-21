// P7 · Parte 2 · No se modifica: si tus clases están bien, la salida es la de la guía.
public class MainPersonajes {
    public static void main(String[] args) {
        Personaje aldeano = new Personaje("Aldeano", 150);
        Caballero g = new Caballero("Brakus", 80, 15);
        Paladin p = new Paladin("Lunara", -5, 12, 40);
        Mago m = new Mago("Zafiro", 60, 50);

        System.out.println(aldeano + " ataca con " + aldeano.atacar());
        System.out.println(g + " ataca con " + g.atacar());
        System.out.println(p + " ataca con " + p.atacar());
        System.out.println(m + " ataca con " + m.atacar());
        System.out.println(p.getNombre() + " tiene fuerza " + p.getFuerza() + " y fe " + p.getFe());
    }
}

public class Personaje {
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;

        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 100) {
            this.vida = 100;
        } else {
            this.vida = vida;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int atacar() {
        return 10;
    }

    @Override
    public String toString() {
        return nombre + " | vida " + vida;
    }
}

public class Paladin extends Caballero {
    private int fe;

    public Paladin(String nombre, int vida, int fuerza, int fe) {
        super(nombre, vida, fuerza);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    @Override
    public int atacar() {
        // Lo del padre (que ya suma 10 + fuerza) más la mitad de la fe
        return super.atacar() + (fe / 2);
    }

    @Override
    public String toString() {
        return super.toString() + " | fe " + fe;
    }
}

public class Caballero extends Personaje {
    private int fuerza;

    public Caballero(String nombre, int vida, int fuerza) {
        super(nombre, vida);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public int atacar() {
        
        return super.atacar() + fuerza;
    }

    @Override
    public String toString() {
        return super.toString() + " | fuerza " + fuerza;
    }
}

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public int atacar() {
        
        return mana / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " | mana " + mana;
    }
}

