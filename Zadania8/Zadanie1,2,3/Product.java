package zadanie8.pkg1;

public abstract class Product {

    private double price;
    private String name;
    private String describe;

    public Product(String name, double price, String describe) {
        this.name = name;
        this.price = price;
        this.describe = describe;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(double price) {
        this.describe = describe;
    }

    public abstract void Buy();

    public abstract void ShowInfo();
}
