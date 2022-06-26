package zadanie7.pkg1;

public class Wykladowca extends Osoba{
    String stopien;
    String przedmiot;
    
    public void PokazDane(){
    System.out.println("Imie i nazwiko: " + this.stopien + " "+ this.imie +" "+  this.nazwisko);
    System.out.println("Przedmiot: " + this.przedmiot);
    System.out.println("Data urodzenia: " + this.data);
    System.out.println("Płeć: " + this.plec);
    }
}
