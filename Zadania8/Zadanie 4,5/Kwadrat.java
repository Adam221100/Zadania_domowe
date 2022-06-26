package zadanie8.pkg4;

public class Kwadrat extends FiguraPlaska {

    private double a;

    public Kwadrat(double a) {
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
        return Math.pow(a, 2);
    }

    @Override
    public double obliczObwód() {
        return 4 * a;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Kwadrat:\n" + "Pole: " + obliczPole() + "\nObwód: " + obliczObwód();
    }
}
