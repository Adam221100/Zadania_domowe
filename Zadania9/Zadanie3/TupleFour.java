package zadanie9.pkg2;

public class TupleFour<T1, T2, T3, T4> extends TupleThree {

    private T4 fourth;

    public TupleFour(T4 fourth, Object third, Object first, Object second) {
        super(third, first, second);
        this.fourth = fourth;
    }

    public T4 getFourth() {
        return fourth;
    }

    public void setFourth(T4 fourth) {
        this.fourth = fourth;
    }
     @Override
     public void Show() {
         super.Show();
         System.out.println("4: " + this.fourth);
    }
}
