package zadanie8.pkg4;

public class Walec extends FiguraPrzestrzenna {

    private double r;
    private double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
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

    @Override
    public double obliczPole() {
        return 2*Math.PI*Math.pow(r, 2)+2*Math.PI*r*h;
    }

    @Override
    public double obliczObjętość() {
        return Math.PI*Math.pow(r, 2)*h;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Walec:\n" + "Pole: " + obliczPole() + "\nObjętość: " + obliczObjętość();
    }
}
