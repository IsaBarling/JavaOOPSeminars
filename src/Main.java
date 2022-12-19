import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Coffee", 100, 75));
        productList.add(new HotDrinks("Hot Milk", 75, 65));

        List<VendingMachine> vm = new ArrayList<>();
        vm.add(new VendingMachine() {
            @Override
            public void getProduct(String name, int volume, int temperature) {
            }
        });
        vm.add(new HotCoffeeVM());

        for (VendingMachine i: vm){
            i.restore();

        }

        for (Product product: productList) {
            product.doSmth();
        }


    }
}
