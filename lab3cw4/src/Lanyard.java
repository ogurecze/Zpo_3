public class Lanyard extends CartDecorator {
    public Lanyard(Cart decoratedCart) {
        super(decoratedCart);
    }

    @Override
    public String getDescription() {
        return decoratedCart.getDescription() + "Bonus: Lanyard\n";
    }

    @Override
    public double getCost() {
        return decoratedCart.getCost();
    }

    @Override
    public void addItem(Product product) {

    }
}