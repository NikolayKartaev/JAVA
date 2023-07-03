package JAVA.Seminars.OOP.Seminar1;

public class Bottle extends Product{
    private double volume;

    public Bottle(String name, double price, double volume) {
        super(name, price);
        this.volume=volume;

    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" объем: %f", volume);
    }
    
    
}
