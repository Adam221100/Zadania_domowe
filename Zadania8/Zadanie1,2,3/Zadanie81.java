package zadanie8.pkg1;

public class Zadanie81 {

    public static void main(String[] args) {
        Książka k1= new Książka("Pan Tadeusz",13.99,"Ostatni zajazd na Litwie");
        Dżem d1= new Dżem("Dżem",3.99,"smak truskawkowy");
        Polopiryna p1= new Polopiryna("Polopiryna",9.99,"forte");
        Długopis d2= new Długopis("Długopis",2.99,"czarny tusz");
        Czekolada c1= new Czekolada ("Czekolada",4.99,"z orzechami");
        Tractor t1= new Tractor ("Ferguson",50000,"czerwony");
        
        Product[] tablica= new Product[10];
        tablica[0]=k1;
        tablica[1]=c1;
        tablica[2]=k1;
        tablica[3]=d1;
        tablica[4]=d2;
        tablica[5]=p1;
        tablica[6]=c1;
        tablica[7]=d1;
        tablica[8]=k1;
        tablica[9]=t1;
        
        for(int i=0;i<10;i++){
        tablica[i].Buy();
        tablica[i].ShowInfo();
        }
    }
}
