package zadanie3.pkg1.pkg2;
import java.util.Scanner;

public class Zadanie312 {

    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadź liczbe. Program sprawdzi czy nalezy do przedzialu:\na:[-3,7]\nb:[-inf,4]U[6,inf]\n");
        a = scan.nextInt();
        boolean v1 = a>=-3 && a<=7;
        boolean v2 = a<=4 || a>=6;
        if(v1==true){
        System.out.print("Liczba należy do przedziału a\n");
        }
        if(v2==true){
        System.out.print("Liczba należy do przedziału b\n");
        }
    }
    
}
