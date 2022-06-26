package zadanie3.pkg3.pkg4;
import java.util.Scanner;

public class Zadanie334 {
    public static int rekurencja(int n){
    if(n<=0){
     return 0;
    }else if(n==1){
    return 1;
    }else{
    return rekurencja(n-1)+rekurencja(n-2);}
    }
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;
       System.out.println("Który wyraz ciągu?");
       n = scan.nextInt();
       System.out.println(rekurencja(n));
       
    }
    
}
