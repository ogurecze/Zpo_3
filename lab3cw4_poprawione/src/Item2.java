public class Item2 extends CartDecorator {

    public Item2 (Cart cart){
        super(cart);
    }
    @Override
    public String getDescription() {
        return decoratedCart.getDescription() + " Item2,";
    }

    @Override
    public double getCost() {
        return decoratedCart.getCost() + 15;
    }
}