package Part9.Inheritance.Exercise2;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String direction, int salary) {
        super(name, direction);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }

}
