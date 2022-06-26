package zadanie2.pkg4;
import java.util.Scanner;

public class Zadanie24 {
    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int i=0,c;
      double [] tab={0,0,0,0,0,0,0,0,0,0};
      double s;
      System.out.print("Wprowadź 10 liczb\n");
      while(i<10){
       System.out.print("liczba nr " + (i+1) + "\n");
       tab[i] = scan.nextDouble();
       i++;
      }
    outerLoop:
    while(true){
        System.out.print("Wybierz:\n1- aby obliczyć sumę elementów tablicy \n2- aby obliczyć iloczyn elementów tablicy\n3- aby wyznaczyć wartość średnią\n4- aby wyznaczyć wartość minimalą\n5- aby wyznaczyć wartość maksymaną\ninne- aby wyjść\n");
        c = scan.nextInt();
        switch (c) {
            case 1:
                i=0;
                s=0;
                while(i<10){
                s=s+tab[i];
                i++;
                }
                System.out.print("Suma:" + s +"\n");
                break;
                
            case 2:
                i=0;
                s=1;
                while(i<10){
                s=s*tab[i];
                i++;
                }
                System.out.print("Iloczyn:" + s +"\n");
                break;
    
            case 3:
                i=0;
                s=0;
                while(i<10){
                s=s+tab[i];
                i++;
                }
                System.out.print("Wartość średnia:" + (s/10) +"\n");
                break;
            case 4:
                i=0;
                s=1000000000;
                while(i<10){
                    if(s>tab[i]){
                    s=tab[i];
                    i++;
                    }else{
                    i++;
                    continue;
                    }
                }
                System.out.print("Najmniejsza:" + s +"\n");
                break;
    
            case 5:
                i=0;
                s=-1000000000;
                while(i<10){
                    if(s<tab[i]){
                    s=tab[i];
                    i++;
                    }else{
                    i++;
                    continue;
                    }
                }
                System.out.print("Największa:" + s +"\n");
                break;
                
            default:
                break outerLoop;
    }
    }
}
    }