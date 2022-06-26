package zadanie7.pkg1;

public class Zadanie71 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.imie = "Kamil";
        student1.nazwisko = "Hołyszko";
        student1.data = "21.09.2000r.";
        student1.plec = "M";
        student1.nrindexu = 45276;
        student1.typs = "Inżynierskie";
        student1.kierunek = "Informatyka";
        student1.roks = 1;
        student1.PokazDane();
        
        Wykladowca wykladowca1= new Wykladowca();
        wykladowca1.imie = "Wojciech";
        wykladowca1.nazwisko = "Kozioł";
        wykladowca1.plec = "M";
        wykladowca1.stopien="dr inż.";
        wykladowca1.przedmiot="programowanie obiektowe";
        wykladowca1.PokazDane();
    }
}
