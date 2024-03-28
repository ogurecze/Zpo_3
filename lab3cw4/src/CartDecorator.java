public abstract class CartDecorator implements Cart {
    protected Cart decoratedCart;

    public CartDecorator(Cart decoratedCart) {
        this.decoratedCart = decoratedCart;
    }
}
