package zadanie8.pkg4;

public class Prostokąt extends FiguraPlaska {

    private double a;
    private double b;

    public Prostokąt(double a, double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public double obliczPole() {
        return a * b;
    }

    @Override
    public double obliczObwód() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Prostokąt:\n" + "Pole: " + obliczPole() + "\nObwód: " + obliczObwód();
    }
}
