package zadanie8.pkg4;

public class Koło extends FiguraPlaska {

    private double r;

    public Koło(double r) {
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
        return Math.PI*Math.pow(r, 2);
    }

    @Override
    public double obliczObwód() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Koło:\n" + "Pole: " + obliczPole() + "\nObwód: " + obliczObwód();
    }
}
