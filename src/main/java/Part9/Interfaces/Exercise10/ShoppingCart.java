package Part9.Interfaces.Exercise10;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.get(product) == null) {
            items.put(product, new Item(product, 1, price));
        } else {
            items.get(product).increaseQuantity();
        }
    }

    public int price() {
        int totalPrice = 0;
        for (String productTitle : items.keySet()) {
            Item item = items.get(productTitle);
            int itemPrice = item.price();
            totalPrice += itemPrice;
        }
        return totalPrice;
    }

    public void print() {
        for (String productTitle : items.keySet()) {
            System.out.println(items.get(productTitle).toString());
        }
    }
}
