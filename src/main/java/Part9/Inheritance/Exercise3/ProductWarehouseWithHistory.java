package Part9.Inheritance.Exercise3;

import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ArrayList<Double> history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ArrayList<>();
        this.history.add(initialBalance);
        super.setBalance(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.history.get(this.history.size() - 1) + amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        this.history.add(this.history.get(this.history.size() - 1) - amount);
        return super.takeFromWarehouse(amount);
    }

    public String history() {
        String history = "[";
        for (int i = 0; i < this.history.size(); i++) {
            if (i != this.history.size() - 1) {
                history += String.valueOf(this.history.get(i)) + ", ";
            } else {
                history += String.valueOf(this.history.get(i)) + "]";
            }
        }
        return history;
    }

    public void printAnalysis() {
        ChangeHistory ch = new ChangeHistory();
        System.out.println(
                "Product: " + this.getName() +
                        "\nHistory: " + history() +
                        "\nLargest amount of product: " + ch.maxValue() +
                        "\nSmallest amount of product: " + ch.minValue() +
                        "\nAverage: " + ch.average());
    }
}
