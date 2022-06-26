package zadanie5.pkg3;

import java.util.Scanner;

public class Zadanie53 {

    public static void main(String[] args) {
        Stos stos = new Stos(50);
        stos.getTop();
        stos.push(4);
        stos.getTop();
        stos.push(2);
        stos.push(8);
        stos.push(10);
        stos.getTop();
        stos.pop();
        stos.getTop();
        stos.pop();
        stos.pop();
        stos.pop();
        stos.getTop();
        stos.push(5);
        stos.getTop();
        stos.pop();
        stos.getTop();
    }
}
