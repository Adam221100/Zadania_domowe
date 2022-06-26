package zadanie2.pkg1;
import java.util.Scanner;

public class Zadanie21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, x1, x2;
        System.out.print("Program wylicza pierwiastki trójmianu kwadratowego");
        System.out.print("\nWprowadz a:");
        a = scan.nextDouble();
        System.out.print("Wprowadz b:");
        b = scan.nextDouble();
        System.out.print("Wprowadz c:");
        c = scan.nextDouble();    
        if (a == 0){
        x1=-c/b;
        System.out.print("Fukjca liniowa:\nx=" + x1);
        }
        else{
          System.out.print("Fukjca kwadratowa");
          double del= b*b -4*a*c;
          System.out.print("\nDelta równa " +del);
          if(del<0){
          System.out.print("\nBrak pierwiskow rzeczywistych");
          } else if (del == 0){
          x1=-b/2*a;
          System.out.print("\nx=" + x1);
          } else{
          x1=(-b-Math.sqrt(del))/2*a;
          x2=(-b+Math.sqrt(del))/2*a;
          System.out.print("\nDwa pierwiastki:\nx=" + x1);
          System.out.print("\nx=" + x2 + "\n");
          }
        }   
        }
}