package zadanie8.pkg4;

public class Trapez extends FiguraPlaska {

    private double a;
    private double b;
    private double h;

    public Trapez(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h < 0) {
            this.h = -h;
        } else {
            this.h = h;
        };
    }

    @Override
    public double obliczPole() {
        return (a + b) * h / 2;
    }

    @Override
    public double obliczObwód() {
        return 0;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Trapez:\n" + "Pole: " + obliczPole();
    }
}
