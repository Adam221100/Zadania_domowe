package zadanie9.pkg0;

public class Pojemnik<T> {

    private T nazwa;

    public Pojemnik(T nazwa) {
        this.nazwa = nazwa;
    }

    public T getNazwa() {
        return nazwa;
    }

    public void setNazwa(T nazwa) {
        this.nazwa = nazwa;
    }

    public void ShowThing() {
        System.out.println(this.nazwa);
    }
}
