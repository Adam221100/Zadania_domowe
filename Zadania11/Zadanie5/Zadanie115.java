package zadanie11.pkg5;

public class Zadanie115 {

    public static void main(String[] args) throws NegativeNumberExcepion, NullPointerException {

        try {
            Osoba ktos1 = new Osoba("Kamil", "Hołyszko", -20, 72.F, 180.F);
        } catch (NegativeNumberExcepion e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Osoba ktos2 = new Osoba("Jan", null, 20, 72.F, 180.F);
        } catch (NegativeNumberExcepion i) {
            System.out.println(i.getMessage());
        } catch (NullPointerException i) {
            System.out.println(i.getMessage());
        }
    }
}
