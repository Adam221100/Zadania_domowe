package zadanie8.pkg4;

public class Kula extends FiguraPrzestrzenna {

    private double r;

    public Kula(double r) {
        this.r = r;
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

    @Override
    public double obliczPole() {
        return 4*Math.PI*Math.pow(r, 2);
    }

    @Override
    public double obliczObjętość() {
        return (4/3)*Math.PI*Math.pow(r, 2);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Kula:\n" + "Pole: " + obliczPole() + "\nObjętość: " + obliczObjętość();
    }
}
