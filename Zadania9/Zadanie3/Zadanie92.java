package zadanie9.pkg2;

public class Zadanie92 {

    public static void main(String[] args) {
        TupleTwo<String, String> proba1 = new TupleTwo<String, String>("jeden", "jeden");
        proba1.Show();
        TupleTwo<Integer, String> proba2 = new TupleTwo<Integer, String>(2, "dwa");
        proba2.Show();
        TupleThree<Integer, String, Integer> proba3 = new TupleThree<Integer, String, Integer>(3, "trzy", 3);
        proba3.Show();
        TupleFour<Integer, String, Integer, String> proba4 = new TupleFour<Integer, String, Integer, String>("cztery", 4, "cztery",4);
        proba4.Show();
    }
}
