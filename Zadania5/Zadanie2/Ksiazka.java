package zadanie5.pkg2;

public class Ksiazka {

    Ksiazka(String tytuł, String autor, int liczba_stron, int rok_wydania, int cena) {
    }

    private String tytuł;

    String getTytuł() {
        return "Tytuł: " + this.tytuł;
    }

    void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    private String autor;

    String getAutor() {
        return "Autor: " + this.autor;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    private int liczba_stron;

    String getLiczba_stron() {
        return "Liczba stron: " + this.liczba_stron;
    }

    void setLiczba_stron(int liczba_stron) {
        this.liczba_stron = liczba_stron;
    }

    private int rok_wydania;

    String getRok_wydania() {
        return "Rok wydania: " + this.rok_wydania;
    }

    void setRok_wydania(int rok_wydania) {
        this.rok_wydania = rok_wydania;
    }

    private int cena;

    String getCena() {
        return "Cena: " + this.cena + " złoty";
    }

    void setCena(int cena) {
        this.cena = cena;
    }
}
