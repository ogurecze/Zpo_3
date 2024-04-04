public class Mushrooms extends ToppingDecorator {
    public Mushrooms(ToppingDecorator pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    public double getCost() {
        return pizza.getCost() + 0.5; // Additional cost for cheese
    }

}