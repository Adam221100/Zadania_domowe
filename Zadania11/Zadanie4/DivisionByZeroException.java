package zadanie11.pkg4;

public class DivisionByZeroException extends ArithmeticException {

    public DivisionByZeroException() {
        System.out.println("Wystąpił wyjątek dzielenia przez 0.");
    }

    @Override
    public String getMessage() {
        return "Wywołanie metody " + this.getStackTrace()[0].toString() + "spowodowało wyrzucnie wyjątku dzielenia przez zero";
    }
}
