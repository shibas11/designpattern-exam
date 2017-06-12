package shibas11.DesignPattern.GoF.creational.Singleton;

/**
 * Created by shiba on 2017-06-11.
 */
public class UsePrinter {
    public void doSomething() {
        String str = "doSomething and print it.";
        PrinterFactory.getPrinterFactory().getPrinter().print(str);
    }
}
