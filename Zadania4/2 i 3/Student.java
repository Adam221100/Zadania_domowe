package danestudenta;
import java.util.Scanner;

public class Student {

    public String imie;
    public String nazwisko;
    public int nr_indexu;
    public String nazwa_specjalości;
    public int rok_studiow;

    public Student(String imie, String nazwisko, int nr_indexu, String nazwa_specjalości, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indexu = nr_indexu;
        this.nazwa_specjalości = nazwa_specjalości;
        this.rok_studiow = rok_studiow;
    }

    public Student(String imie_, String nazwisko_, int nr_indexu_) {
        imie = imie_;
        nazwisko = nazwisko_;
        nr_indexu = nr_indexu_;
    }

    public Student(String imie_, String nazwisko_, String nazwa_specjalości_) {
        imie = imie_;
        nazwisko = nazwisko_;
        nazwa_specjalości = nazwa_specjalości_;
    }

    public Student(String imie_, String nazwisko_, String nazwa_specjalości_, int rok_studiow_) {
        imie = imie_;
        nazwisko = nazwisko_;
        nazwa_specjalości = nazwa_specjalości_;
        rok_studiow = rok_studiow_;
    }
    
    public Student(){
    }
    
    public void PokazDane() {
        System.out.println("Student");
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Nr indexu: " + this.nr_indexu);
        System.out.println("Nazwa specjalości: " + this.nazwa_specjalości);
        System.out.println("Rok studiów: " + this.rok_studiow);
    }
    
    public void WprowadzDane(){
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Wprowadzasz dane Studenta");
        System.out.println("Imię: ");
        this.imie = scan.nextLine();
        System.out.println("Nazwisko: ");
        this.nazwisko= scan.nextLine();
        System.out.println("Nr indexu: ");
        this.nr_indexu = scan.nextInt();
        System.out.println("Specjalość: ");
        this.nazwa_specjalości = scan.next();
        System.out.println("Rok: ");
        this.rok_studiow= scan.nextInt();
    }
}
