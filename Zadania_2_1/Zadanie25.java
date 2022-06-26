package zadanie2.pkg5;
import java.util.Scanner;

public class Zadanie25 {

    public static void main(String[] args) {
        int i=20;
        System.out.print("Program wyświetla liczby od 20 do 0, bez 2,6,9,15,19:\n");
        while(i>-1){
        if(i==19){
        i--;
        continue;
        } else if(i==15){
        i--;
        continue;
        }else if(i==9){
        i--;
        continue;
        }else if(i==6){
        i--;
        continue;
        }else if(i==2){
        i--;
        continue;
        } else {
        System.out.print(i + "\t");
        i--;
        }
 
    }
    }
}
