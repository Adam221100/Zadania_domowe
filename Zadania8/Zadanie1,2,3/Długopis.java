package zadanie8.pkg1;

public class Długopis extends Product {

    public Długopis (String name, double price, String describe) {
        super(name, price, describe);
    }

    @Override
    public void Buy() {
        System.out.println(
                "I bought a pen!");
    }

    @Override
    public void ShowInfo() {
        System.out.println("Price:" + getPrice() + "name:" + getName() + " describe:" + getDescribe());
    }
}
