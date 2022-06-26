package obliczaniefigur;

import java.util.Scanner;

public class ObliczanieFigur {

    public static void main(String[] args) {
        int z;
        Scanner scan = new Scanner(System.in);

        outerLoop:
        while (true) {
            System.out.println("Wybierz figurę");
            System.out.println("-1 dla koła\n-2 dla kuli\n-3 dla kwadratu\n-4 dla prostokotu\n-5 dla prostopadłościanu\n-6 dla stożku\n-7 dla sześcianu\n-inne aby aby wyjść");
            z = scan.nextInt();

            switch (z) {

                case 1:
                    System.out.println("KOŁO");
                    Koło Koło1 = new Koło();
                    Koło1.WprowadzDane();
                    Koło1.wyświetl();
                    break;

                case 2:
                    System.out.println("KULA");
                    Kula Kula1 = new Kula();
                    Kula1.WprowadzDane();
                    Kula1.wyświetl();
                    break;

                case 3:
                    System.out.println("Kwadrat");
                    Kwadrat Kwadrat1 = new Kwadrat();
                    Kwadrat1.WprowadzDane();
                    Kwadrat1.wyświetl();
                    break;

                case 4:
                    System.out.println("Protokąt");
                    Prostokąt Prostokąt1 = new Prostokąt();
                    Prostokąt1.WprowadzDane();
                    Prostokąt1.wyświetl();
                    break;

                case 5:
                    System.out.println("Prostopadłościan");
                    Prostopadłościan Prostopadłościan1 = new Prostopadłościan();
                    Prostopadłościan1.WprowadzDane();
                    Prostopadłościan1.wyświetl();
                    break;

                case 6:
                    System.out.println("Stożek");
                    Stożek Stożek1 = new Stożek();
                    Stożek1.WprowadzDane();
                    Stożek1.wyświetl();
                    break;

                case 7:
                    System.out.println("Sześcian");
                    Sześcian Sześcian1 = new Sześcian();
                    Sześcian1.WprowadzDane();
                    Sześcian1.wyświetl();
                    break;

                default:
                    break outerLoop;

            }
        }
    }
}
