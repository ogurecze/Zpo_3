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
        } else if (pizza.getClass().getName().equals(toRemove)) {
            ToppingDecorator current = this;
            ToppingDecorator previous = null;

            while (current != null) {
                if (current.getClass().getName().equals(toRemove)) {
                    if (previous != null) {
                        previous.pizza = current.pizza;
                    } else {
                        this.pizza = current.pizza;
                    }
                    return;
                }
                previous = current;
                current = current.getPizza();
            }
        } else {
            pizza.removeTopping(toRemove);
        }
    }

}
