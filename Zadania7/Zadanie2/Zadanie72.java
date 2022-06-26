package zadanie7.pkg2;

import java.util.Random;

public class Zadanie72 {

    public static void main(String[] args) {

        int a, b, c;
        Punkt2D punkt1 = new Punkt2D();
        Punkt2D punkt2 = new Punkt2D(4, 5);

        Random r = new Random();
        a = r.nextInt(20) - 10;
        b = r.nextInt(20) - 10;
        punkt1.Random(a, b);
        System.out.println("Test:");
        System.out.println(punkt1.toString());
        System.out.println(punkt2.toString());

        Punkt3D punkt3 = new Punkt3D();
        a = r.nextInt(20) - 10;
        b = r.nextInt(20) - 10;
        c = r.nextInt(20) - 10;
        punkt3.Random(a, b, c);
        System.out.println(punkt3.toString());

        Punkt2D[] array2d = new Punkt2D[100];
        Punkt3D[] array3d = new Punkt3D[100];
        for (int i = 0; i < 100; i++) {
            a = r.nextInt(20) - 10;
            b = r.nextInt(20) - 10;
            array2d[i] = new Punkt2D(a, b);

            a = r.nextInt(20) - 10;
            b = r.nextInt(20) - 10;
            c = r.nextInt(20) - 10;
            array3d[i] = new Punkt3D(a, b, c);
        }
        System.out.println("Szukane współrzędne");
        for (int i = 0; i < 100; i++) {
            if (array2d[i].wspx == array3d[i].wspx || array2d[i].wspy == array3d[i].wspy) {
                System.out.println(array2d[i].toString());
            }
        }
    }
}