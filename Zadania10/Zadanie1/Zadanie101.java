package zadanie10.pkg1;

import java.util.Random;
import java.util.Arrays;

public class Zadanie101 {

    private static int[] Lista = new int[99];

    public static void main(String[] args) {
        Random losuj = new Random();
        for (int i = 0; i < Lista.length; i++) {
            Lista[i] = losuj.nextInt(150);
        }
        sortuj();
        pokaz();
    }

    public static void pokaz() {
        System.out.println(Arrays.toString(Lista));
    }

    public static void sortuj() {
        Arrays.sort(Lista);
    }
}

