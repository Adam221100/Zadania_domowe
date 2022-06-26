package zadanie3.pkg2.pkg5;

public class Zadanie325 {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("a:" + a);
        int b = 3;
        System.out.println("\na:" + a + "\nb:" + b);
        int c = a + b++;
        System.out.println("\na:" + a + "\nb:" + b + "\nc:" + c);
        int d = (a++) + b;
        System.out.println("\na:" + a + "\nb:" + b + "\nc:" + c + "\nd:" + d);
    }
}
