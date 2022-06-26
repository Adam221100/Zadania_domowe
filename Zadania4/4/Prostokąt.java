package obliczaniefigur;
import java.util.Scanner;

public class Prostokąt {
    double a,b;
    public Prostokąt(){}
    
    public double Pole() {
        return a*b;
    }
    
    public double Przekątna() {
        return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
    }
    
    public double Obwód() {
        return 2*(a+b);
    }
    public void wyświetl(){
    System.out.println("Prostokąt: ");
    System.out.println("bok pierwszy: "+a);
    System.out.println("bok drugi: "+b);
    System.out.println("pole: "+this.Pole());
    System.out.println("przekątna: "+this.Przekątna());
    System.out.println("obwód: "+this.Obwód());
    }
    public void WprowadzDane(){
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Wprowadzasz a:");
        a = scan.nextDouble();
        System.out.println("Wprowadzasz b:");
        b = scan.nextDouble();
}
}