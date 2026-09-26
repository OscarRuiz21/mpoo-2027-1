// MPOO S10 · Tu turno: ¿el anio es bisiesto?
// Correr:  java TuTurnoBisiesto.java
//
// Es bisiesto si es divisible entre 4, EXCEPTO los divisibles entre 100,
// SALVO que tambien lo sean entre 400.
// Pista: combina %, ==, != , && y ||

public class TuTurnoBisiesto {

    static boolean esBisiesto(int anio) {
        if(anio % 4 == 0 && anio % 100 !=0){
            return true;
        } else if (anio % 400 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        // lo que debe dar cada uno:
        System.out.println("2024 -> " + esBisiesto(2024) + "   (deberia ser true)");
        System.out.println("1900 -> " + esBisiesto(1900) + "   (deberia ser false)");
        System.out.println("2000 -> " + esBisiesto(2000) + "   (deberia ser true)");
        System.out.println("2026 -> " + esBisiesto(2026) + "   (deberia ser false)");
    }
}