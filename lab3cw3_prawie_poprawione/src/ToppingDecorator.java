public abstract class ToppingDecorator{
    protected ToppingDecorator pizza;

    public ToppingDecorator(ToppingDecorator pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();

    public abstract double getCost();

    public ToppingDecorator getPizza() {
        return pizza;
    }

    public void removeTopping(String toRemove) {
        if (pizza == null) {
            System.out.println("Nothing to remove");
        } else if (this.getClass().getName().equals(toRemove)) {
            pizza = pizza.getPizza();
        } else {
            pizza.removeTopping(toRemove);
        }

    }

}
