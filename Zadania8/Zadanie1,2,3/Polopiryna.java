package zadanie8.pkg1;

public class Polopiryna extends Product {

    public Polopiryna (String name, double price, String describe) {
        super(name, price, describe);
    }

    @Override
    public void Buy() {
        System.out.println(
                "I bought a polopyrin!");
    }

    @Override
    public void ShowInfo() {
        System.out.println("Price:" + getPrice() + "name:" + getName() + " describe:" + getDescribe());
    }
}
