package JAVA.Seminars.OOP.Seminar1;

public class Product {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("id: %d Наименование: %s Цена: %f", id, name, price);
    }

    public void setName(String name) {
        this.name = name;
    }

}
