package danestudenta;
import java.util.Scanner;

public class DaneStudenta {

    public static void main(String[] args) {
        
        Student student1 = new Student("Kamil", "Hołyszko", 117798,"Informatyka",1);
        student1.PokazDane();

        System.out.println("--------------------------");
        Student student2 = new Student("Adam", "Kowalski",123456);
        student2.PokazDane();

        System.out.println("--------------------------");
        student2.nazwa_specjalości = "Mechatronika";
        student2.rok_studiow = 2;
        student2.PokazDane();

        System.out.println("--------------------------");
        Student student3 = new Student("Janusz", "Jakiś","Architekruta krajobrazu");
        student3.PokazDane();
        
        System.out.println("--------------------------");
        student3.nr_indexu = 23819;
        student3.rok_studiow = 1;
        student3.PokazDane();
        
        System.out.println("--------------------------");
        Student student4 = new Student("Sebastian", "Inny","Filologia rosyjska",3);
        student4.PokazDane();
        
        System.out.println("--------------------------");
        student4.nr_indexu = 35398;
        student4.PokazDane();
        
        System.out.println("--------------------------");
        Student student5 = new Student();
        student5.WprowadzDane();
        System.out.println("--------------------------");
        student5.PokazDane();
    }
    
}