package shibas11.DesignPattern.SOLID.SRP;

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
