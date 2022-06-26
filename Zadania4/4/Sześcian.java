package obliczaniefigur;

import java.util.Scanner;

public class Sześcian {

    double a;

    public Sześcian() {
    }

    public double Objętość() {
        return Math.pow(a, 3);
    }

    public double Pole() {
        return 2 * (a * a);
    }

    public double Przekątna() {
        return Math.sqrt(3) * a;
    }

    public double Obwód() {
        return 12 * a;
    }

    public void wyświetl() {
        System.out.println("Prostopadłościan: ");
        System.out.println("bok: " + a);
        System.out.println("objetosc: " + this.Objętość());
        System.out.println("pole: " + this.Pole());
        System.out.println("przekątna: " + this.Przekątna());
        System.out.println("obwód: " + this.Obwód());
    }

    public void WprowadzDane() {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Wprowadzasz a:");
        a = scan.nextDouble();
    }
}
