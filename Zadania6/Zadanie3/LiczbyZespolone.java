package liczbyzespolone;

public class LiczbyZespolone {

    public static void main(String[] args) { 
        Complex a = new Complex(0, -1.0, false);
        Complex b = new Complex(-2, 4, false);
        System.out.println("|z| = " + Complex.absoluteValue(a));
        System.out.println("Liczba sprzężona: ");
        Complex.conjugateNumber(a);
        System.out.println("a+b");
        Complex.addAlg(a.re, a.im, b.re, b.im);
        System.out.println("a-b");
        Complex.subtractAlg(a.re, a.im, b.re, b.im);
        System.out.println("a*b");
        Complex.multiplyAlg(a.re, a.im, b.re, b.im);
        System.out.println("a/b");
        Complex.divideAlg(a.re, a.im, b.re, b.im);
        Complex.showExp(a);
        a = new Complex(1, 3, true);
        b = new Complex(7, 0.34, true);
        System.out.println("Postac trygonometryczna:");
        Complex.showTry(a);
        System.out.println("Postać wykładnicza (a)");
        Complex.showExp(a);
        System.out.println("Postać wykładnicza (b)");
        Complex.showExp(b);
        System.out.println("Postać wykładnicza (a+b)");
        Complex.addExp(1, 3, 7 , 0.34);
        System.out.println("Postać wykładnicza (a/b)");
        Complex.divideExp(1, 3, 7, 0.34);
    }
    
}
