package obliczaniefigur;
import java.util.Scanner;

public class Kwadrat {
    
    double a;
    public Kwadrat(){}
    
    public double Pole() {
        return Math.pow(a, 2);
    }
    
    public double Przekątna() {
        return a*Math.sqrt(2);
    }
    
    public double Obwód() {
        return 4*a;
    }
    
    public void wyświetl(){
    System.out.println("KWADRAT: ");
    System.out.println("bok "+a);
    System.out.println("pole: "+this.Pole());
    System.out.println("przekątna: "+this.Przekątna());
    System.out.println("obwód: "+this.Obwód());
    }
    public void WprowadzDane(){
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Wprowadzasz a:");
        a = scan.nextDouble();
    }
}
