public interface Cart {
    String getDescription();
    double getCost();
    void addItem(Product product);
}
