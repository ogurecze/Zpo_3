public class Pepperoni extends ToppingDecorator {
    public Pepperoni(ToppingDecorator pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    public double getCost() {
        return pizza.getCost() + 1.5; // Additional cost for cheese
    }

}