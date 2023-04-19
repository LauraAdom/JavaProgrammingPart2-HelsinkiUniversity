package Part9.Inheritance.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class OneItemBox extends Box {

    private List<Item> items;

    public OneItemBox(){
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.items.isEmpty()){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        boolean cont = false;
        for(int i = 0; i < this.items.size();i++){
            if(this.items.get(i).equals(item)) {
                cont = true;
            }
        }
        return cont;
    }
}