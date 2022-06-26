package zadanie9.pkg1;

public class Zadanie91 {

    public static void main(String[] args) {
        Pair<String, String> para1 = new Pair<String, String>("jeden", "dwa");
        para1.ShowPair();
        Pair<Integer, String> para2 = new Pair<Integer, String>(1, "dwa");
        para2.ShowPair();
        Pair<String, Integer> para3 = new Pair<String, Integer>("jeden", 2);
        para2.ShowPair();

    }
}
