package obliczaniefigur;
import java.util.Scanner;

public class Kula {

    double r;
    public Kula(){}
    

 public double średnica() {
        return 2*r;
    }
 
     public double objętość() {
        return 4/3*Math.PI*Math.pow(r, 3);
    }
     
    public double pole() {
        return 4*Math.PI * Math.pow(r, 2);
    }
    public void wyświetl(){
    System.out.println("KULA: ");
    System.out.println("promień: "+r);
    System.out.println("średnica: "+this.średnica());
    System.out.println("objętość: "+this.objętość());
    System.out.println("pole: "+this.pole());
    }
    public void WprowadzDane(){
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Wprowadzasz r:");
        r = scan.nextDouble();
    }
}
