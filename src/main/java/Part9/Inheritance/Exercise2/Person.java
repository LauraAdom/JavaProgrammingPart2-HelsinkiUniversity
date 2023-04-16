package Part9.Inheritance.Exercise2;

public class Person {

    private String name;

    private String direction;

    public Person(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    public String toString() {
        return this.name + "\n  " + this.direction;
    }
}