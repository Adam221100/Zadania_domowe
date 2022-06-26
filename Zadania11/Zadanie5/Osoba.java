package zadanie11.pkg5;

public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;
    private float waga;
    private float wzrost;

    public Osoba(String imie, String nazwisko, int wiek, float waga, float wzrost) throws NegativeNumberExcepion, NullPointerException {
        if (imie == null) {
            System.out.println("Musisz podać imie.");
            throw new NullPointerException();
        } else {
            this.imie = imie;
        }

        if (nazwisko == null) {
            System.out.println("Musisz podać nazwisko.");
            throw new NullPointerException();
        } else {
            this.nazwisko = nazwisko;
        }

        if (wiek <= 0) {
            System.out.println("Wiek nie może być ujemny.");
            throw new NegativeNumberExcepion();
        } else {
            this.wiek = wiek;
        }

        if (waga <= 0) {
            System.out.println("Waga nie może być ujemna.");
            throw new NegativeNumberExcepion();
        } else {
            this.waga = waga;
        }

        if (wzrost <= 0) {
            System.out.println("Wzrost nie może być ujemny.");
            throw new NegativeNumberExcepion();
        } else {
            this.wzrost = wzrost;
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) throws NullPointerException {
        if (imie == null) {
            System.out.println("Musisz podać imie.");
            throw new NullPointerException();
        } else {
            this.imie = imie;
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) throws NullPointerException {
        if (nazwisko == null) {
            System.out.println("Musisz podać nazwisko.");
            throw new NullPointerException();
        } else {
            this.nazwisko = nazwisko;
        }
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) throws NegativeNumberExcepion {
        if (wiek <= 0) {
            System.out.println("Wiek nie może być ujemny.");
            throw new NegativeNumberExcepion();
        } else {
            this.wiek = wiek;
        }
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) throws NegativeNumberExcepion {
        if (waga <= 0) {
            System.out.println("Waga nie może być ujemna.");
            throw new NegativeNumberExcepion();
        } else {
            this.waga = waga;
        }
    }

    public float getWzrost() {
        return wzrost;
    }

    public void setWzrost(float wzrost) throws NegativeNumberExcepion {
        if (wzrost <= 0) {
            System.out.println("Wzrost nie może być ujemny.");
            throw new NegativeNumberExcepion();
        } else {
            this.wzrost = wzrost;
        }
    }

}
