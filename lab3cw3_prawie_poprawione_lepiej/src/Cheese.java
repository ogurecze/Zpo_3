public class Cheese extends ToppingDecorator {
    public Cheese(ToppingDecorator pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }

}
