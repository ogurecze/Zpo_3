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
            // Find the topping to be removed
            ToppingDecorator current = this;
            ToppingDecorator previous = null;

            while (current != null) {
                if (current.getClass().getName().equals(toRemove)) {
                    if (previous != null) {
                        // Update the previous topping's pizza reference to skip over the current topping
                        previous.pizza = current.pizza;
                    } else {
                        // If the current topping is the first one in the hierarchy, update pizza reference of the current instance
                        this.pizza = current.pizza;
                    }
                    return; // Exit the loop after removing the topping
                }
                previous = current;
                current = current.getPizza();
            }
        } else {
            // Recursively call removeTopping on the next topping in the hierarchy
            pizza.removeTopping(toRemove);
        }
    }

}
