package zadanie9.pkg4;

import java.util.List;

public class Zadanie94 {
    public static void main(String[] args) {
        
    }
    static void writeToList( List<? super Owoc> lista){
            lista.add(new Papierowka());
            lista.add(new Banan());
            lista.add(new Reneta());
            lista.add(new Pizang());
        }
}
