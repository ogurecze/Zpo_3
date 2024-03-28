import java.util.ArrayList;
import java.util.List;
public class ShoppingCart implements Cart {
    private List<Product> items;
    private double totalCost;

    public ShoppingCart() {
        items = new ArrayList<>();
        totalCost = 0;
    }

    @Override
    public void addItem(Product product) {
        items.add(product);
        totalCost += product.getCost();
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Items Purchased:\n");
        for (Product product : items) {
            description.append(product.getDescription()).append("\n");
        }
        return description.toString();
    }

    @Override
    public double getCost() {
        return totalCost;
    }
}
