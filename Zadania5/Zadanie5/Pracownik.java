package zadanie5.pkg5;

public class Pracownik {
	private String imie;
	private String nazwisko;
	private int wiek;
	private String stanowisko;
	
	public Pracownik(String imie, String nazwisko, int wiek, String stanowisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.stanowisko = stanowisko;
	}
	protected void PokazDane(int id){
	System.out.println("PRACOWNIK: " + (id+1)+"----");
	System.out.println("imie: "+this.imie);
	System.out.println("nazwisko: "+this.nazwisko);
	System.out.println("wiek: " +this.wiek+" lat");
	System.out.println("nazw1sko: "+this.stanowisko);
	}
}
