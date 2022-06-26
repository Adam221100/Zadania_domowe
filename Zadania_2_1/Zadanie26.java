package zadanie2.pkg6;
import java.util.Scanner;

public class Zadanie26 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        System.out.print("Wprowadź liczby większe od zera:\n");
        while(true){
        a = scan.nextDouble();
        if(a<0){
        break;
        }
        }
    }
}
