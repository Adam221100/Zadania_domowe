package zadanie7.pkg1;

public class Student extends Osoba{
    int nrindexu;
    String typs;
    String kierunek;
    int roks;
    public void PokazDane(){
    System.out.println("Imie i nazwiko " + this.imie + " "+ this.nazwisko);
    System.out.println("Data urodzenia: " + this.data);
    System.out.println("Płeć: " + this.plec);
    System.out.println("Nr Indexu: " + this.nrindexu);
    System.out.println("Typ studiów: " + this.typs);
    System.out.println("Kierunek: " + this.kierunek);
    System.out.println("Rok studiów: " + this.roks);
    }
}
