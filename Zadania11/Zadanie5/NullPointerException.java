package zadanie11.pkg5;

public class NullPointerException extends Exception {

    public NullPointerException() {
    }
    
    @Override
    public String getMessage() {
        return "Trzeba ustalić wartość.";
    }
}
