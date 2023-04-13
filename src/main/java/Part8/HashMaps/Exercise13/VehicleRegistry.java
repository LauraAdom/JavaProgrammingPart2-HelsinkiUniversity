package Part8.HashMaps.Exercise13;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vechileRegistryhash;

    public VehicleRegistry() {
        this.vechileRegistryhash = new HashMap<>();
    }

    public boolean add (LicensePlate licenseplate, String owner) {

        if(get(licenseplate) == null) {
            vechileRegistryhash.put(licenseplate, owner);
            return true;
        }
        return false;
    }

    public String get (LicensePlate licensePlate) {
        if(!vechileRegistryhash.containsKey(licensePlate)) {
            return null;
        }
        return vechileRegistryhash.get(licensePlate);
    }

    public boolean remove (LicensePlate licensePlate) {
        if(!vechileRegistryhash.containsKey(licensePlate)) {
            return false;
        }
        vechileRegistryhash.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.vechileRegistryhash.keySet()) {
            System.out.println(licensePlate);
        }
    }


    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<>();
        for (LicensePlate licensePlate : this.vechileRegistryhash.keySet()) {
            if(!ownersList.contains(this.vechileRegistryhash.get(licensePlate))) {
                System.out.println(this.vechileRegistryhash.get(licensePlate));
                ownersList.add(this.vechileRegistryhash.get(licensePlate));
            }
        }
    }
}
