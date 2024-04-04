public class ShopService {
    public static void main(String[] args) {

        Cart cart = new ShoppingCart();

        cart = new Item1(new Item1(new Item2(cart)));

        cart = new ShopMascot(cart);
        cart = new Lanyard(cart);
        cart = new Discount(cart, 2);

        System.out.println("cart1");

        System.out.println(cart.getDescription());
        System.out.println("Total Cost: $" + (cart.getCost()));

        Cart cart2 = new ShoppingCart();

        cart2 = new Item1(new Item1(new Item1(new Item1(new Item2(new Item2(new Item2(cart2)))))));

        cart2 = new ShopMascot(cart2);
        cart2 = new Lanyard(cart2);
        cart2 = new Discount(cart2, 15);

        System.out.println("cart2");

        System.out.println(cart2.getDescription());
        System.out.println("Total Cost: $" + (cart2.getCost()));
    }
}