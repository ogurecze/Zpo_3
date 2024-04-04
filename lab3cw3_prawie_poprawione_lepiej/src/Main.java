public class Main {
    public static void main(String[] args) {
        ToppingDecorator pizza1 = new Pepperoni(new Mushrooms(new Cheese(new PlainPizza())));

        ToppingDecorator pizza2 = new PepperoniPizza();

        System.out.println("Des: " + pizza1.getDescription());
        System.out.println("Cost: " + pizza1.getCost());

        System.out.println("Des: " + pizza2.getDescription());
        System.out.println("Cost: " + pizza2.getCost());

        System.out.println("Removing the will to live");
        pizza1.removeTopping("Pepperoni");
        System.out.println("test");
        System.out.println("Des: " + pizza1.getDescription());
        System.out.println("Cost: " + pizza1.getCost());

        pizza2.removeTopping("Cheese");

        System.out.println("Des: " + pizza2.getDescription());
        System.out.println("Cost: " + pizza2.getCost());
    }
}