package zadanie3.pkg3.pkg2;
import java.util.Scanner;

public class Zadanie332 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź liczbe");
        int a;
        int b = 1;
        a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        System.out.println("Wynik:" + b);
    }

}
