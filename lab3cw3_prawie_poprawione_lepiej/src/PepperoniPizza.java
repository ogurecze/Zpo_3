public class PepperoniPizza extends ToppingDecorator {

    public PepperoniPizza() {
        super(new Cheese(new Pepperoni(new PlainPizza())));
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " - Pepperoni Pizza";
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
