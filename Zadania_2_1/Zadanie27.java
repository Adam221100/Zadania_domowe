package zadanie2.pkg7;
import java.util.Scanner;

public class Zadanie27 {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int i=0;
     int j;
     int w,k;
     System.out.print("Ile liczb chcesz wprowadzić liczb?\n");
     w = scan.nextInt();
     int [] tab;
     tab= new int[w];
     while (i<w) {
     System.out.print("Liczba nr:"+ (i+1)+"\n");
     tab[i]= scan.nextInt();
     i++;
     }
     i=0;
     while (i<w) {
     System.out.print( tab[i] + "\t");
     i++;
     }
     System.out.print("\n");
    for(j=0;j<w-1;j++){
        for(i=0;i<w-1;i++){
            if(tab[i]>tab[i+1]){
                k=tab[i];
                tab[i]=tab[i+1];
                tab[i+1]=k;
            } else {
            continue;
            }
        }  
    }
     i=0;
     while (i<w) {
        System.out.print( tab[i] + "\t");
        i++;
     }
    } 
}