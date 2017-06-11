package shibas11.DesignPattern.GoF.creational.Singleton;

/**
 * Created by shiba on 2017-06-11.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void print() {
        Printer printer = RealPrinter.getPrinter();
        printer.print(this.name + " print using " + printer.toString() + ".");
    }
}
