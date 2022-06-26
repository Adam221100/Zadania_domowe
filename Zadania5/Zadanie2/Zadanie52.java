package zadanie5.pkg2;

public class Zadanie52 {

    public static void main(String[] args) {

        Ksiazka ksiazka1 = new Ksiazka("","",0,0,0);
        ksiazka1.setTytuł("Pan Tadeusz");
        System.out.println(ksiazka1.getTytuł());
        ksiazka1.setAutor("Adam Mickiewicz");
        System.out.println(ksiazka1.getAutor());
        ksiazka1.setLiczba_stron(420);
        System.out.println(ksiazka1.getLiczba_stron());
        ksiazka1.setRok_wydania(1834);
        System.out.println(ksiazka1.getRok_wydania());
        ksiazka1.setCena(50);
        System.out.println(ksiazka1.getCena());
        
        ksiazka1.setCena(60);
        
        System.out.println(ksiazka1.getTytuł());
        System.out.println(ksiazka1.getAutor());
        System.out.println(ksiazka1.getLiczba_stron());
        System.out.println(ksiazka1.getRok_wydania());
        System.out.println(ksiazka1.getCena());
    }
}

