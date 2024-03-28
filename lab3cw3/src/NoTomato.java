public class NoTomato extends PizzaDecorator{
    public NoTomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().replace(", Cheese", ", No Cheese");
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
