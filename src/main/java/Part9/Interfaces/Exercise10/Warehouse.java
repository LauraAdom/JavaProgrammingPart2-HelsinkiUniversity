package Part9.Interfaces.Exercise10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsAndPrices;
    private Map<String, Integer> productsAndStock;

    public Warehouse() {
        this.productsAndPrices = new HashMap<>();
        this.productsAndStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsAndPrices.put(product, price);
        this.productsAndStock.put(product, stock);
    }

    public int price(String product) {
        if (this.productsAndPrices.containsKey(product)) {
            return this.productsAndPrices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.productsAndStock.containsKey(product)) {
            return this.productsAndStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.productsAndStock.containsKey(product)) {
            if (stock(product) > 0) {
                this.productsAndStock.put(product, stock(product) - 1);
                return true;
            }
            return false;
        }
        return false;
    }

    public Set<String> products() {
        return this.productsAndPrices.keySet();
    }
}