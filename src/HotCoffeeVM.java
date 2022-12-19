

import java.util.*;

public class HotCoffeeVM extends VendingMachine{

    @Override
    public void restore() {
        System.out.println("The coffee has been given out successfully.");
    }

    @Override
    public void getProduct(String name, int volume, int temperature) {
        List<HotDrinks> coffeeSet = new ArrayList<HotDrinks>();
        coffeeSet.add(new HotDrinks("Latte", 120, 85));
        coffeeSet.add(new HotDrinks("Espresso", 95, 95));
        coffeeSet.add(new HotDrinks("Moccha", 145, 85));

        System.out.println("Our Menu is:");
        System.out.println(coffeeSet);




    }
}

