package obliczaniefigur;
import java.util.Scanner;

public class Stożek {
    
    double h,r,l;
    
    public Stożek() {
    }

    public double Objętość() {
        return 1/3*Math.PI*Math.pow(r, 2)*h;
    }

    public double PolePodstawy() {
        return Math.PI*Math.pow(r, 2);
    }

    public double PoleBoczne() {
        return Math.PI*r*l;
    }

    public double PoleCałkowite() {
        return PoleBoczne()+PolePodstawy();
    }

    public void wyświetl() {
        System.out.println("Stożek: ");
        System.out.println("wysokość: " + h);
        System.out.println("promień: " + r);
        System.out.println("tworząca: " + l);
        System.out.println("objętość: " + this.Objętość());
        System.out.println("pole podstawy: " + this.PolePodstawy());
        System.out.println("pole boczne: " + this.PoleBoczne());
        System.out.println("pole całkowite: " + this.PoleCałkowite());
    }

    public void WprowadzDane() {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Wprowadzasz H:");
        h = scan.nextDouble();
        System.out.println("Wprowadzasz r:");
        r = scan.nextDouble();
        System.out.println("Wprowadzasz l:");
        l = scan.nextDouble();
    }
}
