public class ShopMascot extends CartDecorator {
    public ShopMascot(Cart decoratedCart) {
        super(decoratedCart);
    }

    @Override
    public String getDescription() {
        return decoratedCart.getDescription() + "Bonus: Shop Mascot\n";
    }

    @Override
    public double getCost() {
        return decoratedCart.getCost();
    }

    @Override
    public void addItem(Product product) {

    }
}
