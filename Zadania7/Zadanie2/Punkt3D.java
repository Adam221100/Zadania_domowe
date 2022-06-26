package zadanie7.pkg2;

public class Punkt3D extends Punkt2D {

    int wspz;

    Punkt3D() {
        this.wspx = 0;
        this.wspy = 0;
        this.wspz = 0;
    }

    public void Random(int wspx, int wspy, int wspz) {
        this.wspx = wspx;
        this.wspy = wspy;
        this.wspz = wspz;
    }

    Punkt3D(int wspx, int wspy, int wspz) {

        this.wspx = wspx;
        this.wspy = wspy;
        this.wspz = wspz;
    }

    @Override
    public String toString() {
        return "x: " + this.wspx + " y: " + this.wspy + " z: " + this.wspz;
    }
}
