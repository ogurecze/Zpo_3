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
        ToppingDecorator current = this;
        ToppingDecorator previous = null;

        while (current != null) {
            if (current.getClass().getName().equals(toRemove)) {
                if (previous != null) {
                    previous.pizza = current.pizza;
                } else {
                    //System.out.println("why?");
                    this.pizza = current.pizza; //Nie rozumiem dlaczego to nie działa
                }
                return;
            }
            previous = current;
            current = current.getPizza();
        }

        System.out.println("Topping " + toRemove + " not found");
    }

}
