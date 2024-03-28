public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " " + pizza.getCost());

        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " " + pizza.getCost());

        pizza = new Tomato(pizza);
        System.out.println(pizza.getDescription() + " " + pizza.getCost());

        pizza = new NoCheese(pizza);
        System.out.println(pizza.getDescription() + " " + pizza.getCost());
    }
}