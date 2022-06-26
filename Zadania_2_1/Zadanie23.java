package zadanie2.pkg3;
import java.util.Scanner;

public class Zadanie23 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int i=0;
      double [] tab={0,0,0,0,0,0,0,0,0,0};
      double opcja;
      System.out.print("Wprowadź 10 liczb\n");
      while(i<10){
       System.out.print("liczba nr " + (i+1) + "\n");
       tab[i] = scan.nextDouble();
       i++;
      }
      outerLoop:
        while(true){
         System.out.print("Wpisz:\n1- aby wyświetlić od pierwszeo do ostatniego indeksu\n2- aby wyświetlić od ostatniego do pierwszego indeksu\n3- aby wyświetlić elementy o nieparzystych indeksach\n4- aby aby wyświetlić elementy o parzystych indeksach\ninne- aby wyjść\n");
         opcja = scan.nextDouble();
         if(opcja==1){
            i=0;
            System.out.print("Od pierwszego do ostatniego:\n");
            while(i<10){
                System.out.print(tab [i]+"\t");
                i++;
         }
         System.out.print("\n");  
      }
         else if(opcja==2){
            i=9;
            System.out.print("Od ostatniego do pierwszego:\n");
            while(i>-1){
                System.out.print(tab [i]+"\t");
                i--;
             }
         System.out.print("\n");        
        }
        else if(opcja==3){
            i=0;
            System.out.print("Parzyste:\n");
            while(i<10){
                if(i%2==1){
                System.out.print(tab [i]+"\t");
                i++;
                } else {
                i++;
                continue;
                }
            }  
            System.out.print("\n");  
        }
        else if(opcja==4){
            i=0;
            System.out.print("Nieparzyste:\n");
            while(i<10){
                if(i%2==0){
                System.out.print(tab [i]+"\t");
                i++;
                } else {
                i++;
                continue;
                }
            }
            System.out.print("\n");  
        } else {
        break outerLoop;
        }
}
}
}