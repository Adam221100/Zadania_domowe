package zadanie3.pkg2.pkg2;

public class Zadanie322 {

    public static void main(String[] args) {
        String s1 = new String(" Witaj świecie.");
        String s2 = new String(" witaj świecie.");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("Konwertuje ten ciąg na nową tablicę znaków.");
        char[] a = s1.toCharArray();
        for (int i = 0; i < 15; i++) {
            System.out.println(a[i]);
        }

        System.out.println("\nKoduje ten ciąg do sekwencji bajtów przy użyciu domyślnego zestawu znaków platformy, przechowując wynik w nowej tablicy bajtów.");
        byte[] b = s1.getBytes();
        for (int i = 0; i < 15; i++) {
            System.out.println(b[i]);
        }

        System.out.println("\nPorównuje ten ciąg z określonym obiektem.");
        boolean c = s1.equals(s2);
        System.out.println(c);

        System.out.println("\nPorównuje ten ciąg z innym ciągiem, ignorując rozważania dotyczące wielkości liter.");
        boolean d = s1.equalsIgnoreCase(s2);
        System.out.println(d);

        System.out.println("\nZwraca indeks pierwszego wystąpienia określonego znaku.");
        int e = s2.indexOf('w');
        System.out.println(e + 1);

        System.out.println("\nZwraca indeks ostatniego wystąpienia określonego znaku.");
        int f = s2.lastIndexOf('i');
        System.out.println(f + 1);

        System.out.println("\nZwraca nowy ciąg, który jest podłańcuchem tego ciągu.");
        String g = s1.substring(3);
        System.out.println(g);

        System.out.println("\nZwraca nowy ciąg wynikający z zastąpienia wszystkich wystąpień starego znaku w tym ciągu nowym znakiem.");
        String h = s1.replace('i', 'p');
        System.out.println(h);

        System.out.println("\nZwraca kopię ciągu z pominięciem wiodących i końcowych białych znaków.");
        String i = s1.trim();
        System.out.println(i);

        System.out.println("\nKonwertuje wszystkie znaki w tym ciągu na małe litery przy użyciu reguł domyślnych ustawień regionalnych.");
        String j = s1.toLowerCase();
        System.out.println(j);

        System.out.println("\nKonwertuje wszystkie znaki w tym ciągu na wielkie litery przy użyciu reguł domyślnych ustawień regionalnych.");
        String k = s1.toUpperCase();
        System.out.println(k);

        System.out.println("\nDzieli ten ciąg wokół dopasowań podanego wyrażenia regularnego.");
        String[] l = s1.split("i");
        System.out.println(l[0] + "\n" + l[1] + "\n" + l[2] + "\n" + l[3]);

    }

}
