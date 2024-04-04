import java.util.ArrayList;
import java.util.List;
public class ShoppingCart extends Cart {


    @Override
    public String getDescription() {
        return "Cart: ";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
