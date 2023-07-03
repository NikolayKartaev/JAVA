package JAVA.Seminars.OOP.Seminar1;

public class Main {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine(123);

        Product product1 = new Bottle("SNICKERS", 50.49, 0.5);
        Product product2 = new Product("MARS", 49.49);

        product1.setPrice(50.99);
        
   
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);


        System.out.println(vendingMachine.getProductsInfo());
    }

}
