package zadanie9.pkg2;

public class TupleThree<T1, T2, T3> extends TupleTwo {

    private T3 third;

    public T3 getThird() {
        return third;
    }

    public void setThird(T3 third) {
        this.third = third;
    }

    public TupleThree(T3 third, Object first, Object second) {
        super(first, second);
        this.third = third;
    }
    @Override
     public void Show() {
         super.Show();
         System.out.println("3: " + this.third);
    }
}

