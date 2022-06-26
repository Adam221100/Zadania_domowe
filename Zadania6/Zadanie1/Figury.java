package składowestatyczne;

public class Figury {

    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    public static double PoleKola(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double ObwodKola(double r) {
        return 2 * Math.PI * r;
    }

    public static double PoleKwadratu(double a) {
        return Math.pow(a, 2);
    }

    public static double ObwodKwadratu(double a) {
        return 2 * a;
    }

    public static double PoleProstokata(double a, double b) {
        return a * b;
    }

    public static double ObwodProstokata(double a, double b) {
        return 2 * (a + b);
    }

    public static double PoleStozka(double r, double l) {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }

    public static double ObjetoscStozka(double r, double h) {
        return (1/3)*Math.PI * Math.pow(r, 2) * h;
    }

    public static double PoleWalca(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    public static double ObjetoscWalca(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
