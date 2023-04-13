package Part8.HashMaps.Exercise13;

public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        String trimmed = this.liNumber.trim();
        String[] parts = trimmed.split("-");
        String[] numbWithoutSpaces = parts[1].split(" ");
        if (numbWithoutSpaces[0].matches("\\d+")) {
            return Integer.valueOf(numbWithoutSpaces[0]);
        }
        return Integer.valueOf(numbWithoutSpaces[1]);
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }

        LicensePlate compared = (LicensePlate) object;

        return this.liNumber.equals(compared.liNumber) && this.country.equals(compared.country);
    }
}
