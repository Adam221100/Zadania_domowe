package wprowadzdane;

import java.util.Scanner;

public class WprowadzDane {

    public static void main(String[] args) {
        int z, a, b;
        Scanner scan = new Scanner(System.in);
        Student[] student = new Student[100];
        for (int i = 0; i < 100; i++) {
            student[i] = new Student("", "", 0, "", 0);
        }
        outerLoop:
        while (true) {
            System.out.println("APLIKACJA STUDENT");
            System.out.println("Wybierz:");
            System.out.println("1 aby wprowadzić dane studenta pod wybrany index tablicy");
            System.out.println("2 aby edytoać (nadpisać dane studenta) spod wybranego indeksu");
            System.out.println("3 aby usunąć dane studenta");
            System.out.println("4 wyświetlić obiekt o danym indeksie");
            System.out.println("5 aby wyświetlić wszytskie obiekty");
            System.out.println("6 aby wyświetlić indeksy z danego zakresu");
            System.out.println("inne aby wyjść");
            z = scan.nextInt();

            switch (z) {

                case 1:
                    System.out.println("Wprowadź indeks:");
                    a = scan.nextInt();
                    a = a--;
                    student[a].WprowadzDane();
                    break;

                case 2:
                    System.out.println("Wprowadź indeks:");
                    a = scan.nextInt();
                    a = a--;
                    student[a].WprowadzDane();
                    break;

                case 3:
                    System.out.println("Wprowadź indeks:");
                    a = scan.nextInt();
                    a = a--;
                    student[a].imie = "";
                    student[a].nazwisko = "";
                    student[a].nr_indexu = 0;
                    student[a].nazwa_specjalości = "";
                    student[a].rok_studiow = 0;
                    break;

                case 4:
                    System.out.println("Wprowadź indeks:");
                    a = scan.nextInt();
                    a = a--;
                    student[a].PokazDane();
                    break;

                case 5:
                    for (int i = 0; i < 100; i++) {
                        student[i].PokazDane();
                    }
                    break;

                case 6:
                    System.out.println("Wprowadź początkowy indeks:");
                    a = scan.nextInt();
                    System.out.println("Wprowadź Końcowy indeks:");
                    b = scan.nextInt();
                    for (int i = a-1; i <= b-1; i++) {
                        student[i].PokazDane();
                    }
                    break;

                default:
                    break outerLoop;
            }
        }
    }
}
