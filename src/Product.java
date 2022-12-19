

/**
 *
 * @author Мария Фомина
 */
import java.util.*;

public class Product {

    private String name;
    private double price;
    private final int temperature;


    public Product (String name, double price, int temperature){

        this.name = name;
        this.price = price;
        this.temperature = temperature;

    }

    public String getName(){

        return name;
    }
    public double getPrice(){

        return price;
    }

    public void setName(String name){

        this.name = name;
    }
    public void setPrice(double price){

        this.price = price;
    }

    public void doSmth() {
        System.out.println("This is a fresh Product. Enjoy it");
    }

    public static Set<Product> createProduct(){
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("beverage", 2.5, 2));
        productSet.add(new Product("snack", 4.5, 2));
        productSet.add(new Product("chocolatebar", 7.5, 2));
        for (Product i: productSet){
            System.out.println(i);
        }
        return productSet;


    }

}
