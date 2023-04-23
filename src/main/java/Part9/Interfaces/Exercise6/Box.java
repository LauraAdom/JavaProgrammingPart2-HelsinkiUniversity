package Part9.Interfaces.Exercise6;

import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> stuff;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.stuff = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    @Override
    public double weight() {

        double currentWeight = 0;

        for (Packable item : this.stuff) {
            currentWeight += item.weight();
        }
        return currentWeight;
    }

    public void add(Packable packable) {

        double currentWeight = weight();

        if (packable.weight() + currentWeight <= maxCapacity) {
            this.stuff.add(packable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.stuff.size() + " items, total weight " + weight() + " kg";
    }
}
