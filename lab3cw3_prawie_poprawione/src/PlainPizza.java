public class PlainPizza extends ToppingDecorator{

    public String getDescription() {
        return "Plain Pizza";
    }

    public double getCost() {
        return 5.00;
    }

    public PlainPizza() {
        super(null);
    }
}
