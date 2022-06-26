package zadanie8.pkg4;

public class Zadanie84 {

    public static void main(String[] args) {
        FiguraGeometryczna[] tablica = new FiguraGeometryczna[15];
        tablica[0] = new Kwadrat(2);
        tablica[1] = new Prostokąt(2, 3);
        tablica[2] = new Trójkąt(1, 4);
        tablica[3] = new Trapez(1, 4, 4);
        tablica[4] = new Równoległobok(1, 4);
        tablica[5] = new Romb(2, 4);
        tablica[6] = new Koło(4);
        tablica[7] = new Sześcian(3);
        tablica[8] = new Prostopadłościan(1, 2, 3);
        tablica[9] = new Kula(2);
        tablica[10] = new Walec(2, 3);
        tablica[11] = new Stożek(1, 2, 3);
        
        
        
        for (int i = 0; i < 12; i++) {
            System.out.println(tablica[i].toString());
        }
    }
}
