package obliczaniefigur;

import java.util.Scanner;

public class Prostopadłościan {

    double a, b, c;

    public Prostopadłościan() {
    }

    public double Objętość() {
        return a * b * c;
    }

    public double Pole() {
        return 2 * (a * b) + 2 * (b * c) + 2 * (c * a);
    }

    public double Przekątna() {
        return Math.sqrt(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + Math.pow(c, 2));
    }

    public double Obwód() {
        return 4 * (a + b + c);
    }

    public void wyświetl() {
        System.out.println("Prostopadłościan: ");
        System.out.println("bok pierwszy: " + a);
        System.out.println("bok drugi: " + b);
        System.out.println("bok trzeci: " + c);
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
        System.out.println("Wprowadzasz b:");
        b = scan.nextDouble();
        System.out.println("Wprowadzasz c:");
        c = scan.nextDouble();
    }
}
