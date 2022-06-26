package zadanie5.pkg5;

public class Firma {
	private int iloscPracownikow = 0;
	Pracownik[] pracownik = new Pracownik[100];
	
	protected void addPrac(String imie, String nazwisko, int wiek, String stanowisko){
		if(iloscPracownikow <= 100){
			pracownik[iloscPracownikow] = new Pracownik(imie, nazwisko, wiek, stanowisko);
			iloscPracownikow++;
			System.out.println("Dodano pracownika!");
		} else {
			System.out.println("LIMIT PRACOWNIKOW WYNOSI 100");
		}
	}
	protected void showPrac(){
		for(int i = 0; i < iloscPracownikow; i++){
			pracownik[i].PokazDane(i);
		}
	}
}
