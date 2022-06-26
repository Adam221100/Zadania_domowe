package zadanie11.pkg2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie112 {

    public static void main(String[] args) {
        String[] tablica = {"Iza", "Kamil", "Damian", "Wiktor", "Dawid", "Janek", "Monika", "Patka", "Konrad", "Michał"};
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź liczbę od 1 do 10.\nWprowadź -1 aby wyjść.");
        while (true) {
            try {
                a = scan.nextInt();
                if (a == -1) {
                    break;
                }
                System.out.println(tablica[a - 1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Liczba wychodzi poza zakres.");
            } catch (InputMismatchException p) {

                System.out.println("To nawet nie jest liczba.");
                break;
            }

        }

        System.out.println("Koniec.");
    }
}
