package zadanie3.pkg2.pkg7;
import java.util.Scanner;

public class Zadanie327 {

    public static void main(String[] args) {
      double a;
      Scanner scan = new Scanner(System.in);
      System.out.print("Program sprawdza czy liczba to 5\n");
      a = scan.nextDouble();
      if(a!=5){
      System.out.print("Liczba jest różna od 5\n");
      } else {
      System.out.print("Liczba jest równa 5\n");
      }
    }
    
}
