package mazmorra;

public class Hacha extends Herramienta{

    public Hacha(int danio){
        super("Hacha",danio);
    }
    @Override
    public String grito(){
        return "da  un hachazo";
    }
    @Override
     public int golpear(){
        return usar()*2;
    }
}
