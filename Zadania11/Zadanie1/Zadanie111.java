package zadanie11.pkg1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie111 {

    public static void main(String[] args) {
        wprowadzInt();
        wprowadzDouble();
        wprowadzByte();
        wprowadzBigDecimal();
        wprowadzBigInteger();
        wprowadzBoolean();

    }

    public static void wprowadzInt() {
        System.out.println("Wprowadź liczbę typu int.");
        Scanner scan = new Scanner(System.in);
        try {
            int a;
            a = scan.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Nie jest to liczba typu int.");
        }
    }

    public static void wprowadzDouble() {
        System.out.println("Wprowadź liczbę typu double.");
        Scanner scan = new Scanner(System.in);
        try {
            double a;
            a = scan.nextDouble();
        } catch (InputMismatchException b) {
            System.out.println("Nie jest to liczba typu double.");
        }
    }

    public static void wprowadzByte() {
        System.out.println("Wprowadź liczbę typu byte.");
        Scanner scan = new Scanner(System.in);
        try {
            byte a;
            a = scan.nextByte();
        } catch (InputMismatchException c) {
            System.out.println("Nie jest to liczba typu byte.");
        }
    }

    public static void wprowadzBigDecimal() {
        System.out.println("Wprowadź liczbę typu BigDecimal.");
        Scanner scan = new Scanner(System.in);
        try {
            BigDecimal a;
            a = scan.nextBigDecimal();
        } catch (InputMismatchException e) {
            System.out.println("Nie jest to liczba typu BigDecimal.");
        }
    }

    public static void wprowadzBigInteger() {
        System.out.println("Wprowadź liczbę typu BigInteger.");
        Scanner scan = new Scanner(System.in);
        try {
            BigInteger a;
            a = scan.nextBigInteger();
        } catch (InputMismatchException e) {
            System.out.println("Nie jest to liczba typu BigInteger.");
        }
    }

    public static void wprowadzBoolean() {
        System.out.println("Wprowadź liczbę typu Boolean.");
        Scanner scan = new Scanner(System.in);
        try {
            Boolean a;
            a = scan.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Nie jest to liczba typu Boolean.");
        }
    }
}
