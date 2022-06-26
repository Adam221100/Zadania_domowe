package zadanie10.pkg3;

public class Samochod {

    private String marka;
    private String nazwa;
    private int maxV;
    private int cena;

    public Samochod(String marka, String nazwa, int maxV, int cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.maxV = maxV;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getMaxV() {
        return maxV;
    }

    public void setMaxV(int maxV) {
        this.maxV = maxV;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public void ShowV() {
        System.out.println("Prędkosc auta wynosi: " + this.maxV);
    }
    public void ShowP() {
        System.out.println("Cena auta wynosi: " + this.cena);
    }

}
