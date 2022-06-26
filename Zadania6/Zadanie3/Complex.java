package liczbyzespolone;

public class Complex {
    public double re;
    public double im;

    public Complex(double re, double im, boolean ifExp){
        if (ifExp){
            this.re = re*Math.cos(im);
            this.im = re*Math.sin(im);
        }
        else {
            this.re = re;
            this.im = im;
        }

    }

    public static void showAlg(Complex a){
        System.out.println(a.re + " + " + a.im + "i");
    }

    public static void showExp(Complex a){
        double r = absoluteValue(a);
        double arcctg = Math.atan(a.im/a.re);
        System.out.println(r + "e^" + arcctg +"i");
    }

    public static double absoluteValue(Complex a){
       return Math.sqrt(Math.pow(a.re, 2) + Math.pow(a.im, 2));
    }

    public static void conjugateNumber(Complex a){
        if (a.im > 0)
            System.out.println(a.re + " - " + a.im + "i");
        else
            System.out.println(a.re + a.im + "i");
    }


       public static Complex addAlg(double are, double aim, double bre, double bim){
       Complex c = new Complex(are + bre, aim + bim, false);
        showAlg(c);
       return c;
    }

    public static Complex subtractAlg(double are, double aim, double bre, double bim){
        Complex c = new Complex(are - bre, aim - bim, false);
        showAlg(c);
        return c;
    }

    public static Complex multiplyAlg(double are, double aim, double bre, double bim){
        Complex c = new Complex(are * bre - aim * bim, are * bim + aim * bre, false);
        showAlg(c);
        return c;
    }

    public static Complex divideAlg(double are, double aim, double bre, double bim){
        double temp = are * are + bim * bim;
        Complex c = new Complex((bre * are + bim * aim)/temp, (bim * are - bre*aim)/temp, false);
        showAlg(c);
        return c;
    }

    public static void showTry(Complex a){
        double temp = absoluteValue(a);
        System.out.println(temp + "(cos " + a.re/temp + " i sin " + a.im/temp);
    }

    public static Complex addExp(double ar, double aphi, double br, double bphi){
        Complex a = new Complex (ar, aphi, true);
        Complex b = new Complex (br, bphi, true);
        Complex c = new Complex (a.re + b.re, a.im+ b.im, false);
        showExp(c);
        return c;
    }

    public static Complex divideExp(double ar, double aphi, double br, double bphi){
        Complex a = new Complex (ar, aphi, true);
        Complex b = new Complex (br, bphi, true);
        double temp = a.re * a.re + b.im * b.im;
        Complex c = new Complex ((b.re * a.re + b.im * a.im)/temp, (b.im * a.re - b.re*a.im)/temp, false);
        showAlg(c);
        return new Complex((b.re * a.re + b.im * a.im)/temp, (b.im * a.re - b.re*a.im)/temp, false);
    }
}