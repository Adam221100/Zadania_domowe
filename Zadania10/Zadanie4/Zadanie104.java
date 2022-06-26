package zadanie10.pkg4;

import java.util.HashMap;
import java.util.Scanner;

public class Zadanie104 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> tlumacz = new HashMap<String, String>();
        tlumacz.put("one", "jeden");
        tlumacz.put("two", "dwa");
        tlumacz.put("three", "trzy");
        tlumacz.put("four", "cztery");
        tlumacz.put("five", "piec");
        tlumacz.put("white", "bialy");
        tlumacz.put("black", "czarny");
        tlumacz.put("red", "czerwony");
        tlumacz.put("blue", "niebieski");
        tlumacz.put("yellow", "żółty");
        tlumacz.put("hello", "cześć");
        tlumacz.put("door", "drzwi");
        tlumacz.put("house", "dom");
        tlumacz.put("window", "okno");
        tlumacz.put("cup", "filiżanka");
        tlumacz.put("mouse", "myszka");
        tlumacz.put("printer", "drukarka");
        tlumacz.put("desk", "biurko");
        tlumacz.put("floor", "podloga");
        tlumacz.put("lamp", "lampa");
        String action = "x";
        while (true) {
            System.out.println("Wpisz słowo po angielsku lub koniec aby zakończyć ");
            action = scan.next();
            if (action.equalsIgnoreCase("koniec"))
            {
                break;
            }
            if (tlumacz.get(action) == null) {
                System.out.println("Nie ma takiego słowa w słowniku");
            } else {
                System.out.println(tlumacz.get(action));
            }
        }
    }
}
