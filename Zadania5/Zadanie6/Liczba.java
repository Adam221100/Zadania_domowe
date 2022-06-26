package zadanie5.pkg6;

public class Liczba {
	
	protected void silnia(int n){
		int silnia = 1;
		for(int i = n; i > 1; i--){
			silnia *= i;
		}
		System.out.println(silnia);
	}
}
