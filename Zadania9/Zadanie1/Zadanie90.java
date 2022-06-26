package zadanie9.pkg0;

public class Zadanie90 {

    public static void main(String[] args) {
        Pojemnik<String> obiekt1 = new Pojemnik<String>("zegarek");
        obiekt1.ShowThing();
        Pojemnik<Integer> obiekt2 = new Pojemnik<Integer>(5);
        obiekt2.ShowThing();
    }
}
