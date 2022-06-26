package obliczaniefigur;
import java.util.Scanner;

public class Koło {

    double r;
    public Koło(){}
    
    public double obwod() {
        return 2 * Math.PI * r;
    }
 public double średnica() {
        return 2*r;
    }
    public double pole() {
        return Math.PI * Math.pow(r, 2);
    }
    public void wyświetl(){
    System.out.println("KOŁO: ");
    System.out.println("promień: "+r);
    System.out.println("średnica: "+this.średnica());
    System.out.println("obwód: "+this.obwod());
    System.out.println("pole: "+this.pole());
    }
    public void WprowadzDane(){
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Wprowadzasz r:");
        r = scan.nextDouble();
    }
}
