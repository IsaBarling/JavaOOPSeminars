import java.util.List;

public abstract class VendingMachine {


    public void initProduct (List<Product> products){

        Product product = products.get(0);
        Product product1 = new Product("Chocolate", 150, 20);
        Product product2 = new Product("SuperBarSnack", 200, 20);
    }

    public void getProduct(String name){
        System.out.println();
    }

    public void restore() {
        System.out.println("Product is given out successfully.");
    }

    public abstract void getProduct(String name, int volume, int temperature);
}
