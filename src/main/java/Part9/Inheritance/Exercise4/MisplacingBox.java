package Part9.Inheritance.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class MisplacingBox extends Box {

    private List<Item> items;

    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
