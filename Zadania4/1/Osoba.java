package daneosobowe;

public class Osoba {

    public String imie;
    public String nazwisko;
    public int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie_, String nazwisko_) {
        imie = imie_;
        nazwisko = nazwisko_;
    }

    public Osoba() {
    }

    public void PokazDane() {
        System.out.println("Osoba");
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Wiek: " + this.wiek + " lat");

    }
}
