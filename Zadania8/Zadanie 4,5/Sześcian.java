package zadanie8.pkg4;

public class Sześcian extends FiguraPrzestrzenna {

    private double a;

    public Sześcian(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) {
            this.a = -a;
        } else {
            this.a = a;
        };
    }

    @Override
    public double obliczPole() {
        return Math.pow(a, 2)*6;
    }

    @Override
    public double obliczObjętość() {
        return Math.pow(a, 3);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Sześcian:\n" + "Pole: " + obliczPole() + "\nObjętość: " + obliczObjętość();
    }
}
