package zadanie8.pkg4;

public class Prostopadłościan extends FiguraPrzestrzenna {

    private double a;
    private double b;
    private double c;

    public Prostopadłościan(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b < 0) {
            this.b = -b;
        } else {
            this.b = b;
        };
    }
    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c < 0) {
            this.c = -c;
        } else {
            this.c = c;
        };
    }

    @Override
    public double obliczPole() {
        return 2*(a*b)+2*(a*c)+2*(b*c);
    }

    @Override
    public double obliczObjętość() {
        return a*b*c;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Prostopadłościan:\n" + "Pole: " + obliczPole() + "\nObjętość: " + obliczObjętość();
    }
}
