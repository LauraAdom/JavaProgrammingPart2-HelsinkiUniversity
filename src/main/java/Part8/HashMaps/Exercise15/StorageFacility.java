package Part8.HashMaps.Exercise15;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!this.storage.containsKey(unit)) {
            ArrayList<String> items = new ArrayList<>();
            items.add(item);
            this.storage.put(unit, items);
        } else {
            ArrayList<String> items = this.storage.get(unit);
            items.add(item);
            this.storage.put(unit, items);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.storage.containsKey(storageUnit) || this.storage.containsKey(storageUnit) && this.storage.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {
            ArrayList<String> strList = this.storage.get(storageUnit);
            if (strList.contains(item)) {
                strList.remove(item);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> keyList = new ArrayList<>();
        for (String k : this.storage.keySet()) {
            if (this.storage.get(k) != null && this.storage.get(k).size() > 0) {
                keyList.add(k);
            }
        }
        return keyList;
    }
}
