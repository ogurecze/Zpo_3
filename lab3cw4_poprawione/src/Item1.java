public class Item1 extends CartDecorator {

    public Item1 (Cart cart){
        super(cart);
    }
    @Override
    public String getDescription() {
        return decoratedCart.getDescription() + " Item1,";
    }

    @Override
    public double getCost() {
        return decoratedCart.getCost() + 20;
    }
}
