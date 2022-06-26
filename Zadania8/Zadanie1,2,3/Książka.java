package zadanie8.pkg1;

public class Książka extends Product {

    public Książka(String name, double price, String describe) {
        super(name, price, describe);
    }

    @Override
    public void Buy() {
        System.out.println(
                "I bought a book!");
    }

    @Override
    public void ShowInfo() {
        System.out.println("Price:" + getPrice() + "name:" + getName() + " describe:" + getDescribe());
    }
}
