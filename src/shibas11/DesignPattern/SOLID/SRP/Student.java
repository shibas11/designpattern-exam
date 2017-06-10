package shibas11.DesignPattern.SOLID.SRP;

/**
 * Created by shiba on 2017-06-11.
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void study() {
        System.out.println("Do study.");
    }

    public void work() {
        System.out.println("Do work.");
    }
}
