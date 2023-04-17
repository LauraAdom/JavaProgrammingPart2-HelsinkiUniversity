package Part9.Inheritance.Exercise3;

import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public ArrayList<Double> getHistory() {
        return this.history;
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (this.history.size() == 0) {
            return 0;
        } else {
            Double max = this.history.get(0);
            for (Double x : this.history) {
                if (x > max) {
                    max = x;
                }
            }
            return max;
        }
    }

    public double minValue() {
        if (this.history.size() == 0) {
            return 0;
        } else {
            Double min = this.history.get(0);
            for (Double x : this.history) {
                if (x < min) {
                    min = x;
                }
            }
            return min;
        }
    }

    public double average() {
        if (this.history.size() == 0) {
            return 0;
        } else {
            Double sum = 0.0;
            for (Double x : this.history) {
                sum += x;
            }
            return sum / this.history.size();
        }
    }
}
