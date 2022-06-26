package zadanie8.pkg4;

public class Stożek extends FiguraPrzestrzenna {

    private double r;
    private double h;
    private double l;

    public Stożek(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r < 0) {
            this.r = -r;
        } else {
            this.r = r;
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

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if (l < 0) {
            this.l = -l;
        } else {
            this.l = l;
        };
    }

    @Override
    public double obliczPole() {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }

    @Override
    public double obliczObjętość() {
        return (1 / 3) * Math.PI * Math.pow(r, 2) * h;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Stożek:\n" + "Pole: " + obliczPole() + "\nObjętość: " + obliczObjętość();
    }
}
