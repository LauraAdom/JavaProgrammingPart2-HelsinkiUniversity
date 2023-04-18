package Part9.Inheritance.Exercise3;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.setBalance(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.history.getHistory().get(this.history.getHistory().size() - 1) + amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        this.history.add(this.history.getHistory().get(this.history.getHistory().size() - 1) - amount);
        return super.takeFromWarehouse(amount);
    }

    public String history() {
        String history = "[";
        for (int i = 0; i < this.history.getHistory().size(); i++) {
            if (i != this.history.getHistory().size() - 1) {
                history += String.valueOf(this.history.getHistory().get(i)) + ", ";
            } else {
                history += String.valueOf(this.history.getHistory().get(i)) + "]";
            }
        }
        return history;
    }

    public void printAnalysis() {
        System.out.println(
                "Product: " + this.getName() +
                        "\nHistory: " + history() +
                        "\nLargest amount of product: " + this.history.maxValue() +
                        "\nSmallest amount of product: " + this.history.minValue() +
                        "\nAverage: " + this.history.average());
    }
}