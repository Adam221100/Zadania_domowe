package zadanie3.pkg3.pkg3;
import java.util.Scanner;

public class Zadanie333 {

    public static double iteracja(double a, double b) {
        System.out.println("Iteracja");
        double c = 1;
        for (int i = 1; i <= b; i++) {
            c *= a;
        }
        return c;
    }

    public static double rekurencja(double a, double b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 1) {
            return a * (rekurencja(a, (b - 1) / 2)) * (rekurencja(a, (b - 1) / 2));
        } else {
            return (rekurencja(a, b / 2)) * (rekurencja(a, b / 2));
        }
    }

    public static void main(String[] args) {
        double a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Jaka liczba?");
        a = scan.nextDouble();
        System.out.println("Do której potęgi?");
        b = scan.nextDouble();
        System.out.println(iteracja(a, b));
        System.out.println("Rekurencja");
        System.out.println(rekurencja(a, b));
    }
}
