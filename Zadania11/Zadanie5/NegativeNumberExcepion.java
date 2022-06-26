package zadanie11.pkg5;

public class NegativeNumberExcepion extends Exception {

    public NegativeNumberExcepion() {
    }
    
    @Override
    public String getMessage() {
        return "To nie może być ujemne.";
    }
}
