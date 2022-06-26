package zadanie11.pkg4;

public class Zadanie114 {

    public static void main(String[] args) {
        try {
            DevisionD(1.0, 0.0);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }

        try {
            DevisionF(1.0F, 0.0F);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }

    }

    public static double DevisionD(double dzielna, double dzielnik) {
        if (dzielnik == 0) {
            throw new DivisionByZeroException();
        }
        return dzielna / dzielnik;
    }

    public static double DevisionF(float dzielna, float dzielnik) {
        if (dzielnik == 0) {
            throw new DivisionByZeroException();
        }
        return dzielna / dzielnik;
    }

}
