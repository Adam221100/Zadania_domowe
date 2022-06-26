package zadanie2.pkg2;
import java.util.Scanner;

public class Zadanie22 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a,b,w;
    int c;
    outerLoop:
    while(true){
        System.out.print("KALKULATOR\nWpisz:\n1 aby policzyć sumę\n2 aby policzyć różnicę\n3 aby policzyć iloczyn\n4 aby policzyć iloraz\n5 aby policzyć potęgę\n6 aby policzyć pierwiastek drugiego stopnia\n7 aby policzyć sinus\n8 aby policzyć cosinus\n9 aby policzyć tangens\n10 aby policzyć cotangens\nInne aby wyjść\n");
        c = scan.nextInt();
        switch (c) {
            case 1:
                System.out.print("Suma:\nwprowadź pierwszą liczbę:");
                a = scan.nextDouble();
                System.out.print("wprowadź drugą liczbę:");
                b = scan.nextDouble();
                w=a+b;
                System.out.print("Wynik:\n" + w);
                break;
            case 2:
                System.out.print("Różnica:\nwprowadź pierwszą liczbę:");
                a = scan.nextDouble();
                System.out.print("wprowadź drugą liczbę:");
                b = scan.nextDouble();
                w=a-b;
                System.out.print("Wynik:\n" + w);
                break;
            case 3:
                System.out.print("Iloczyn:\nwprowadź pierwszą liczbę:");
                a = scan.nextDouble();
                System.out.print("wprowadź drugą liczbę:");
                b = scan.nextDouble();
                w=a*b;
                System.out.print("Wynik:\n" + w);
                break;
            case 4:
                System.out.print("Iloraz:\nwprowadź pierwszą liczbę:");
                a = scan.nextDouble();
                System.out.print("wprowadź drugą liczbę:");
                b = scan.nextDouble();
                if (b==0) {
                    System.out.print("Nie można dzielić przez 0");
                } else {
                    w=a/b;
                    System.out.print("Wynik:\n" + w);
                }
                break;
            case 5:
                System.out.print("Potęga:\nwprowadź liczbę:");
                a = scan.nextDouble();
                System.out.print("wprowadź do której potęgi:");
                b = scan.nextDouble();
                w = Math.pow(a,b);
                System.out.print("Wynik:\n" + w);
                break;
            case 6:
                System.out.print("Pierwiastek drugiego stopnia:\nwprowadź liczbę:");
                a = scan.nextDouble();
                w = Math.sqrt(a);
                if (a<0) {
                System.out.print("Liczba musi być większa od zera\n");
                } else {
                System.out.print("Wynik:\n" + w);
                }
                break;
            case 7:
                System.out.print("Sinus:\nwprowadź wartość w radianach:");
                a = scan.nextDouble();
                w = Math.sin(a);
                System.out.print("Wynik:\n" + w);
                break;
            case 8:
                System.out.print("Cosinus:\nwprowadź wartość w radianach:");
                a = scan.nextDouble();
                w = Math.cos(a);
                System.out.print("Wynik:\n"+ w);
                break;
            case 9:
                System.out.print("Tangens:\nwprowadź wartość w radianach:");
                a = scan.nextDouble();
                w = Math.tan(a);
                System.out.print("Wynik:\n"+ w);
                break;
            case 10:
                System.out.print("Cotangens:\nwprowadź wartość w radianach:");
                a = scan.nextDouble();
                w = 1/Math.tan(a);
                System.out.print("Wynik:\n"+ w);
                break;
            default:
                break outerLoop;
        }
        }   
        }
    }
