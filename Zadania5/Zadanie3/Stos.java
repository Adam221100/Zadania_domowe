package zadanie5.pkg3;

public class Stos {

    private int n;
    private int currentIndex = 0;
    private int[] tab;
    private int top;

    Stos(int n) {
        this.setN(n);
        this.tab = new int[n];
    }

    private void setN(int n) {
        if (n <= 0) {
            this.n = 1;
        } else {
            this.n = n;
        }
    }

    private void setTop() {
        if (currentIndex != 0) {
            this.top = tab[currentIndex - 1];
        }
    }

    protected void getTop() {
        if (currentIndex != 0) {
            System.out.println(this.top);
        } else {
            System.out.println("stos jest pusty");
        }

    }

    protected void push(int x) {
        if (currentIndex < n) {
            tab[currentIndex] = x;
            currentIndex++;
            this.setTop();
        } else {
            System.out.println("osiagnieto limit stosu");
        }
    }

    protected void pop() {
        if (currentIndex != 0) {
            tab[currentIndex - 1] = 0;
            currentIndex--;
            setTop();
        }
    }
}
