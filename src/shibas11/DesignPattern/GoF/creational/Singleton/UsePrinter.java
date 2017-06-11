package shibas11.DesignPattern.GoF.creational.Singleton;

/**
 * Created by shiba on 2017-06-11.
 */
public class UsePrinter {
    public void doSomething(Printer printer) {
        String str = "doSomething and print it.";
        printer.print(str);
    }
}
