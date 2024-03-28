public class Tomato extends PizzaDecorator{
    public Tomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2;
    }
}
