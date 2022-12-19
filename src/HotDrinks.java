public class HotDrinks extends Product{
    public HotDrinks(String name, double price, int temperature) {
        super(name, price, temperature);
    }



    @Override
    public void doSmth() {
        System.out.println("This is a hot beverage");

    }
}
