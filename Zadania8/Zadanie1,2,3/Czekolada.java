package zadanie8.pkg1;

public class Czekolada extends Product {

    public Czekolada (String name, double price, String describe) {
        super(name, price, describe);
    }

    @Override
    public void Buy() {
        System.out.println(
                "I bought a chocolate!");
    }

    @Override
    public void ShowInfo() {
        System.out.println("Price:" + getPrice() + "name:" + getName() + " describe:" + getDescribe());
    }
}
