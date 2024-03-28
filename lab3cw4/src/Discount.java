public class Discount extends CartDecorator {
    private int discountCount;

    public Discount(Cart decoratedCart, int discountCount) {
        super(decoratedCart);
        this.discountCount = discountCount;
    }

    @Override
    public String getDescription() {
        String description = decoratedCart.getDescription();
        for (int i = 0; i < discountCount; i++) {
            description += "Bonus: -10 Rabat\n";
        }
        return description;
    }

    @Override
    public double getCost() {
        double cost = decoratedCart.getCost() - (discountCount * 10);
        return Math.max(0, cost);
    }

    @Override
    public void addItem(Product product) {

    }
}
