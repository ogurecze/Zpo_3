public class ShopMascot extends CartDecorator {
    public ShopMascot(Cart decoratedCart) {
        super(decoratedCart);
    }

    @Override
    public String getDescription() {
        return decoratedCart.getDescription() + " Bonus: Shop Mascot,";
    }

    @Override
    public double getCost() {
        return decoratedCart.getCost();
    }

}
