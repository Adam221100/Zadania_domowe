package zadanie10.pkg2;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Zadanie102 {

    public static void main(String[] args) {
        Random losuj = new Random();
        TreeSet<Integer> lista = new TreeSet<Integer>();
        for (int i = 0; i < 100; i++) {
            lista.add(losuj.nextInt(150));
        }
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

    }
}
