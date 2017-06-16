package shibas11.DesignPattern.SOLID.SRP;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Do work.");
    }

    public String getName() {
        return name;
    }

}
