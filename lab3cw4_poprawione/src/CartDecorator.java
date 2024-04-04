public abstract class CartDecorator extends Cart {
    protected Cart decoratedCart;

    public CartDecorator(Cart decoratedCart) {
        this.decoratedCart = decoratedCart;
    }
}
