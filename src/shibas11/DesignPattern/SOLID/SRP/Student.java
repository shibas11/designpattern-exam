package shibas11.DesignPattern.SOLID.SRP;

/**
 * Created by shiba on 2017-06-11.
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println("Do study.");
    }

    public String getName() {
        return name;
    }

}
