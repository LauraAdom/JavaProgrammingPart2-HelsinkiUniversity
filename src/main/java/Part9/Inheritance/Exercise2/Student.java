package Part9.Inheritance.Exercise2;

public class Student extends Person {

    private int credits;

    public Student(String name, String direction) {
        super(name, direction);
        this.credits = 0;
    }

    public void study() {
        this.credits++;
        System.out.println("Study credits " + this.credits);
    }

    public int credits() {
        return this.credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
    }
}
