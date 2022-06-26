package zadanie10.pkg3;

import java.util.ArrayList;

public class Zadanie103 {

    public static void main(String[] args) {
        ArrayList<Samochod> auta = new ArrayList<>();
        auta.add(new Samochod("Daewoo", "Matiz", 160, 1300));
        auta.add(new Samochod("Daewoo1", "Matiz1", 150, 1200));
        auta.add(new Samochod("Daewoo2", "Matiz2", 140, 1100));
        auta.add(new Samochod("Daewoo3", "Matiz3", 130, 1000));
        auta.add(new Samochod("Daewoo4", "Matiz4", 120, 900));
        for(int i=0;i<auta.size();i++){
        Samochod x = auta.get(i);
        x.ShowP();
        x.ShowV();
        }
          
    }
}
