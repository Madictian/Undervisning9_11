import java.awt.*;
import java.util.ArrayList;

public class Lager {

    ArrayList<Varer> lager = new ArrayList<>();

    Alcohol vodka = new Alcohol();
    Apple golden = new Apple();
    Cheese parmasan = new Cheese();
    Cola freeway = new Cola();
    IceCream choko = new IceCream();
    Milk let = new Milk();
    Pizza skinke = new Pizza();
    Peas grønne = new Peas();
    Peas gule = new Peas();



    public void udvalg(){
        for (int i = 0; i < 10; i++) {
            lager.add(vodka);
        }

        for (int i = 0; i < 8; i++) {
            lager.add(freeway);
        }

        for (int i = 0; i < 9; i++) {
            lager.add(skinke);
        }

        for (int i = 0; i < 3; i++) {
            lager.add(grønne);
        }

        for (int i = 0; i < 3; i++) {
            lager.add(gule);
        }
    }

    
    public int antalvarer(){
        return lager.size();
    }

    public void vis(){
        for (Varer i:lager
             ) {
            System.out.println(i.getClass().getName());
        }
    }

    public int antal(){
        int many = 0;
        for  (Varer i : lager) {
            if (i == vodka) {
                many++;
            }
        }
        return many;
    }

    public int antalAf(String type){
        int many = 0;
        for  (Varer i : lager) {
            if (i.getClass().getName().equals(vodka)) {
                many++;
            }
        }
        return many;
    }

    public static void main(String[] args) {
        Lager lager = new Lager();
        lager.udvalg();
        System.out.println(lager.antalvarer());
        lager.vis();
        System.out.println(lager.antal());


    }


}
