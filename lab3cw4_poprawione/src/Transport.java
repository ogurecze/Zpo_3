public class Transport extends CartDecorator {

    public Transport(Cart decoratedCart) {
        super(decoratedCart);
    }

    @Override
    public String getDescription() {
        return " Transport,";
    }

    @Override
    public double getCost() {
        return 13;
    }
}