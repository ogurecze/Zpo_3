public class Transport implements Product {
    @Override
    public String getDescription() {
        return "Transport";
    }

    @Override
    public double getCost() {
        return 13;
    }
}