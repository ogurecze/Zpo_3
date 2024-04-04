public class Lanyard extends CartDecorator {
    public Lanyard(Cart decoratedCart) {
        super(decoratedCart);
    }

    @Override
    public String getDescription() {
        return decoratedCart.getDescription() + " Bonus: Lanyard,";
    }

    @Override
    public double getCost() {
        return decoratedCart.getCost();
    }

}